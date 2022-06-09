package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Convert_List_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an ArrayList
		List<Integer> numberList=new ArrayList<Integer>();
		numberList.add(1);
		numberList.add(5);
		numberList.add(8);
		System.out.println(numberList);
		
		//Convert into stream
		 
		Stream<Integer> stream=numberList.stream();
		System.out.println(stream);
		System.out.println("Count" +stream.count());
		
		
	}

	@Override
	public String toString() {
		return "Convert_List_Stream [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
