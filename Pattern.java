package com.himanshu;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=14;
		int col=14;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i+j<=row/2-1 ||  j-i>=row/2-1 || j==0 || j==col-1 || i==row-1) {
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
