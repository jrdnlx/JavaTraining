package com.hcl.July26;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class LambdaEx2 {
	
	interface EmpFactory<E extends Emp>{
		E create(String EmpFirstName, String empLastName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpFactory<Emp> empFac = Emp::new;
		
		Emp emp= empFac.create("Name1", "Name2");
		
	}

}
