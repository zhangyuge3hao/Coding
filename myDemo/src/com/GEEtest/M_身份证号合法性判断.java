package com.GEEtest;
/**
 * ��Ŀ������
�ҹ����֤��Ϊ18λ��ǰ17λ��Ϊ���֣����һλ��Ϊ���ֻ�����ĸX��
����ǰ��λΪ��ַ�룬������ס���������أ��У��죬����
��������ʮλΪ������ݣ�
��ʮһ��ʮ��λΪ�����·�
��ʮ����ʮ��λΪ�������ڡ�

��ô�������ˣ�����֪����ݷ�Ϊƽ������꣬��ν������ǣ�
��Щ�ܱ�4����  �����ܱ�100����  �����ܱ�400��������ݣ�����ν֮�����ꡱ��
�����2�·���29�죬��ƽ������28�졣

�����һ�������ж�һ�����֤�ŵĺϷ��ԣ�
���һ���˵����֤�Ϸ����򷵻�0��
���һ���˵����֤�ų��Ȳ��Ϸ����򷵻�1��
���һ�������֤��ǰ17λ���ַ������ַ����򷵻�2��
���һ�������֤�ŵ�18λ�Ȳ�������Ҳ����X���򷵻�3��
���һ���˳�������ڣ�1900-2017��֮�⣬�򷵻�4��
���һ���˳����·ݲ��Ϸ����򷵻�5��
���һ���˳������ڲ��Ϸ����򷵻�6��
���������Ϸ�������������迼�ǣ�
���磺
���룺						�����
362329199411015334			0
35393099939849				1
.......................�ȵ�

 * @author pc
 *
 */
import java.util.Scanner;
public class M_���֤�źϷ����ж� {
	public static void main(String []args){
		boolean f = true;
		Scanner sc = new Scanner(System.in);
		String n1 = "362329199411015334";
		boolean a = n1.matches("[\\d]{17}.");
		System.out.println("a"+a);

		while(f){
			System.out.println("�������֤��");
			String n = sc.next();
			
			char car[] = n.toCharArray();
			String year = "";//��ȡ���
			for(int i = 6;i<10;i++){
				year += car[i];
			}
			int y = Integer.parseInt(year);
			System.out.println("y"+year);
			
			String mon = "";//��ȡ�·� ��ʮһ��ʮ��λΪ�����·�
			for(int i = 10;i<12;i++){
				mon += car[i];
			}
			int m = Integer.parseInt(mon);
			System.out.println("m"+mon);
			
			String day = "";//��ȡ���� ��ʮ����ʮ��λΪ��������
			for(int i = 12;i<14;i++){
				day += car[i];
			}
			int d = Integer.parseInt(day);
			System.out.println("d"+day);
			
			char c = n.charAt(17);//Java ������ȡ�ַ���ָ���±�λ�õ�ֵ charAt(),����char
	        System.out.println(c);
	        

	        if(n.length()!=18){//���һ���˵����֤�ų��Ȳ��Ϸ����򷵻�1��
				System.out.println(1+"���Ȳ��Ϸ�");
			}else if(!n.matches("[\\d]{17}.")){//���һ�������֤��ǰ17λ���ַ������ַ����򷵻�2��
				System.out.println(2+"ǰ17λ���ַ������ַ�");
			}else if(String.valueOf(c).matches("[^(\\dxX)]")){//���һ�������֤�ŵ�18λ�Ȳ�������Ҳ����X���򷵻�3��
				System.out.println(3+"��18λ�Ȳ�������Ҳ����X");
			}
			//��������ʮλΪ�������,���һ���˳�������ڣ�1900-2017��֮�⣬�򷵻�4��
			else if(y<1900||y>2017){
				System.out.println(4+"�˳�������ڣ�1900-2017��֮��");
			}
			//���һ���˳����·ݲ��Ϸ����򷵻�5��m>12,m<0
			else if(m>12||m<0){
				System.out.println(5+"�����·ݲ��Ϸ���y>12,y<0");
			}
			//���һ���˳������ڲ��Ϸ����򷵻�6��d>31,d<0,����(y%4==0&&y%100!=0&&y%400!=0)2��d>28��ƽʱm==2&&d>29
			else if(m<0||m>31||(y%4==0&&y%100!=0&&d>28)||(y%400==0&&d>28)||(m==2&&d>29)){
				System.out.println(6+"�����ڲ��Ϸ�");
			}else if(n.matches("[\\d]{17}[\\dxXS]")){//���һ���˵����֤�Ϸ����򷵻�0��
				System.out.println(0+"���֤�Ϸ�");
			}
		}//362329199602295334
	}
}
