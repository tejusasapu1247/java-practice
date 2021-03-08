package com.day7.session2;

public class DemoJavaLang {

	public static void main(String[] args) {
		int arrl[] ={1,3,2,4};
        int arr2 []= {6,7,8,0};
        //void arraycopy(Object src, int srcPos,Object dest, int destPos, int length)
        System.arraycopy(arrl, 0, arr2, 2, 2);
        for(int val: arr2){
            System.out.print(val+" ");
        }
        System.out.println();
        System.out.println("--------------");
        for(int val: arrl){
            System.out.print(val+" ");
        }
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("java.class.version"));
        
       }

}
