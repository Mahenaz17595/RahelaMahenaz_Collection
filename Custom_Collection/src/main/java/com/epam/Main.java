package com.epam;

public class Main {
	
	public static void main(String[] args) 
    {
        DemoList<String> list = new DemoList<>();
 
        list.add("John");
        list.add("Smith");
        list.add("Arun ");
        System.out.println(list);
         
       
        list.remove(2);
        System.out.println(list);
         
        
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
 
      
        System.out.println(list.size());
    }
}

