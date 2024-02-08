package p03_plusOne;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {

	public static void main(String[] args) {
		int [] arr = {9,9,9,9,9,9,9,9,9,9};
		
		int [] brr = plusOne(arr);
		
		for(int i : arr) {
			System.out.print(i);
		}
		System.out.println();
		for(int i : brr) {
			System.out.print(i);
		}

	}
	public static int[] plusOne(int[] digits) {
        int placeSum = 0;
        int carry = 1;        
        int size = digits.length;
        
        List<Integer> myList = new ArrayList<>();        
        for(int i = digits.length -1; i>=0; i--) {
        	placeSum = digits[i] + carry;
        	myList.add(0,placeSum%10);        	
        	carry = placeSum/10;     	 
        }        
        
        if(carry>0) {
        	myList.add(0,carry);
        	size++;
        }        int [] arr = new int[size];

        for(int i = 0; i<size;i++){
            arr[i] = myList.get(i);
        }                
        
        return arr;
    }
}
