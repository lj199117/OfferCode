package com.hnu.effectivejava.chapter3;

public class Point {
	public static void main(String[] args) {
        // First equals function violates symmetry
        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
        //因为Point的equals方法和ColorPoint的equals方法不相同,所以破坏对称性
        System.out.println("满足对称性(这个对称性忽略了颜色的比较):"+p.equals(cp) + " " + cp.equals(p));

        // Second equals function violates transitivity
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
        //因为p1=p2,p2=p3都是忽略了颜色的比较才会相等的(色盲比较),最后一个却考虑了颜色
        System.out.printf("破坏传递性:%s %s %s%n",
                          p1.equals(p2), p2.equals(p3), p1.equals(p3));
    }
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override 
    public boolean equals(Object o) {
    	//子类instanceof父类  return true
    	if(o == this)
    		return true;
        if (!(o instanceof Point))
            return false;
        Point p = (Point)o;
        return p.x == x && p.y == y;
    }
    
    // Broken - violates Liskov substitution principle - Pages 39-40
    //破坏里氏替换原则,父类的属性和方法在子类中应该运行得很好
/*  @Override 
    public boolean equals(Object o) {
      if (o == null || o.getClass() != getClass())
          return false;
      Point p = (Point) o;
      return p.x == x && p.y == y;
  }*/

    // See Item 9
    @Override 
    public int hashCode()  {
        return 31 * x + y;
    }
}

enum Color { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }

class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    // Broken - violates symmetry!  破坏对称性
   /* @Override 
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint))
            return false;
        return super.equals(o) && ((ColorPoint) o).color == color;
    }*/

  // Broken - violates transitivity!  满足对称性(这个对称性忽略了颜色的比较),但是破坏传递性
  @Override 
  public boolean equals(Object o) {
      if (!(o instanceof Point))
          return false;
      // If o is a normal Point, do a color-blind comparison
      if (!(o instanceof ColorPoint))
          return o.equals(this);
      // o is a ColorPoint; do a full comparison
      return super.equals(o) && ((ColorPoint)o).color == color;
  }

}


/*//对于那些扩展了可实例化的类又增加了新属性的类，当碰到equals时是不怎么好解决的；
//
//	比较折中的办法是：
//	1.复合优于继承
//	2.提供公共视图获取复合对象
class ColorPoint {
    private final Point point;
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        if (color == null)
            throw new NullPointerException();
        point = new Point(x, y);
        this.color = color;
    }

    *//**
     * Returns the point-view of this color point.
     *//*
    public Point asPoint() {
        return point;
    }

    @Override 
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint))
            return false;
        ColorPoint cp = (ColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }

    @Override 
    public int hashCode() {
        return point.hashCode() * 33 + color.hashCode();
    }
}*/
