package com.flowcontrol;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��5�� ����3:41:02
* 	
* 	for(��ʼ�����;�ж���䣨boolean��;�����������){
* 		ѭ�������;
* 	}
* 	
* 	for����ִ��˳��
* 		A. ��ִ�г�ʼ�����
* 		B. ִ���ж���䣬��Ϊfalse�����˳�forѭ��
* 		C. ִ���ж���䣬��Ϊtrue����ִ��{}��ѭ�������
* 		D. ִ����ѭ��������ִ�п����������
* 		E. ���������仯�󣬻ص�B��ִ���ж����
*/
public class ForDemoѭ���ṹ {
	public static void main(String[] args) {
		for(int a=1;a<=10;a++){
			System.out.println("���"+a+"��");
		}
		
		//��ȡ����1-5,5-1
		System.out.println("/---------��ȡ����5-1------------/");
		for(int a=5;a>=1;a--){
			System.out.println("��ȡ��"+a);
		}
		//��1-5�ĺ�
		System.out.println("/-----------��1-5֮�����ݵĺ�------------/");
		int temp=0;
		for(int a=5;a>=1;a--){
			temp += a;
		}
		System.out.println("/-----------1-5֮�����ݵĺͣ�"+temp+"------------/");
		//��1-100֮���ż����
		temp=0;
		for(int a=1;a<=100;a++){
			if(a%2==0){
				temp += a;
			}
		}
		System.out.println("/-----------1-100֮���ż���ͣ�"+temp+"------------/");
		
		//�������ˮ�ɻ���-----ˮ�ɻ�����ָһ�� nλ������ ( n��3 )������ÿ��λ�ϵ����ֵ� n ����֮�͵��������������磺1^3 + 5^3+ 3^3 = 153��
		
		
		int flower =104;  //����ԭ����ˮ�ɻ���������ΪҪ�Ͳ�ֺ�����ֽ���Աȣ����Ա������������㣨�������ڵȺ���ߣ�
		int num_long =1;  //��ʾԭ���ĳ���
		int ten_times =0; //��ʾԭ����Ӧλ���ı��������磺10��100��1000......
		temp = 0;         //��ʾԭ��ÿһλ�ϵ�����
		int temp_long =0; //��ʾԭ��ÿ���������λ��
		int temp_flower =flower; //��ʾ�ڼ����д���ԭ����ֵ
		/*int temp_flowerBefore =flower; //��ʾÿ������ǰ��ԭ��
		int temp_flowerAfter =0; //��ʾÿ���������ԭ��
*/		int get_checkNum =0;//��ʾˮ�ɼ���Ľ�������ں�ԭ������ж��Ƿ���ˮ����
		/*
		 *  ���ˮ�����ĵ�һ�����ж�һ�����ǲ���ˮ�ɻ���
		 */
		for(int a=temp_flower;(a<-9)||(a>9);a/=10){   
			//aÿ��10ȡ������ȥ�����λ��ֱ��a<9,����ʾ�Ѿ���������λ�����˳�ѭ��
			num_long++;
		}
		System.out.println(temp_flower+"��"+num_long+"λ��");
		temp_long=num_long-1;//��ʾԭ��ÿ���������λ��.��ԭ��Ϊ3λ(153)����������Ϊ2λ
							//ͬʱ ԭ��/(10^2) ȡ����Ϊ���λ�ϵ�����
		/*�ҳ�ԭ����ÿһλ�Ƕ���*/
		for(int a=1 ;a<=num_long;a++){		//num_long->1��1->num_longЧ��һ������Ϊ�˷������(1)����˳�����ÿһλ���������
			//���㱻����ten_times�����õ�ǰλ��temp_long����1λ���Ա��´�ѭ�����㱻����
			ten_times = (int) Math.pow(10,temp_long--);		
			System.out.println("������ten_times�ǣ�"+ten_times);
			System.out.println("��ʱ�ĵ���temp_flower�ǣ�"+temp_flower);
			
			//temp��ʾÿ��ԭ�����������λ�ϵ����֣�int 290/100=2����ѭ���󼴵�ԭ��ÿһλ�ϵ�����
			temp = temp_flower/ten_times;	 	
			System.out.println("ԭ��flower�ĵ�"+a+"λ��    (--"+temp+"--)");
			
			//�ҵ����λ�����ֺ󣬾��������λ����ʱtemp_flower��ʾԭ��ÿ��������������Ա��´ν���ѭ��ʹ��
			temp_flower -= temp*ten_times;   	
			System.out.println("ȥ����λʣ�µĲ����ǣ�"+temp_flower);
			
			//����ˮ�ɻ�����ÿ��λ�ϵ����ֵ� n ����֮�͵�����������ÿ�μ���������get_checkNum
			get_checkNum += (int) Math.pow(temp,num_long);	
		}
		if(get_checkNum==flower){
			System.out.println("------------get_checkNum="+get_checkNum+" ,������ˮ�ɻ���------------");
		}else{
			System.out.println("------------get_checkNum="+get_checkNum+" ,��������ˮ�ɻ���------------");
		}
		/*
		 *  ����������֡������ҳ����е�ˮ�ɻ���
		 */
		for(int i=1;i<=2;i++){
			flower=i;
			//temp_flower =flower;
			
			
		}
		
		//ͳ��ˮ�ɻ����ж���
	}
}
