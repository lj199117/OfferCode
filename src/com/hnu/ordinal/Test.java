package com.hnu.ordinal;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/4/24 0024.
 */
public class Test  {
    public static void main(String[] args){
        new Test().run();
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        while(!str.equals("EOF")){
            System.out.print(str);
            str = scanner.nextLine();
        }
    }
}
