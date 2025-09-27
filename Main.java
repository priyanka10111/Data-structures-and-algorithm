// prefix sum by creating the new array :


import java.util.*;
public class Main{
    static void printArray(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] makePrefixsum(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i = 1 ; i < n ; i++){
             prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        //printArray(arr);
        int[] pref = makePrefixsum(arr);
        printArray(pref);
    }
}
