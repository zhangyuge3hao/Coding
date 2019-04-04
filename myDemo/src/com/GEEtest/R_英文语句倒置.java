package com.GEEtest;
/**
 * ÀýÈç£ºÊäÈë£ºstudent. a am I
				JOBDU! Like I and Freshman a I¡¯m
  Êä³ö I am a student.
		JOBDU! Like I and Freshman a I¡¯m
I¡¯m a Freshman and I like JOBDU!

 * @author pc
 *
 */
public class R_Ó¢ÎÄÓï¾äµ¹ÖÃ {
	public static void main(String []args){
		String a = "student. a am I";
		String b = "JOBDU! Like I and Freshman a I¡¯m";
		String a1[] = a.split(" ");
		String b1[] = b.split(" ");
		
/*		for(String c:a1){
			System.out.println(c);
		}
		for(String c:b1){
			System.out.println(c);
		}*/
		int len1 = a1.length;
		int len2 = b1.length;
		for(int i =len1-1;i>=0;i--){
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		for(int i =len2-1;i>=0;i--){
			System.out.print(b1[i]+" ");
		}
	}
}
