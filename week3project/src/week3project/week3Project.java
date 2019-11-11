package week3project;

public class week3Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] ages = new int[9];
//		
//			ages[0] = 3;
//			ages[1] = 9;
//			ages[2] = 23;
//			ages[3] = 64;
//			ages[4] = 2;
//			ages[5] = 8;
//			ages[6] = 28;
//			ages[7] = 93;
//			ages[8] = 82;
//			
//		    	System.out.println(ages[ages.length - 1] - ages[0]);{
//		    		
//		    	}
//			
//		    	int average = 0; 
//		    	
//		    for (int a = 0; a < ages.length; a++) {
//		    	average += ages[a]; 
//		    }
//		    	System.out.println(average / ages.length);	    	
//	}
//	{
	
		String[] names = new String[6];  
			
			names[0] = "Sam";
			names[1] = "Tommy";
			names[2] = "Tim";
			names[3] = "Sally";
			names[4] = "Buck";
			names[5] = "Bob";
			
				int sum = 0;
			
			for (int b = 0; b < names.length; b++) {
				sum = sum + names[b].length();
			}
			
			int sumLetters = sum / names.length;
			
			System.out.println(sumLetters);
			
			String newNames = " ";
			
			for (int b = 0; b < names.length; b++) {
				newNames = newNames + names[b] + " ";
			
			
			System.out.println(newNames);

			// You access the last element of an array by using (array[array.length - 1])
			
			// You access the first element of an array by using (array[0])
			}
			
			int[] nameLengths = new int [6];
			
			for (int c = 0; c < names.length; c++) {
				nameLengths[c] = names[c].length();
			
			}
			int sumOfAll = 0; 
			
			for (int c = 0; c < nameLengths.length; c++) {
				sumOfAll = sumOfAll + nameLengths[c];
				
				System.out.println(sumOfAll);
			}
			
			
		}		
}