package edu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �����ϱ�
		int firstNo, secondNo;
		int sum;
		
		// 1. �μ� �Է��ϱ�
		Scanner scan =new Scanner(System.in);		
		System.out.print("ù�� : ");
		firstNo = scan.nextInt();
		System.out.print("�ι�° �� : ");
		secondNo = scan.nextInt();
		
		// 2. �հ賻��(C=A+B)
		sum = firstNo + secondNo;
		
		// 3. �հ� ����ϱ�
		System.out.println("�հ� : " + sum );
	}

}
