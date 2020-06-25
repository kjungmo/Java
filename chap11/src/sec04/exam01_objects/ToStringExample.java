package sec04.exam01_objects;

import java.util.*;

public class ToStringExample {

	public static void main(String[] args) {

		String str1 = "ȫ�浿";
		String str2 = null;
		String str3 = "null";
		
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str3));
		
		System.out.println(Objects.toString(str2, "input is null"));
		System.out.println(Objects.toString(str3, "input is 'null'"));
	}

}
