package com.summarize;

public class StringBufferTest {
	public static void main(String[] args){
		StringBuffer buffer= new StringBuffer("hello,");    //����һ�� StringBuffer ����
		String str="World!";
		buffer.append(str);    //�� StringBuffer ����׷�� str �ַ���
		buffer.append("");
		System.out.println(buffer.substring(0));    //�����Hello,World!
		
		buffer.append("Hello ").append("World!!1asd") ;        // ��StringBuffer�������
		String a = "1asd";
        if(buffer.indexOf(a)==-1){//StringBuffer����ͨ���β��ҵ�String���Ƿ����һ����ĸ,indexOf����һ���±꣬�±�λ-1��ʱ���ʾ������
        	
            System.out.println("û�в��ҵ�ָ��������") ;
        }else{    // ��Ϊ01��ʾ���ҵ�����
            System.out.println("���Բ��ҵ�ָ��������") ;
        }
        System.out.println(buffer.substring(0)) ;
        System.out.println(buffer.substring(1)) ;
        System.out.println(buffer.substring(0,1)) ;
	}
}
