package com;

public class testb extends test{
	public String i = "����";

	testb(){
		show();
		 System.out.println(" ��ʾ��ʼ��"); 
		 show();
		 System.out.println(" ��ʾ��ʼ������"); 
	}
	
@Override
public void show() {
	// TODO Auto-generated method stub
	System.out.println("���ࣺ"+i);
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t = new testb();
		System.out.println(t.i);
		t.show();
	}

}
