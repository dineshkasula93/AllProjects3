package com.dinesh.Corejava;

public class BufferedReaderEmployee {

	int id;
	String name;
	
	BufferedReaderEmployee(int i, String n){
		id=i;
		name=n;
	}
		public void display(){
		System.out.println(id+"\t"+name);	
		}
	
}
