package com.arrays;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		System.out.println("==1d==");
		int a[]=new int[2];
		 a[0]=10;
		 a[1]=20;
		
		 
		 System.out.println(a[0]);
		 System.out.println(a[1]);
		
		 System.out.println("====2d==enhanced==");
		 int b[][]=new int[2][2];
		 b[0][0]=100; b[0][1]=200;
	     b[1][0]=300;b[1][1]=400;
		for(int i[]:b) {
			for(int j:i) {
				
				System.out.print(j+" ");
			}System.out.println();
		}
		
		
		System.out.println("=====2d for loop=====");
		
		
		int c[][]=new int[2][2];
		c[0][0]=500; c[0][1]=600;
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=1;j++) {
				System.out.print(c[i][j]+ " ");
			
			}System.out.println();
		}
		
		 
		
	
	
	
	
	
	
	}
	
}
