//Time complexity: O(n)
// Maulik Chhabra

import java.util.Arrays;

public class validShuffle {
    
    public static void main(String[] args) {
        
		//Strings input
        String a="abc";
        String b="xyz";
        

        char arr1[]=a.toCharArray();
        char arr2[]=b.toCharArray();

        
		//String to be validated
        char[] shuffle2="abzxcy".toCharArray();

		//Sorting all arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(shuffle2);

		//If shuffle length not equal to (arr1 length + arr2 length) then error 
        if(arr1.length+arr2.length!=shuffle2.length){
            System.err.println("Not a valid shuffle: Length error");
        }
        else{
            int i=0,j=0,k=0; //pointers initializations

            while(k<shuffle2.length){ //k is pointer for shuffle
                if(i<arr1.length && arr1[i]==shuffle2[k]){
                    i++;
                }
                else if(j<arr2.length && arr2[j]==shuffle2[k]){
                    j++;
                }
                else{
                    System.err.println("Not a valid shuffle: Element error");
                }
                k++;
            }

            if(i>=arr1.length && j>=arr2.length){ //if i and j > length of array then valid 
                System.out.println("Valid");
            }
           
        }
   

    }       
}
