package com.fils;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��2��23�� ����11:36:10
* 
* 
*/
import java.io.File;
public class ɨ�豾���ļ� {
	public static void main(String []args){
		scan("C:\\Coding\\Workspace\\Servers");
		//"C:/Coding/Workspace/Servers" ��б�ܺ�˫б��һ��
	}
	static void scan(String add){
		File file = new File(add);
		File []ff = file.listFiles();//����һ������File������飬���洢��ǰ·���µ��ļ����ļ��е�����
		int len = ff.length;
		for(int i = 0; i<len ; i++){
			if(ff[i].isFile()){//�ļ���.isFile()�ж��Ƿ�����ͨ�ļ�
				System.out.println(ff[i].getName());
			}else{
				System.out.println(add+"\\"+ff[i].getName()+"----");
				scan(add+"\\"+ff[i].getName());
			}
		}
	}
}
