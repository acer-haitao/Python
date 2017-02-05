package cn.com.DIH;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Reverse {
	public static void main(String[] args) {
		//数组反转
		String str = "Hello World";
		String reverse  = new StringBuffer(str).reverse().toString();
		System.out.println("反转前：" + str);
		System.out.println("反转后:" + reverse);
		
		//数组排序
		ArrayList arraylist = new ArrayList();
		arraylist.add("A");	
		arraylist.add("B");	
		arraylist.add("C");	
		arraylist.add("D");
		arraylist.add("E");
		System.out.println("排序前：" + arraylist);
		Collections.reverse(arraylist);
		System.out.println("排序后：" + arraylist);
		
		//数组输出
		String name[] = new String[3];
		name[1] = "zhangsan";
		name[2] = "lisi";
		name[0] = "wangwu";
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		//最大值 最小值
		Integer[] Num = {1,2,3,4,5,6,-10};
		int min = (int)Collections.min(Arrays.asList(Num));
		int max = (int)Collections.max(Arrays.asList(Num));
		System.out.println("最小值：" + min +" "+ "最大值：" + max);
		
		//数组合并
		String a[] = {"A", "B", "C"};
		String b[] = {"D", "E"};
		ArrayList list = new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));//此类包含用来操作数组（比如排序和搜索）的各种方法
	  
		//数组填充
		int array[] = new int[6];
		Arrays.fill(array, 100);
		System.out.println(Arrays.toString(array));
		Arrays.fill(array, 0, 6, 500);
		System.out.println(Arrays.toString(array));
		
	    //数组扩容
		String[] names = {"A","b","c"};
		String[] extend = new String[5];
		extend[3] = "D";
		extend[4] = "F";
		//源数组中位置在 srcPos 到 srcPos+length-1 之间的组件被分别复制到目标数组中的 destPos 到 destPos+length-1 位置。 
		System.arraycopy(names, 0, extend, 0, names.length);
		System.out.println(Arrays.toString(extend));
		
		//删除数组
		ArrayList list1 = new ArrayList();
		list1.clear();
		list1.add(0, "第一个元素");
		list1.add(1, "第二个元素");
		list1.add(2, "第三个元素");
		System.out.println("数值删除前：" + list1);
		list1.remove(1);
		System.out.println("数值删除后：" + list1);
		
		//数组差集
		ArrayList list2 = new ArrayList();
		list2.clear();
		list2.add(0, "第一个元素");
		list2.add(1, "第二个元素");
		list2.add(2, "第三个元素");
		
		list2.retainAll(list1);
		System.out.println("交集:" + list2);
		list2.removeAll(list1);
		System.out.println("差集:" + list2);
	
	}
}
