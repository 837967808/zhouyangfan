package com.jihework.com;
/**
 * 6��	�ֱ���Set�����Լ�List��������ӡ�A������a������c��,��C ����a��,�۲��ظ�ֵ��a���ܷ���List�����Լ�Set�����гɹ�����ӡ�
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class diliuti {
    public static void main(String[] args) {
    		List<String> a=new ArrayList<String>();
    		Set<String> b=new HashSet<String>();
    		a.add("A");
    		a.add("a");
    		a.add("c");
    		a.add("C");
    		a.add("a");
    		b.add("A");
    		b.add("a");
    		b.add("c");
    		b.add("C");
    		b.add("a");
    		for (String string : a) {
				System.out.println("List����"+string);
			}
    		for (String string : b) {
    			System.out.println("set����"+string);
			}
    		
	}

}