package com.summarize;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��8�� ����9:04:07
* 
* 
*/
public class ��ȡ���ָ���λ���ϵ��� {
	public static void main(String[] args) {
		int initial = 291;
		/**
		 * ����һ��
		 * 		A. �Ȼ�ȡ���ֵĳ��ȣ���1��ÿ�γ���10�������<10��ʱ��ֹͣ��ѭ���˼��μ�Ϊ��λ���� ��2��String.valueOf(initial).length();  ��ת��string��Ȼ�����ַ���
		 * 		B. ���������Ϊѭ�����ݣ���ԭ����������ȳ������١�ǧ������������ȡ����int����Ϊ���λ�����֡�ԭ���ټ�ȥ�ȳ������١�ǧ�����õ��´�ѭ����ԭ��
		 * 			�磺291��291Ϊ3λ����291/��10^2��=2���ð�λΪ2���´�ѭ����ԭ���ǣ�291-10^2	
		 */
		System.out.println("/----------��һ�ֻ�ȡ"+initial+"����λ�������ֵķ���----------/");
		/*----------�����ֳ���----------*/
		int len = 1;	//ԭ�����ȣ�ֻҪ������������һλ��
		int temp_initial ;	//����ԭ����ֵ����ѭ������
		//��һ�ַ���  �����ֳ��ȷ������Ƽ���
		for(temp_initial= initial;temp_initial>=10;temp_initial/=10){
			len++;
		}
		System.out.println("����һ��ԭ������"+len);
		//�ڶ��ַ���  �����ֳ��ȷ���
		len=String.valueOf(initial).length();	//String.valueOf(initial)---תstring
													//.length()���ַ�����������int����
		System.out.println("��������ԭ������"+len);
		
		/*----------��ȡÿ��λ���ϵ�����----------*/
		int temp_lenth=0;	//�������١�ǧ��
		int get_singleNum=0;//��ȡÿһλ�ϵ�����
		for(temp_initial=initial;len>=1;){
			temp_lenth=(int)Math.pow(10, len-1);
			//System.out.println(temp_lenth+"  "+len);
			get_singleNum=temp_initial/temp_lenth;
			len--;
			temp_initial-=get_singleNum*(int)Math.pow(10, len);
			System.out.println("�����������ǣ�"+get_singleNum);
		}
		
		/**
		 * ��������
		 * 		A. ��λ��291%10=1
		 * 		B. ʮλ��291/10%10=9
		 * 		C. ��λ��291/10/10%10=2
		 * 		......
		 * 		˼·����ÿ����%10����ȡ��λ��
		 * 			ÿ��ѭ��������ʱ��ԭ��/10�������´�ѭ��
		 * 			ѭ�������жϣ�ԭ���Ǹ�λ�����˳�ѭ��
		 */
		System.out.println("/----------�ڶ��ֻ�ȡ"+initial+"����λ�������ֵķ���----------/");
		for(temp_initial=initial;temp_initial>=10;temp_initial/=10){
			get_singleNum=temp_initial%10;
			System.out.println("���ҵ��������ǣ�"+get_singleNum);
		}
		System.out.println("���ҵ��������ǣ�"+temp_initial);
	}
}
