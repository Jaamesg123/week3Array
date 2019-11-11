package week3project;

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int total = 100;
		
		double[] newArray = new double[5];
		
		newArray[0] = 26;
		newArray[1] = 13;
		newArray[2] = 52;
		newArray[3] = 29;
		newArray[4]	= 2;
		

		double[] newArray1 = new double[5];
		
		newArray[0] = 26;
		newArray[1] = 13;
		newArray[2] = 35;
		newArray[3] = 29;
		newArray[4]	= 2;
		
		
		System.out.println(sumArray(newArray) >= total); 
		System.out.println(fullName("Henry", "Ford"));
		System.out.println(copyMorning("Good Morning ", 4));
		System.out.println(calcAverage(newArray));
		System.out.println(arrayAverage(newArray, newArray1));
		System.out.println(willBuyDrink(true, 10.50));
		System.out.println(overallAverage(newArray, newArray1));
	}
	
		public static String copyMorning(String morning, int times) {
	
			String result = " ";
			for (int i = 0; i < times; i++) {
				result += morning;
				
			}
			return result;	
		}

		public static String fullName(String first, String last) {
			
			return first + " " + last;
		}

		public static double sumArray(double[] numbers) {
			
			double sum = 0;
				for (double number : numbers) {
					sum += number;
				}
				
				return sum;
		}

		public static double calcAverage(double[] numbers) {
			
			double sum = 0;
			for (double number : numbers) {
				sum += number;
			}
			return sum / numbers.length;
				
		}

		public static boolean arrayAverage(double[] numbers, double[] numbers1) {
			
			double sum = 0;
			double sum1 = 0;
				for (double number : numbers) {
					sum += number;
					}
				for (double number1 : numbers1) {
					sum1 += number1;
				}
		
				return (sum / numbers.length) >= (sum1 / numbers1.length);
				
		}
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			
		double money = 10.50;	
		boolean itsHot = true;
			
			if (money >= 10.50) {
				
			}
		
		return itsHot && isHotOutside;
	
		}
		
		public static double overallAverage(double [] numbers, double [] numbers1) {
			
			double sum = 0;
			double sum1 = 0;
				for (double number : numbers) {
					sum += number;
					}
				for (double number1 : numbers1) {
					sum1 += number1;
				}
		
				return (sum / numbers.length) + (sum1 / numbers1.length);
			
				//this method is useful for finding the average number between multiple sets of arrays, which creates a way to identify 
				//and compare data from two completely different sources. For example, the overall statistics for two different stores
				//sales numbers.
		}
}

