package wb.homework.week2.HashMapandSets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] num1 = {1,2,2,3,4,5,6,7,8};
		int [] num2 = {1,2,2,3,4};
		
		System.out.println(Arrays.toString(intersection(num1, num2)));
		
	}
	
   public static int[] intersection(int[] nums1, int[] nums2) {
        
	   HashSet <Integer> set = new HashSet<>();
	   
	   ArrayList <Integer> list = new ArrayList<>();
	   
	   for (Integer num : nums1) set.add(num);
	  
	   for(Integer num : nums2) {
		   if(set.contains(num)) {
			   if(!list.contains(num))
				   list.add(num);
		   }
	   }
   
	   int [] res = new int [list.size()];
   	   for(int i = 0 ; i < list.size() ; i++) {
   			res[i] = list.get(i);
   	   }

	   return res;
}
}
