package com.GEEtest;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年1月18日 下午12:00:34
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
/*本质：边长l=第一行留白+1【第一行的有效点数永远为1】，向下两行之间有效点数差2，左侧留白差1
 * 
 *  		--*			
			-*-*		
			*-*-*		
			-*-*		
			--*			
*/
	    Scanner sc =new Scanner(System.in);
		while(true){
			System.out.println("请输入菱形的边长");
			String s=sc.next();
			if(s.matches("\\d+")){
			    int l=Integer.parseInt(s);
			    //输出上半部分（包括长轴）
			    int r=1;
			    for(int i=l-1;i>=0;i-=1,r+=2){
			    	outS(i);
			    	outC(r);
			    	System.out.println();
			    }
			    //输出下半部分
			    r-=4;//一个2是为了抵消上个for的+2，一个-2是计算下行有效点数
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
/*	左侧留白：i/2  【i=R-】	  本质：从长轴开始，向上向下每走一行，有效点数少2【故左侧留白依次+1】
 * 		2=(5-1)/2	--*	   R-=2	1，故需留的-个数为：(5-1)/2  [(R-i)/2,i-=2]
		1=(5-3)/2	-*-*   R-=2 3
		0=(5-5)/2	*-*-*  直径R=5，r（含中间点）=3
		1			-*-*
		3			--*
*/
	    Scanner sc =new Scanner(System.in);
	    while(true){
		    System.out.println("请输入菱形的直径(奇数)");
		    String s=sc.next();
		    if(s.matches("\\d*[13579]")){
		    	int R=Integer.parseInt(s);
		    	int r=R/2+1;
		    	int sNumM=R-1;
		    	//输出上半部分（包括长轴）
		    	for(int i=sNumM;i>=0;i-=2){
		    		outS(i/2);
		    		outC(R-i);
		    		System.out.println();
		    	}
		    	//输出下半部分
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
	  //输入本行需要打印的总个数，方法以*开始和结束，并以*和-间隔输出
	public static void outC(int n){//n一定是奇数
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
