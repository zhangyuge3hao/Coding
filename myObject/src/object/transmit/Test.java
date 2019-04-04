package object.transmit;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年6月13日 上午9:47:28
*/
public class Test {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		Student s = new Student(); //可单独输出
		t.teacher(s);
		t.getStudent();
	}
}
