
public class AssignmentsSolv {

	public static void main(String[] args) {
		//1 create an array of int called ages that contains the following values: 
		//3, 9, 23, 64, 2, 8, 28, 93.
				
int ages []={3,9,23,64,2,8,28,93,43};
			
		//1.a Programmatically subtract the value of the first element in the array
		//from the value in the last element of the array. do not use ages[7]
		//print the result to the console

int equal = ages[ages.length-1] -= ages [0];
		//**to access the value of last element we can use the length of the array -1
System.out.println(equal);
		
		//1.b Add a new age to your array and repeat the step above to ensure it is dynamic
	

		//1.c use a loop to iterate through the array and calculate the average age.
		//print the result to the console
		
int ageAverage = 0;

	for (int i=0; i<ages.length; i++) {
		 //**setup a new variable with 0 value and just setup a for loop to add all value
		ageAverage += ages[i];
	}	//**then divide to how many elements are in the array
		System.out.println(ageAverage /= ages.length); 
	

		//2 create an array of string called names that contains the following values
		//Sam, Tommy, Tim, Sally, Buck, Bob
		
	String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
		
		//2.a use a loop to iterate through the array and calculate the
		//average number of letters per name.
		//print the result to the console
		
		int aveName = 0;
		
		for (int i =0; i < names.length; i++) {
			//**used a for loop to add the length per name to the new variable
			aveName += names[i].length();
		}	//**then we divide it on how many elements are there in the array
			System.out.println(aveName / names.length);
	
		//2.b use a loop to iterate through the array again and 
		//concatenate all the names together, seperate by spaces
		//and print the result to the console.
		
			for (int i = 0; i < names.length; i++) {
				//**just a simple for loop to assign the i to the element and then print
				//**out that element
				System.out.print(names[i] + " ");
			}
			
			System.out.println();
		
		//3 how do you access the last element of array??
			//** A: array.length - 1, 
		//4 how do you access the first element of array
			//** A: array[0];
		
		//5 create a new array of int called nameLengths. write a loop to iterate over the 
		//previously created names array and add the length of each name to the nameLengths
			
			int [] nameLengths = new int [names.length];
			
			
			for (int i = 0; i < names.length; i++) {
			//**setup a for loop to access the elements of the new array nameLengths
			//**then add the length of each string on the that same element number on
				//**names array
				nameLengths[i] += names[i].length();
				System.out.print(nameLengths[i] + " ");
			}
			System.out.println();
		//6 write a loop to iterate over the nameLengths array and calculate the sum of all
		//the elements in the array. Print the result to the console.
			
			int nLength = 0;
			
			for (int i = 0; i < nameLengths.length; i++) {
				//**setup a for loop to access the value of each element in namelengths
				//**and add it to the new variable nLength then just print out the result
				nLength += nameLengths[i];
				}
				System.out.println(nLength);
			
			
			
			//METHODS
				
			
			
}

//7 write a method that takes a String, word, and an int n, as arguments 
//and returns the word concatenated to itself n number of times
//ie (if i pass in hello and 3, i expect the method to return HelloHelloHello

public static void word(String word, int n) {

//**a simple for loop to iterate the word by n times
for ( int i = 0; i < n; i++) {
	System.out.print(word);
}	


}

//8 write a method that takes two strings, first and lastname and returns full name
//the full name should be the first and the last name as a string seperated by space

public static void fullName(String first, String last) {
//**just a systemprint to print the two Strings that will be given
System.out.println(first + " " + last);

}

//9 write  a method that takes an array of int and returns true
//if the summ of all the ints in the array is greater than 100

public static boolean greater(int[] sum) {
	
	int sumR = 0;
	
	for (int i = 0; i < sum.length; i++) {
		//**simple for loop to add the sum of all elements into the new variable
		sumR += sum[i];
	}	
		//**then setup the boolean in return to confirm if sumR is greater than 100
	return sumR > 100;
} 

//10 write a method that takes an array of double and returns the average off all the
//elements in the array

public static double returnAve(double[] ave) {
	double returnA = 0.0;
	
	for (int i = 0; i < ave.length; i++) {
		//** setup a for loop to access all elements in the array then add it 
		//** in the variable
		returnA += ave[i];
		
	} 	//**then divide it by how many elements are there in the array to get average
		return returnA / ave.length;
}

//11 write a method that takes two arrays of double and returns true
//if the average of all the elements in the first array is greater than the average
//of all the elements in the second array
public static boolean arrayAve(double[] x, double[] y) {
	
	double f = 0;
	double s = 0;
			
	for (double first : x) {
		
		f += first / x.length;
	}	//**enhanced for loop to get all elements in both arrays and divide it by
		//**the number of elements in the arrays
		//**then add it to a variable (f & s)
	for (double second : y) {
		s += second / y.length;
	}	
		//**boolean to check if first array > than second array
	boolean z = f > s;
	
		//**then return
	return z;
}


//12 write a method called willBuyDrink that takes a boolean isHotOutside
//and a double moneyInPocket and returns true if it's hot outside
//and if moneyInPocket is greater than 10.50

public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
	
	//**since all conditions are already given we can just return with the
	//**boolean condition
	return moneyInPocket > 10.50 && isHotOutside == true;
}



//13 create a method of your own that solves a problem.
//in comments, write what the method does and why you created it.

//this method produces the Greatest common divisor of two numbers,
//it iterates to the highest number while first condition is true to find the 
//common divisor. it's a simple code that only needs modulus and loop conditions
//but are really helpful
public static int gcd(int n1, int n2) {
		int gcd = 1;
		int k = 2;
		
		while (k <=n1 && k <= n2) {
			if(n1 % k == 0 && n2 % k == 0 )
				gcd = k;
			k++;
		} return gcd;
		
	}

	}


