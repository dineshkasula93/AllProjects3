package com.dinesh.Servlets;

public class ScopeOfVariable {

	int y = 22;
	public static int newMethod(){
		int x = 20;
		int z =22;
		int y = x+z;
		return y;
	}
	
	public static int newMethod1(){
		int x = 30;
		int z =32;
		ScopeOfVariable sv = new ScopeOfVariable();
		int y = sv.y;
		System.out.println(y);
		return y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScopeOfVariable sv = new ScopeOfVariable();
		int z = ScopeOfVariable.newMethod1();
		int w = ScopeOfVariable.newMethod();
		int x;
		int y = 100;
		for(x=0; x<3; x++){
			System.out.println("Y is:"+y+"\t"+z+"\t"+w);
			y = y + 101;
			System.out.println("Y is now:"+ y);
		}

	}

}
