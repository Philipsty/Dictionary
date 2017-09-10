package packageA1;
import java.util.ArrayList;
import java.util.List;

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
public class Dictionary {
	List<Integer> keys = new ArrayList<Integer>();
	List<String> values = new ArrayList<String>();
	public int counter=0;
	
	public static void main(String[]args){
		Dictionary thing = new Dictionary();
		thing.Insert(5, "five");
		thing.Insert(3, "d");
//		thing.Insert(3, "p");
//		thing.Insert(4, "d");
		System.out.println(thing.keys);
		System.out.println(thing.printKeys());
		System.out.println("getter: "+thing.GetKey("d"));
		thing.Remove(1);
		System.out.println(thing.keys +"\n"+thing.values);
		System.out.println("getvalue:\n"+thing.GetValue(4));
		System.out.println("Compare: "+thing.Compare(1, 3));
		System.out.println();	
	}
	
	
	//Constructor without parameters
	Dictionary(){
		List<String> values= new ArrayList<String>();
		List<Integer> keys = new ArrayList<Integer>();
		this.values=values;
		this.keys=keys;	
	}

    void Insert(int key, String value){
    	//if the arrayLists are not already full
		if (keys.size()<20){
			//if the input key is not already in arraylist keys
			if(!(keys.contains(key))){
				this.values.add(value);
				this.keys.add( key);
				counter++;
			}
		}
	}
	
    //Returns the value of the given key
	String GetValue(int key) {
		//check if key exists
		if(keys.contains(key)){
			//find position of key
			int position=keys.indexOf(key);
			//return element at position
			return values.get(position);	
		}
		return null;
	}
	
	//Returns all keys of the given value.		
	String GetKey(String value) {
		
		// make a string that will hold all the keys that 
		//are linked with the given value
		String keyss = "[";		
		
		for (int i = 0; i < this.values.size(); i++) {
			// if values[i] is one of the desired values, take the key in that position
			// and put it to the string
			if (values.get(i).equals(value)) {
				keyss += Integer.toString(keys.get(i)) + ", ";
			}
		}

		//remove the last ", " , and then close it with a "}"
		if(keyss.length()>3){
			keyss=keyss.substring(0, keyss.length()-2);
		}
		
		keyss += "]";

		return keyss;
	}
	 
	//Remove the (key, value) pair of the given key		
	//checks if the key is in the keys ArrayList and then finds its position
	//it uses this position to remove the element at that position in the 
	//values and keys ArrayLists
	void Remove(int key){

		if (keys.contains(key)){
			int position=keys.indexOf(key);
			keys.remove(keys.get(position));
			values.remove(values.get(position));
		}
	}	
	
	//Returns true if values of two keys are the same		
	Boolean Compare(int key1,int key2){
		//Check to make sure both keys exist
		if(keys.contains(key1)&&keys.contains(key2)){
			//find position of key1 and key2
			//get the value at the positions and return if they are equal
			int position=keys.indexOf(key1);
			System.out.println(position);
			String value1=values.get(position);
			position=keys.indexOf(key2);
			String value2=values.get(position);
			
			return value1.equals(value2);
		}
		return null;
	}
	
	//Checks the existence of the given key	and returns a boolean
	Boolean Contains(int key) {		
		return keys.contains(key);
	}
	
	//Returns the total number of (key, value) pairs currently in the dictionary.		
	int Count (){
		return keys.size();
	}
	
	//Returns whether the Dictionary is empty or not.		
	Boolean IsEmpty(){
		return this.keys.isEmpty();
	}
	
	//Prints out all keys in the following format: [key1, key2,...,keyN]
	//it creates a string word that goes through a for loop of size(length of arrayList keys)
	//and converts the key at the position to a string and adds it to word
	//word is returned
	String printKeys(){
		String word = "[";
		if(keys.size()!=0){
			word += keys.get(0);
			
			for(int i=1;i<this.keys.size();i++){
				word+=", "+ keys.get(i);
			}
		}
		word+="]";
		System.out.println(word);
		return word;
	}
}
