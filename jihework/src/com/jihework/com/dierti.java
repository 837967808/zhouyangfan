package com.jihework.com;
/**
 * 2，	在项目中创建类，在主方法中创建集合对象，通过Math类的random()方法随机获取集合中的某个元素，然后移除数组中索引位置是“2”的元素，最后遍历数组。
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class dierti {
       public static void main(String[] args) {
		  ArrayList<String> number=new ArrayList<String>();
		  number.add("a");
		  number.add("b");
		  number.add("c");
		  number.add("d");
		  Iterator<String> num=number.iterator();
		  while(num.hasNext()){
			  String shuzi=num.next();
		  }
		  System.out.println(number);
		  number.remove(2);
		  System.out.println(number);
		  int score=((int)(Math.random()*4) + 0);
		  for (int i = 0; i < number.size(); i++) {
			 i=score;
			System.out.println(number.get(i));
			break;
		}
		  
	}
}
