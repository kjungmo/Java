package sec04.exam01_objects;

import java.util.*;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {

		Integer o1 = 1000; //Integer ��ü�� 1000�� ���Եȴ�. 
		Integer o2 = 1000; //Integer�� Object.equals�� �������ߴ�(������ �������� ������ true�� return�ϵ���)
		System.out.println(Objects.equals(o1, o2)); //���� �ٸ� ��ü������ ���� ������ true ������
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		System.out.println(Objects.deepEquals(o1, o2));
		
		System.out.println();
		
		Integer[] arr1 = { 1, 2 }; //"1"�� ���� ���� Integer��ü�� �迭�� �׸��� ���� �ȴ�. int[] arr1 = {1,2}���� 1�� 4byte�� �������̴�
		Integer[] arr2 = { 1, 2 };
		System.out.println(Objects.equals(arr1, arr2)); // ������ �ٸ���
		System.out.println(Objects.deepEquals(arr1, arr2)); // �迭�� �׸��� ����
		System.out.println(Arrays.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, null));
	}

}
