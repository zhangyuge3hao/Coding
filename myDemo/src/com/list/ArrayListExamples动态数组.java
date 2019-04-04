package com.list;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��6��2�� ����11:11:21
* 
* 	arraylist�Ƕ�̬���飬�����������ô��ֱ���:
* 	A. ��̬�����Ӻͼ���Ԫ�� 
* 	B. ʵ����ICollection��IList�ӿ�
* 	C. ������������Ĵ�С
* 
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExamples��̬���� {
	public static void main(String[] args) {
		// ����һ���յ������������list��list�������String���͵�����
        ArrayList<String> list = new ArrayList<String>();

        // ����Ԫ�ص�list������
        list.add("Item1");
        list.add("Item2");
        list.add(2, "Item3"); // ������佫��ѡ�Item3���ַ������ӵ�list�ĵ�3��λ�á�
        list.add("Item4");

        // ��ʾ���������е�����
        System.out.println("arraylist������Ԫ��: "+ list);

        // ���Ԫ�ص�λ��
        int pos = list.indexOf("Item2");
        System.out.println("Ԫ�� Item2 ����һλ: " + pos);

        // ������������Ƿ�Ϊ��
        boolean check = list.isEmpty();
        System.out.println("������������Ƿ�Ϊ��: " + check);

        // ��ȡ����Ĵ�С
        int size = list.size();
        System.out.println("��ȡ����Ĵ�С: " + size);

        // ��������������Ƿ����ĳԪ��
        boolean element = list.contains("Item5");
        System.out.println("��������������Ƿ����ĳԪ��--Item5: "+ element);

        // ��ȡָ��λ���ϵ�Ԫ��
        String item = list.get(0);
        System.out.println("��ȡָ��λ���ϵ�Ԫ��- 0λ��: " + item);

        // ����arraylist�е�Ԫ��

        // ��1�ַ���: ѭ��ʹ��Ԫ�ص�����������Ĵ�С
        System.out.println("ʹ��Ԫ�ص�����������Ĵ�С����������");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("����: " + i + " - ��Ԫ��: " + list.get(i));
        }

        // ��2�ַ���:ʹ��foreachѭ��
        System.out.println("ʹ��foreach��������");
        for (String str : list) {
            System.out.println("Ԫ�طֱ��� is: " + str);
        }

        // �����ַ���:ʹ�õ�����
        // hasNext(): ����true��ʾ���������л���Ԫ��
        // next(): ������һ��Ԫ��
        System.out.println("hasNext(): ����true��ʾ���������л���Ԫ��");
        int temp=0;
        for (Iterator<String> it = list.iterator(); it.hasNext();temp++) {
            System.out.println("��"+temp+"��Ԫ���ǣ�" + it.next());
        }

        // �滻Ԫ��
        list.set(1, "NewItem");
        System.out.println("�滻��һλ��Ԫ��: " + list);

        // �Ƴ�Ԫ��
        // �Ƴ���0��λ���ϵ�Ԫ��
        list.remove(0);

        // �Ƴ���һ���ҵ��� "Item3"Ԫ��
        list.remove("Item3");

        System.out.println("�Ƴ���һ���ҵ��� \"Item3\"Ԫ��: " + list);

        // ת�� ArrayList Ϊ Array
       String[] simpleArray = list.toArray(new String[list.size()]);
       // System.out.println("The array created after the conversion of our arraylist is: "+ Array.toString(simpleArray));
        /*List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);

        //����1
        Iterator it1 = list.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

        //����2
        for(Iterator it2 = list.iterator();it2.hasNext();){
             System.out.println(it2.next());
        }

        //����3
        for(String tmp:list){
            System.out.println(tmp);
        }

        //����4
        for(int i = 0;i < list.size(); i ++){
            System.out.println(list.get(i));
        }*/

    }	
}
