package wodepackages;
import java.io.*;
public class Test {
	
	public static void main(String args[]) {
		
		Student student = new Student("XXXX","XXX",0,"XXXX");
		
		System.out.println("������������Ϣ");
		student.jianru();
		
		//try {
			//File file = new File("C:\\Users\\Administrator\\eclipse-workspace\\ShiYan5-WenJian\\src\\wodepackages\\A.txt");
			//if(!file.exists()){
               //file.createNewFile();
           // }
		//}catch(Exception e) {
			//System.out.println("�Ѵ�������ΪA���ļ��������������󣡣���");
		//}
		
		File sourceFile = new File("F://java05//B.txt");//��ȡ���ļ�
		File targetFile = new File("F://java05//A.txt");//д����ļ�
//		char c[] = new char[1000];
		String d = null;
		String e1 = null;
		String f = null;
		try {
		    Writer out = new FileWriter(targetFile,true);//ָ��Ŀ�ĵص������
		    Reader in = new FileReader(sourceFile);//ָ��Դ��������
		    BufferedReader br = new BufferedReader(in);
		    while((d = br.readLine())!= null) {
			    e1 = e1 + d;
		    }
		    e1 = e1.replaceAll("null","");
//		    int n = -1;
		    out.write(student.toString()+"\n");
//			while((n = in.read(c)) != -1) {
			for(int i = 0;i < e1.length();i = i+7) {
				if(i%2 == 0) {
					String p = e1.substring(i,i+7);
					f = f+ p + "��";
				}
				if(i%2 == 1) {
					String p = e1.substring(i,i+7);
					f = f+ p + "��\n";
				}
			}
			String g = f.replaceAll("null","");
			out.write(g);
			out.flush();
			out.close();
			br.close();
			System.out.println("�ѳɹ���������ţ�����");
		}
	    catch(IOException e) {
			System.out.println("��ȡ�ļ����󣡣���");
		}
	}
}