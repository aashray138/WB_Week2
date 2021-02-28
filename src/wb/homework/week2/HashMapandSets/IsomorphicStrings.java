package wb.homework.week2.HashMapandSets;

import java.util.HashMap;

public class IsomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "title";
		String str2 = "paper";
		String str3 = "foo";
		String str4 = "baa";

		System.out.println(str1 + " & " + str2 + " " + isIsomorphic(str1, str2));
		System.out.println(str3 + " & " + str4 + " " + isIsomorphic(str3, str4));

	}


	public static boolean isIsomorphic(String s, String t) {

		HashMap<Character, Character> map =  new HashMap <>();

		if (s.length() != t.length()) return false;

		for (int i = 0 ; i < s.length() ; i++) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);

			if(map.containsKey(ch1) || map.containsValue(ch2)) {
				if (map.get(ch1) == null || map.get(ch1) != ch2){
					return false;
				}
			} else {
				map.put(ch1,ch2);  
			}
		}
			return true;
		
	}
}



