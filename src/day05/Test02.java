package day05;

/**
 * 数组的增删改查
 * @author TEACHER
 *
 */
public class Test02 {
	public static void main(String[] args) {
		int[] oldArr = {14,5,6,33};
//		int[] tempArr = add(oldArr,99);
//		int[] tempArr = delete(oldArr, 2);
		int[] tempArr = insert(oldArr, 99, 2);
		Print(tempArr);
		
	}
	/**
	 * 向数组的末尾追加一个元素
	 * @param arr    要被在末尾追加元素的数组
	 * @param value  要在末尾增加的元素
	 * @return
	 */
	public static int[] add(int[] arr,int value)
	{
		//引用数据类型 所有的默认值都是null
		int[] newArr = new int[arr.length+1];
		for(int i = 0 ; i <arr.length;i++){
			//将旧数组中的值赋给新数组
			newArr[i]=arr[i];
		}
		newArr[arr.length] = value;
		return newArr;
	}
	
	/**
	 * 删除arr数组中下标为index的元素
	 * @param arr
	 * @param index
	 * @return
	 */
	public static int[] delete(int[] arr,int index)
	{
		int[] newArr = new int[arr.length-1];
		for(int i = 0 ; i <newArr.length;i++)
		{
			if(i<index)
			{
				newArr[i] = arr[i];
//				continue;
			}
			else
			{
				newArr[i] = arr[i+1];
			}
		}
		
		return newArr;
	}
	/**
	 * 在指定位置index插入一个元素value
	 * @param arr
	 * @param value
	 * @param index
	 * @return
	 */
	public static int[] insert(int[] arr,int value,int index)
	{
		int[] newArr = new int[arr.length+1];
		//以index为分界 进两次数组的拷贝
		for(int i= 0; i <arr.length;i++)
		{
			if(i<index)
			{
				newArr[i] = arr[i];
			}
			else {
				newArr[i+1]=arr[i];
			}
		}
		newArr[index] =value;
		
		return newArr;
	}
	
	/**
	 * 在控制台打印数组
	 */
	public static void Print(int[] arr)
	{
		for(int i =0 ;i<arr.length;i++ )
		{
			System.out.println(arr[i]);
		}
		System.out.println("-------------------");
	}
}
