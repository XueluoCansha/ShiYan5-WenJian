package wodepackages;
import java.io.*;
public class Test {
	
	public static void main(String args[]) {
		
		Student student = new Student("XXXX","XXX",0,"XXXX");
		
		System.out.println("请输入您的信息");
		student.jianru();
		
		//try {
			//File file = new File("C:\\Users\\Administrator\\eclipse-workspace\\ShiYan5-WenJian\\src\\wodepackages\\A.txt");
			//if(!file.exists()){
               //file.createNewFile();
           // }
		//}catch(Exception e) {
			//System.out.println("已存在命名为A的文件，或发生其他错误！！！");
		//}
		
		File sourceFile = new File("F://java05//B.txt");//读取的文件
		File targetFile = new File("F://java05//A.txt");//写入的文件
//		char c[] = new char[1000];
		String d = null;
		String e1 = null;
		String f = null;
		try {
		    Writer out = new FileWriter(targetFile,true);//指向目的地的输出流
		    Reader in = new FileReader(sourceFile);//指向源的输入流
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
					f = f+ p + "，";
				}
				if(i%2 == 1) {
					String p = e1.substring(i,i+7);
					f = f+ p + "。\n";
				}
			}
			String g = f.replaceAll("null","");
			out.write(g);
			out.flush();
			out.close();
			br.close();
			System.out.println("已成功加入标点符号！！！");
		}
	    catch(IOException e) {
			System.out.println("读取文件错误！！！");
		}
	}
}