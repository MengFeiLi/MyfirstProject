package day06;

import java.util.Arrays;


public class Test05 {
	public static void main(String[] args) {
		int[] arr  = {2,5,1,4,3};
		//相当于调用
		//实现原理 快速排序
		//前提 该数组必须是可排序的 Compareable
		Arrays.sort(arr);
		
		for(int i = 0 ;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
