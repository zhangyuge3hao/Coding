package com.GEEtest1;
import java.util.Scanner;
public class N_�ַ���ѹ�� {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuffer sb = new StringBuffer(s);
		boolean flag = true;
		while(sb.length()>0){
			String check = sb.substring(0,1);//��¼��һ����
			sb.deleteCharAt(0);//��buffer��ĵ�һ����ɾ��
			if(sb.indexOf(check) != -1){//����ƥ�䵽��˵����Ҫѹ��
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("����Ҫѹ��");
		}else{
			System.out.println("��Ҫѹ��");
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
					count = 1;//count��¼��ǰԪ���ǵڼ�����arr���ֵģ�����ֻҪ���ھ���1
				}
			}
			//����temp��¼��һ��Ԫ���Ƕ��٣��������һ��Ԫ���޷���for����뵽buffer
			buffer.append(temp);
			buffer.append(count);
			System.out.println(buffer.toString());
		}
	}
}
