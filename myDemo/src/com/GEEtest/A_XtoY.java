package com.GEEtest;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��1��7�� ����5:55:36
* Ҫ�󣺶�����Ķ����ˡ�ʮ��ʮ��������ת�ɶ����ˡ�ʮ��ʮ������
* 	�κν���ת��10���ƣ�10����ת�����������ڻ����������й���
* 	���Խ���������ȫ��ת��10���ƣ�����10����ת��ȥ
*/
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class A_XtoY{
	public static boolean  temp =true;
	public static void main(String [] args){
		Scanner cs = new Scanner(System.in);
		while(temp){
			inputCheck(cs);
		}
		cs.close();
	}
	public static void inputCheck(Scanner cs){//�������ֲ��жϺ�ѯ�ʽ���
		System.out.println("��������Ҫת�������֡���ǰ���ơ�ת����Ľ��ƣ�����.����");
		String input = cs.next();
		Pattern p = Pattern.compile("[a-fA-F0-9]+\\.[0-9]+\\.[0-9]+");//[a-fA-F0-9]+\\.[0-9]+\\.[0-9]+
		Matcher m = p.matcher(input);
		String num = new String("a");
		int from = 0;
		int to = 0;
		if(m.matches()){
			String [] res = input.split("\\.");
			num = res[0];
			from = Integer.parseInt(res[1]);
			to = Integer.parseInt(res[2]);
			if(from==10){
				DtoX(num,from,to);
			}else{
				XtoY(num,from,to);
			}
		}else{
			System.out.println("Input illegal");
		}
	}
	public static int XtoD(String num,int from ,int to){//2-10 �и��10  ��10ȡ���ٳ�10
		char[] eachChar = num.toLowerCase().toCharArray();
		int len = eachChar.length;
		int temp =0;
		int D=0;
		int count=0;
		for(int i=len-1;i>=0;i--){
			//System.out.print(eachChar[i]+"--");
			if(String.valueOf(eachChar[i]).matches("\\d")){
				temp= eachChar[i]-'0';
			}else{
				switch (eachChar[i]){
				case 'a':
					temp=10;
				break ;
				case 'b':
					temp=11;
					break;
				case 'c':
					temp=12;
					break;
				case 'd':
					temp=13;
					break;
				case 'e':
					temp=14;
					break;
				case 'f':
					temp=15;
					break;
				}
			}
			//System.out.println("temp "+temp);
			D+=temp*(int)Math.pow(from,count);
			count++;
			//eachChar[i]-'0';
		}
		System.out.println("X to D="+D);

		return D;
	}
	public static void DtoX(String num,int from ,int to){//10-2 �̳���
		int n=Integer.parseInt(num);//parse���﷨�Ϸ���
		int count =0;
		String  yu ="";
		String res="";
		int temp=0;
		while(n>0){
			temp=n%to;
			if(temp>=10){
				switch (temp){
				case 10:
					yu="a";
					break;
				case 11:
					yu="b";
					break;
				case 12:
					yu="c";
					break;
				case 13:
					yu="d";
					break;
				case 14:
					yu="e";
					break;
				case 15:
					yu="f";
					break;
				default:
					break;
				}
			}else{
				yu =String.valueOf(temp);
			}
			res=yu+res;
			//System.out.println(res);
			//X=X+yu*(int)Math.pow(10, count);
			n/=to;
			count++;
		}
		System.out.println("D to X:"+res);

	}

	public static void XtoY(String num,int from ,int to){
		String nu = Integer.toString(XtoD(num,from,10));
		DtoX(nu,10,to);
	}
	public static void toD(String num,int from ,int to){

		System.out.println("It is H");
	}

	/*System.out.println("---"+num+"---"+from+"---"+to+"---");
	for(String s : res){
		System.out.println("---"+s+"---");
	}
	
	*
	*	public static int XtoD(String num,int from ,int to){//2-10 �и��10  ��10ȡ���ٳ�10
		String each = num;
		char[] eachChar = each.toCharArray();
	
		int n = Integer.parseInt(num);
		int eachNum=0;
		int temp=0;
		int X=0;
		while(n>0){
			eachNum=n%10;//���ÿ�θ�λ�ϵ����֣�����ԭ����ʲô���ƣ���ͨ����10ȡ���ȡ
			n/=10;//������ÿ�δӸ���λ����һλ������ԭ����ʲô���ƣ���ͨ����10ȡ����ȡ
			X+=eachNum*(int)Math.pow(from,temp);//110-> 1*2^2 + 1*2^1 + [0]*2^0
			temp++;
		}
		System.out.println("X to D:"+X);
		return X;
	}
	
		public static int DtoX(String num,int from ,int to){//10-2 �̳���
		int n=Integer.parseInt(num);//parse���﷨�Ϸ���
		int count =0;
		int yu =0;
		int X=0;
		while(n>0){
			yu=n%to;
			X=X+yu*(int)Math.pow(10, count);
			
			n/=to;
			count++;
		}
		System.out.println("D to X:"+X);
		return X;
	}
	*
	*
	*/
/*		Pattern p = Pattern.compile("[01]*"); 
	Matcher m = p.matcher(num);
	if(m.find()){
		System.out.println("It is a B");
		turnO(2,num);turnD(2,num);turnH(2,num);
	}else if(num.matches("[0-7]*")){
		System.out.println("It is a O");
		turnB(2,num);turnD(2,num);turnH(2,num);
	}else if(num.matches("[0-9]*")){
		System.out.println("It is a D");
		turnB(2,num);turnO(2,num);turnH(2,num);
	}else if(num.matches("[0-9A-Fa-f]*")){
		System.out.println("It is a H");
		turnB(2,num);turnO(2,num);turnD(2,num);
	}else if(num.matches("#")){
		temp=false;
		System.out.println("Input stop");
	}else{
		System.out.println("Input Erro");
	}*/

}