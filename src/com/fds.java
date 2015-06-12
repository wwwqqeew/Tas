package com;

public class fds {

	private static inClass ic = null;
	private static int i = 5;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		getInClass().start();
		byte a= 'z';
		
		System.out.println((char) 65);
	}
	
	private static inClass getInClass() {
		if (ic == null) {
			ic = new inClass();
		}
		return ic;
	}
	
	public static class inClass extends Thread{
		@Override
		public void run() {
			System.out.println("3223:"+i);
		}
	}

}
