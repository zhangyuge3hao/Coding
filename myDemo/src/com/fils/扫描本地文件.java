package com.fils;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年2月23日 上午11:36:10
* 
* 
*/
import java.io.File;
public class 扫描本地文件 {
	public static void main(String []args){
		scan("C:\\Coding\\Workspace\\Servers");
		//"C:/Coding/Workspace/Servers" 反斜杠和双斜杠一样
	}
	static void scan(String add){
		File file = new File(add);
		File []ff = file.listFiles();//建立一个【】File类的数组，来存储当前路径下的文件和文件夹的名字
		int len = ff.length;
		for(int i = 0; i<len ; i++){
			if(ff[i].isFile()){//文件名.isFile()判断是否是普通文件
				System.out.println(ff[i].getName());
			}else{
				System.out.println(add+"\\"+ff[i].getName()+"----");
				scan(add+"\\"+ff[i].getName());
			}
		}
	}
}
