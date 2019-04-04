package com.summarize;

public class StringBufferTest {
	public static void main(String[] args){
		StringBuffer buffer= new StringBuffer("hello,");    //创建一个 StringBuffer 对象
		String str="World!";
		buffer.append(str);    //向 StringBuffer 对象追加 str 字符串
		buffer.append("");
		System.out.println(buffer.substring(0));    //输出：Hello,World!
		
		buffer.append("Hello ").append("World!!1asd") ;        // 向StringBuffer添加内容
		String a = "1asd";
        if(buffer.indexOf(a)==-1){//StringBuffer可以通过形参找到String里是否包含一组字母,indexOf返回一个下标，下标位-1的时候表示不存在
        	
            System.out.println("没有查找到指定的内容") ;
        }else{    // 不为01表示查找到内容
            System.out.println("可以查找到指定的内容") ;
        }
        System.out.println(buffer.substring(0)) ;
        System.out.println(buffer.substring(1)) ;
        System.out.println(buffer.substring(0,1)) ;
	}
}
