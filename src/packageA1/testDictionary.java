/*
 * Student information
 * --------------------
 * Student Name: Philips, Tyler
 * Student Number: 400017512
 * Course code: CS 2XB3
 * Lab Section: 2
 * 
 * I attest that the following code being submitted is my own
 *  individual work.
 *  
 */
package packageA1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class testDictionary {
    static PrintWriter output;
    static Scanner input;
    
    //declaring the variables that will take input from input.txt and hold the "key and value" values
    static int key1,key2,key3,key4,key5,key6,key7,key8,key9,key10
    ,key11,key12,key13,key14,key15,key16,key17,key18,key19,key20,
    key21,key22;
    
    static String value1,value2,value3,value4,value5,value6,value7,
    value8,value9,value10,value11,value12,value13,value14,value15,
    value16,value17,value18,value19,value20,value21,value22;
   
	public static void main(String[]args) throws IOException, InterruptedException{
		output= new PrintWriter("output.txt");
		input= new Scanner(new File("input.txt"));
		
		//taking input, splitting string at ',' and assigning values to int variable key and
		//String variable value
		
		//5,"five"
		String pair =input.next();
		String[] splitt=pair.split(",");
		key1=Integer.parseInt(splitt[0]);
		value1=splitt[1];
		
		//3,"five"
		pair =input.next();
		splitt=pair.split(",");
		key2=Integer.parseInt(splitt[0]);
		value2=splitt[1];
		
		//4,"four"
		pair =input.next();
		splitt=pair.split(",");
		key3=Integer.parseInt(splitt[0]);
		value3=splitt[1];

		//3,"five"
		pair =input.next();
		splitt=pair.split(",");
		key4=Integer.parseInt(splitt[0]);
		value4=splitt[1];
		
		//6,"six"
		pair =input.next();
		splitt=pair.split(",");
		key5=Integer.parseInt(splitt[0]);
		value5=splitt[1];
		
		//7,"seven"
		pair =input.next();
		splitt=pair.split(",");
		key6=Integer.parseInt(splitt[0]);
		value6=splitt[1];
		
		//8,"seven"
		pair =input.next();
		splitt=pair.split(",");
		key7=Integer.parseInt(splitt[0]);
		value7=splitt[1];
		
		//9,"hello"
		pair =input.next();
		splitt=pair.split(",");
		key8=Integer.parseInt(splitt[0]);
		value8=splitt[1];
		
		//10,"hi"
		pair =input.next();
		splitt=pair.split(",");
		key9=Integer.parseInt(splitt[0]);
		value9=splitt[1];
		
		//11,"world"
		pair =input.next();
		splitt=pair.split(",");
		key10=Integer.parseInt(splitt[0]);
		value10=splitt[1];
		
		//12,"jello"
		pair =input.next();
		splitt=pair.split(",");
		key11=Integer.parseInt(splitt[0]);
		value11=splitt[1];
		
		//13,"java"
		pair =input.next();
		splitt=pair.split(",");
		key12=Integer.parseInt(splitt[0]);
		value12=splitt[1];
		
		//14,"wampa"
		pair =input.next();
		splitt=pair.split(",");
		key13=Integer.parseInt(splitt[0]);
		value13=splitt[1];
		
		//15,"genos"
		pair =input.next();
		splitt=pair.split(",");
		key14=Integer.parseInt(splitt[0]);
		value14=splitt[1];
		
		//16,"zeus"
		pair =input.next();
		splitt=pair.split(",");
		key15=Integer.parseInt(splitt[0]);
		value15=splitt[1];
		
		//17,"stark"
		pair =input.next();
		splitt=pair.split(",");
		key16=Integer.parseInt(splitt[0]);
		value16=splitt[1];
		
		//18,"hello"
		pair =input.next();
		splitt=pair.split(",");
		key17=Integer.parseInt(splitt[0]);
		value17=splitt[1];
		
		//19,"grimes"
		pair =input.next();
		splitt=pair.split(",");
		key18=Integer.parseInt(splitt[0]);
		value18=splitt[1];
		
		//20,"grimes"
		pair =input.next();
		splitt=pair.split(",");
		key19=Integer.parseInt(splitt[0]);
		value19=splitt[1];
		
		//1,"one"
		pair =input.next();
		splitt=pair.split(",");
		key20=Integer.parseInt(splitt[0]);
		value20=splitt[1];
		
		//2,"two"
		pair =input.next();
		splitt=pair.split(",");
		key21=Integer.parseInt(splitt[0]);
		value21=splitt[1];
		
		//100,"one"
		pair =input.next();
		splitt=pair.split(",");
		key22=Integer.parseInt(splitt[0]);
		value22=splitt[1];
		
		//calling test functions
		testCount();
		testIsEmpty();
		testPrintKeys();
		testContains();
		testRemove();
		testGetKey();
		testGetValue();
		testInsert();
		
		
		//close files
		input.close();
		output.close();
	}
	
	//this function tests the Insert() function in Dictionary.java
	//There are 5 test cases that will run various inputs and check if the output
	//is correct.	
	public static void testInsert() throws FileNotFoundException {
		//opening statement to output.txt
		output.println("\nEntering testInsert...");

		//Test1 -insert 5,"five" into an empty arraylist and test to see if ArrayList contain them ////////////////
		Dictionary test = new Dictionary();
		test.Insert(key1, value1);
		String expected="["+Integer.toString(key1)+"]";
		String given=test.printKeys();
		
		//check to see if the output matches what is desired
		if(expected.equals(given)){
			output.println("Test Case 1 passed.");
		}else{
			output.println("Test Case 1 failed.");
		}
		
		//Test2- has 3 values inputed and checks to if ArrayList now contains them//////////////////////////	
		test.Insert(key2, value2);
		test.Insert(key3, value3);

		expected="["+Integer.toString(key1)+", "+Integer.toString(key2)+", "+Integer.toString(key3)+"]";
		given=test.printKeys();
		
		//check to see if the output matches what is desired
		if(expected.equals(given)){
			output.println("Test Case 2 passed.");
		}else{
			output.println("Test Case 2 failed.");
		}

		//Test3- has 4 values inputed and 2 of these values are 5. This tests to make sure there are no////// 
		//duplicates allowed/////////////////////////////////////////////////////////////////////////////////
		test.Insert(key4, value4);

		expected="["+Integer.toString(key1)+", "+Integer.toString(key2)+", "+Integer.toString(key3)+"]";
		given=test.printKeys();
		
		//check to see if the output matches what is desired
		if(expected.equals(given)){
			output.println("Test Case 3 passed.");
		}else{
			output.println("Test Case 3 failed.");
		}
		
		//Test4- has 20 values inputed, the 21st inserted pair should not be accpted////////////////////////// 
		//dublicates/////////////////////////////////////////////////////////////////////////////////////////
		test.Insert(key4, value4);
		test.Insert(key5, value5);
		test.Insert(key6, value6);
		test.Insert(key7, value7);
		test.Insert(key8, value8);
		test.Insert(key9, value9);
		test.Insert(key10, value10);
		test.Insert(key11, value11);
		test.Insert(key12, value12);
		test.Insert(key13, value13);
		test.Insert(key14, value14);
		test.Insert(key15, value15);
		test.Insert(key16, value16);
		test.Insert(key17, value17);
		test.Insert(key18, value18);
		test.Insert(key19, value19);
		test.Insert(key20, value20);
		test.Insert(key21, value21);//length is 20 now
		test.Insert(key22, value22);//this should not enter

		//creating the desired output
		expected="["+Integer.toString(key1)+", "+Integer.toString(key2)+", "+Integer.toString(key3)
				+", "+Integer.toString(key5)+", "+Integer.toString(key6)+
				", "+Integer.toString(key7)+", "+Integer.toString(key8)+", "+Integer.toString(key9)+
				", "+Integer.toString(key10)+", "+Integer.toString(key11)+", "+Integer.toString(key12)+
				", "+Integer.toString(key13)+", "+Integer.toString(key14)+", "+Integer.toString(key15)+
				", "+Integer.toString(key16)+", "+Integer.toString(key17)+", "+Integer.toString(key18)+
				", "+Integer.toString(key19)+", "+Integer.toString(key20)+", "+Integer.toString(key21)+"]";
		given=test.printKeys();
		
		//check to see if the output matches what is desired
		if(expected.equals(given)){
			output.println("Test Case 4 passed.");
		}else{
			output.println("Test Case 4 failed.");
		}
		
		//Test5- has 3 values inputed and then removes one and inserts it again/////////////////////////////////
		//test to see if you can insert an element that had been removed////////////////////////////////////////	
		Dictionary test5 = new Dictionary();
		test5.Insert(key1, value1);
		test5.Insert(key4, value4);
		test5.Insert(key5, value5);
		test5.Remove(key4);//remove 3
		test5.Insert(key4, value4);//insert 3
		
		expected="["+Integer.toString(key1)+", "+Integer.toString(key5)+", "+Integer.toString(key4)+"]";
		given=test5.printKeys();
		
		//check to see if the output matches what is desired
		if(expected.equals(given)){
			output.println("Test Case 5 passed.");
		}else{
			output.println("Test Case 5 failed.");
		}

		//closing statement to output.txt
		output.println("...\ntestInsert completed.");
	}
	
	//this function tests the GetValue() function in Dictionary.java
	//There are 5 test cases that will run various inputs and check if the output
	//is correct.	
	public static void testGetValue() throws FileNotFoundException {
	    
		output.println("\nEntering testGetValue...");

		//Test1 -check to see if an arraylist with the pair(5,"five") is able to return "five" ////////////////
		//when GetValue() is called///////////////////////////////////////////////////////////////////////////
		Dictionary test = new Dictionary();
		test.Insert(key1, value1);
		String expected=value1;
		String given=test.GetValue(5);
		
		//check to see if the output matches what is desired
		if(expected.equals(given)){
			output.println("Test Case 1 passed.");
		}else{
			output.println("Test Case 1 failed.");
		}
		
		//Test2- has 3 values inputed and checks to if the GetKey(4) will output "four"////////////////////////		
		test.Insert(key2, value2);
		test.Insert(key3, value3);

		expected=value3;
		given=test.GetValue(4);
		
		//check to see if the output matches what is desired
		if(expected.equals(given)){
			output.println("Test Case 2 passed.");
		}else{
			output.println("Test Case 2 failed.");
		}
		
		//Test3- has 6 values inputed and checks to if the GetKey(8) will output "seven"//////////////////////
		//insert 3 more pairs
		test.Insert(key5, value5);
		test.Insert(key6, value6);
		test.Insert(key7, value7);

		expected=value7;
		given=test.GetValue(8);
		
		//check to see if the output matches what is desired
		if(expected.equals(given)){
			output.println("Test Case 3 passed.");
		}else{
			output.println("Test Case 3 failed.");
		}
		
		//Test4- has 6 values inputed and checks to if the GetKey(9) will output null because it /////////////
		//is not in the list/////////////////////////////////////////////////////////////////////////////////
		
		//check to see if the output matches what is desired
		if(null==test.GetValue(9)){
			output.println("Test Case 4 passed.");
		}else{
			output.println("Test Case 4 failed.");
		}

		//Test5- has 6 values inputed and checks to if the GetKey(8) will output "seven" and the /////////////
		//Getkey(6) will output "six: ///////////////////////////////////////////////////////////////////////

		expected=value7;
		String expected2=value5;
		given=test.GetValue(8);
		String given2=test.GetValue(6);
		
		//check to see if the output matches what is desired
		if(expected.equals(given)&&expected2.equals(given2)){
			output.println("Test Case 5 passed.");
		}else{
			output.println("Test Case 5 failed.");
		}
		
		//closing statement to output.txt
		output.println("...\ntestGetValue completed.");
	}
	
	//this function tests the GetKey() function in Dictionary.java
	//There are 5 test cases that will run various inputs and check if the output
	//is correct.	
	public static void testGetKey() throws FileNotFoundException {
		
		output.println("\nEntering testGetKey...");
		
		//Test1 - test list of 2 elements to see if recognizes that the value////////////////////////////////
		//"five" corresponds to the key 5///////////////////////////////////////////////////////////////////
		Dictionary test = new Dictionary();
		test.Insert(key1, value1);
		test.Insert(key3, value3);
		String expected="["+Integer.toString(key1)+"]";
		String given=test.GetKey("five");
		
		//check to see if the output matches what is desired
		if(expected.equals(given)){
			output.println("Test Case 1 passed.");
		}else{
			output.println("Test Case 1 failed.");
		}
		
		//Test2- has 3 values inputed and checks to see if the GetKey("five") will recognize that ///////////
		//the keys that share this value are [5, 3] ////////////////////////////////////////////////////////
		test.Insert(key2, value2);
		expected="[5, 3]";
		given=test.GetKey("five");
		
		//check to see if the output matches what is desired
		if(expected.equals(given)){
			output.println("Test Case 2 passed.");
		}else{
			output.println("Test Case 2 failed.");
		}

		//Test3- has 6 values inputed and checks to see if the GetKey("six") will recognize that ///////////
		//it corresponds to the key (6)////////////////////////////////////////////////////////////////////
		test.Insert(key5, value5);
		test.Insert(key6, value6);
		test.Insert(key7, value7);
		expected="[6]";
		given=test.GetKey("six");
		
		//check to see if the output matches what is desired
		if(expected.equals(given)){
			output.println("Test Case 3 passed.");
		}else{
			output.println("Test Case 3 failed.");
		}
		
		//Test4 - test empty list to see if it can handle being asked to return //////////////////////////
		//a key even though it has none//////////////////////////////////////////////////////////////////
		Dictionary test2 = new Dictionary();
		given=test2.GetKey("hello");
		expected="[]";
		//check to see if the output matches what is desired
		if(expected.equals(given)){
			output.println("Test Case 4 passed.");
		}else{
			output.println("Test Case 4 failed.");
		}	

		//Test5- has 5 values inputed and checks to see if the GetKey("ginko") will recognize that ///////
		//it corresponds to the key (19, 20, 2) and that GetKey("genos") corresponds with////////////////
		//[13, 16]//////////////////////////////////////////////////////////////////////////////////////
		Dictionary test5 = new Dictionary();
		test5.Insert(key12, value12);//ginko
		test5.Insert(key15, value15);// ginko
		test5.Insert(key18, value18);//ginko
		test5.Insert(key19, value19);//genos
		test5.Insert(key21, value21);//genos
		
		expected="[19, 20, 2]";
		given=test5.GetKey("ginko");
		String expected2="[13, 16]";
		String given2=test5.GetKey("genos");
		
		//check to see if the output matches what is desired
		if(expected.equals(given)&&expected2.equals(given2)){
			output.println("Test Case 5 passed.");
		}else{
			output.println("Test Case 5 failed.");
		}
		
		//closing statement to output.txt
		output.println("...\ntestGetKey completed.");
	}
	
	//this function tests the Remove() function in Dictionary.java
	//There are 5 test cases that will run various inputs and check if the output
	//is correct.	
	//this function tests the Remove() function in Dictionary.java
	//There are 5 test cases that will run various inputs and check if the output
	//is correct.
	public static void testRemove() throws FileNotFoundException {
		output.println("\nEntering testRemove...");
		
		//Test1 - remove element that is not in list (remove 1 from empty)///////////////////////
		Dictionary test = new Dictionary();
		String expected = "[]";
		test.Remove(1);
		String given =test.printKeys();
		
		//check to see if the output matches what is desired
		if(expected.equals(given)){
			output.println("Test Case 1 passed.");		
		}else{
			output.println("Test Case 1 failed.");
		}
		
		//Test2 - list contains 5 and 1, test checks if 5 can be removed/////////////////////////
		Dictionary test2 = new Dictionary();
		test2.Insert(key1, value1);
		test2.Insert(key20, value20);
		expected = "[1]";
		test2.Remove(5);
		//string variable that holds contents of the arraylist so that it can be compared
		given =test2.printKeys();
		
		//check to see if the output matches what is desired
		if(expected.equals(given)){
			output.println("Test Case 2 passed.");		
		}else{
			output.println("Test Case 2 failed.");
		}
		
		//Test3 - remove 2 elements( 5 and 3 )list only containting 5 and 3/////////////
		///(remove 1 from empty)///////////////////////////////////////////////////////
		Dictionary test3 = new Dictionary();
		test3.Insert(key1, value1);
		test3.Insert(key2, value2);
		expected = "[]";
		
		test3.Remove(5);
		test3.Remove(3);
		
		given =test3.printKeys();
		//check to see if the output matches what is desired
		if(expected.equals(given)){
			output.println("Test Case 3 passed.");		
		}else{
			output.println("Test Case 3 failed.");
		}
		
		//Test4 - Testing to see if I can add an element then remove ///////////////////////
		//then add it back and remove it again/////////////////////////////////////////////
		test3.Insert(key1, value1);
		test3.Insert(key2, value2);
		expected = "[3]";
		
		test3.Remove(5);
		test3.Insert(key1, value1);
		test3.Remove(5);
		
		given =test3.printKeys();
		//check to see if the output matches what is desired
		if(expected.equals(given)){
			output.println("Test Case 4 passed.");		
		}else{
			output.println("Test Case 4 failed.");
		}
		
		//Test5 - Testing to see if I can add an element then remove ////////////////////
		//an element and then use the remove function to remove it again////////////////
		//even though the element is already gone//////////////////////////////////////
		Dictionary test5 = new Dictionary();
		test5.Insert(key1, value1);
		test5.Insert(key2, value2);
		expected = "[3]";
		
		test5.Remove(5);
		test5.Remove(5);
		
		given =test5.printKeys();
		//check to see if the output matches what is desired
		if(expected.equals(given)){
			output.println("Test Case 5 passed.");		
		}else{
			output.println("Test Case 5 failed.");
		}
	    
		//closing statement to output.txt
		output.println("...\ntestRemove completed.");
	}
	
	//this function tests the Contains() function in Dictionary.java
	//There are 5 test cases that will run various inputs and check if the output
	//is correct.	
	//this function tests the Contains() function in Dictionary.java
	//There are 5 test cases that will run various inputs and check if the output
	//is correct.
	public static void testContains() throws FileNotFoundException {
	   	output.println("\nEntering testContains...");
	   	
		//Test1 - testing empty list , giving it a  command to//////////////////////////////////
	   	//to see if it contain 5///////////////////////////////////////////////////////////////
		Dictionary test = new Dictionary();
		Boolean expected=false;
		
		if(expected==test.Contains(5)){
			output.println("Test Case 1 passed.");		
		}else{
			output.println("Test Case 1 failed.");
		}
		
		//Test2 - testing a list that does contain 5 to see it////////////////////////////////
		// can recognize that it has 5///////////////////////////////////////////////////////
		Dictionary test2 = new Dictionary();
	    expected = true;
		test2.Insert(key1, value1);
		
		if(expected==test2.Contains(5)){
			output.println("Test Case 2 passed.");		
		}else{
			output.println("Test Case 2 failed.");
		}
		
		//Test3 - testing list with 2 elements(9 and 10) to see if recognizes //////////////
		//that it contains them both///////////////////////////////////////////////////////
		Dictionary test3 = new Dictionary();
		expected=true;
		test3.Insert(key8, value8);
		test3.Insert(key9, value9);
		
		//checking to see if Contains returns true when asked if it has 9 and 10
		if(expected==test3.Contains(9) && expected==test3.Contains(10)){
			output.println("Test Case 3 passed.");		
		}else{
			output.println("Test Case 3 failed.");
		}
		
		//Test4 - testing list with 4 elements(9, 10, 11, 12) to see if recognizes //////////////
		//that it contains all fo them ///////////////////////////////////////////////////////
		expected=true;
		test3.Insert(key10, value10);
		test3.Insert(key11, value11);
		
		if(expected==test3.Contains(9) && expected==test3.Contains(10) && expected==test3.Contains(11)
				&& expected==test3.Contains(12)){
			output.println("Test Case 4 passed.");		
		}else{
			output.println("Test Case 4 failed.");
		}

		//Test5 - testing list with 8 elements(9, 10, 11, 12, 13 , 14, 15, 16) to see if recognizes //////////////
		//that it contains 13 //////////////////////////////////////////////////////////////////////////////
		expected=true;
		test3.Insert(key12, value12);
		test3.Insert(key13, value13);
		test3.Insert(key14, value14);
		test3.Insert(key15, value15);
		
		if(expected==test3.Contains(13)){
			output.println("Test Case 5 passed.");		
		}else{
			output.println("Test Case 5 failed.");
		}

		//closing statement to output.txt
		output.println("...\ntestContains completed.");
	}
	
	//this function tests the Count() function in Dictionary.java
	//There are 5 test cases that will run various inputs and check if the output
	//is correct.	
	//this function tests the Count() function in Dictionary.java
	//There are 5 test cases that will run various inputs and check if the output
	//is correct.
	public static void testCount() throws FileNotFoundException {
	 

		output.println("Entering testCount...");
		
		//Test1 - Enter arrayList with no elements and see Count() returns 0////////////////////////
		Dictionary test = new Dictionary();
		int expected=0;
		
		//check to see if the output matches what is desired
		if(expected==test.Count()){
			output.println("Test Case 1 passed.");
		}else{
			output.println("Test Case 1 failed.");
		}
		
		//Test2- Enter arrayList with one element and see Count() returns 1//////////////////////////
		Dictionary test2 = new Dictionary();
		test2.Insert(key1, value1);
		expected=1;
		
		//check to see if the output matches what is desired
		if(expected==test2.Count()){
			output.println("Test Case 2 passed.");
		}else{
			output.println("Test Case 2 failed.");
		}
		
		//Test3- Enter arrayList with 10 elements and see Count() returns 10///////////////////////////
		Dictionary test3 = new Dictionary();
		
		test3.Insert(key1, value1);
		test3.Insert(key2, value2);
		test3.Insert(key3, value3);
		test3.Insert(key5, value5);
		test3.Insert(key6, value6);
		test3.Insert(key7, value7);
		test3.Insert(key8, value8);
		test3.Insert(key9, value9);
		test3.Insert(key10, value10);
		test3.Insert(key11, value11);
		
		expected=10;
		
		//check to see if the output matches what is desired
		if(expected==test3.Count()){
			output.println("Test Case 3 passed.");
		}else{
			output.println("Test Case 3 failed.");
		}
		
		//Test4- Enter arrayList with 20 elements and see Count() returns 20////////////////////////////
		//I am going to reuse the test3 object since it already has 10 elements on it/////////////////////		
		test3.Insert(key12, value12);
		test3.Insert(key13, value13);
		test3.Insert(key14, value14);
		test3.Insert(key15, value15);
		test3.Insert(key16, value16);
		test3.Insert(key17, value17);
		test3.Insert(key18, value18);
		test3.Insert(key19, value19);
		test3.Insert(key20, value20);
		test3.Insert(key21, value21);
		
		expected=20;
		
		//check to see if the output matches what is desired
		if(expected==test3.Count()){
			output.println("Test Case 4 passed.");
		}else{
			output.println("Test Case 4 failed.");
		}
		
		//Test5- Enter arrayList with 17 elements (after using remove()) and see Count() returns 17////////////////////////////
		//I am going to reuse the test3 object since it already has 10 elements on it/////////////////////	
		
		//removing 3 elements form test3 so that the count should be 17
		test3.Remove(9);
		test3.Remove(10);
		test3.Remove(11);
		
		expected=17;
		
		//check to see if the output matches what is desired
		if(expected==test3.Count()){
			output.println("Test Case 5 passed.");
		}else{
			output.println("Test Case 5 failed.");
		}
		
		//closing statement to output.txt
		output.println("...\ntestCount completed.");
	}
	
	//this function tests the IsEmpty() function in Dictionary.java
	//There are 5 test cases that will run various inputs and check if the output
	//is correct.	
	//this function tests the IsEmpty() function in Dictionary.java
	//There are 5 test cases that will run various inputs and check if the output
	//is correct.
	public static void testIsEmpty() throws FileNotFoundException {
		output.println("\nEntering testIsEmpty...");
		
		//Test1 - test empty list to see if it recognizes count is 0//////////////////////////////
		Dictionary test = new Dictionary();		
		boolean expected=true;
		
		//check to see if the output matches what is desired
		if(expected==test.IsEmpty()){
			output.println("Test Case 1 passed.");
		}else{
			output.println("Test Case 1 failed.");
		}
		
		//Test2- has 1 values inputed and checks to see if count is 1 and is not empty/////////////
		Dictionary test2 = new Dictionary();
		test2.Insert(key1, value1);
		expected=false;	
		
		//check to see if the output matches what is desired
		if(expected==test2.IsEmpty()){
			output.println("Test Case 2 passed.");
		}else{
			output.println("Test Case 2 failed.");
		}
		
		//Test3- has 5 values inputed and checks to see IsEmpty() knows its not empty/////////////
		//reusing test2 object since it already contains some elements////////////////////////////
		test2.Insert(key4, value4);
		test2.Insert(key5, value5);
		test2.Insert(key6, value6);
		test2.Insert(key7, value7);
		expected=false;	
		
		//check to see if the output matches what is desired
		if(expected==test2.IsEmpty()){
			output.println("Test Case 3 passed.");
		}else{
			output.println("Test Case 3 failed.");
		}
		
		//Test4- has 1 value inputed which will be removed than inputed in again, to see //////////
		//IsEmpty() can tell that the list is not empty////////////////////////////////////////////
		expected=false;	
		Dictionary test4 = new Dictionary();		
		test4.Insert(key7, value7);
		test4.Remove(8);
		test4.Insert(key7, value7);
		
		//check to see if the output matches what is desired
		if(expected==test4.IsEmpty()){
			output.println("Test Case 4 passed.");
		}else{
			output.println("Test Case 4 failed.");
		}

		//Test5-removing an arrayLists only element and then checking to see if ////////////////////
		//IsEmpty() can see that it is empty////////////////////////////////////////////////////////
		expected=true;	
		test4.Remove(8);
		
		//check to see if the output matches what is desired
		if(expected==test4.IsEmpty()){
			output.println("Test Case 5 passed.");
		}else{
			output.println("Test Case 5 failed.");
		}
		
		//closing statement to output.txt
		output.println("...\ntestIsEmpty completed.");

	}
	
	//this function tests the printKeys() function in Dictionary.java
	//There are 5 test cases that will run various inputs and check if the output
	//is correct.	
	//this function tests the printKeys() function in Dictionary.java
	//There are 5 test cases that will run various inputs and check if the output
	//is correct.
	public static void testPrintKeys() throws FileNotFoundException {
		//Note on output printed to console when code is run.
		//printKeys() is used to see if the arraylists are equal but it also prints
		//said arrays to console so  I left this message to explain what 
		//the cause of the output was
		System.out.println("This output is due to the printKeys() function being called.");
		
		//printing to output.txt
		output.println("\nEntering testPrintKeys...");

		//Test1 - test empty list to see if it recognizes 
		Dictionary test = new Dictionary();
		String value=test.printKeys();
		String expected="[]";
		
		//check to see if the output matches what is desired
		if(value.equals(expected)){
			output.println("Test Case 1 passed.");
		}else{
			output.println("Test Case 1 failed.");
		}
		
		//Test2- has 1 value inputed and checks to see the arrayList is properly printed
		Dictionary test2 = new Dictionary();
		test2.Insert(key1, value1);

	    value=test2.printKeys();
		expected="[5]";
		
		//check to see if the output matches what is desired
		if(value.equals(expected)){
			output.println("Test Case 2 passed.");
		}else{
			output.println("Test Case 2 failed.");
		}
		
		//Test3- Test to print an arrayList with 5 elements//////////////////
		Dictionary test3 = new Dictionary();
		test3.Insert(key1, value1);
		test3.Insert(key2, value2);
		test3.Insert(key3, value3);
		test3.Insert(key5, value5);
		test3.Insert(key6, value6);
		
	    value=test3.printKeys();
		expected="[5, 3, 4, 6, 7]";
		
		//check to see if the output matches what is desired
		if(value.equals(expected)){
			output.println("Test Case 3 passed.");
		}else{
			output.println("Test Case 3 failed.");
		}

		//Test4- Test to print an arrayList with 10 elements////////////////
		test3.Insert(key7, value7);
		test3.Insert(key8, value8);
		test3.Insert(key9, value9);
		test3.Insert(key10, value10);
		test3.Insert(key11, value11);
		
	    value=test3.printKeys();
		expected="[5, 3, 4, 6, 7, 8, 9, 10, 11, 12]";
		
		//check to see if the output matches what is desired
		if(value.equals(expected)){
			output.println("Test Case 4 passed.");
		}else{
			output.println("Test Case 4 failed.");
		}

		//Test5- Test to print an arrayList with 15 elements////////////////
		test3.Insert(key12, value12);
		test3.Insert(key13, value13);
		test3.Insert(key14, value14);
		test3.Insert(key15, value15);
		test3.Insert(key16, value16);
		
	    value=test3.printKeys();
		expected="[5, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]";
		
		//check to see if the output matches what is desired
		if(value.equals(expected)){
			output.println("Test Case 5 passed.");
		}else{
			output.println("Test Case 5 failed.");
		}

	//closing statement
	output.println("...\ntestPrintKeys completed.");

	}
}