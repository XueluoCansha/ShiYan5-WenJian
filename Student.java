package wodepackages;

import java.util.Scanner;

public class Student {
	String banji;//�༶
	String xingming;//����
	int xuehao;//ѧ��
	String tijiaoriqi;//�ύ����
	
	Student(String a, String b, int c, String d){
		banji = a;
		xingming = b;
		xuehao = c;
		tijiaoriqi = d;
	}
	
	public String toString() {
		return "�༶��"+banji+"��������"+xingming+"��ѧ�ţ�"+xuehao+"���ύ���ڣ�"+tijiaoriqi;
	}
	
	Scanner scS = new Scanner(System.in);
	Scanner scI = new Scanner(System.in);
	
	void jianru()
	{
		try {
		    System.out.println("��Ϣ����Ϊ���༶ ���� ѧ�� �ύ���ڣ���Ϣ���ûس�������");
		    banji = scS.nextLine();
		    xingming = scS.nextLine();
		    xuehao = scI.nextInt();
		    tijiaoriqi = scS.nextLine();
		}catch(Exception e) {
			System.out.print("�밴��ʾ������ȷ����Ϣ������");
		}
	}
}