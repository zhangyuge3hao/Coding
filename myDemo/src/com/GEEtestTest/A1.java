package com.GEEtestTest;

import java.util.Scanner;

public class A1 {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        System.out.println("������Ҫת����ʮ���Ƶ�����");
	        Scanner input = new Scanner(System.in);
	        int n = input.nextInt();        
	        System.out.println("ת����ʮ�����Ƶ���Ϊ��"+intToHex(n));
	    }

	    private static String intToHex(int n) {
	        //StringBuffer s = new StringBuffer();
	        StringBuilder sb = new StringBuilder();
	        String a;
	        char []b = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	        while(n != 0){
	            sb = sb.append(b[n%2]);
	            n = n/2;            
	        }
	        a = sb.reverse().toString();
	        return a;
	    }
}
