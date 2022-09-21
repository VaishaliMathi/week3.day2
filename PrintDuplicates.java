package week3.day2.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates 
{

	public static void main(String[] args)
	{
		Integer arr[] = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> duplicates = new HashSet<Integer>();
		for (Integer dup : arr)
		{
			if(duplicates.add(dup)==false)
			{
				System.out.println(dup);
			}
			
		}
		
	}	
}

			

