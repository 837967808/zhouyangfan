package com.jihework.com;
/**
 * 2��	����Ŀ�д����࣬���������д������϶���ͨ��Math���random()���������ȡ�����е�ĳ��Ԫ�أ�Ȼ���Ƴ�����������λ���ǡ�2����Ԫ�أ����������顣
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
