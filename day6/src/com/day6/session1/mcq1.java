package com.day6.session1;

import java.util.*;
class mcq1 
{
    public static void main(String args[]) 
    {
        ArrayList obj = new ArrayList();
        obj.add("A");
        //to extend the capacity of ArrayList obj ,manually..
        
        obj.ensureCapacity(0);
        System.out.println(obj.size()+" "+obj);
    }
}

