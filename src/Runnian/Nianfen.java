package Runnian;

import java.util.Scanner;

public class Nianfen {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
Scanner sc=new Scanner(System.in);
System.out.println("���������");
 int nian =sc.nextInt();
 if(nian%400==0||nian%4==0&&nian%100!=0){
	 System.out.println("����");
 }else{
	 System.out.println("ƽ��");
 }
	}

}
