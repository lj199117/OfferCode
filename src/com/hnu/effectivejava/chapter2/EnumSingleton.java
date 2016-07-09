package com.hnu.effectivejava.chapter2;

//枚举的方法实现单例，应该是最好的方法，虽然目前还不流行(摘自Effective java)
public enum EnumSingleton {
  INSTANCE;

  public void leaveTheBuilding() {
      System.out.println("Whoa baby, I'm outta here!");
  }

  // This code would normally appear outside the class!
  public static void main(String[] args) {
      EnumSingleton elvis = EnumSingleton.INSTANCE;
      elvis.leaveTheBuilding();
  }
}

