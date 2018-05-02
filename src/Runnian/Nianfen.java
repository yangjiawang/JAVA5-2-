package Runnian;

import java.util.Scanner;

public class Nianfen {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Scanner sc=new Scanner(System.in);
System.out.println("请输入年份");
 int nian =sc.nextInt();
 if(nian%400==0||nian%4==0&&nian%100!=0){
	 System.out.println("闰年");
 }else{
	 System.out.println("平年");
 }
	}

}
