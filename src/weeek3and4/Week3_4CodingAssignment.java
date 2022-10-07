package weeek3and4;

public class Week3_4CodingAssignment {

	public static void main(String[] args) {
		
		
		/*	1.Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the 
		array (i.e. do not use ages[7] in your code). Print the result to the console.  
		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		c.Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		*/
		int [] ages =  {3, 9, 23, 64, 2, 8, 28, 93};
		
		int lastMinusFirst = (ages[ages.length - 1] - ages[0]);
		System.out.println(lastMinusFirst);
		
		
		int [] AddAge =  {3, 9, 23, 64, 2, 8, 28, 93, 99};
		int lastMinusFirstAdd = (AddAge[AddAge.length - 1] - AddAge[0]);
		System.out.println(lastMinusFirstAdd);
		
		double sum = 0;
		
		for( int x : ages) {
			sum += x;
		}
		System.out.println(sum / ages.length);
			
		
		
		
		/* 2.	Create an array of String called names that contains the following values: 
		“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		a.	Use a loop to iterate through the array and calculate the average number 
		of letters per name. Print the result to the console.
		b.	Use a loop to iterate through the array again and concatenate all the names
		 together, separated by spaces, and print the result to the console.
		*/
		
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		
		int average = 0;
		
		for (String  string : names) {
			average += string.length();	
		}
		System.out.println(average / names.length);
		
		
		
		String sumOfNames = "";
		
		for(String string : names ) {
			sumOfNames += string + " ";
		}
		System.out.println(sumOfNames);
				
		//3.How do you access the last element of any array?
		System.out.println(names[names.length-1]);
		
		
		//4.How do you access the first element of any array?
		System.out.println(names[0]);
		
		
		//5.Create a new array of int called nameLengths. Write a loop to iterate over the previously created
		//names array and add the length of each name to the nameLengths array.
		 int [] nameLengths = new int [names.length];
		 
		 for(int i = 0; i < names.length; i++) {
			 nameLengths[i] = names[i].length();
		 }
		
		 for (int x : nameLengths) {
		System.out.println(x);
		 }
		 
		
		//6.Write a loop to iterate over the nameLengths array and calculate the sum of all the elements
		//in the array. Print the result to the console.
		int sumOfAllElement = 0;
		
		for(int x : nameLengths) {
			sumOfAllElement += x;
		}
		System.out.println(sumOfAllElement);
		
		//7.Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to 
		//itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		
		int numTimes = 3;
		String userWord = "Hello";
		
		System.out.println(repeatWord(userWord,numTimes));
		
		
		
		//8.Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should 
		//be the first and the last name as a String separated by a space).
		String firstName = "Pedro";
		String lastName = "Smith";
		
		System.out.println(createFullName(firstName, lastName));
		
		
		//9.Write a method that takes an array of int and returns true if the sum of all the ints in the array is 
		//greater than 100.
		int num1=150;
		
		System.out.println(GreaterValue(num1));
		
		//10.Write a method that takes an array of double and returns the average of all the elements in the array.
		
		double[] averages = new double[3];
		averages[0] = 35;
		averages[1] = 15;
		averages[2] = 25;
		
		int avgLen = (int) AverageNumbers(averages);
		System.out.println(avgLen);
	
		//11.Write a method that takes two arrays of double and returns true if the average of the elements in 
		//the first array is greater than the average of the elements in the second array.
		double[] arr1 = new double[1];
		arr1[0] = 78;
		
		double[] arr2 = new double[1];
		arr2[0] = 35;
		
		boolean greater = (boolean) AverageGreater(arr1, arr2);
		System.out.println(greater);
		
	
		//12.Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and 
		//returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		boolean isHotOutside = true;
		double moneyInPocket = 3.50;
	
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
	}
		
		 
		
		 // Question seven method
		 public static String repeatWord(String userWord, int numTimes) {
					
					String newString = "";
					for (int i = 0; i < numTimes; i++) {
					    newString += userWord;
					}	
				
				return newString; 
				}
		
		 
		 //Question eight method
		 public static String createFullName (String firstName, String lastName) {
				String fullName = " ";
				
				return fullName = firstName + " " + lastName;
			}
		 
		 
		 //Question nine method
		 public static boolean GreaterValue (int num1) {
			 int[] arr = {num1};
			 

			 int sum = 0;
			 
			for (int number : arr) {
				 sum += number;
			 }
			 if (sum > 100) {
				 return true;
			 } else {
			 return false;
			 }
		 }
		
		 
		 //Question ten method
		 public static double AverageNumbers(double[] averages) {
				
				
				double avgLength = 0;
				
				for (double x : averages) {
					avgLength += x;	
				}
				return avgLength / averages.length;
			}
		 
		
		 //Question eleven method
		 public static boolean AverageGreater(double[] arr1, double [] arr2) {
				
				
				double avgLength1 = 0;
				double avgLength2 = 0;
				
				for (double x : arr1) {
					avgLength1 += x;	
				}
				for (double x : arr2) {
					avgLength1 += x;	
				}
				if (avgLength1 > avgLength2) {
					return true;
			} else {
				return false;
			}
		
		 }
		
		 
		 // Question twelve method
		 public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {	 
					 if(isHotOutside == true && moneyInPocket > 10.50) {
						 return true;
					} else {
						return false;
					}
				 }
				 
		 
	

}
