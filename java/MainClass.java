package cn.com.DIH;

import java.util.Arrays;

/*����*/
public class MainClass {

	public static void main(String[] args) {
		int array[] = {9,8,0,-5,12,1,3,44,23,7};
		Arrays.sort(array);
		PrintArray("���������", array);
		System.out.println();
		
		int index = Arrays.binarySearch(array, 44);
		System.out.println("44�ڵ�" + index + "��λ��");
		
		
		int index1 = Arrays.binarySearch(array, 17);
		
		array = InsertNum(array, 17, (-index1 - 1));
		PrintArray("�������1��", array);
	}
	
	private static void PrintArray(String msg, int array[])
	{
		System.out.print(msg + ":[���ȣ�" + array.length +"]" );
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
		//��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����
		des[index] = insertNum;
		System.arraycopy(original, index, des, index+1, length-index);
		return des;
	}
}
