package com.mcqs.practice;

import java.io.ByteArrayInputStream;

public class filesinputoutput 
    {
    	public static void main(String[] args) 
        {
 	   String obj  = "abc";
           byte b[] = obj.getBytes();
           ByteArrayInputStream obj2 = new ByteArrayInputStream(b);
           for (int i = 0; i < 2; ++ i) 
           {
               int c;
               while ((c = obj2.read()) != -1) 
               {
            	   if (i == 0) 
                   {
                       System.out.print(Character.toUpperCase((char)c));
                       obj2.write(1); 
            	   }
               }
               System.out.print(obj2);
           }
        }
    }