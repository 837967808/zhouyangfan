package com.jihework.com;
/**
 * 1��	����Ŀ�д�����,����������ʵ�������϶��󣬲��򼯺������Ԫ�أ���󽫼����еĶ�����String��ʽ�����
 */
import java.util.ArrayList;
import java.util.Iterator;

public class diyiti {
    public static void main(String[] args) {
		ArrayList<String> jihe=new ArrayList<String>();
		jihe.add("¥��");
		jihe.add("����");
		jihe.add("����");
		Iterator<String> sum=jihe.iterator(); 
		while(sum.hasNext()){
			String s=sum.next();
		}
		System.out.println(jihe);
	}
}