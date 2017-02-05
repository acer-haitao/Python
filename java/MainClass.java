package cn.com.DIH;

import java.util.Arrays;

/*排序*/
public class MainClass {

	public static void main(String[] args) {
		int array[] = {9,8,0,-5,12,1,3,44,23,7};
		Arrays.sort(array);
		PrintArray("数组排序后", array);
		System.out.println();
		
		int index = Arrays.binarySearch(array, 44);
		System.out.println("44在第" + index + "个位置");
		
		
		int index1 = Arrays.binarySearch(array, 17);
		
		array = InsertNum(array, 17, (-index1 - 1));
		PrintArray("添加数组1：", array);
	}
	
	private static void PrintArray(String msg, int array[])
	{
		System.out.print(msg + ":[长度：" + array.length +"]" );
		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(",");
			}
			System.out.print(array[i]);
		}
	}
	private static int[] InsertNum(int original[], int insertNum, int index)
	{
		int length = original.length;
		int des[] = new int[length + 1];
		System.arraycopy(original, 0, des, 0, index);
		//从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
		des[index] = insertNum;
		System.arraycopy(original, index, des, index+1, length-index);
		return des;
	}
}
