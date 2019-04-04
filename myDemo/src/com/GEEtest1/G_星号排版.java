package com.GEEtest1;
import java.util.Scanner;
public class G_–«∫≈≈≈∞Ê {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("«Î ‰»Î–«∫≈◊Ó¥Û±ﬂ≥§");
		String s = sc.next();
		int temp = 1;
		if(s.matches("[13579]+")){
			int n = Integer.parseInt(s);
			while(temp<=n){
				space((n-temp)/2);
				star(temp);
				System.out.println();
				temp += 2;
			}

			temp = n-2;
			while(temp>=0){
				space((n-temp)/2);
				star(temp);
				System.out.println();
				temp -= 2;
			}
		}

				
	}
	public static void space(int n){
		for(int i = 0;i<n;i++){
			System.out.print(" ");
		}
	}
	public static void star(int n){
		for(int i = 0;i<n;i++){
			System.out.print("*");
		}
	}
}
