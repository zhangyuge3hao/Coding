package com.list;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年6月2日 上午11:11:21
* 
* 	arraylist是动态数组，它具有三个好处分别是:
* 	A. 动态的增加和减少元素 
* 	B. 实现了ICollection和IList接口
* 	C. 灵活的设置数组的大小
* 
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExamples动态数组 {
	public static void main(String[] args) {
		// 创建一个空的数组链表对象list，list用来存放String类型的数据
        ArrayList<String> list = new ArrayList<String>();

        // 增加元素到list对象中
        list.add("Item1");
        list.add("Item2");
        list.add(2, "Item3"); // 此条语句将会把“Item3”字符串增加到list的第3个位置。
        list.add("Item4");

        // 显示数组链表中的内容
        System.out.println("arraylist有以下元素: "+ list);

        // 检查元素的位置
        int pos = list.indexOf("Item2");
        System.out.println("元素 Item2 在哪一位: " + pos);

        // 检查数组链表是否为空
        boolean check = list.isEmpty();
        System.out.println("检查数组链表是否为空: " + check);

        // 获取链表的大小
        int size = list.size();
        System.out.println("获取链表的大小: " + size);

        // 检查数组链表中是否包含某元素
        boolean element = list.contains("Item5");
        System.out.println("检查数组链表中是否包含某元素--Item5: "+ element);

        // 获取指定位置上的元素
        String item = list.get(0);
        System.out.println("获取指定位置上的元素- 0位置: " + item);

        // 遍历arraylist中的元素

        // 第1种方法: 循环使用元素的索引和链表的大小
        System.out.println("使用元素的索引和链表的大小来遍历链表：");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("索引: " + i + " - 的元素: " + list.get(i));
        }

        // 第2种方法:使用foreach循环
        System.out.println("使用foreach遍历链表");
        for (String str : list) {
            System.out.println("元素分别是 is: " + str);
        }

        // 第三种方法:使用迭代器
        // hasNext(): 返回true表示链表链表中还有元素
        // next(): 返回下一个元素
        System.out.println("hasNext(): 返回true表示链表链表中还有元素");
        int temp=0;
        for (Iterator<String> it = list.iterator(); it.hasNext();temp++) {
            System.out.println("第"+temp+"个元数是：" + it.next());
        }

        // 替换元素
        list.set(1, "NewItem");
        System.out.println("替换第一位的元素: " + list);

        // 移除元素
        // 移除第0个位置上的元素
        list.remove(0);

        // 移除第一次找到的 "Item3"元素
        list.remove("Item3");

        System.out.println("移除第一次找到的 \"Item3\"元素: " + list);

        // 转换 ArrayList 为 Array
       String[] simpleArray = list.toArray(new String[list.size()]);
       // System.out.println("The array created after the conversion of our arraylist is: "+ Array.toString(simpleArray));
        /*List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);

        //方法1
        Iterator it1 = list.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

        //方法2
        for(Iterator it2 = list.iterator();it2.hasNext();){
             System.out.println(it2.next());
        }

        //方法3
        for(String tmp:list){
            System.out.println(tmp);
        }

        //方法4
        for(int i = 0;i < list.size(); i ++){
            System.out.println(list.get(i));
        }*/

    }	
}
