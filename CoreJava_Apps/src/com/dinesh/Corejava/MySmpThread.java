package com.dinesh.Corejava;

public class MySmpThread {
	
	public static int count=0;
	public void run(){
		
		while(MySmpThread.count<= 20){
			try{
				System.out.println("Expl Thread"+(++MySmpThread.count));
			}catch(Exception iex){
				System.out.println("Exception in thread:"+ iex.getMessage());
			}
		}
	}
	
}
