package com.ExcelPoi;


import java.io.InputStream;
import java.util.List;

public class testMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> list = testPoiU("E:\\��˾����\\����\\�ĵ�2014-12-22\\��������(���ݷ���������)20140325(���հ�)ģ��.xls");
		System.out.println(list.size());
//		for (int i = 0; i < 6; i++) {
//			System.out.print(i +" ");
//			for (int j = 0; j < list.get(i).size(); j++) {
//				System.out.print("["+j+"] " + list.get(i).get(j));
//			}
//			System.out.println(" ");
//		}
		
		
		for (int i = 584; i < list.size(); i++) {
			System.out.print(i +" ");
			for (int j = 0; j < list.get(i).size(); j++) {
				System.out.print("["+j+"] " + list.get(i).get(j));
			}
			System.out.println(" ");
		}
	}

	/**
	 * �����ļ�����InputStream��ȡExcel�����б������
	 * 
	 * @param fileName �ļ���
	 * @param s InputStream
	 * @return List<List<String>>
	 */
	public static List<List<String>> testPoiU(String fileName) {
		ReadExcel poi = new ReadExcel();
		List<List<String>> list = poi.read(fileName);
		return list;
	}
}
