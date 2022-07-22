package com.hcl.July22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListExample {
	
    //creates a dnyamic array;stores the duplicate elements of different data types, maintains insertion order
    //non synchronized
    
    public static void main(String[] args) {
        //Generics ->making sure that its type safety
         
        List<String> list2=new ArrayList<>();//run time polymorphism
         
        
        list2.add("Justin");
        list2.add(new String("Amritpal"));
        list2.add("Rachid");
        
    
        Iterator<String> itr=list2.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        
    }
}
