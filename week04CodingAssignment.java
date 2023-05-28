/**	 ---------------------------------  **/
/**	 PromineoTech Coding Bootcamp 		**/
/**	 Week04 Coding Assignment			**/
/**	 Mark Gryparis						**/
/**	 Cohort:  2023-04-26-be-pacific		**/
/**	 ---------------------------------  **/
/**	 Coding Steps — Arrays and Methods  **/
/**	 ---------------------------------  **/

package week04;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set; 
import java.util.HashSet; 
import java.util.HashMap; 
public class week04CodingAssignment {
	public static void main (String[] args)	{

//  1.  Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//  	a.  Programmatically subtract the value of the first element in the array from the value in the last 
//			element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
//  	b.  Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of
//			different lengths).
//  	c.  Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		System.out.println("[1]  ages[] Arrays  ____________________________________________________________________");
		int[] ages1 = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.print("ages1[]:  {"+ages1[0]);
		for (int i=1; i<ages1.length; i++)	{
			System.out.print(", "+ages1[i]);
		}
		System.out.println("}");
		System.out.println(">>  ages1[]:  Last Age - First Age = "+(ages1[ages1.length-1]-ages1[0]));
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 108};
		System.out.print("ages2[]:  {"+ages2[0]);
		for (int i=1; i<ages2.length; i++)	{
			System.out.print(", "+ages2[i]);
		}
		System.out.println("}");
		System.out.println(">>  ages2[]:  Last Age - First Age = "+(ages2[ages2.length-1]-ages2[0]));
		double avg = 0.0;
		for (int i=0; i<ages2.length; i++)	{
			avg += ages2[i];
		}
		System.out.println(">>  ages2[]:  Average Age = "+avg/ages2.length);

//  2.  Create an array of String called names that contains the following values: 
//		“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//  	a.  Use a loop to iterate through the array and calculate the average number of letters per name. 
//			Print the result to the console.
//  	b.  Use a loop to iterate through the array again and concatenate all the names together, separated by 
//			spaces, and print the result to the console.
		System.out.println("\n[2]  names[] Array  __________________________________________________________________");
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		System.out.print("names[]:  {"+names[0]);
		for (int i=1; i<names.length; i++)	{
			System.out.print(", "+names[i]);
		}
		System.out.println("}");
		double avgNameLength = 0.0;
		for (int i=0; i<names.length; i++)	{
			avgNameLength += names[i].length();
		}
		System.out.println(">>  names[]:  Average number of letters/name = "+avgNameLength/names.length);
		StringBuilder sb = new StringBuilder();
		for (String str : names) {
			sb.append(str+" ");
		}
		System.out.println(">>  names[]:  Concatenated into a single String = "+sb);
		
//  3.  How do you access the last element of any array?
		System.out.println("\n[3]  Last Element of names[]:  "+names[names.length-1]);

//  4.  How do you access the first element of any array?
		System.out.println("\n[4]  First Element of names[]:  "+names[0]);

//  5.  Create a new array of int called nameLengths. Write a loop to iterate over the previously created 
//		names array and add the length of each name to the nameLengths array.
		List<Integer> nameLengths = new ArrayList<Integer>();
		for (int i=0; i<names.length; i++)	{
			nameLengths.add(names[i].length());
		}
		System.out.println("\n[5]  Create List nameLengths from names[]:  "+nameLengths);

//  6.  Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
//  	Print the result to the console.
		int sum = 0;
		for (int i : nameLengths)	{
			sum += i;
		}
		System.out.println("\n[6]  Sum of Lengths from List nameLengths:  "+sum);
		
//  7.  Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to 
//  	itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		System.out.println("\n[7]  Method that concatenate a word n times  _________________________________________");
		String word = "Penny";
		int n = 3;
		System.out.println(">>  word:  "+word);
		System.out.println(">>  n:     "+n);
		System.out.println(">>  Result "+repeater(word,n));

		
//  8.  Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name 
//  	should be the first and the last name as a String separated by a space).
		System.out.println("\n[8]  Method that concatenates a firstName and lastName into a fullName  ______________");
		String firstName = "Penny";
		String lastName = "Hofstadter";
		System.out.println(">>  First Name:  "+firstName);
		System.out.println(">>  Last Name:   "+lastName);
		System.out.println(">>  Full Name:   "+getFullName(firstName, lastName));
		

//  9.  Write a method that takes an array of int and returns true if the sum of all the ints in the array is 
//  	greater than 100.
		List<Integer> aList = new ArrayList<Integer>();
		aList.add(6);aList.add(8);aList.add(3);aList.add(4);aList.add(1);aList.add(4);aList.add(4);
		aList.add(1);aList.add(6);aList.add(8);aList.add(2);aList.add(1);aList.add(6);aList.add(9);
		aList.add(2);aList.add(4);aList.add(3);aList.add(6);aList.add(7);aList.add(7);aList.add(5);
		aList.add(7);aList.add(8);aList.add(8);aList.add(8);
		System.out.println("\n[9]  Method that takes a List of Integer and returns True if Sum > 100   _____________");
		System.out.println(">>  List of Integers:  "+aList);
		System.out.println(">>  Sum >100?          "+determineIfSumIsGT100(aList));
		
//  10. Write a method that takes an array of double and returns the average of all the elements in the array.
		List<Double> doubles = new ArrayList<Double>();
		doubles.add(147.35968245);doubles.add(159.42283681);doubles.add(43.43580026);doubles.add(73.33964608);
		doubles.add(169.72174460);doubles.add(129.09709882);doubles.add(188.81091853);doubles.add(80.07215838);
		doubles.add(125.71844611);doubles.add(197.46163177);doubles.add(169.16649820);doubles.add(67.20343229);
		doubles.add(142.56355280);doubles.add(6.79011848);doubles.add(41.03895357);doubles.add(54.95707319);
		doubles.add(6.94881530);doubles.add(164.91683711);doubles.add(51.17418166);doubles.add(182.78792107);
		doubles.add(119.66628659);doubles.add(111.39760611);doubles.add(196.49788384);doubles.add(2.26948431);
		doubles.add(139.81630776);doubles.add(44.26468707);doubles.add(172.64890697);doubles.add(22.14299023);
		doubles.add(170.60602774);doubles.add(117.24207981);
		System.out.println("\n[10]  Method that takes a List of double and returns the average   _____________");
		System.out.println(">>  List of double:  "+doubles);
		System.out.println(">>  Average:         "+avgDoubles(doubles));
		
//  11. Write a method that takes two arrays of double and returns true if the average of the elements in the 
//  	first array is greater than the average of the elements in the second array.
		List<Double> doubles2 = new ArrayList<Double>();
		doubles2.add(133.73393878);doubles2.add(73.24569194);doubles2.add(10.63084003);doubles2.add(178.63993225);
		doubles2.add(175.03505133);doubles2.add(104.35104053);doubles2.add(65.41538467);doubles2.add(108.69070774);
		doubles2.add(159.42379622);doubles2.add(29.51813627);doubles2.add(106.43448787);doubles2.add(76.51792543);
		doubles2.add(102.67656498);doubles2.add(80.58894733);doubles2.add(16.45762445);doubles2.add(114.54226096);
		doubles2.add(56.87211039);doubles2.add(34.62354924);doubles2.add(88.75373493);doubles2.add(100.77129225);
		doubles2.add(14.36709900);doubles2.add(9.56533075);doubles2.add(50.74403208);doubles2.add(57.75654615);
		doubles2.add(7.08824324);doubles2.add(99.09827070);doubles2.add(0.34296994);doubles2.add(10.17580539);
		doubles2.add(70.16351362);doubles2.add(78.59151880);
		System.out.println("\n[11]  Method that takes 2 double Lists and determines if avg of 1st > avg of 2nd  ____");
		System.out.println(">>  First double List:   "+doubles);
		System.out.println(">>  Second double List:  "+doubles2);
		System.out.println(">>  Is Avg of 1st > Avg of 2nd?  "+isFirstAvgGreater(doubles,doubles2));
		
		
//  12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and 
//  	returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		boolean isHotOutside = true;
		double moneyInPocket = 5.00;
		System.out.println("\n[12]  Method that will buy a drink if it's hot outside and has more than $10.50  _____");
		System.out.println(">>  Is it hot outside?         "+isHotOutside);
		System.out.println(">>  How much money do I have?  "+moneyInPocket);
		System.out.println(">>  Will I buy a drink?        "+willBuyDrink(isHotOutside, moneyInPocket));

//  13. Create a method of your own that solves a problem. In comments, write what the method does and why you 
//  	created it.
		System.out.println("\n[13] Hit Any Key Demo  _________________________________________________________________");
		Scanner kbd = new Scanner(System.in);
		System.out.println(">>  Hit any key...");
		hitAnyKey(kbd);
		System.out.println(">>  Hit another...");
		hitAnyKey(kbd);
		System.out.println(">>  One more time...");
		hitAnyKey(kbd);
		kbd.close();
		System.out.println("That concludes the demo. Thanks for Attending!");
		
//		--  Don't touch the curly bracket below (Closes main Method) -----------------------------------------
	}
	
