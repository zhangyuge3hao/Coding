package com.flowcontrol;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��4�� ����5:07:18
* 	
* 	if�����3�ָ�ʽ��
* 		A. if(��ϵ���ʽ){            ---�ʺ��� һ ��������ж�
* 				�����
* 			}
* 			���̣�1�� �ȼ����ϵ���ʽ
* 				2�� ����ϵ���ʽΪtrue����ִ�������
* 				3�� ����ϵ���ʽΪfalse�������������
* 
* 		B. if(��ϵ���ʽ){            ---�ʺ��� �� ��������ж�
* 				�����1
* 			}else{
* 				�����2
* 			}
* 			���̣�1�� �ȼ����ϵ���ʽ
* 				2�� ����ϵ���ʽΪtrue����ִ�������1
* 				3�� ����ϵ���ʽΪfalse����ִ��else�������2
* 
*  		B. if(��ϵ���ʽ1){            ---�ʺ��� �� ��������жϣ�ƽʱ������
* 				�����1
* 			}else if(��ϵ���ʽ2){
* 				�����2
* 			}else if(��ϵ���ʽ){
* 				�����2
* 			.......
* 			}else{
* 				�����n+1 ---------���else���������ǣ���Ҫ�ǵ�д
* 			}
* 			���̣�1�� �ȼ����ϵ���ʽ
* 				2�� ����ϵ���ʽΪtrue����ִ�������1
* 				3�� ����ϵ���ʽΪfalse����ִ��else�������2
* 
*/
import java.util.*;
public class IfDemoѡ��ṹ {
	public static void main(String[] args) {
		//��һ��if���
		System.out.println("---------��һ��if���--��ʼ----------");
		int a = 10;
		int b = 21;
		if(a==b){
			System.out.println("��a==b������ʾ");
		}
		if(a!=b){
			System.out.println("��a!=b������ʾ");
		}
		System.out.println("---------��һ��if���--�������ڶ��ֿ�ʼ----------");
		
		//�ڶ���if���
		if(a%2==0){
			System.out.println("��a%2==0Ϊtrue����aΪż��");
		}else{
			System.out.println("��a%2==0Ϊfalse����aΪ����");
		}
		System.out.println("---------�ڶ���if���--�����������ֿ�ʼ----------");
		
		//������if���
		/*ʵ�ֹ���
		 * x>=3 y=2x+1
		 * -1<=x<=3 y=2x
		 * x<=-1 y=2x-1
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("������X��ֵ��");
		int x = sc.nextInt();
		
		if(x>=3){
			System.out.println("x>=3,y=2x+1,y="+(2*x+1));//ʹ��()���ַ�����������㲿�����������������Ĳ������нϸߵ�����Ȩ
		}else if(-1<=x && x<=3){
			System.out.println("-1<=x<=3,y=2x,y="+2*x);
		}else if(x<=-1){
			System.out.println("x<=-1,y=2x-1,y="+(2*x-1));
		}else{
			System.out.println("x�����ڣ�ĩβ��else����Ҫд");
		}
		System.out.println("---------������if���--д��һ����----------");
		
		System.out.println("---------������if���--д������ʼ----------");
		
		int  y ;	//y�ڶ���ʱ������ֵ
		if(x>=3){
			y=(2*x+1);
			System.out.println("x>=3,y=2x+1,y="+y);
		}else if(-1<=x && x<=3){
			y=2*x;
			System.out.println("-1<=x<=3,y=2x,y="+y);
		}else if(x<=-1){
			y=2*x-1;
			System.out.println("x<=-1,y=2x-1,y="+y);
		}else{
			y = 0;       //�����������y��ֵ��ѡ�������ʹ��y����ʱ����
			System.out.println("x�����ڣ�ĩβ��else����Ҫд��ͬʱyҲҪ��ֵ");
		}
		System.out.println("y��ѡ�����⣩="+y);  //������������else�ﲻдy��ȡֵ�����y�ᱨ��
										//The local variable y may not have been initialized
										//���������������if��䣬ֻҪ�������ж����д���yû�и�ֵ��������ͻᱨ��yû�и���ֵ��
	}
}


