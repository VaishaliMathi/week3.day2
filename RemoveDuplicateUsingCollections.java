package week3.day2.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateUsingCollections {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> str= new LinkedHashSet<String>();
		for (int i = 0; i < split.length; i++)
		{
		 str.add(split[i]);
		}
		System.out.println(str);

	}

}
