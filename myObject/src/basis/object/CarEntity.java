package basis.object;

import java.util.Scanner;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��6��9�� ����9:27:55
* 
* 	Ҫ����
* 
*/
public class CarEntity {
	public static void main(String[] args){
		boolean flag =true;
		int price;
		Car c = new Car();
		//System.out.println("new������ c �ڶ��ڴ棬 "+c+"���Դ���ǵ�ַ");  //basis.object.Car@37eaab
		c.brand = "���Դ�";
		//c.price = 15;		//price��private��Ա����������ֱ�ӷ���
		Scanner sc = new Scanner(System.in);
		while(flag){
			System.out.println("�����복�ۣ�");
			price= sc.nextInt();
			flag=c.setPrice(price);
		}
		
		c.color = "�궯��";
		
		c.buy(c.brand, c.color, c.getPrice());
	}
}
