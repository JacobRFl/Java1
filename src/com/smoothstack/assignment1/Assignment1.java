package com.smoothstack.assignment1;

public class Assignment1 {

	public static void main(String[] args) {
		String str = "_____________";
		printloop1();
		System.out.println(str);
		printLoop2();
		System.out.println(str);
		printLoop3();
		System.out.println(str);
		printLoop4();
		
	}

	private static void printLoop4() {
		String str1 = " ";
		String str2 = "*******";
		for(int i = 0;i<4;i++) {
			System.out.println(str1+str2);
			if (str2.length()>2)
			str2=str2.substring(2);
			str1=str1 +" ";
		}
	}

	private static void printLoop3() {
		String str1 = "    ";
		String str2 = "*";
		for(int i = 0;i<4;i++) {
			System.out.println(str1+str2);
			str1=str1.substring(1);
			str2=str2 +"**";
		}
		
	}

	private static void printLoop2() {
		String str = "****";
		for(int i =4;i>=1;i--) {
			
			System.out.println(str);
			str = str.substring(1);
		}
		
	}

	private static void printloop1() {
		String str = "";
		for(int i =1;i<=4;i++) {
			str = str+"*";
			System.out.println(str);
		}
		
	}

}
