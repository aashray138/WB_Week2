package wb.homework.week2.HashMapandSets;

import java.util.HashSet;
import java.util.Iterator;

public class UncommonWordsFromTwoSentences {

	public static void main (String [] args) {
		
		String [] words = uncommonFromSentences("This is a sentence." , "This quick brown fox is jumps over the barn.");
		
		for(String word : words) 
			System.out.println(word);
	}
	
	  public static String[] uncommonFromSentences(String A, String B) {
		  
		 HashSet <String> set = new HashSet<String>();
		 
		 for (int i = 0 ; i < A.length() ; i++)
		 {
			 int substring = i;
			 for (int j = i ; j < A.length() ; j++) {
					 if (A.charAt(j) ==  ' ' || A.charAt(j) ==  '.') {
						 substring = j;	
						 break;
					 }
			 }
			 set.add(A.substring(i, substring));
			 i = substring;
		 }
		 
		 for (int i = 0 ; i < B.length() ; i++)
		 {
			 int substring = i;
			 for (int j = i ; j < B.length() ; j++) {
					 if (B.charAt(j) ==  ' ' || B.charAt(j) ==  '.') {
						 substring = j;	
						 break;
					 }
			 }
			 if (set.contains(B.substring(i, substring))) set.remove(B.substring(i, substring));
			 i = substring;
		 }
		 
		 String [] array = new String [set.size()];
		 
		 Iterator<String> i = set.iterator(); 
		 int count = 0;
	        while (i.hasNext()) {
	           array[count] = i.next();
	        	count++;
	        }
	        
	     return array;
	        
	    } 
	        
	  }

