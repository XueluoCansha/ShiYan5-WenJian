package wodepackages;

import java.util.Scanner;

public class Student {
	String banji;//班级
	String xingming;//姓名
	int xuehao;//学号
	String tijiaoriqi;//提交日期
	
	Student(String a, String b, int c, String d){
		banji = a;
		xingming = b;
		xuehao = c;
		tijiaoriqi = d;
	}
	
	public String toString() {
		return "班级："+banji+"，姓名："+xingming+"，学号："+xuehao+"，提交日期："+tijiaoriqi;
	}
	
	Scanner scS = new Scanner(System.in);
	Scanner scI = new Scanner(System.in);
	
	void jianru()
	{
		try {
		    System.out.println("信息依次为：班级 姓名 学号 提交日期，信息间用回车隔开。");
		    banji = scS.nextLine();
		    xingming = scS.nextLine();
		    xuehao = scI.nextInt();
		    tijiaoriqi = scS.nextLine();
		}catch(Exception e) {
			System.out.print("请按提示输入正确的信息！！！");
		}
	}
}