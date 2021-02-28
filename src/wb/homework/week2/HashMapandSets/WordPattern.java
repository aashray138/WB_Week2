package wb.homework.week2.HashMapandSets;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "abba";
		String words = "cat dog dog cat";
		String words1 = "dog dog dog dog";
		
		System.out.println("This should be true " + wordPattern(str1, words));
		System.out.println("This should be false " + wordPattern(str1, words1));
	}
	
	public static boolean wordPattern(String str, String s) {
		String[] words = str.split(" ");
	    if (words.length != str.length())
	        return false;
	    
	    HashMap index = new HashMap();
	    for (Integer i=0; i<words.length; ++i)
	        if (index.put(str.charAt(i), i) != index.put(words[i], i))
	            return false;
	    return true;
    }
}
