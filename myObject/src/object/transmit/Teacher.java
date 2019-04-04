package object.transmit;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年6月13日 上午9:42:22
* 
*/
public class Teacher {
	public void teacher(Student s){	//类名作为形参，需要传入的是该类的对象
		System.out.println("加油");
	}
	public Student getStudent(){	//类名作为返回值，返回的是给该类的对象
		Student s = new Student();
		return s;
	}
}
