package basis.object;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��6��13�� ����8:49:52
* 
* 	���췽����
* 			Ϊ������г�ʼ��
* 
* 	�ص㣺
* 			1. ��������������ͬ
* 			2. ����û�з���ֵ���ͣ���void��������
* 			3. ������Ҳû�з���ֵ
* 
*  	���췽����ע�����
* 		A. �����Լ�д���췽����ϵͳ���ṩһ��Ĭ�ϵ��޲ι��췽��
* 		B. ����Լ�д�˹��췽����ϵͳ�Ͳ��ٰ������ṩ�����з�����Ҫ�Լ���д
* 		��ע�⡿�������㣬��סһ��Ҫ��  [���Լ���д�޲ι��췽��] ��ϰ�ߣ��Է��Ժ󱨴�
* 		C. ���췽����������
* 		D. ���췽��Ҳ���Ը�private��Ա������ֵ
*/
public class Car���� {
	private String brand ;
	private int price;
	
	//�Լ�д�˹��췽����ϵͳ�Ͳ��ٰ������ṩ��
	//���Ա����Լ�д�޲ι��췽���������ڶ����е���ʱ�ᱨ��
	
	public Car����(){		//��������������ͬ	����û�з���ֵ���ͣ���void��������			
		System.out.println("Car����  de ���췽��");	//������Ҳû�з���ֵ
	}

	public Car����(String brand){	 //���췽��Ҳ�ɸ�private��Ա������ֵ
		this.brand=brand;
	}
	public Car����(int price){			
		this.price=price;	
	}
	public void show(){
		System.out.println(brand+"-----"+price);
	}
}
