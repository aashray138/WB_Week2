package wb.homework.week2.Multiset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class firstUniqCharacter {

	public static void main(String[] args) {
		
		String str = "cccbbvlfeetleteveee";
		
		System.out.println(firstUniqChar(str));

	}
	
	public static int firstUniqChar(String s) {
        
		int index  = -1;
		
		HashMap<Character, Integer> maps =  new HashMap <Character, Integer>();
		
		for(Character ch : s.toCharArray()) {
			if(!maps.containsKey(ch)) {
				maps.put(ch, 1);
			} else {
				maps.put(ch, maps.get(ch) + 1);
			}
		}
		System.out.println(maps);
		
		
		for(int i = 0 ; i < s.length() ; i++) {
			int count = maps.get(s.charAt(i));
			if (count == 1) return i;
		}
		
		return index;
    }

}
