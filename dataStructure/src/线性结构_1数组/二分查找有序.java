package ���Խṹ_1����;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��3��29�� ����5:28:00
* 
* 
*/
public class ���ֲ������� {//�����������вſ���
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int target = 8;
		erfen(arr,target);
		erfen1(arr,target);
	}
	public static void erfen(int[] arr,int target){
		/**
		 * ʹ��begin��mid��end����¼����߽�Ͳ����м��
		 */
		int len = arr.length;
		int begin =0,end = len-1;
		int mid = (begin + end)/2;
		int times = 0;//��¼���ҵĴ�����������=lenʱ�˳�ѭ������ʾȫ�����ֲ������
		boolean flag = false;//�ҵ��˳��жϱ��
		//--------��Ƶ����----����ʼ��λ�úͽ�����λ���غϣ����߿�ʼλ���ڽ���λ�ú��棬����begin >= end
		//����ʼλ���ڽ���λ�ú��棬����begin > end
		while(times <= len){
			if(arr[mid] < target){
				begin = mid+1;
			}else if(arr[mid] > target){
				end = mid-1;
			}else if(begin > end){
				System.out.println("while�ڣ����޴���");
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
			System.out.println("�ҵ������"+target+"�����±꣺"+mid);
		}else{
			System.out.println("���޴���");
		}
	}
	public static void erfen1(int[] arr,int target){
		int len = arr.length;
		int index = len/2;
		int times = 0;//��¼���ҵĴ�����������=lenʱ�˳�ѭ������ʾȫ�����ֲ������
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
			System.out.println("�ҵ������"+target+"�����±꣺"+index);
		}else{
			System.out.println("���޴���");
		}
	}
}
