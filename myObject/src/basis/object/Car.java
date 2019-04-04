package basis.object;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年6月9日 上午9:03:40
* 
*	（一）Java语言最基础的单位是类，用类来解释世界
* 
* 	类：一个事物的一组相关  [属性] 与 [行为] 的集合
* 	对象：该事物的具体体现（这种实物的一个实体）
* 		例：	类：	学生
* 			对象：班长
* 
* 	（二）【成员变量   和  局部变量  的区别】：
* 	A. 在类中的位置：
* 		成员变量：	在类中，方法外
* 		局部变量：	在方法里面
* 	B. 在内存里的位置：
* 		成员变量：	栈内存
* 		局部变量：	堆内存
* 	C. 生命周期：
* 		成员变量：	与类共存亡
* 		局部变量：	随方法的调用而产生，随方法的调用结束的消失
* 	D. 初始化：
* 		成员变量：	系统默认有初始值，[可以不用初始化]
* 		局部变量：	系统没有初始值，[必须定义+赋初值，否则报错]
* 
* 	（三）【private关键字】：
* 	A. 为防止对象直接访问成员变量造成错误，可对一些成员变量加上private关键字
* 	B. 有private关键字的成员变量就只能在本类中被调用，不能在对象里直接访问
* 	C. 对象可用类中的get()、set()函数对private成员变量进行赋值和调用
*		         可在类中set()方法下加入赋值判断，来保证private成员变量的安全
*	D. 私有成员变量也可用构造方法进行赋值
*
* 	（四）【封装】
* 	A. 是面向对象三大特征之一【封装、继承、多态】
* 	B. 是面向对象编程语言对客观世界的模拟，客观世界里成员变量都是隐藏在对象内部的，外界无法直接操作和修改。即定义 private成员变量
* 	C. 封装原则：
*		1. 将不需要对外提供的内容都隐藏起来。
*		2. 把属性隐藏，提供公共方法对其访问。
*			成员变量private，提供对应的getXxx()/setXxx()方法
*	D. 好处：
*		1. 通过方法来控制成员变量的操作，提高了代码的安全性
*		2. 把代码用方法进行封装，提高了代码的复用性
*
*	（五）【this关键字与就近原则】
*	A. 当类的方法中出现成员变量和局部变量相同命名时，系统自动判为调用局部变量
*		（因为方法中局部变量的入口一定比成员变量定义的地方近，这就是【就近原则】）
*	B. 为方便区分，引入this关键字：
*		1. this代表所在类的【对象】引用，为（在调用类时new出的）实体对象的赋值及操作服务
*		2. 方法被哪个对象调用，this就代表那个对象
*
*/
public class Car {
	String brand ;
	private int price ;  //封装的体现之一
	String color ;
	
	//右键--scoure--Generate Getters and Setters 自动形成get的set方法
	public int getPrice() {
		return price;
	}
	public boolean setPrice(int price) {
		if(price<=0 || price>30){
			System.out.println("您输入的价格有误");
			return true;	//一般情况下，给[判错继续循环]判断体传flag值时，异常状态flag为true（用来继续判错循环）
		}else{
			this.price = price;
			return false;	//正确状态flag为false（用以退出判错循环）
		}
	}
	
	public void buy(String brand,String color,int price){
		System.out.println(price+" 万买辆  "+color+" 色的  "+brand);
		discount(price);
	}
	public void brand(String brand){
		System.out.println("品牌是："+brand);
	}
	public void color(String color){
		System.out.println("颜色是："+color);
	}
	public void discount(int price){
		
		double discount=price*0.75; //局部变量，必须设置初值
		
		System.out.println("打完折的价格是："+discount+"万");
	}
}
