package com.nexttech.javaptac1;

public class SwappNumbers1 {

	public static void main(String[] args) {
		int x = 250, y = 500;
		 
        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
 
        int temp = x;
        x = y;
        y = temp;
 
        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
	}

}
