package com.array;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��10�� ����11:37:31
* 
* 	��ά���飺��Ԫ����  [һ��һά����] ������
* 
* 	�����ʽ��
* 		��������[][] ������ (�Ƽ�);
* 		��������   ������[][];
* 		��������[] ������[];
* 
* 	��̬��ʼ����
* 		��������[][] ������  = new ��������[m][n];
* 		m: ��ʾ����������ά�����У�Ԫ�أ�һά���飩�ĸ��� [��ʾ�����ά�����а������ٸ�һά����]
* 		n: ��ʾ��ά����ÿ��Ԫ�أ�һά���飩�ڵ�Ԫ�ظ��� [��ʾÿ��һά�����ж��ٸ�Ԫ��]
* 
* 	��̬��ʼ����
* 		��������[][] ������  = new ��������{{һά����Ԫ��...},{һά����Ԫ��...},{һά����Ԫ��...}...};
* 		��������[][] ������  = {{һά����Ԫ��...},{һά����Ԫ��...},{һά����Ԫ��...}...};  (�򻯰�)
* 
* 	���У�
* 		��ά�����������[m]�����ҵ�һά����
* 		һά�����������[n]�����ҵ���ӦԪ��
* 		����������[m][n]
* 
*/
public class TwoDimensionArray {
	public static void main(String[] args) {
		int[][] arryArry = {{1,2,3},{4,5,9,6},{7,8,0}};
		System.out.println("/---------�����ά�����һά����ĵ�ַ---------/");
		/*
		 * ͬһά���飬ֱ������������������������ĵ�ַ�����У�
		 * ��ά�������� arryArry   ��ʾ��ά����ĵ�ַ
		 * һά�������� arryArry[m] ��ʾ��m��Ԫ�أ�һά����ĵ�ַ
		 */
		System.out.println("arryArry="+arryArry); 		// [[I@2d04cf67  ��ά�����ַ���������[[��
		System.out.println("arryArry[0]="+arryArry[0]);	// [I@2d11f5f1     һά�����ַ�����һ��[��
		//���Կ������������ά�����ַ��ʱ�򣬵�ַ���������[[�����һά�����ַ��ʱ�������һ��[
		
		/*
		 * Ҫ�����ά�����е�ÿ������Ԫ�أ�
		 * 	A. �ҵ���Ԫ�����ڵ�һά����[m]��		arryArry[m];
		 *  B. �����Ԫ���ڶ�Ӧһά�����е�λ��[n]��	arryArry[m][n];
		 */
		System.out.println("/---------�������Ԫ��---------/");
		System.out.println("arryArry[0][0]="+arryArry[0][0]);
		
		System.out.println("/---------���ȫ��Ԫ��---------/");
		int tempOut ;
		int tempIn ;
		/*
		 * ע����	��Ϊ  arryArry.length ��ʾ���鳤�ȣ�������1��ʼ
		 * 		��  ����������  temp ������0��ʼ
		 * 		Ϊ��ֹ����Խ�磬����������߼�Ķ����У�������temp < arryArry.length
		 *		������  " <= "
		 */
		for(tempOut=0;tempOut<arryArry.length;tempOut++){	//arryArry.length ���ٸ�һά����
			System.out.println("/---��"+tempOut+"������---/"+arryArry.length);
			for(tempIn=0;tempIn<arryArry[tempOut].length;tempIn++){//ÿ���Ӵ����� arryArry[tempOut].length
				System.out.println("arryArry["+tempOut+"]["+tempIn+"]="+arryArry[tempOut][tempIn]);
			}
		}
		
	}
}
