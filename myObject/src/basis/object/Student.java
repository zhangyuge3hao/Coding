package basis.object;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��6��13�� ����9:20:25
* 
* 	Student��һ��ѧ�����������࣬main�������ʺϷ���������
*/
public class Student {
	private String name;
	private int age;
	
	//���췽��
	public Student (){
		System.out.println("Student  de ���췽��");
	}
	
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	//��Ա����
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
