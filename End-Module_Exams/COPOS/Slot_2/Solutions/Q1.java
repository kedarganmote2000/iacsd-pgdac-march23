// Accept 10 integers from user and count the occurrences of each element in the array.

import java.util.Scanner;

public class COPOSSolutionQ3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter the 10 elements of your array: ");
      
      // Asking user for inputs using for loop
      for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            arr[i] = in.nextInt();
        }
      
      // Checking the occurance of each element in the array
                for (int i = 0; i < arr.length; i++) {
                    int count = 0;
                    i!=arr.length-1;
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[i] == arr[k])
                            count++;
                    }
                  
                  // Printing out the occurance of each element in the array
                    System.out.println(arr[i] + " occurs " + count + " times in the Array");
                    i+=(count-1);
                           //It is used to shift the i to the last Position
		                  //of the Occurance element or be on the same position
	                      //for single Element 
			              //for eg (4 4 4 5 2) here i=0,but after i value will become 2
			              // i.e it will go to last position of the same element
			              //  and when i will 3 it will be on the same position i.e i=3
                }
    }
}
