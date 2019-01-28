package day06;

public class Test01 {
	public static void main(String[] args) {
		int[] arr= {2,1,5,7,4};
//		insertSort(arr);
		pipSort(arr);
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	/**
	 * 插入排序
	 */
	public static void insertSort(int[] arr)
	{
		for(int i = 1;i<arr.length;i++)
		{
			//取出当前的数temp
			int temp = arr[i];
			//从当前位置i的前一位元素开始找
			int j = i-1;
			//和已有的已经排序好的数组进行对比
			for( ;j>=0;j--)
			{
				if(arr[j]>temp)
				{
					//如果前一个大于temp j位置元素后移
					arr[j+1] = arr[j];
				}
				else{
					//如果前一个元素小于temp
					break;
				}
			}
			arr[j+1]= temp;
			
		}
	}
	/**
	 * 选择排序
	 */
	public static void choiceSort(int[] arr)
	{
		//循环整个数组
		for(int i = 0;i<arr.length;i++)
		{
			//假设i对应的值min是最小值 此时i的值为index
			int min = arr[i];
			int index = i;
			for(int j = i+1;j<arr.length;j++)
			{
				//一旦发现比min小的值 更新min和index值
				if(arr[j]<min)
				{
					min = arr[j];
					index = j;
				}
			}
			//当内循环结束后 将i的值和index对应的值调换
			arr[index] = arr[i];
			arr[i] = min;
			
		}
	}
	/**
	 * 冒泡排序
	 */
	public static void pipSort(int[] arr)
	{
		//控制外层循环次数
		for(int i = 0 ;i <arr.length;i++)
		{
			for(int j = 0 ; j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
}
