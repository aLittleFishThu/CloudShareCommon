package test;

import java.io.UnsupportedEncodingException;

public class TestEncoding {
	public static void main (String args[]) throws UnsupportedEncodingException{
		String s="����";
		byte[] buffer1=s.getBytes("UTF-8");
		byte[] buffer2=s.getBytes("GBK");
 		String s1=new String(buffer1,"UTF-8");
		String s2=new String(buffer2,"UTF-8");
		System.out.println(s1);
		System.out.println(s2);
	}
}
