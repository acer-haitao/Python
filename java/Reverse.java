package cn.com.DIH;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Reverse {
	public static void main(String[] args) {
		//���鷴ת
		String str = "Hello World";
		String reverse  = new StringBuffer(str).reverse().toString();
		System.out.println("��תǰ��" + str);
		System.out.println("��ת��:" + reverse);
		
		//��������
		ArrayList arraylist = new ArrayList();
		arraylist.add("A");	
		arraylist.add("B");	
		arraylist.add("C");	
		arraylist.add("D");
		arraylist.add("E");
		System.out.println("����ǰ��" + arraylist);
		Collections.reverse(arraylist);
		System.out.println("�����" + arraylist);
		
		//�������
		String name[] = new String[3];
		name[1] = "zhangsan";
		name[2] = "lisi";
		name[0] = "wangwu";
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		//���ֵ ��Сֵ
		Integer[] Num = {1,2,3,4,5,6,-10};
		int min = (int)Collections.min(Arrays.asList(Num));
		int max = (int)Collections.max(Arrays.asList(Num));
		System.out.println("��Сֵ��" + min +" "+ "���ֵ��" + max);
		
		//����ϲ�
		String a[] = {"A", "B", "C"};
		String b[] = {"D", "E"};
		ArrayList list = new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));//������������������飨����������������ĸ��ַ���
	  
		//�������
		int array[] = new int[6];
		Arrays.fill(array, 100);
		System.out.println(Arrays.toString(array));
		Arrays.fill(array, 0, 6, 500);
		System.out.println(Arrays.toString(array));
		
	    //��������
		String[] names = {"A","b","c"};
		String[] extend = new String[5];
		extend[3] = "D";
		extend[4] = "F";
		//Դ������λ���� srcPos �� srcPos+length-1 ֮���������ֱ��Ƶ�Ŀ�������е� destPos �� destPos+length-1 λ�á� 
		System.arraycopy(names, 0, extend, 0, names.length);
		System.out.println(Arrays.toString(extend));
		
		//ɾ������
		ArrayList list1 = new ArrayList();
		list1.clear();
		list1.add(0, "��һ��Ԫ��");
		list1.add(1, "�ڶ���Ԫ��");
		list1.add(2, "������Ԫ��");
		System.out.println("��ֵɾ��ǰ��" + list1);
		list1.remove(1);
		System.out.println("��ֵɾ����" + list1);
		
		//����
		ArrayList list2 = new ArrayList();
		list2.clear();
		list2.add(0, "��һ��Ԫ��");
		list2.add(1, "�ڶ���Ԫ��");
		list2.add(2, "������Ԫ��");
		
		list2.retainAll(list1);
		System.out.println("����:" + list2);
		list2.removeAll(list1);
		System.out.println("�:" + list2);
	
	}
}
