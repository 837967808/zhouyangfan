package com.jihework.com;
/**
 * 1，	在项目中创建类,在主方法中实例化集合对象，并向集合中添加元素，最后将集合中的对象以String形式输出。
 */
import java.util.ArrayList;
import java.util.Iterator;

public class diyiti {
    public static void main(String[] args) {
		ArrayList<String> jihe=new ArrayList<String>();
		jihe.add("楼道");
		jihe.add("房屋");
		jihe.add("走廊");
		Iterator<String> sum=jihe.iterator(); 
		while(sum.hasNext()){
			String s=sum.next();
		}
		System.out.println(jihe);
	}
}