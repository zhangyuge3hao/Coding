package 线性结构_1数组;
import javax.swing.JOptionPane;//【】


public class MyArray {
	public static void main(String[] args){
		//创造一个可变数组
		MyArrayObject ma = new MyArrayObject();
		System.out.println("ma.size():"+ma.size());
		ma.add(0);
		ma.add(1);
		ma.add(2);
		ma.show();
		
		System.out.println("----------");
		System.out.println("ma.insert(1, 5):");
		ma.insert(1, 5);
		ma.show();
		
		System.out.println("----------");
		System.out.println("ma.deleteAtInd(7);:");
		ma.deleteAtInd(7);
		ma.show();

		System.out.println("----------");
		System.out.println("ma.remove(9);:");
		ma.remove(9);
		ma.show();
		
		System.out.println("----------");
		System.out.println("ma.replace(2, 0);:");
		ma.replace(1, 0);
		ma.show();
		
		System.out.println("----------");
		System.out.println("ma.getIndOrder(1):"+ma.getIndOrder(1));
	}
}
