package edu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언하기
		int firstNo, secondNo;
		int sum;
		
		// 1. 두수 입력하기
		Scanner scan =new Scanner(System.in);		
		System.out.print("첫수 : ");
		firstNo = scan.nextInt();
		System.out.print("두번째 수 : ");
		secondNo = scan.nextInt();
		
		// 2. 합계내기(C=A+B)
		sum = firstNo + secondNo;
		
		// 3. 합계 출력하기
		System.out.println("합계 : " + sum );
	}

}
