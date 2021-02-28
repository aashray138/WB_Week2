package wb.homework.week2.HashMapandSets;

import java.util.HashSet;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int num = 32;
			System.out.println( num + " is a happy number?? " + isHappy(num));
	}

	 public static boolean isHappy(int n) {
	     
		 int num = n ;
		 
		 HashSet <Integer> set = new HashSet<>();
		 
		 while (num != 1) {
			 
			 set.add(num);
	            
	         int val = 0; 
	         int total = 0;
	            while (num > 0){
	               val = num % 10;
	               num = num / 10;  
	               total += val * val;
	            }

			 if(set.contains(total)) return false;
			 
			 if (total == 1 ){
	                return true; 
	            }
	  
	          num = total;
	            
		 }
	
	 return true;
	 }
}
