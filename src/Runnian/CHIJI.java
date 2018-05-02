package Runnian;

import java.util.Scanner;

public class CHIJI {
public static void main(String[] args) {
	Scanner  sc=new Scanner(System.in);
	System.out.println("ÇëÊäÈë³É¼¨");
	int c=sc.nextInt();
	if(c>90&&c<100){
		System.out.println("A");
	}else if(c>80&&c<90){
		System.out.println("B");
	}else if(c>70&&c<80){
		System.out.println("C");
	}else if(c>60&&c<70){
		System.out.println("D");
	}else if(c<60){
		System.out.println("F");
	}
	
}
}
