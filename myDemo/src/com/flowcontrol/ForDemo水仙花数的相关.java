package com.flowcontrol;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��6�� ����11:17:13
* 
* 	ˮ�ɻ�����ָһ�� nλ������ ( n��3 )��һ��Ϊ3λ��������ÿ��λ�ϵ����ֵ� n ����֮�͵��������������磺1^3 + 5^3+ 3^3 = 153��
*/
public class ForDemoˮ�ɻ�������� {
	/*�ҳ�1000���ڣ�100~1000�����е�ˮ�ɻ���*/
	
	public static void main(String[] args) {
		int shuiXian = 0;	//��ʾforѭ����(100~1000)ÿ��ԭ�������ںͱ��𿪺�ĸ�λ�����ֽ���ж�ԭ���Ƿ�Ϊˮ�ɻ���
		int all = 100000;		//Ѱ��ˮ�ɻ����ķ�Χ����100��all��
		int temp = 0;		//����ͬ����Χ��ˮ�ɻ����ĸ���
		
		for(shuiXian=100;shuiXian<=all;shuiXian++){
			int temp_shuiXian = shuiXian;	//��ѭ���д���ǰ������ԭ����(��Ҫһ����������ѭ������)
			int sx_long = 1;	//��ʾ��ǰ����temp_shuiXian�ĳ��ȡ��Ǽ�λ����һ����������1λ����ʼֵλ1��
			int sx_first = 0;	//��¼��ǰ����temp_shuiXian�����λ����
			int temp_tenTimes = 0;	//�������λ����sx_firstʱ��Ҫ�����ٱ����� 290/100=2
			int temp_result = 0;	//���ڲ��ʱÿ�����ֵ�n�������
			int temp_sx_long = 0;	//������ѭ���м�¼�����ĵ�ǰ����sx_long
			int loop_long = 0;		//�����ж�λ����ѭ��
			int loop_resolve = 0;	//�����жϲ��ԭ����ѭ���Ƿ����
			/** 
			 * A. ��ÿһ��ԭ��temp_shuiXian�����ж����Ǽ�λ��
			 * 		������
			 * 		ԭ����ÿ�γ�10ȡ����ֱ�����<10���Ǹ�λ������ѭ���Ĵ�����Ϊ��λ��
			 */
			for(loop_long=temp_shuiXian;loop_long>=10;loop_long/=10){
				sx_long++;
			}
			//System.out.println("ԭ��shuiXian "+temp_shuiXian+" Ϊ  "+sx_long+" λ��");
			temp_sx_long=sx_long;	//��temp_sx_long��ѭ���м�¼�����ĵ�ǰ����sx_long
			/**
			 * B. �ó�λ���Ժ󣬷ֽ�ԭ��(for),����ÿλ��^sx_long�����shuiXian�Ƚ�
			 * 		������  �ٶ�ԭ��Ϊ290
			 * 		����λsx_first��	290Ϊ3λ��---��λ��2 {---2=290/100������100=10^(2)������2=3-1}
			 * 							sx_first=temp_shuiXian/temp_tenTimes;
			 * 							temp_tenTimes=(int) Math.pow(10,--sx_long);	
			 * 		������λ��ͣ�		temp_result += (int) Math.pow(sx_first,sx_long);
			 * 		�´�ѭ����			�´ν���ѭ������90---{90=290-200������200=100*2}
			 * 							����ȥ�����λ��temp_shuiXian-=temp_tenTimes*sx_first;
			 * 							���ȣ�λ������һ��sx_long--;
			 */
			for(loop_resolve=1;loop_resolve<=sx_long;loop_resolve++){	//ԭ��������Ϊ��1λ
				//����λsx_first��
				temp_tenTimes=(int)Math.pow(10,--temp_sx_long);
				sx_first=temp_shuiXian/temp_tenTimes;
				//System.out.println("����temp_shuiXian:"+temp_shuiXian+" �ĵ�"+loop_resolve+"λsx_first�ǣ�(--"+sx_first+"--)");
				//������λ��ͣ�
				temp_result+=(int) Math.pow(sx_first,sx_long);
					//System.out.println("������λ���ʱ��temp_sx_longΪ��"+temp_sx_long);
				//�´�ѭ����
				temp_shuiXian-=temp_tenTimes*sx_first;	//����ȥ�����λ��
				//mp_sx_long--;	//���ȣ�λ������һ��
				//System.out.println("����ȥ�����λ��Ϊ��"+temp_shuiXian+" ��"+temp_sx_long+"λ��");
			}
			/**
			 * 	C. �ж��Ƿ���ˮ�ɻ�����
			 */
			if(temp_result==shuiXian){
				System.out.println("/--------�������ǣ� "+temp_result+" ,��  "+shuiXian+" ��ˮ�ɻ���--------/");
				temp++;
			}else{
				//System.out.println("/--�������ǣ� "+temp_result+" ,��  "+shuiXian+" ����ˮ�ɻ���--/");
			}
		}
		System.out.println("��100~"+all+"�У�����"+temp+"��ˮ�ɻ���");
	}
}
