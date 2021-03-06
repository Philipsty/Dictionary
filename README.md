# Dictionary
This code creates an abstract data type for dictionary.  The ADT has 2 arrays. The first array is used to store keys and is an array of integers. The second array is used to contain the value and should be an array of strings. The elements of the same index in the two arrays make a (key,value) pair. Maximim size of array is 20.
# API
Insert(int key, String value) no return:    Insert a new(key, value) pair.

GetValue(int key) returns string:           Returns the value of the given key

GetKey(String value) returns string :       Returns all keys of the given value.

Remove(int key) no return:                  Remove the (key, value) pair of the given key

Compare(int key1,int key2) returns boolean: Returns true if values of two keys are the same

Contains(int key) returns boolean:          Checks the existence of the given key

Count() return int:                         Returns the total number of (key, value) pairs currently in the dictionary.

IsEmpty() returns boolean:                  Returns whether the Dictionary is empty or not.

printKeys() returns string:                 Prints out all keys in the following format: {key1, key2,...,keyN}

testCount() no return:					    this function tests the Count() function in Dictionary.java
											There are 5 test cases that will run various inputs and check if 
											the output is correct.
											
estIsEmpty() no return:               	    this function tests the IsEmpty() function in Dictionary.java
											There are 5 test cases that will run various inputs and check if 
											the output is correct.
											
testPrintKeys() no return:            	    this function tests the printKeys() function in Dictionary.java
											There are 5 test cases that will run various inputs and check if 
											the output is correct.
											
testContains() no return:    		        this function tests the Contains() function in Dictionary.java
											There are 5 test cases that will run various inputs and check if 
											the output is correct.
											
testRemove() no return: 		            this function tests the Remove() function in Dictionary.java
											There are 5 test cases that will run various inputs and check if 
											the output is correct.
											
testGetKey() no return:		                this function tests the GetKey() function in Dictionary.java
											There are 5 test cases that will run various inputs and check if 
											the output is correct.
											
testGetValue() no return:                   this function tests the GetValue() function in Dictionary.java
											There are 5 test cases that will run various inputs and check if 
											the output is correct.
											
testInsert() no return:					    this function tests the Insert() function in Dictionary.java
											There are 5 test cases that will run various inputs and check if 
											the output is correct.	
# Testing
Test methods are used to ensure the ADT is working properly. They read (key,value) pairs from a text file called input.txt. The results of the tests will be outputed in a file called output.txt
