package com.dejarvu.spring;

public class Find {

	public static void main(String[] args) {
		int a[] = { 12, 3, 21, 6, 4, 13};
		
		int sum = 0;
		for (int i = 0; i < a.length; ++i) {
			sum = sum + a[i];
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}
