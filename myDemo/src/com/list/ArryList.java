package com.list;
import java.util.List;
import java.util.ArrayList;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��2��20�� ����5:34:19
* 
* 
*/
public class ArryList {
	private static void List(){
		List list = new ArrayList();//�����Ӧ����ָ������Ķ���
		list.add("1");
		list.add("2");
		list.add("3");
		list.add(4); //Ӧ����һ������list�У��洢��ͬ���͵Ķ���
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	private static void arrayList(){
		//��List����<>�ķ�ʽ������Լ�����ڱ���Ľ׶ξ����Ƽ����е�����,��ǰ��<>һ��
		List<String> list = new ArrayList<String>();//�����Ӧ����ָ������Ķ���
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("2");
		//list.add(4); //�Ѿ�Լ��ΪString
		int size = list.size();//��Ϊ�ֲ�����sizeҪ��ջ������ջ�ı�����Ҫ�ȷ��ʷ�����ö�
		for(int i=0;i<size;i++){
			System.out.println(list.get(i));
		}
		System.out.println("contains �ж�list�Ƿ����Ҫ�ҵ�Ԫ�أ�����boolean����"+list.contains("1"));//contains �ж�list�Ƿ����Ҫ�ҵ�Ԫ�أ�����boolean����
		System.out.println("lastIndexOf Ѱ�����һ�γ��ָ�Ԫ�ص��±�"+list.lastIndexOf("2"));//lastIndexOf Ѱ�����һ�γ��ָ�Ԫ�ص��±�
		
		list.remove("2");//remove ��ǰ���ɾ��ָ��Ԫ�أ������±�
		size = list.size();
		for(int i=0;i<size;i++){
			System.out.println(list.get(i));
		}
		
		list.set(2,"4");//set �滻��Ӧλ�õ�Ԫ��
		size = list.size();
		for(int i=0;i<size;i++){
			System.out.println(list.get(i));
		}
		
		String [] s = list.toArray(new String[]{});//toArray([]{}) ע��()����{}����listתΪ�涨��ʽ������������
		for(String sr : s){
			System.out.println(sr);
		}
	}
	public static void main(String [] args){
		arrayList();
	}
}
