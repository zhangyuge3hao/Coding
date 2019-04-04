package basis.object;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年6月13日 上午9:20:25
* 
* 	Student是一个学生事物描述类，main方法不适合放在它里面
*/
public class Student {
	private String name;
	private int age;
	
	//构造方法
	public Student (){
		System.out.println("Student  de 构造方法");
	}
	
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	//成员方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void show(){
		System.out.println(name+"----"+age);
	}
}
