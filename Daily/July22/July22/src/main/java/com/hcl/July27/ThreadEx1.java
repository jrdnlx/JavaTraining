package com.hcl.July27;

public class ThreadEx1 extends Thread{
	
	public void run() {
		System.out.println("Running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadEx1 t1 = new ThreadEx1();
		t1.start();
	}

}
