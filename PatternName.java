package com.himanshu;

public class PatternName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" First Name");
		System.out.println();
		int row=11;
		int col=11;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==row/2 || j==0 || j==col-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 || i==row-1 || j==col/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j==0 || j==col-1 || i-j==0 && i<=row/2 || i+j==col-1 && i<=row/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j==0 || j==col-1 || i==0 || i==row/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j==0 || j==col-1 || i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 && j>0 || j==0 && i>0 && i<row/2 || i==row/2 && j!=0 && j<col-1 || j==col-1 && i>row/2 && i!=row-1 || i==row-1 && j!=col-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==row/2 || j==0 || j==col-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j==0 && i!=row-1 || j==col-1 && i!=row-1 || i==row-1 && j!=0 && j!=col-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(" Second Name");
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 && j>0 || j==0 && i>0 && i<row/2 || i==row/2 && j!=0 && j<col-1 || j==col-1 && i>row/2 && i!=row-1 || i==row-1 && j!=col-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j==0 || j==col-1 || i==0 || i==row/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j==0 || j==col-1 || i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j==0 || j==col-1 || i+j==col-1 && i>=row/2 || i-j==1 && i>=row/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j==0 || j==col-1 || i==0 || i==row/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==row-1 || j==0) {
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
