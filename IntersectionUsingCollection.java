package week3.day2.collections;

import java.util.HashSet;
import java.util.Set;

public class IntersectionUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer arr1[]={3,2,11,4,6,7};
Integer arr2[]={1,2,8,4,9,7};
Set<Integer> hs=new HashSet<Integer>();
for (int i = 0; i < arr1.length; i++) {
	for (int j = 0; j < arr2.length; j++) {
		if(arr1[i]==arr2[j]) {
			hs.add(arr1[i]);
		}
	}
}

System.out.println("The Intersection is"+hs);
	}
}
