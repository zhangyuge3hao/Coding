package com.GEEtest;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��1��31�� ����3:08:54
* 
* ����һ������t���Լ�n������������n���������ҵ��Ӻ�Ϊt��������ϡ�
* ˼·һ��
* 	��ȡ��ÿһ������õ����֣���Ŀ�����ֱȽϣ�����Ŀ������pass���������
* 		С��Ŀ�����֣����µ�ǰ���֣��ͺ����������Ӻ���target�Ƚ�
* 
*/
import java.util.Scanner;
public class J_�Ӻ� {
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		int target =0;
		String s[] ={};
		while(true){
			System.out.println("Please input the target number:");
			String tar = sc.next();
			System.out.println("Please input the source number,split it with ','");
			String resour = sc.next();
			if(tar.matches("\\d+")&&resour.matches("(\\d+[\\,])*\\d+")){
				target=Integer.parseInt(tar);
				s =resour.split(",");
				int sn[] = new int[s.length];
				for(int i=0;i<s.length;i++){
					sn[i]=Integer.parseInt(s[i]);
				}
				find(target,sn);
			}else{
				System.out.println("Input illegal");
			}		
		}
	}
	public static void find(int target ,int re[]){//sn��������ƥ�����������
/*		System.out.println("the target:"+target);
		for(int i : sn){
			System.out.println(i);
		}
		
		�������򣬷���
		���� ���ڱ�֤��ѡ���е�0����ͬ���ֵ���ϲ�������
		
*		for(��ͷ����sn����������){
 * 			�Ե�ǰ���֣���target�Ƚϣ�<=��Ϊһ��������У�
 * 			>target������(����д)
 * 			=target{
 *				���ص�ǰ
 * 			}<target��Ϊһ���������{
 * 				��ǰ+���һλ����target�Ƚ�
 * 					> �˳�
 * 					= ��¼���
 * 					< ������һλ
 * 			}
 * 			
		}
		*/
		int sn[] = bobbleSort(re);
		String union ="";//��¼ÿ�����ɵļӺ��飬�������
		int count =0;//��¼���ж��ٳɹ���
		int sum=0;
		for(int i=0;i<sn.length;i++){

			union="";
			if(sn[i]==target){
				union+="|"+sn[i];
				System.out.println(union);
				count++;
			}else if(sn[i]<target){
				int j=i;//ͨ��j����¼��ǰ���֣�������Ƚ�ѭ��������i���ڱȽ�ѭ���в����ı�
				boolean flag=true;
				union="";
				sum=0;
				while(flag){//��sum=��>target,��ѡ��������������Ӷ�<targetʱ��flag=false�˳�
					sum+=sn[j];
					union+="|"+sn[j];
					if(sum==target){
						System.out.println(union);
						count++;
						flag=false;
					}else if(){
						
					}else if(sum>target){
						flag=false;
					}else if(sum<target&&j==sn.length-1){
						flag=false;
					}else{
						j++;//ÿ��j���£���ʾ��ǰsum<target��j<����������߽磬���ڽ���һ�����ּ��뵽sum��
					}
				}
			}
		}
		System.out.println("There are "+count+" groups of result.");
	}
	public static int[] bobbleSort(int num[]){//ð������ ����
		int temp = 0;
		int len = num.length;
		while(len>=1){
			for(int i = 0; i<len-1;i++){
				if(num[i]>num[i+1]){
					temp=num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
				}
			}
			len--;
		}
		for(int n : num){
			System.out.print(n+" ");
		}
		System.out.println();
		return num;
	}
}
