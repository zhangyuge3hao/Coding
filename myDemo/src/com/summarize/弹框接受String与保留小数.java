package com.summarize;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��2��23�� ����10:17:32
* 
* 
*/
import javax.swing.JOptionPane;
import java.util.Random;
public class �������String�뱣��С�� {
	public static void main(String []args){
		/**
		 * ��������������������������һ��+������������֮�������
		 */
		//showInputDialog:���������
		String s = JOptionPane.showInputDialog("Please input a big number��double��.");//�ս�����ֻ����String
		System.out.println(s);
		String a = JOptionPane.showInputDialog("Please input a small one.");
		System.out.println(a);
		Random ra = new Random();
		int r = ra.nextInt(10);
		if(r>=5){
			JOptionPane.showMessageDialog(null,"������"+s);
		}else{
			JOptionPane.showMessageDialog(null,"������"+a);
		}
		//������������֮������֣�Math.random()*(��-С)+С
		double mid = (double)(Math.random()*(Double.parseDouble(s)-Double.parseDouble(a))+Double.parseDouble(a));
		JOptionPane.showMessageDialog(null,"������������֮������֣�" +mid);
		//�������С����һλС���� (int)(mid*10)��/10.0���Ƚ�ԭ���Ŵ�10����Ȼ��intǿ������ȡ�����ٳ���10.0ת��ΪһλС�������ﱣ��1λС����Ч��
		//(int)(mid*100)/100.0  ����2λС��
		double m = (int)(mid*10)/10.0;
		JOptionPane.showMessageDialog(null,m);
		
		
		//showMessageDialog:������Ϣ��
		JOptionPane.showMessageDialog(null,"i don't meet you");
		
		JOptionPane.showConfirmDialog(null,"i ");
		
		JOptionPane.showInternalConfirmDialog(null, "you");
		
		String options[]={"����1","����2","����3"};
		JOptionPane.showInternalOptionDialog(null, "message", "title", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, "����1");
	}
}
