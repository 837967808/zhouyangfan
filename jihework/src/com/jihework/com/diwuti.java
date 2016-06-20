package com.jihework.com;
/**
 * 5，	将1-100之间的所有正整数存放在一个List集合中，并将集合中索引位置是10的对象从集合中移除。
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
