package com.hcl.July22;

public class LocalInner {
	
	private int y = 12;

	void print() {
		class Local{
			void display() {
				System.out.println("The var is 12");
			}
		}
		Local l1 = new Local();
		l1.display();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInner l1 = new LocalInner();
		l1.print();
	}

}
