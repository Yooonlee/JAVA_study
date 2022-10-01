package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list  = new ArrayList<String>();
		list.add("add");
		list.add("bbb");
		list.add("ccc");
		
		for(int i = 0; i < list.size(); i++)
		{
			String s = list.get(i);
			System.out.println(list.get(i)); //i 번째를 가져오겠다.
		}
	}

}
