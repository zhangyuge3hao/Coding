package com.sort;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��2��22�� ����9:34:09
* 
* * https://www.cnblogs.com/onepixel/articles/7674659.html#!comments
* 
* ��������Insertion-Sort�����㷨������һ�ּ�ֱ�۵������㷨�����Ĺ���ԭ����ͨ�������������У�����δ�������ݣ��������������дӺ���ǰɨ�裬�ҵ���Ӧλ�ò����롣

3.1 �㷨����
һ����˵���������򶼲���in-place��������ʵ�֡������㷨�������£�

�ӵ�һ��Ԫ�ؿ�ʼ����Ԫ�ؿ�����Ϊ�Ѿ�������
ȡ����һ��Ԫ�أ����Ѿ������Ԫ�������дӺ���ǰɨ�裻
�����Ԫ�أ������򣩴�����Ԫ�أ�����Ԫ���Ƶ���һλ�ã�
�ظ�����3��ֱ���ҵ��������Ԫ��С�ڻ��ߵ�����Ԫ�ص�λ�ã�
����Ԫ�ز��뵽��λ�ú�
�ظ�����2~5��
*/
import java.util.Scanner;
public class ��������InsertinSort {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int [] a = {10};
		boolean flag = true;
		while(flag){
			System.out.println("Please input the numbers for InsertionSort,and split them with ','.Input # to stiop the progarm");
			String s = sc.next();
			if(s.matches("(\\d+\\,)*\\d+")){
				String []num = s.split("\\,");
				int len = num.length;
				int n[] = new int[len];
				for(int i = 0;i < len ;i++){
					n[i] = Integer.parseInt(num[i]);
				}
				//InsertionSort(n,len,a);
				insertionSort(n,len,a);//ͬһ�����飬�ڷ����д��ݣ���ֱ�Ӹı������е�ֵ����int ֮��Ĳ����ǲ���ı��
			}else if(s.equals("#")){
				System.out.println("Input abort.");
				flag = false;
			}else{
				System.out.println("Input illegal.");
			}
		}
	}
	public static void  insertionSort(int arr[],int len,int []a) {
	    int preIndex, current;
	    for (int i = 1; i < len; i++) {//i = boundry
	        preIndex = i - 1;//preIndex ����������һ��Ԫ�ص�����
	        current = arr[i];//current ������ĵ�һ��
	        
	      //ͨ��preIndex��������Ӻ���ǰ������ֻҪ������current������֣��ͽ���������λ�ã��������ҵ���Ҫ�����λ�ú���һ���Ի�ȫ������
	        while (preIndex >= 0 && arr[preIndex] > current) {
	            arr[preIndex + 1] = arr[preIndex];
	            preIndex--;
	        }
	        arr[preIndex + 1] = current;
	    }
	    for(int n :arr){
			System.out.print(n+" ");
		}
		/*System.out.println(a[0]);*/
	}
	public static void InsertionSort(int num[],int len,int[] a){
		int temp = 0;
		for(int b = 1;b<len;b++){//b = boundry,ָ������߽���ĵ�һ��δ����Ԫ��
			/* i ������������������ڵ����֣�����bԪ�رȽϣ����ҵ���bС��i����b�ŵ�i�ĺ�һλ��
			 * 	 ��i��û�б�bС��������b����0��
			 */
			int index = 0;
			temp = num[b];
			boolean flag = true;
			for(int i = b-1;i>=0&&flag;i--){//i ������������������ڵ����֣�����bԪ�رȽ�,���±�b��Сi���������ҵ������˳���
				if(num[i]<num[b]){
					index = i+1;// index Ĭ��Ϊ0����i��û�б�bС������index���ᱻ�ı䣬��b����0��
					flag = false;
				}
			}
			for(int i = b-1; i>=index; i--){//����index��λ�ã����������д�index���������ұ߽磨b-1��������Ԫ�������ƶ�
				num[i+1] = num[i];
			}
			num[index]  = temp;
		}
		for(int n :num){
			System.out.print(n+" ");
		}
/*		a[0]=11;
		System.out.println(a[0]);*/
		
	}
	
}
