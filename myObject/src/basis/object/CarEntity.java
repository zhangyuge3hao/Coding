package basis.object;

import java.util.Scanner;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年6月9日 上午9:27:55
* 
* 	要调用
* 
*/
public class CarEntity {
	public static void main(String[] args){
		boolean flag =true;
		int price;
		Car c = new Car();
		//System.out.println("new出来的 c 在堆内存， "+c+"所以存的是地址");  //basis.object.Car@37eaab
		c.brand = "马自达";
		//c.price = 15;		//price是private成员变量，不可直接访问
		Scanner sc = new Scanner(System.in);
		while(flag){
			System.out.println("请输入车价：");
			price= sc.nextInt();
			flag=c.setPrice(price);
		}
		
		c.color = "魂动红";
		
		c.buy(c.brand, c.color, c.getPrice());
	}
}
