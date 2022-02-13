package Labs;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//Create a method which accepts a hash map and return the values of the map in
//sorted order as a List.

public class Lab12 {

	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
	{
		
		List<Map.Entry<String, Integer> > list =
			new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
			public int compare(Map.Entry<String, Integer> o1,
							Map.Entry<String, Integer> o2)
			{
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		
		
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}


	public static void main(String[] args)
	{

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		
		hm.put("Data Structure", 85);
		hm.put("Database", 91);
		hm.put("Java", 95);
		hm.put("Operating System", 79);
		hm.put("Angular", 80);
		Map<String, Integer> hm1 = sortByValue(hm);

		
		for (Map.Entry<String, Integer> en : hm1.entrySet()) {
			System.out.println("Key = " + en.getKey() +
						", Value = " + en.getValue());
		}
	}
}


