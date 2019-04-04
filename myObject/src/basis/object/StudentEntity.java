package basis.object;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年6月13日 上午9:21:00
* 
* 	Student是一个学生事物描述类，main方法不适合放在它里面
* 
* 	调用一个类，就是要使用这个类中的[成员方法]和[成员变量]
* 	所以第一步就是要创建这个类的实体对象：
* 		格式： 类名   对象名  = new 类名();
* 
* 	获取成员变量和成员方法：
* 		对象名.变量名；
* 		对象名.方法名(...);	
*/
public class StudentEntity {
	public static void main(String[] args) {
		
		//无参构造   + get/set
		Student s = new Student();
		s.setAge(10);
		s.setName("zhangyu");
		s.show();
		
		//有参构造   + get/set
		Student s1 = new Student("zhangyuge",20);
		s1.show();
	}
}
