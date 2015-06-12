package com.emun;

public class testEmun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Color.BLANK.toString());
		testEmun te = new testEmun();

	}

	public enum Color {
		RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
		// 成员变量
		private String name;
		private int index;

		// 构造方法
		private Color(String name, int index) {
			this.name = name;
			this.index = index;
		}

		// 覆盖方法
		@Override
		public String toString() {
			return this.index + "_" + this.name;
		}
	}

}
