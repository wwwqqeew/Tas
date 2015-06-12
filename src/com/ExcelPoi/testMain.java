package com.ExcelPoi;


import java.io.InputStream;
import java.util.List;

public class testMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> list = testPoiU("E:\\公司资料\\广铁\\文档2014-12-22\\土地清查表(广州房产管理所)20140325(最终版)模板.xls");
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
	 * 根据文件名和InputStream获取Excel所有列表的数据
	 * 
	 * @param fileName 文件名
	 * @param s InputStream
	 * @return List<List<String>>
	 */
	public static List<List<String>> testPoiU(String fileName) {
		ReadExcel poi = new ReadExcel();
		List<List<String>> list = poi.read(fileName);
		return list;
	}
}
