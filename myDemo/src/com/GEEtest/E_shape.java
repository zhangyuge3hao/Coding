package com.GEEtest;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��1��18�� ����12:00:34
* 
* 
*/
import java.util.Scanner;
public class E_shape {
	public static void  main(String[] args){
	    	//outC(9);
	    	L();
	    	//R();
	}
	public static void L(){
/*���ʣ��߳�l=��һ������+1����һ�е���Ч������ԶΪ1������������֮����Ч������2��������ײ�1
 * 
 *  		--*			
			-*-*		
			*-*-*		
			-*-*		
			--*			
*/
	    Scanner sc =new Scanner(System.in);
		while(true){
			System.out.println("���������εı߳�");
			String s=sc.next();
			if(s.matches("\\d+")){
			    int l=Integer.parseInt(s);
			    //����ϰ벿�֣��������ᣩ
			    int r=1;
			    for(int i=l-1;i>=0;i-=1,r+=2){
			    	outS(i);
			    	outC(r);
			    	System.out.println();
			    }
			    //����°벿��
			    r-=4;//һ��2��Ϊ�˵����ϸ�for��+2��һ��-2�Ǽ���������Ч����
			    for(int i=1;i<=l-1;i+=1,r-=2){
			    	outS(i);
			    	outC(r);
			    	System.out.println();
			    }
			}else{
			    System.out.println("Input illegal");
			}
	    }
	}
	public static void R(){
/*	������ף�i/2  ��i=R-��	  ���ʣ��ӳ��Ὺʼ����������ÿ��һ�У���Ч������2���������������+1��
 * 		2=(5-1)/2	--*	   R-=2	1����������-����Ϊ��(5-1)/2  [(R-i)/2,i-=2]
		1=(5-3)/2	-*-*   R-=2 3
		0=(5-5)/2	*-*-*  ֱ��R=5��r�����м�㣩=3
		1			-*-*
		3			--*
*/
	    Scanner sc =new Scanner(System.in);
	    while(true){
		    System.out.println("���������ε�ֱ��(����)");
		    String s=sc.next();
		    if(s.matches("\\d*[13579]")){
		    	int R=Integer.parseInt(s);
		    	int r=R/2+1;
		    	int sNumM=R-1;
		    	//����ϰ벿�֣��������ᣩ
		    	for(int i=sNumM;i>=0;i-=2){
		    		outS(i/2);
		    		outC(R-i);
		    		System.out.println();
		    	}
		    	//����°벿��
		    	for(int i =2;i<=sNumM;i+=2){
		    		outS(i/2);
		    		outC(R-i);
		    		System.out.println();
		    	}
		   	}else{
		   		System.out.println("Input illegal");
		    }
	    }
	}
	  //���뱾����Ҫ��ӡ���ܸ�����������*��ʼ�ͽ���������*��-������
	public static void outC(int n){//nһ��������
	    if(n%2!=1){
	    	System.out.println("n is illegal");
	    }else{
	   		for(int i=1;i<=n;i++){
	    		if(i%2==1){
	    	    	System.out.print("*");
	    		}else{
	    	    	System.out.print("-");
	    		}
	    	}
	   	}
	}
	public static void outS(int n){
		for(int i=1;i<=n;i++){
			System.out.print("-");
		}
	}
}
