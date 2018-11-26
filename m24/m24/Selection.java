import java.util.*;
public class Selection {  
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
    public static void casea() {
    	int[] arr1 = new int[100];
        for (int i = 0; i <=50; i++) {
        	arr1[i] = 1;
        }
        for (int j = 50; j < 100; j++) {
        	arr1[j] = 0;
        }
        selectionSort(arr1);  
        for(int i:arr1){  
            System.out.print(i+" ");  
        } 
    }
    public static void caseb() {
    	int[] arr1 = new int[100];
    	arr1[0] = 6;
    	arr1[1] = 6;
    	arr1[2] = 6;
    	for (int i = 3 ; i <=6; i++) {
    		arr1[i] = 5;
    	}
    	for (int i = 6; i<=12; i++) {
    		arr1[i] = 4;
    	}
    	for (int i =12; i<=24; i++) {
    		arr1[i] = 3;
    	}
    	for (int i = 24; i <=48; i++) {
    		arr1[i] = 2;
    	}
    	for (int i = 48; i < arr1.length; i++) {
    		arr1[i] = 1;
    	}
    	selectionSort(arr1);  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }
    }
    public static void casec() {
    	int[] arr1 = new int[100];
    	for (int i = 0; i < arr1.length; i++) {
        arr1[i] = i;
    }
    for (int i = 50 ; i < arr1.length;i++) {
    	arr1[i] = 0;
    }
    public static void cased() {
        int[] arr1 = new int[200];
        for (int i = 0; i <=100; i++) {
            arr1[i] = 1;
        }
        for (int j = 100; j < 200; j++) {
            arr1[j] = 0;
        }
        selectionSort(arr1);  
        for(int i:arr1){  
            System.out.print(i+" ");  
        } 
    }
    Collections.shuffle(Arrays.asList(arr1));
    selectionSort(arr1);
    System.out.println();  
        for(int i:arr1){  
            System.out.print(i+" ");  
        } 
    }
    public static void main(String a[]){
    	long startTime = System.currentTimeMillis();
         casea();
         caseb();
         casec();
         cased();
         long endTime = System.currentTimeMillis();
      	 System.out.println("\nIt took " + (endTime - startTime) + " milliseconds");

    }  
}  