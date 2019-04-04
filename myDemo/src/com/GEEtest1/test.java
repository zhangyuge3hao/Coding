package com.GEEtest1;

public class test {
	public static void main(String[] args){
/*		String a = "";
		System.out.println(a.indexOf("2"));
		String b = "12335";
		System.out.println(b.substring(2));
		b.replace("1", "6");
		System.out.println(b.length()+"--"+b.substring(4,5));
		*/
		
		StringBuffer spop = new StringBuffer();
		spop.append(2);
		spop.append(1);
		spop.append(4);
		spop.append(5);
		String tpushB ="";
		System.out.println("spop:"+spop.toString()+"--tpushB:"+tpushB);
		getElem(tpushB,spop);
	}
	public static void getElem(String tpushB,StringBuffer spop){
		int len = spop.length();
		for(String i: spop){
			
		}
		for(int i = 0;i<len-1;i++){
			System.out.println(i+"--"+len+"--spop.substring(i,i+1).toString():"+spop.substring(i,i+1).toString()+"--tpushB:"+tpushB);
			if(tpushB.indexOf(spop.substring(i,i+1).toString()) == -1){//若spop里的第i位，不在tpushB中，删除
				spop.deleteCharAt(i);
				i--;
			}
		}
		System.out.println("spop:"+spop.toString()+"--tpushB:"+tpushB);
	}
}
