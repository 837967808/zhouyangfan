package com.jihework.com;
/**
 * 3，	在项目中创建一个User类自定义几个属性信息，在主方法中new出三个不同的User对象，创建集合对象存储刚刚新建的三个User对象。
   4，	在刚刚创建的类中，通过下标索引，循环打印出所有对象信息。

 */
import java.util.ArrayList;

import entity.User;

public class disanti {
            public static void main(String[] args) {
				ArrayList<User> people=new ArrayList<User>();
				User peo=new User();
				 peo.setName("张三");
				 peo.setAge(21);
				 peo.setDizhi("湖北");
				User peo2=new User();
				 peo2.setName("李四");
				 peo2.setAge(20);
				 peo2.setDizhi("湖南");
				User peo3=new User();
				 peo3.setName("王五");
				 peo3.setAge(22);
				 peo3.setDizhi("上海");
				people.add(peo);
				people.add(peo2);
				people.add(peo3);
				for (User user : people) {
					System.out.println(user.getName()+user.getAge()+user.getDizhi());
				}
	
			}
}
