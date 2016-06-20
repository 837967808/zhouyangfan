package com.jihework.com;
/**
 * 6，	分别向Set集合以及List集合中添加“A”，“a”，“c”,”C ””a”,观察重复值“a”能否在List集合以及Set集合中成功地添加。
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
				System.out.println("List方法"+string);
			}
    		for (String string : b) {
    			System.out.println("set方法"+string);
			}
    		
	}

}