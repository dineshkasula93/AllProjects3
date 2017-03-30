package com.dinesh.Corejava;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		int[][] b = new int[5][5];
		a[1] = 10;
		a[2] = 20;
		a[3] = 30;
		a[4] = 40;
		a[5] = 50;
		a[6] = 60;
		a[7] = 70;
		a[8] = 80;
		a[9] = 90;
		a[0] = 200;
		b[1][1] = 11;
		b[1][2] = 12;
		b[1][3] = 13;
		b[1][4] = 14;
		b[1][0] = 15;
		b[2][1] = 21;
		b[2][2] = 22;
		b[2][3] = 23;
		b[2][4] = 24;
		b[2][0] = 25;
		b[3][1] = 31;
		b[3][2] = 32;
		b[3][3] = 33;
		b[3][4] = 34;
		b[3][0] = 35;
		b[4][1] = 41;
		b[4][2] = 42;
		b[4][3] = 43;
		b[4][4] = 44;
		b[4][0] = 45;
		b[0][1] = 51;
		b[0][2] = 52;
		b[0][3] = 53;
		b[0][4] = 54;
		b[0][0] = 55;

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.println(b[i][j]);
			}
		}
		System.out.println("\n"+"\n");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
