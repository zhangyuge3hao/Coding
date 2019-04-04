package basis.object;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年6月13日 上午8:49:52
* 
* 	构造方法：
* 			为对象进行初始化
* 
* 	特点：
* 			1. 方法名和类名相同
* 			2. 方法没有返回值类型，连void都不能有
* 			3. 方法内也没有返回值
* 
*  	构造方法的注意事项：
* 		A. 若不自己写构造方法，系统会提供一个默认的无参构造方法
* 		B. 如果自己写了构造方法，系统就不再帮我们提供，所有方法需要自己编写
* 		【注意】由上两点，记住一定要养  [成自己编写无参构造方法] 的习惯，以防以后报错
* 		C. 构造方法可以重载
* 		D. 构造方法也可以给private成员变量赋值
*/
public class Car构造 {
	private String brand ;
	private int price;
	
	//自己写了构造方法，系统就不再帮我们提供，
	//所以必须自己写无参构造方法，否则在对象中调用时会报错
	
	public Car构造(){		//方法名和类名相同	方法没有返回值类型，连void都不能有			
		System.out.println("Car构造  de 构造方法");	//方法内也没有返回值
	}

	public Car构造(String brand){	 //构造方法也可给private成员变量赋值
		this.brand=brand;
	}
	public Car构造(int price){			
		this.price=price;	
	}
	public void show(){
		System.out.println(brand+"-----"+price);
	}
}
