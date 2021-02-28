package wb.homework.week2.HashMapandSets;

import java.util.HashSet;

public class JewelsAndStones {

	public static void main(String[] args) {
		
		String stones = "aAABBbB";
		String jewels = "aA";
		
		System.out.println(numJewelsInStones(jewels, stones));
		
	}

	public static int numJewelsInStones(String J, String S) {
			 
		int count = 0;
		
		HashSet <Character> set = new HashSet<>();
		
		for(int i = 0 ; i < J.length(); i++) {
			set.add(J.charAt(i));
		}
		
		for(int i = 0 ; i < S.length() ; i++) {
			if(set.contains(S.charAt(i))) count++;
		}
		
		return count;
			 
	}

}
