package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Filter_the_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nameArray = new String [] {"Peter" , "Steve", "paul","Ram"};
		
		// converting Array into Stream
		Stream<String> stream1=Arrays.stream(nameArray);
		Stream<String>filteredstream=stream1.filter(name->name.length()>4);
		
		//converting Stream to Array
		String[] filteredNameArray=filteredstream.toArray(String[]::new);

	}

}
