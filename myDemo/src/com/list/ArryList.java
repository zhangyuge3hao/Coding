package com.list;
import java.util.List;
import java.util.ArrayList;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年2月20日 下午5:34:19
* 
* 
*/
public class ArryList {
	private static void List(){
		List list = new ArrayList();//父类的应引用指向子类的对象
		list.add("1");
		list.add("2");
		list.add("3");
		list.add(4); //应当在一个集合list中，存储相同类型的东西
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	private static void arrayList(){
		//在List后，用<>的方式加类型约数，在编译的阶段就限制集合中的类型,且前后<>一致
		List<String> list = new ArrayList<String>();//父类的应引用指向子类的对象
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("2");
		//list.add(4); //已经约束为String
		int size = list.size();//因为局部变量size要进栈，访问栈的变量，要比访问方法快得多
		for(int i=0;i<size;i++){
			System.out.println(list.get(i));
		}
		System.out.println("contains 判断list是否包含要找的元素，返回boolean变量"+list.contains("1"));//contains 判断list是否包含要找的元素，返回boolean变量
		System.out.println("lastIndexOf 寻找最后一次出现该元素的下标"+list.lastIndexOf("2"));//lastIndexOf 寻找最后一次出现该元素的下标
		
		list.remove("2");//remove 从前向后，删除指定元素，而非下标
		size = list.size();
		for(int i=0;i<size;i++){
			System.out.println(list.get(i));
		}
		
		list.set(2,"4");//set 替换对应位置的元素
		size = list.size();
		for(int i=0;i<size;i++){
			System.out.println(list.get(i));
		}
		
		String [] s = list.toArray(new String[]{});//toArray([]{}) 注意()内有{}。将list转为规定格式的数组来遍历
		for(String sr : s){
			System.out.println(sr);
		}
	}
	public static void main(String [] args){
		arrayList();
	}
}
