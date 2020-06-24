package sec04.exam01_objects;

import java.util.*;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {

		Integer o1 = 1000; //Integer 객체에 1000이 대입된다. 
		Integer o2 = 1000; //Integer는 Object.equals를 재정의했다(내부의 정수값이 같으면 true를 return하도록)
		System.out.println(Objects.equals(o1, o2)); //전혀 다른 객체이지만 값이 같으면 true 리턴함
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		System.out.println(Objects.deepEquals(o1, o2));
		
		System.out.println();
		
		Integer[] arr1 = { 1, 2 }; //"1"의 값을 가진 Integer객체가 배열의 항목의 값이 된다. int[] arr1 = {1,2}에서 1은 4byte의 정수값이다
		Integer[] arr2 = { 1, 2 };
		System.out.println(Objects.equals(arr1, arr2)); // 번지가 다르다
		System.out.println(Objects.deepEquals(arr1, arr2)); // 배열의 항목이 같다
		System.out.println(Arrays.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, null));
	}

}
