package com.jihework.com;
/**
 * 3��	����Ŀ�д���һ��User���Զ��弸��������Ϣ������������new��������ͬ��User���󣬴������϶���洢�ո��½�������User����
   4��	�ڸոմ��������У�ͨ���±�������ѭ����ӡ�����ж�����Ϣ��

 */
import java.util.ArrayList;

import entity.User;

public class disanti {
            public static void main(String[] args) {
				ArrayList<User> people=new ArrayList<User>();
				User peo=new User();
				 peo.setName("����");
				 peo.setAge(21);
				 peo.setDizhi("����");
				User peo2=new User();
				 peo2.setName("����");
				 peo2.setAge(20);
				 peo2.setDizhi("����");
				User peo3=new User();
				 peo3.setName("����");
				 peo3.setAge(22);
				 peo3.setDizhi("�Ϻ�");
				people.add(peo);
				people.add(peo2);
				people.add(peo3);
				for (User user : people) {
					System.out.println(user.getName()+user.getAge()+user.getDizhi());
				}
	
			}
}
