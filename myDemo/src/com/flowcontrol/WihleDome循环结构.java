package com.flowcontrol;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��8�� ����10:03:34
* 
* 	��ʼ�����
* 	while(�ж����){
* 		ѭ������䣻
* 		������������䣻
* 	}
* 
* �Ա�for���
* 	for(��ʼ����䣻�ж���䣻�������������){
* 		ѭ������䣻
* 	}
* 
* 	����while������for��������for������whileҲ������
*/
public class WihleDomeѭ���ṹ {
	public static void main(String[] args) {
		int a;
		for( a=1;a<=10;a++){
			System.out.println("for��"+a+"��");
		}
		System.out.println("/---------------------/");
		a=1;	//��ʼ�����
		while(a<=10){	//�ж����
			System.out.println("while��"+a+"��"); //ѭ������䣻
			a++;	//����������䣻
		}
		
		
		/*--------------��1~100�ĺ�--------------*/
		System.out.println("/----------��1~100�ĺ�-----------/");
		int temp = 1;
		int initial =0;
		while(temp<=100){
			initial+=temp;
			temp++;
			//System.out.println(initial);
		}
		System.out.println("1~100�ĺ���"+initial); //ѭ������䣻
		
		/*--------------��100~1000��ˮ�ɻ����ĸ���--------------*/
		System.out.println("/----------��100~1000��ˮ�ɻ����ĸ���-----------/");
		initial = 152;
		int temp_initial = initial;
		int get_num=0;	//��ʾÿһλ�ϵ���
		int len=0;	//��ʾ���ֳ���
		int get_all= 0;	//���ݺ͵�ֵ
		int count=0;
		
		while(temp_initial<=1000){
			get_all= 0;
			initial = temp_initial;
			len=String.valueOf(initial).length();
			int tempLen=len;
			while(len>0){
				get_num=initial/(int)Math.pow(10, len-1);
				get_all+=(int)Math.pow(get_num, tempLen);
				initial-=get_num*(int)Math.pow(10, len-1);
				len--;	
				}
			if(get_all==temp_initial){
				System.out.println("---------ˮ�ɻ�"+get_all);
				count++;
			}
			temp_initial++;
		}
		System.out.println(count);

/*		while(initial<=1000){
			get_all=0;	//�����ۼ��ݺͣ�ÿ�λ�ȡ�µ�ԭ��ʱӦ�������ؼ�
			temp_initial = initial;
			len = String.valueOf(initial).length();
			//System.out.println("len��"+len+",temp_initial:"+initial);
			while(temp_initial>=10){
				get_num=temp_initial%10;
				
				temp_initial/=10;
				//System.out.println("get_num��"+get_num+"   temp_initial:"+temp_initial);
				get_all+=Math.pow(get_num, len);
			}
			//System.out.println("�ճ�ѭ��get_all��"+get_all);
			get_all+=Math.pow(temp_initial, len);
			if(get_all==initial){
				//System.out.println("��ˮ�ɻ�����ֵ�ǣ�"+get_all+"����"+Math.pow(temp_initial, len));
				System.out.println("��ˮ�ɻ�����ֵ�ǣ�"+get_all);
			}else{
				//System.out.println("����ˮ�ɻ�����ֵ�ǣ�"+get_all+"����"+Math.pow(temp_initial, len));
			}
			initial++;
		}*/
		

	}
}
