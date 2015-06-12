package com.reflex;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * ���������ߣ�
 * @author rocent
 *
 */
public class BeanHelper {
	/**
	 * @see #org.apache.commons.beanutils.BeanUtils.BeanUtils.describe(obj)
	 */ 
	public static Map describe(Object obj) {
		if (obj instanceof Map)//��������ߵĶ����Ƿ������ұߵ����ʵ��
			return (Map) obj;

		Map map = new HashMap();
		PropertyDescriptor[] descriptors = getPropertyDescriptors(obj.getClass());//������ĸ�������
		for(int i = 0; i < descriptors.length; i++ ) {
			String name = descriptors[i].getName();
			System.out.println("name:"+name);
            Method readMethod = descriptors[i].getReadMethod();
            System.out.println("readMethod:"+readMethod+"\n");
			if (readMethod != null) {
				try {
					map.put(name, readMethod.invoke(obj, new Object[]{}));//�Դ���ָ��������ָ����������ɴ� Method �����ʾ�ĵײ㷽����
					if("declaredFields".equals(name)){
						//JSONArray objf = JSONArray.fromObject(readMethod.invoke(obj, new Object[]{}));
						//infoMap = readMethod.invoke(obj, new Object[]{});
						//System.out.println("11111:"+name+"         "+objf.toString());
//						readMethod.invoke(obj, new Object[]{})888888
					}
					//JSONArray objf = JSONArray.fromObject(readMethod.invoke(obj, new Object[]{}));
//					System.out.println("11111:"+name+"         "+readMethod.invoke(obj, new Object[]{}).toString());
				}catch(Exception e){
//					GLogger.warn("error get property value,name:"+name+" on bean:"+obj,e);
					System.out.println(e);
				}
            }
		}
		return map;
	}

	public static PropertyDescriptor[] getPropertyDescriptors(Class beanClass) {
		BeanInfo beanInfo = null;
		try {
			beanInfo = Introspector.getBeanInfo(beanClass);
		} catch (IntrospectionException e) {
			return (new PropertyDescriptor[0]);
		}
		PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
		if (descriptors == null) {
			descriptors = new PropertyDescriptor[0];
		}
		return descriptors;
	}
}
