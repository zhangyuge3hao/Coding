package com.GEEtest;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��1��18�� ����5:29:04
* 
* 
*/
import java.util.Scanner;
public class H_����ѡ���� {
	public static void main(String [] args){
/*		N������Χ��һ��Ȧ
		1���ӵ�һֻ���ӿ�ʼ��������һֻ���ӱ�1,����ı���2
		2��ÿ����2�ĺ����˳���Ȼ�����һֻ�������¿�ʼ������
		3��Ҫ������˳���˳������ʣ�µ���
*/
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("Input the number of monkeies");
			String s = sc.next();
			if(s.matches("\\d+")){
				//getOutOrder(Integer.parseInt(s));//��12Ϊ˳��������2�ĺ����˳�
				//getOutOrder3(Integer.parseInt(s));//��123Ϊ˳��������3�ĺ����˳�
				
				getintegrity(Integer.parseInt(s));
			}else{
				System.out.println("Input illegal");
			}
		}
	}
	public static void getintegrity(int n){
		int mon[] =new int[n];
		int check=0;
		int temp=0;//��temp��¼��һ�����ӱ���������1��2��3�£�temp=2����ֻ���ӱ�2������ǰ���Ӽ�¼�±겢�˳���Ϸ
		int tocken=1;
		String res="";
		for(int i=0;i<n;i++){ //ÿ��Ԫ�ص��±�ʼ�ձ�ʾ���ţ�Ԫ�����ݼ�¼���ӱ���������
			if(tocken==4){
				tocken=1;
			}
			mon[i]=tocken;
			tocken++;
		}
		while(check<n){//�ҳ����м�¼Ϊ3��Ԫ�أ���Ϊ0����ʾ�˳���Ϸ��
			for(int i=0;i<n;i++){
				if(mon[i]!=0){//����ȷ����Ԫ���Ƿ���Ч
					if(temp==2){//��1��2��3�£�temp=2����ֻ���ӱ�2������ǰ���Ӽ�¼�±겢�˳���Ϸ
						res=res+"|"+i;
						mon[i]=0;
					}else{
						
					}
				}	
			}
		}
	}
	public static void outPlay(int n,int[] mon){
		
	}
	public static void getOutOrder(int n){
		int [] mon=new int [n];
		int temp=1;
		int tempNum=0;
		int check=0;
		String index="";
		boolean flag=true;
		for(int i=0;i<n;i++){ //ʹ����������¼���ӣ����ݲ�λ0��Ԫ�ؿ���δ�����ĺ��ӡ��������ĺ����˳���Ϸ�������ݼ�Ϊ0
			mon[i]=i+1;
		}
		while(check<n){//ֱ�����к��Ӷ�����������Ϸ����
			for(int i=0;i<n;i++){//����n������Ϊһ�ֽ��б�����������Ԫ��Ϊ0�ģ������������ӣ����ٲ�����Ϸ:flag����
				if(mon[i]!=0){
					flag=!flag;//��Ϊ1��2��1��2��������ͨ��flag�����仯��ʵ�֣���flagΪfalse�ģ���ʾ����1��������Ϸ��
					if(flag){//����flagΪtrue�ģ���Ϊ����2
						tempNum=temp%n;//123ȡ��ѭ��Ϊ120��120��120���ʵ�ȡ���Ϊ0ʱ������Ϊn
						if(tempNum==0){
							tempNum=n;
						}
						index=index+(tempNum)+"|";//ȡ����ǰ�����ĺ��ӵı��
						mon[i]=0;//�������ĺ����˳���Ϸ
						check++;//��¼�������ĺ��Ӹ����������к��Ӷ���������check==n������Ϸ����
					}
				}
				temp++;
			}
			//System.out.println(check);
		}
		System.out.println(index);
	}
	public static void getOutOrder3(int n){
		int [] mon=new int [n];
		int temp=1;
		int tempNum=0;
		int check=0;
		String index="";
		boolean flag=false;
		for(int i=0;i<n;i++){ //ʹ����������¼���ӣ����ݲ�λ0��Ԫ�ؿ���δ�����ĺ��ӡ��������ĺ����˳���Ϸ�������ݼ�Ϊ0
			mon[i]=i+1;
		}
		while(check<n){//ֱ�����к��Ӷ�����������Ϸ����
			for(int i=0;i<n;i++){//����n������Ϊһ�ֽ��б�����������Ԫ��Ϊ0�ģ������������ӣ����ٲ�����Ϸ:flag����
				if(mon[i]!=0){
					switch(temp%3){//��Ϊ1��2��3��1��2��3������ͨ��swich���ñ�1��2��flagΪfalse����ʾ����1��������Ϸ��
					case 1:
					case 2:
						flag=false;
						break;
					case 0:
						flag=true;
						break;
					}
					if(flag){//����flagΪtrue�ģ���Ϊ����2
						tempNum=temp%n;//123ȡ��ѭ��Ϊ120��120��120���ʵ�ȡ���Ϊ0ʱ������Ϊn
						if(tempNum==0){
							tempNum=n;
						}
						index=index+(tempNum)+"|";//ȡ����ǰ�����ĺ��ӵı��
						mon[i]=0;//�������ĺ����˳���Ϸ
						check++;//��¼�������ĺ��Ӹ����������к��Ӷ���������check==n������Ϸ����
					}
				}
				temp++;
			}
			//System.out.println(check);
		}
		System.out.println(index);
	}
}
