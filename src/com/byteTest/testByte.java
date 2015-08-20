package com.byteTest;

public class testByte {

	/**
	 * @param args
	 */ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aa = "佛挡杀佛";
		byte[] bb = aa.getBytes();
		System.out.println(new String(bb)+" "+bb.length);
	}

}
