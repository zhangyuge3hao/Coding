package com.GEEtest;
/**
����������������һ��ջ����֪Ԫ�صĽ�ջ���У��ж�һ����ջ������Ԫ����ɵ������Ƿ��ǿ��ܵĳ�ջ���С�
���磬��ջ����Ϊ1 2 3 4������ܵĳ�ջ������4 3 2 1��1 4 3 2�ȡ���1 4 2 3�Ͳ��ǡ�
��������ʽ���ӱ�׼�����ȡ��һ����һ������N��3��N��10����������N��Ԫ�أ����ջ������1 2 3 ���� N��
�ڶ����ǿո�ָ���1~N�����ֵ�һ�����С�
�������ʽ�����׼�����ӡ���������������ǿ��ܵĳ�ջ���У����ӡ��YES����
�����ӡ��NO��������ĩҪ���һ���س�����
������������
3
3 1 2
�����������
NO
������˵������ջ����Ϊ1 2 3�ĳ�ջ������û��3 1 2
�����ֱ�׼�������ȫ��ȷ��20�֣�ÿ�����Ե�4�֡��ϴ�c����Դ����Ϊoutstack.c��

 */
import java.util.Scanner;
import java.util.ArrayList;
public class P_2 {
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	public static void main(String[] args){
		boolean f = true;
		Scanner sc = new Scanner(System.in);
		while(f){
			System.out.println("�����볤��N");
			int n = sc.nextInt();

			String notuse = sc.nextLine();
			System.out.println("�������ջ˳��");
			String s = sc.nextLine();
			
			String[] p = s.split("\\ ");
			int[] pop = new int[n]; 
			int[] push = new int[n];
			for(int i = 0;i<n;i++){
				pop[i] = Integer.parseInt(p[i]);
				push[i] = i+1;
			}
			check(n,push,pop);
		}
	}
	//�����n
	public static void check (int len,int[] push,int[] pop){
		boolean flag = true;//����������������ȷ������true
		//for(int ex = 0;ex<1;ex++){//ex��popѭ��
		for(int ex = 0;ex<len;ex++){//ex��popѭ��	 
			int n = push[ex];//n�䵱������
			System.out.println(" ��������"+n);
			//���n��pop����±�,n��push����±����ex
			int index = 0;
			for(int i = 0;i<len;i++){
				if(n == pop[i]){
					index = i;
				}
			}
			
			//��pop�е�n����ģ���push�У���nǰ���ֵ
			getA(len,ex,index,push,pop);
			
			//�ж��Ƿ�����
			if(order()){
			}else{
				System.out.println("NO");
				flag = false;
				break;
			}
			arr.clear();
		}
		if(flag){
			System.out.println("yes");
		}
	}
	public static boolean order(){
		boolean f = true;
		int len = arr.size();
		for(int i = 0 ;i<len ;i++){
			f = true;
			for(int j = i+1 ;j<len ;j++){
				if(arr.get(i)<arr.get(j)){
					f = false;
					return f;
				}
			}
		}
		return f;
	}
	public static void getA(int len,int ex,int index,int[] push,int[]pop){
		//�ҵ�pop����n�����
		for(int i = index+1 ;i<len ;i++){
			arr.add(pop[i]);
		}
		System.out.println("pop��"+pop[index]+"���������"+arr);

		int lenA = arr.size();
		//��arr�����ȥpush��exǰ���ң��Ҳ�����ɾ��arr������,
		int delete = 0;//�������arr��ͬʱɾ��arr��Ķ��������±���:�õ�����delete����ѭ��iͬ��������remove������delete--
		for(int i = 0 ;i<lenA ;i++,delete++){
			boolean f =false;
			if(ex==0){//û�б�push��һ��Ԫ�ػ�����ջ�ģ�arr�϶�Ϊ��
				f = true;
			}
			for(int j = 0 ;j<ex ;j++){
				if(arr.get(i) == push[j]){//ֻҪ�ҵ����˳�
					f = true;
					break;
				}
			}
			if(f){
				arr.remove(delete);
				System.out.println("arr"+arr);
				delete--;
			}
		}
		System.out.println("��push��"+pop[index]+"�ԱȺ�ʣ��"+arr);
		/*for(int i:copy){
			System.out.print(i);
		}
		System.out.println(arr);
		for(int i = 0 ;i<lenA ;i++){
			if(){
				res.add();
			}
		}*/
	}
}