//  Methods
//  #7
	public static StringBuilder repeater(String str, int iterations)	{
		StringBuilder sb = new StringBuilder();
		for (int i=1; i<=iterations; i++)	{
			sb.append(str);
		}
		return sb;
	}
	
//  #8
	public static StringBuilder getFullName(String firstName, String lastName)	{
		StringBuilder sb = new StringBuilder();
		return sb.append(firstName).append(" ").append(lastName);
	}

//	#9
	public static boolean determineIfSumIsGT100(List<Integer> aList)	{
		int summer=0;
		for (Integer i : aList)	{
			summer += i;
		}
		// System.out.println("Summer:  "+summer);
		return summer>100;
	}
	
//  #10
	public static double avgDoubles(List<Double> dubList)	{
		double summer = 0.0;
		for (double d : dubList)	{
			summer += d;
		}
		return summer/dubList.size();
	}

//	#11
	public static boolean isFirstAvgGreater(List<Double> dubList1, List<Double>dubList2)	{
		double avgDubList1 = avgDoubles(dubList1);
		double avgDubList2 = avgDoubles(dubList2);
		System.out.println("Avg of 1st:  "+avgDubList1);
		System.out.println("Avg of 2nd:  "+avgDubList2);
		return avgDubList1>avgDubList2;
	}

//	#12	
	public static boolean willBuyDrink(boolean isHot, double money)	{
		return isHot && (money>10.50);
	}

//	#13
	public static void 	hitAnyKey(Scanner kbd)	{
		char letter = kbd.next().toCharArray()[0];
		//  while (letter != '!')	{
		//  	letter = kbd.next().toCharArray()[0];
		//	System.out.println("User entered >> " + letter);
		//  System.out.println("End Program");
		return;
	}
	
//	--  Don't touch the curly bracket below  (Closes week04CodingAssignment Class)  -------------------------
}
