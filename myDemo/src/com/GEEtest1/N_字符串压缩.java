package com.GEEtest1;
import java.util.Scanner;
public class N_字符串压缩 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuffer sb = new StringBuffer(s);
		boolean flag = true;
		while(sb.length()>0){
			String check = sb.substring(0,1);//记录第一个数
			sb.deleteCharAt(0);//吧buffer里的第一个数删了
			if(sb.indexOf(check) != -1){//还能匹配到，说明需要压缩
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("不需要压缩");
		}else{
			System.out.println("需要压缩");
			StringBuffer buffer = new StringBuffer();
			char[] arr = s.toCharArray();
			char temp = arr[0];
			int count = 0;
			for(char i : arr){
				if(temp == i){
					count++;
				}else{
					buffer.append(temp);
					buffer.append(count);
					temp = i;
					count = 1;//count记录当前元素是第几次在arr出现的，所以只要存在就是1
				}
			}
			//由于temp记录上一个元素是多少，所以最后一个元素无法在for里加入到buffer
			buffer.append(temp);
			buffer.append(count);
			System.out.println(buffer.toString());
		}
	}
}
