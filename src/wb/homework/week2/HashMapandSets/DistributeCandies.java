package wb.homework.week2.HashMapandSets;

import java.util.HashSet;

public class DistributeCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int [] candyType = {1,1,5,2,3,4,5,6};
 		 System.out.println(distributeCandies(candyType));
			
	}

	public static int distributeCandies(int[] candyType) {
	        
		int count = 0;
		
		int numOfCandiesAllowed = candyType.length/2;
		
		HashSet <Integer> candyTypes = new HashSet<Integer>();
		
		for(int i = 0 ; i < candyType.length ; i++) {
			candyTypes.add(candyType[i]);
		}
		
		if(numOfCandiesAllowed >= candyTypes.size()) {
			return candyTypes.size();
		} 

		count = numOfCandiesAllowed;
		
		return count;
	 }
}
