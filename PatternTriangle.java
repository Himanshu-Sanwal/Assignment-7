package com.himanshu;

public class PatternTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=21;
		int col=21;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i+j==(row/2) || j-i==row/2 || i==row/2) {
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
