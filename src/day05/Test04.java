package day05;

public class Test04 {
	public static void main(String[] args) {
		//第一个参数必填 第二个可写可不写
		int[][] arr = new int[5][];
		int[] arr2= {23,3,3,3};
		int[][] arr1 = {
				{1,2,3,4},
				{2,3,4,5},
				{3,4,5,6}
		};
		
		System.out.println(arr1[2][3]);
		
		//控制行
		for(int i = 0 ; i < arr1.length;i++)
		{
			//控制列
			for(int j = 0 ;j<arr1[i].length;j++)
			{
				System.out.println(arr1[i][j]);
			}
		}
	}
}
