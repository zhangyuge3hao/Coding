package com.GEEtest;
/**
 * ����������������һ��ջ����֪Ԫ�صĽ�ջ���У��ж�һ����ջ������Ԫ����ɵ������Ƿ��ǿ��ܵĳ�ջ���С�
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

�жϱ�׼����ջ�����У�Ԫ��i֮�����б�iС��Ԫ�ؼ�����ǽ������еġ�

D ��4 3 1 2�� ѡ��ĳ�ջ˳������ 1 �� 2 ���޷���ɵ�,���Է��֣� ������������Ԫ�ص�˳������һ�£��Ϳ��������

�ܽ᣺
��˳����ջ�����У�����Ԫ�� e ���� e ����ջ��Ԫ�أ����ұ� e ���ջ��Ԫ�أ�һ��������ġ�

�������е��ƿڣ���ô�ȼ��� �� ����������� ��

�������У�3 1 2 4

ѡ������Ԫ�� e ������ѡ�� 3
�� 3 ���ջ��������Ԫ�� 1 2 4
���б� 3 ����ջ��������Ԫ�� 1 2
���� 1 2 ������ģ������������
����������в��ǺϷ���ջ����
 */

import java.util.ArrayList;
import java.util.Scanner;
public class P_����_�ж�һ����ջ������Ԫ����ɵ������Ƿ��ǿ��ܵĳ�ջ���� {
/**
 *  ����
 * @param args
 */
	public static void main(String []args){
		boolean f = true;
		Scanner sc = new Scanner(System.in);
		while(f){
			System.out.println("��������N��3��N��10����");
			/**
			 * next() �� nextLine() ����
next():
1��һ��Ҫ��ȡ����Ч�ַ���ſ��Խ������롣�Կո񡢻س���Tab��������Ϊ����������
2����������Ч�ַ�֮ǰ�����Ŀհף�next() �������Զ�����ȥ����
3��ֻ��������Ч�ַ���Ž����������Ŀհ���Ϊ�ָ������߽�������
next() ���ܵõ����пո���ַ�����
nextLine()��
1����EnterΪ������,Ҳ����˵ nextLine()�������ص�������س�֮ǰ�������ַ���
			 */
			String num = sc.nextLine();// �ÿո�ֿ���������nextLine���ܽ��ܵ��ո�
			System.out.println("������ջ˳���ÿո�ָ�");
			String push = sc.nextLine();
			System.out.println("�����ջ˳���ÿո�ָ�");
			String pop = sc.nextLine();
			int n = Integer.parseInt(num);
			if(n>=3&&n<=10){
				int ph[] = new int[n];
				int pp[] = new int[n];
				String p1[] = push.split("\\ ");
				String p2[] = pop.split("\\ ");
/*				for(String a:p1){
					System.out.println(a);
				}
				for(String a:p2){
					System.out.println(a);
				}*/
				for(int i = 0; i<n;i++){
					ph[i]=Integer.parseInt(p1[i]);
					pp[i]=Integer.parseInt(p2[i]);
				}
				//check(n,ph,pp);
				check(4,ph,pp);
			}else{
				System.out.println("��������N����");
			}
			
		}
	}
	public static void check(int len, int ph[],int pp[]){
		/**
		 * ��������Ԫ�أ���������ջ��Ԫ�أ����������ջʱ������������
		 * ��i����pp[i],��ÿ��pp[i]��������Ԫ��
		 * ��Ϊ���ձȽϵ��ǣ���pp�У���ЩԪ�ص�˳���Ƿ�����
		 * ��Ҫȥpp�ҵ���n=pp[i]����ĳ�ջԪ��
		 * �ٸ�����ЩԪ��ȥph�бȶԣ�����Ҳ��nǰ����ֵ�Ԫ��
		 * ����arr����ЩԪ���Ƿ�����
		 */
		//ArrayList<String> list = new ArrayList<String>();
		//��ͬ��String��ArrayList��int �����[]
		ArrayList<Integer> arr = new ArrayList<Integer>();//��¼ph����nǰ�ģ��ҳ�����pp�е�Ԫ��
		int n = 0;
		int indexP = 0;//��¼n������pp�е��±�
		int indexH = 0;//��¼n������ph�е��±�
		boolean flag = true;//��¼��ջpp���У������������ֶ��ԣ��Ƿ�����ȷ����
		for(int i = 0;i<len ;i++){
		//int i=0;
			flag = true;//����i����
			n=pp[i];//ȷ�����ڵ�n
			for(int j = 0;j<len ;j++){//��pp�ҵ��ں������ջԪ��,�ŵ�arr�
				if(n==pp[j]){
					indexP = j;
				}
				if(n==ph[j]){
					indexH = j;
				}
			}
			for(int j = indexP+1 ;j<len ;j++){//��pp�ҵ��ں������ջԪ��,�ŵ�arr�
				arr.add(pp[j]);
			}
			int lenArr = arr.size();
			boolean f = true;//�ж�arr�е�Ԫ���Ƿ���ph��n��ǰ�棬��Ҫÿ�θ���
			for(int j = 0;j<lenArr ;j++){//ɾ��arr�У�������ph�� n ǰ���Ԫ��
				f = false;
				for(int k = 0;k<indexH;k++){
					if(arr.get(j)==ph[k]){
						f = true;//false �Ͳ��ᱻ��arr���޳�
					}
				}
				if(f){
					arr.remove(j);
				}
			}
			System.out.println("�޳���"+arr);//1 2 3 4 ,3 2 1 4 ,3 1 2 4
			int lenArrAfter = arr.size();
			for(int j = 0;j<lenArrAfter-1;j++){
				f = false;
				if(arr.get(j)<arr.get(j+1)){
					f = true;//true ˵���������Ǵ�������
				}
			}
			if(f){
				System.out.println("����");
				flag = false;
				break;
			}else{
				System.out.println("��ȷ");
				flag = true;
			}
		}
		if(flag){
			System.out.println("����ȷ����");
		}else{
			System.out.println("�Ǵ�������");
		}

	}
}
