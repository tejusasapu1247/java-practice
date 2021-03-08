package com.objectClassDemo;

public class FinalizeExample 
{ 
    public static void main(String[] args) 
    { 
    	FinalizeExample t = new FinalizeExample(); 
        System.out.println(t.hashCode()); 
        t = null; 
        // calling garbage collector  
        System.gc(); 
        System.out.println("end"); 
    } 
  
    @Override
    protected void finalize() 
    { 
        System.out.println("finalize method called"); 
    } 
} 