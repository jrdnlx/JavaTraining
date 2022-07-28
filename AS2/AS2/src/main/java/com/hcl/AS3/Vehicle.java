package com.hcl.AS3;

public class Vehicle {

	int vehicleNo;
	String manufactorer;
	String color;
	
	class Truck extends Vehicle{
		
		int loadingCapacity;
		
		void change(String color, int load) {
			this.color = color;
			this.loadingCapacity = load;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
