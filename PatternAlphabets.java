package com.himanshu;

public class PatternAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=10;
		int col=10;
		System.out.println("    Pattern A");
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 || j==0 || j==col-1 || i==row/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("    Pattern B");
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 && j!=col-1 || j==0 || j==col-1 && i>0 && i<row-1 || i==row/2 || i==row-1 && j!=col-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("    Pattern C");
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 && j>0 || j==0 && i>0 && i<row-1 || i==row-1 && j>0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("    Pattern D");
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 && j!=col-1|| j==0 || i==row-1 && j!=col-1|| j==col-1 && i>0 && i<row-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("    Pattern E");
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 || j==0 || i==row-1 || i==row/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("    Pattern F");
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 || j==0 || i==row/2 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("    Pattern G");
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 && j!=0|| j==0 && i>0 && i<row-1 || i==row-1 && j!=0 || i>=row/2 && j==col-1 || i==row/2 && j>=col/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("    Pattern H");
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j==0 || j==col-1 || i==row/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}

}
