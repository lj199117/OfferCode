package com.hnu.util;

import java.util.Scanner;

public class IOUtil {
	public static void run(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        while(!str.equals("EOF")){
            System.out.print(str);
            str = scanner.nextLine();
        }
    }
}
