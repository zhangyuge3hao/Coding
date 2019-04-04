package ���Խṹ_1����;

import java.util.Arrays;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��2��23�� ����5:02:58
* 
* 	����࣬���ڷ�װ������������,�����������
*/
public class MyArrayObject {//A�������
	
	//�����ģ����ڴ洢���ݵ�Ŀ�����飨Ԫ�أ���ֻ�����ڴ�int���������͵Ĵ洢��object����
	private int[] elements;
	/**
	 * ��������ͬ�ķ��������������췽���������������ڵ�һ���౻new�ɶ���ʱ��������Ҫ������һЩ�����Ĺ��������������������ص㣺

	��1�����췽�������ֱ����붨������������ȫ��ͬ��û�з������ͣ�������voidҲû�У�

	��2�����췽���ĵ������ڴ���һ������ʱʹ��new�������еġ����췽���������ǳ�ʼ�����󡣾������£�
    Person p = new Person();  Person()���õľ���Person�Ĺ��췽����

	��3��ÿ�������������������췽����

	��4�����ܱ�static��final��synchronized��abstract��native���Ρ����췽�����ܱ�����̳С�

	��5�����췽���ڴ�������ʱ�Զ�ִ��,һ�㲻����ʽ��ֱ�ӵ��á�
	 */
	//��elements ���й��췽��
	public MyArrayObject(){
		//�ڹ��췽����Ϊelements ��ʼ��һ����ֵ,��Ȼ������0�����Ƕ������
		elements = new int[0];
	}
	
	/**
	 * Ϊelements�������ʹ�÷�ʽ
	 */
	//��ȡ����
	 public int size(){
		return elements.length;
	 }
	 //��ӡ����
	 public void show(){
		System.out.println(Arrays.toString(elements));
	 }
	 //����������������
	 public void add(int n){
		 int len = elements.length;
		 int arr[] = new int[len+1];
		 for(int i = 0;i<len; i++){
			 arr[i]=elements[i];
		 }
		 arr[len]=n;
		 elements = arr;//�޸ĺ�Ҫ��ָ��ָ��elements
	 }
	 //���������������
	 public void insert(int index ,int num){
		 int len = elements.length;
		 int[] arr = new int[len+1];
		 for(int i = 0;i<len+1;i++){
			 if(i < index){
				 arr[i] = elements[i];
			 }else if(i == index){
				 arr[i] = num;
			 }else{
				 arr[i] = elements[i-1];
			 }
		 }
		 elements = arr;
	 }
	 //��ȡĿ���±�Ԫ��
	 public int getEle(int index){
		 return elements[index];
	 }
	 //�滻�±�Ԫ��
	 public void replace(int index,int num){
		 elements[index] = num;
	 }
	 //ɾ����Ӧ�±�Ԫ��
	 public void deleteAtInd(int index){
		 int len = elements.length;
		 int len1 = size();
		 int[] arr = new int[len1-1];
		 if(index < 0 || index>=size()){
			 System.out.println("�±�Խ��");
		 }else{
			 for(int i = 0;i<len1-1;i++){
				 if(i < index){
					 arr[i] = elements[i];
				 }else{
					 arr[i] = elements[i+1];
				 }
			 }
			 elements = arr;
		 }
	 }
	 //��ǰ����ɾ����һ��Ŀ��Ԫ��
	 public void remove(int n){
		 int len = elements.length;
		 int index = 0;
		 boolean flag = false;
		 //getIndex
		 for(int i = 0;i<len ;i++){
			 if(elements[i] == n){
				 index = i;
				 flag = true;
				 break;
			 }
		 }
		 if(flag){
			 deleteAtInd(index);
		 }else{
			 System.out.println("��Ԫ�ز���������");
		 } 
	 }
	 //���ַ��������������ĳ��ֵ�Ƿ����
	 public boolean getIndOrder(int target){
		/**
		 * ʹ��begin��mid��end����¼����߽�Ͳ����м��
		 */
		int len = elements.length;
		int begin =0,end = len-1;
		int mid = (begin + end)/2;
		int times = 0;//��¼���ҵĴ�����������=lenʱ�˳�ѭ������ʾȫ�����ֲ������
		boolean flag = false;//�ҵ��˳��жϱ��
		//--------��Ƶ����----����ʼ��λ�úͽ�����λ���غϣ����߿�ʼλ���ڽ���λ�ú��棬����begin >= end
		//����ʼλ���ڽ���λ�ú��棬����begin > end
		while(times <= len){
			if(elements[mid] < target){
				begin = mid+1;
			}else if(elements[mid] > target){
				end = mid-1;
			}else if(begin > end){
				System.out.println("while�ڣ����޴���");
				break;
			}
			else{
				flag = true;
				break;
			}
			mid = (begin + end)/2;
			times++;
		}
		if(flag){
			System.out.println("�ҵ������"+target+"�����±꣺"+mid);
			 return true;
		}else{
			System.out.println("���޴���");
			 return false;
		}
	}
}
