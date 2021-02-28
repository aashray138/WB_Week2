package wb.homework.week2.Multiset;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord {

	/*
	 * Given a paragraph and a list of banned words, return the most frequent word that is not in the list 
	 * of banned words.  It is guaranteed there is at least one word that isn't banned, and that the answer 
	 * is unique.
	 * 
	 * Words in the list of banned words are given in lowercase, and free of punctuation.
	 * Words in the paragraph are not case sensitive.  The answer is in lowercase.
	 */
	
	
	public static void main(String[] args) {
		
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String [] banned = {"hit"};
		
		 System.out.println(mostCommonWord(paragraph, banned));

	}
	
	public static String mostCommonWord(String paragraph, String[] banned) {
		
		HashSet <String> bannedWords = new HashSet<String>();
		
		for (String word : banned) {
			bannedWords.add(word);
		}
		
		
		HashMap <String, Integer> map = new HashMap<String, Integer>();
	
		String newParagraph = paragraph.replaceAll("[.,]","");
		String [] array = newParagraph.split(" ");
		
		String mostCommon = array[0];
		int highestCount = 1;
		
		for(String word : array) {
			word = word.toLowerCase();
			
			if (bannedWords.contains(word)) {
				continue;
			}

			if (!map.containsKey(word)) {
				map.put(word, 1);
			}else {
				int count = map.get(word);
				map.put(word, count+1);
			}
			
			int num = map.get(word);
			if (num > highestCount) {
				highestCount = num;
				mostCommon = word;
			}
		}
		
		
		System.out.println(map);
		
		return mostCommon.toLowerCase();
        
    }

}
