package basis.object;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��6��13�� ����9:21:00
* 
* 	Student��һ��ѧ�����������࣬main�������ʺϷ���������
* 
* 	����һ���࣬����Ҫʹ��������е�[��Ա����]��[��Ա����]
* 	���Ե�һ������Ҫ����������ʵ�����
* 		��ʽ�� ����   ������  = new ����();
* 
* 	��ȡ��Ա�����ͳ�Ա������
* 		������.��������
* 		������.������(...);	
*/
public class StudentEntity {
	public static void main(String[] args) {
		
		//�޲ι���   + get/set
		Student s = new Student();
		s.setAge(10);
		s.setName("zhangyu");
		s.show();
		
		//�вι���   + get/set
		Student s1 = new Student("zhangyuge",20);
		s1.show();
	}
}
