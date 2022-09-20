package week3.day2.collections;

import java.util.Set;
import java.util.TreeSet;

public class MissingELement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Integer arr[] = {1,2,3,4,7,6,8};
	Set<Integer> data=new TreeSet<Integer>();
for (int i = 0; i < arr.length; i++) {
	if(arr[i]!=(i+1)) {
		System.out.println("The missing element is:"+ (i+1));
		break;
	}
}
	}

}
