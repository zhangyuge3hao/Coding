package com.GEEtest1;
import java.util.ArrayList;
public class C_�����ظ��ַ��� {
	public static void main(String[] args){
		String a = "aassdder3344;";
		char[] arr = a.toCharArray();
		int len = arr.length;
		ArrayList<Character> b = new ArrayList<Character>();
		for(int i = 1;i<len;i++){
			//if(b.contains(arr[i])){
			if(check(b,arr[i])){//��arr��ȡ��������ȥ��b��ı�һ�£�����b֤�Ƿ����������û�����������
				
			}else{
				b.add(arr[i]);
			}
		}
			
		for(char i:b){
			System.out.print(i);
		}
	}
	public static boolean check(ArrayList<Character> b, char a){
		boolean flag = false;
		int len = b.size();
		for(int i = 0 ;i<len;i++){
			if(a == b.get(i)){
				flag = true;
			}
		}
		return flag;
	}
}
