package wb.homework.week2.Multiset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
	
		String word =  "tree";

		System.out.println(frequencySort(word));
		
	}
	
	 public static String frequencySort(String s) {
	        
		 	if (s == null || s.isEmpty()) return s;
		    
		    HashMap<Character, Integer> map = new HashMap<>();
		    for (char c : s.toCharArray()) {
		        map.put(c, map.getOrDefault(c, 0) + 1);
		    }
		    
		    int maximumFrequency = Collections.max(map.values());
		
		    List<List<Character>> buckets = new ArrayList<>();
		    for (int i = 0; i <= maximumFrequency; i++) {
		        buckets.add(new ArrayList<Character>());
		    }
		    
		    for (Character key : map.keySet()) {
		        int freq = map.get(key);
		        buckets.get(freq).add(key);
		    }

		    StringBuilder sb = new StringBuilder();
		    for (int i = buckets.size() - 1; i >= 1; i--) {
		        for (Character c : buckets.get(i)) {
		            for (int j = 0; j < i; j++) {
		                sb.append(c);
		            }
		        }
		    }
		    return sb.toString();
		 
	}

}
