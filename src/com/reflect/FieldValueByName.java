package com.reflect;

import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import com.util.o;
import com.util.sy;

public class FieldValueByName {

	public String name;
	public int age;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FieldValueByName fb = new FieldValueByName();
		fb.setAge(10);
		fb.setName("CGY");
		HashMap<String,Method> hmp = new HashMap<String,Method>();
		sy.o(getFieldValueByName("name", fb ,hmp));
		try {
			o.o(((Method) hmp.get("name")));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}


	/**
	 * �����������ƺ����ȡ����ֵ���Ұѷ����ŵ�HashMap��
	 * @param fieldName ��������
	 * @param o ��
	 * @param hmp ��ŷ�����HashMap
	 * @return ����
	 */
	public static Object getFieldValueByName(String fieldName, Object o,HashMap hmp) {
		try {
			Method method = null;
			//���HashMap���Ƿ��Ѿ����˲���
			if (hmp.get(fieldName) == null) {
				String firstLetter = fieldName.substring(0, 1).toUpperCase();
				String getter = "get" + firstLetter + fieldName.substring(1);
				method = o.getClass().getMethod(getter, new Class[] {});
				hmp.put(fieldName, method);
			}else{
				method = (Method) hmp.get(fieldName);
			}
			//�������͵�ת�����������͵��ж�
			if (new Date().getClass() ==  method.getGenericReturnType()) {
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				return df.format(method.invoke(o, new Object[] {}));
			} else {
				return method.invoke(o, new Object[] {}) + "";
			}
		} catch (Exception e) {
			e.getMessage();
			return "getFieldValueByName�����쳣";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
