package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> word = new ArrayList<String>();
		//2. Add five Strings to your list
		word.add("Ah");
		word.add("Kumbaya");
		word.add("we are");
		word.add("all");
		word.add("Children of Jesus");
		
		//3. Print all the Strings using a standard for-loop
		for(int i = 0;i < word.size(); i++){
			String words = word.get(i);
		}
		//4. Print all the Strings using a for-each loop
		for(String words : word){
			System.out.println(word);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i <word.size(); i++){
			if(i%2==0){
				System.out.println(word.get(i));
			}
			}

		//6. Print all the Strings in reverse order.
		for(int i = word.size() - 1; i>= 0; i--){
			System.out.println(word.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i <word.size(); i++){
			if(word.contains('e')){
				System.out.println(word.get(i));
			}
		}
	}
}
//for(int i = arr.length - 1; i >= 0; i--){
//	  System.out.println(arr[i]);
//	}
