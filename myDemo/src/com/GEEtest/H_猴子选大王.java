package com.GEEtest;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年1月18日 下午5:29:04
* 
* 
*/
import java.util.Scanner;
public class H_猴子选大王 {
	public static void main(String [] args){
/*		N个猴子围成一个圈
		1、从第一只猴子开始报数，第一只猴子报1,后面的报数2
		2、每个报2的猴子退出，然后从下一只猴子重新开始报数，
		3、要求输出退出的顺序和最后剩下的人
*/
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("Input the number of monkeies");
			String s = sc.next();
			if(s.matches("\\d+")){
				//getOutOrder(Integer.parseInt(s));//以12为顺序报数，报2的猴子退出
				//getOutOrder3(Integer.parseInt(s));//以123为顺序报数，报3的猴子退出
				
				getintegrity(Integer.parseInt(s));
			}else{
				System.out.println("Input illegal");
			}
		}
	}
	public static void getintegrity(int n){
		int mon[] =new int[n];
		int check=0;
		int temp=0;//用temp记录上一个猴子报的数，在1，2，3下，temp=2（上只猴子报2），当前猴子记录下标并退出游戏
		int tocken=1;
		String res="";
		for(int i=0;i<n;i++){ //每个元素的下标始终表示其编号，元素内容记录猴子报出的数字
			if(tocken==4){
				tocken=1;
			}
			mon[i]=tocken;
			tocken++;
		}
		while(check<n){//找出所有记录为3的元素，改为0，表示退出游戏。
			for(int i=0;i<n;i++){
				if(mon[i]!=0){//首先确定该元素是否有效
					if(temp==2){//在1，2，3下，temp=2（上只猴子报2），当前猴子记录下标并退出游戏
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
		for(int i=0;i<n;i++){ //使用数组来记录猴子，内容部位0的元素看做未报数的猴子。报过数的猴子退出游戏，即内容记为0
			mon[i]=i+1;
		}
		while(check<n){//直到所有猴子都报过数后游戏结束
			for(int i=0;i<n;i++){//仍以n个猴子为一轮进行报数，当遇到元素为0的（报过数）猴子，不再参与游戏:flag不变
				if(mon[i]!=0){
					flag=!flag;//因为1，2，1，2，报数，通过flag两级变化来实现，让flag为false的，表示报数1，留在游戏中
					if(flag){//所有flag为true的，即为报数2
						tempNum=temp%n;//123取余循环为120，120，120，故当取余后为0时，翻译为n
						if(tempNum==0){
							tempNum=n;
						}
						index=index+(tempNum)+"|";//取出当前报数的猴子的编号
						mon[i]=0;//报过数的猴子退出游戏
						check++;//记录报过数的猴子个数，当所有猴子都报过数后（check==n），游戏结束
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
		for(int i=0;i<n;i++){ //使用数组来记录猴子，内容部位0的元素看做未报数的猴子。报过数的猴子退出游戏，即内容记为0
			mon[i]=i+1;
		}
		while(check<n){//直到所有猴子都报过数后游戏结束
			for(int i=0;i<n;i++){//仍以n个猴子为一轮进行报数，当遇到元素为0的（报过数）猴子，不再参与游戏:flag不变
				if(mon[i]!=0){
					switch(temp%3){//因为1，2，3，1，2，3报数，通过swich，让报1，2的flag为false，表示报数1，留在游戏中
					case 1:
					case 2:
						flag=false;
						break;
					case 0:
						flag=true;
						break;
					}
					if(flag){//所有flag为true的，即为报数2
						tempNum=temp%n;//123取余循环为120，120，120，故当取余后为0时，翻译为n
						if(tempNum==0){
							tempNum=n;
						}
						index=index+(tempNum)+"|";//取出当前报数的猴子的编号
						mon[i]=0;//报过数的猴子退出游戏
						check++;//记录报过数的猴子个数，当所有猴子都报过数后（check==n），游戏结束
					}
				}
				temp++;
			}
			//System.out.println(check);
		}
		System.out.println(index);
	}
}
