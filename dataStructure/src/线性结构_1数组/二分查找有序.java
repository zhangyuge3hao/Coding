package 线性结构_1数组;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年3月29日 下午5:28:00
* 
* 
*/
public class 二分查找有序 {//必须是有序列才可用
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int target = 8;
		erfen(arr,target);
		erfen1(arr,target);
	}
	public static void erfen(int[] arr,int target){
		/**
		 * 使用begin、mid、end来记录数组边界和查找中间点
		 */
		int len = arr.length;
		int begin =0,end = len-1;
		int mid = (begin + end)/2;
		int times = 0;//记录查找的次数，用于在=len时退出循环，表示全部数字查找完毕
		boolean flag = false;//找到退出判断标记
		//--------视频错误----若开始的位置和结束的位置重合，或者开始位置在结束位置后面，即：begin >= end
		//若开始位置在结束位置后面，即：begin > end
		while(times <= len){
			if(arr[mid] < target){
				begin = mid+1;
			}else if(arr[mid] > target){
				end = mid-1;
			}else if(begin > end){
				System.out.println("while内，查无此数");
				break;
			}
			else{
				flag = true;
				break;
			}
			mid = (begin + end)/2;
			times++;
		}
		if(flag){
			System.out.println("找到这个数"+target+"，在下标："+mid);
		}else{
			System.out.println("查无此数");
		}
	}
	public static void erfen1(int[] arr,int target){
		int len = arr.length;
		int index = len/2;
		int times = 0;//记录查找的次数，用于在=len时退出循环，表示全部数字查找完毕
		boolean flag = false;
		while(times<=len){
			if(target < arr[index]){
				index /= 2;
			}else if(target > arr[index]){
				index += (len - index)/2;
			}else{
				flag = true;
				break;
			}
			times++;
		}
		if(flag){
			System.out.println("找到这个数"+target+"，在下标："+index);
		}else{
			System.out.println("查无此数");
		}
	}
}
