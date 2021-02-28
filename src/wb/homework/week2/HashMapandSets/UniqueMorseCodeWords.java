package wb.homework.week2.HashMapandSets;

import java.util.HashSet;

public class UniqueMorseCodeWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String [] words = {"gin", "zen", "gig", "msg"};
		 
		int count =  uniqueMorseRepresentations(words);
		System.out.println("# -> " + count);
	}
	
	public static int uniqueMorseRepresentations(String[] words) {
		
		String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		HashSet <String> set = new HashSet<>();
		
		String curr = "";
		
		for(String word : words) {
			curr = "";
			for (Character chars : word.toCharArray()) {
				curr = curr +  (morse[ chars - 'a' ]);
			}
		 set.add(curr);
		}        
	
		return set.size();
			
	}
}
