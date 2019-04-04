package com.summarize;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年2月23日 上午10:17:32
* 
* 
*/
import javax.swing.JOptionPane;
import java.util.Random;
public class 弹框接受String与保留小数 {
	public static void main(String []args){
		/**
		 * 弹框输入两个数，随机弹框输出一个+随机输出两个数之间的数字
		 */
		//showInputDialog:弹出输入框
		String s = JOptionPane.showInputDialog("Please input a big number（double）.");//收进来的只能是String
		System.out.println(s);
		String a = JOptionPane.showInputDialog("Please input a small one.");
		System.out.println(a);
		Random ra = new Random();
		int r = ra.nextInt(10);
		if(r>=5){
			JOptionPane.showMessageDialog(null,"随机输出"+s);
		}else{
			JOptionPane.showMessageDialog(null,"随机输出"+a);
		}
		//随机输出两个数之间的数字：Math.random()*(大-小)+小
		double mid = (double)(Math.random()*(Double.parseDouble(s)-Double.parseDouble(a))+Double.parseDouble(a));
		JOptionPane.showMessageDialog(null,"随机输出两个数之间的数字：" +mid);
		//保留这个小数的一位小数【 (int)(mid*10)】/10.0：先将原数放大10倍，然后int强制向下取整，再除以10.0转换为一位小数，到达保留1位小数的效果
		//(int)(mid*100)/100.0  保留2位小数
		double m = (int)(mid*10)/10.0;
		JOptionPane.showMessageDialog(null,m);
		
		
		//showMessageDialog:弹出消息框
		JOptionPane.showMessageDialog(null,"i don't meet you");
		
		JOptionPane.showConfirmDialog(null,"i ");
		
		JOptionPane.showInternalConfirmDialog(null, "you");
		
		String options[]={"方案1","方案2","方案3"};
		JOptionPane.showInternalOptionDialog(null, "message", "title", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, "方案1");
	}
}
