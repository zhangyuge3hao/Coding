package com.array;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月10日 上午11:37:31
* 
* 	二维数组：即元素是  [一堆一维数组] 的数组
* 
* 	定义格式：
* 		数据类型[][] 数组名 (推荐);
* 		数据类型   数组名[][];
* 		数据类型[] 数组名[];
* 
* 	动态初始化：
* 		数据类型[][] 数组名  = new 数据类型[m][n];
* 		m: 表示定义的这个二维数组中，元素（一维数组）的个数 [表示这个二维数组中包含多少个一维数组]
* 		n: 表示二维数组每个元素（一维数组）内的元素个数 [表示每个一维数组有多少个元素]
* 
* 	静态初始化：
* 		数据类型[][] 数组名  = new 数组类型{{一维数组元素...},{一维数组元素...},{一维数组元素...}...};
* 		数据类型[][] 数组名  = {{一维数组元素...},{一维数组元素...},{一维数组元素...}...};  (简化版)
* 
* 	其中：
* 		二维数组配合索引[m]可以找到一维数组
* 		一维数组配合索引[n]可以找到对应元素
* 		即：数组名[m][n]
* 
*/
public class TwoDimensionArray {
	public static void main(String[] args) {
		int[][] arryArry = {{1,2,3},{4,5,9,6},{7,8,0}};
		System.out.println("/---------输出二维数组和一维数组的地址---------/");
		/*
		 * 同一维数组，直接输出数组名，即输出该数组的地址，其中：
		 * 二维数组名： arryArry   表示二维数组的地址
		 * 一维数组名： arryArry[m] 表示第m个元素，一维数组的地址
		 */
		System.out.println("arryArry="+arryArry); 		// [[I@2d04cf67  二维数组地址（左侧两个[[）
		System.out.println("arryArry[0]="+arryArry[0]);	// [I@2d11f5f1     一维数组地址（左侧一个[）
		//可以看出，当输出二维数组地址的时候，地址左侧有两个[[；输出一维数组地址的时候，左侧有一个[
		
		/*
		 * 要输出二维数据中的每个具体元素：
		 * 	A. 找到该元素所在的一维数组[m]：		arryArry[m];
		 *  B. 在这个元素在对应一维数组中的位置[n]：	arryArry[m][n];
		 */
		System.out.println("/---------输出具体元素---------/");
		System.out.println("arryArry[0][0]="+arryArry[0][0]);
		
		System.out.println("/---------输出全部元素---------/");
		int tempOut ;
		int tempIn ;
		/*
		 * 注明：	因为  arryArry.length 表示数组长度，计数从1开始
		 * 		而  数组编号索引  temp 计数从0开始
		 * 		为防止数组越界，在所有数组边间的定义中，必须是temp < arryArry.length
		 *		不能用  " <= "
		 */
		for(tempOut=0;tempOut<arryArry.length;tempOut++){	//arryArry.length 多少个一维数组
			System.out.println("/---第"+tempOut+"子数组---/"+arryArry.length);
			for(tempIn=0;tempIn<arryArry[tempOut].length;tempIn++){//每个子串长度 arryArry[tempOut].length
				System.out.println("arryArry["+tempOut+"]["+tempIn+"]="+arryArry[tempOut][tempIn]);
			}
		}
		
	}
}
