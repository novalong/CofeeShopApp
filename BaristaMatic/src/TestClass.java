import java.util.*;

/**
 * 
 */

/**
 * @author naveen
 *
 */
public class TestClass {
	public static void main(String[] args)
	{
		//List<int[]> integer = new ArrayList <Integer>();
		int[] arr = {10,20,30,40,45,45,50,60,70,70,70,80,90};
		Set <Integer>ans = Duplicate(arr);
		for(Integer i : ans)
			System.out.println(i);
		
	}
	
	static Set <Integer> Duplicate(int[] input)
	{
	    Set map = new HashSet();
	    Set <Integer> outputlist = new HashSet();
	    for(Integer i : input)
	    {
	        if(!map.add(i))
	        	outputlist.add(i);

	    }
	    return outputlist;
	}

}
