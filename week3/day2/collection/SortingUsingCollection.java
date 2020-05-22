package week3.day2.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("HCL");
		list.add("Wipro");
		list.add("Aspire Systems");
		list.add("CTS");
		
		int size = list.size();
		
		Collections.sort(list);
		
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(list.get(i));
		}
		
	}

}
