package com.GEEtest1;
/**
 * �ҹ����֤��Ϊ18λ��ǰ17λ��Ϊ���֣����һλ��Ϊ���ֻ�����ĸX��
 * ����ǰ��λΪ��ַ�룬������ס���������أ��У��죬������
 * ��������ʮλΪ������ݣ���ʮһ��ʮ��λΪ�����·ݣ���ʮ����ʮ��λΪ�������ڡ�
 * ��ô�������ˣ�����֪����ݷ�Ϊƽ������꣬��ν������ǣ�
 * ��Щ�ܱ�4���������ܱ�100���������ܱ�400��������ݣ�����ν֮�����ꡱ��
 * �����2�·���29�죬��ƽ������28�졣�����һ�������ж�һ�����֤�ŵĺϷ��ԣ�
���һ���˵����֤�Ϸ����򷵻�0��
���һ���˵����֤�ų��Ȳ��Ϸ����򷵻�1��
���һ�������֤��ǰ17λ���ַ������ַ����򷵻�2��
���һ�������֤�ŵ�18λ�Ȳ�������Ҳ����X���򷵻�3��
���һ���˳�������ڣ�1900-2017��֮�⣬�򷵻�4��
���һ���˳����·ݲ��Ϸ����򷵻�5��
���һ���˳������ڲ��Ϸ����򷵻�6��
���������Ϸ�������������迼�ǣ�
 */
import java.util.Scanner;
public class ��_M_���֤ {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������֤");
		String s = sc.next();
		StringBuffer buffer = new StringBuffer(s); 
		int year = Integer.parseInt(buffer.substring(6,10));
		int mon = Integer.parseInt(buffer.substring(10,12));
		int day = Integer.parseInt(buffer.substring(12,14));
		boolean flag = true;
		if(year%400==0||(year%4==0&&year%100!=0)){
			flag = true;
		}else{
			flag = false;
		}
		System.out.println("year"+year+"mon"+mon+"day"+day);
		if(s.length()!=18){
			System.out.println("1 ���Ȳ��Ϸ�");
		}else if(!s.matches("[\\d]{17}.")){//��ȫ������ĿҪ��һ��һ��д�����������¹�ϵ
			System.out.println("ǰ17λ���ַ������ַ����򷵻�2");
		}else if(!s.matches(".{17}[\\dxX]")){
			System.out.println("��18λ�Ȳ�������Ҳ����X���򷵻�3");
		}else if(year<1900||year>2017){
			System.out.println("��������ڣ�1900-2017��֮�⣬�򷵻�4");
		}else if(mon<1||mon>12){
			System.out.println("�����·ݲ��Ϸ����򷵻�5��");
		}else if((day<1||day>31)||(mon==2&&day>29)||(!flag)&&(mon==2&&day>28)){
			System.out.println("�������ڲ��Ϸ����򷵻�6��");
		}else{
			System.out.println("1");
		}//620105199302292011
	}
}
