package com.hcl.July22;

import java.util.LinkedList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
class Book2{
    
    private int bkId;
    private String bkName;
    
    
}
public class LinkedListExample2 {
    //Collection doesn't support primitive data type
    
    public static void main(String[] args) {
        
        List<Book2> list=new LinkedList<>();
        Book2 b1=new Book2(111,"Thinking in Java");
        Book2 b2=new Book2(222,"Thinking in SpringBoot");
        Book2 b3=new Book2(333,"Thinking in Maven");
        Book2 b4=new Book2(444,"Thinking in Angular");
        list.add(b1);list.add(b2);list.add(b3);list.add(b4);
        
        for(Book2 book:list) {
            System.out.println(book.getBkId()+book.getBkName());
        }
        
        Book2 b22=new Book2();
        b22.setBkId(123);
        System.out.println(b22);
        
        
        
    }
}
