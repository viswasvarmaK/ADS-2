import java.util.*;
class Insertion
{ 
    /*Function to sort array using insertion sort*/
    void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=1; i<n; ++i) 
        { 
            int key = arr[i]; 
            int j = i-1; 
            while (j>=0 && arr[j] > key) 
            { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = key; 
        } 
    } 
  
    /* A utility function to print array of size n*/
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    }
    public static void casea() {
        int[] arr1 = new int[100];
        for (int i = 0; i <=50; i++) {
            arr1[i] = 1;
        }
        for (int j = 50; j < 100; j++) {
            arr1[j] = 0;
        }
        Insertion ob = new Insertion();         
        ob.sort(arr1); 
        printArray(arr1); 
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
        Insertion ob = new Insertion();         
        ob.sort(arr1); 
        printArray(arr1); 
    }
    public static void casec() {
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
        arr1[i] = i;
    }
    for (int i = 50 ; i < arr1.length;i++) {
        arr1[i] = 0;
    }
    Collections.shuffle(Arrays.asList(arr1));
   Insertion ob = new Insertion();         
        ob.sort(arr1); 
        printArray(arr1);  
    }
    public static void cased() {
        int[] arr1 = new int[200];
        for (int i = 0; i <=100; i++) {
            arr1[i] = 1;
        }
        for (int j = 100; j < 200; j++) {
            arr1[j] = 0;
        }
        Insertion ob = new Insertion();         
        ob.sort(arr1); 
        printArray(arr1); 
    }
    public static void main(String args[]) 
    {         
        long startTime = System.currentTimeMillis();
         casea();
         caseb();
         casec();
         cased();
         long endTime = System.currentTimeMillis();
         System.out.println("\nIt took " + (endTime - startTime) + " milliseconds");
    } 
} 