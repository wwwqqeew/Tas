package com.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public  class sy {
	public static void o(Object... fields) {
		System.out.print("��"+fields.length +"���������ֱ�Ϊ��");
		for (int i = 0; i < fields.length; i++) {
			System.out.print("["+fields[i]+"] ");
		}
		System.out.print("\n");
	}
	
	public static void on(Object... fields) {
		for (int i = 0; i < fields.length; i++) {
			System.out.print(fields[i]+"\n");
		}
	}
	
	public static void ol(Object... fields) {
		for (int i = 0; i < fields.length; i++) {
			System.out.print(fields[i]+" ");
		}
		System.out.print("\n");
	}
	
	public static void o(HashMap hashMap){
		 Iterator iter = hashMap.entrySet().iterator();  
		 System.out.println("HashMap��ʼ��[��:"+hashMap.size()+"��Ԫ��]");
	        while (iter.hasNext()) {  
	            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) iter.next();  
	            System.out.println("key:["+entry.getKey()+"], value:["+entry.getValue()+"]");
	        }  
	     System.out.println("HashMap����!");
	}
}
