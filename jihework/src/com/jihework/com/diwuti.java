package com.jihework.com;
/**
 * 5��	��1-100֮������������������һ��List�����У���������������λ����10�Ķ���Ӽ������Ƴ���
 */
import java.util.ArrayList;


public class diwuti {
        public static void main(String[] args) {
			ArrayList<Integer> num=new ArrayList<Integer>();
			for (int i = 0; i < 100; i++) {
				  num.add(i);				  
				  System.out.println(num.get(i));				  
			}
			num.remove(10);	
			System.out.println(num);
		}
}
