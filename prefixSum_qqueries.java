// given an arr of int size n , print the sum of in the given the range of q queries from indices l to r (both included)

import java.util.*;
public class prefixSum_qqueries{
    static void printArray(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] makePrefixsum(int[] arr){
        int n = arr.length;
        
        for(int i = 1 ; i < n ; i++){
             arr[i] +=  arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 1 ; i <= n ; i++){
            arr[i] = sc.nextInt();
        }
        //printArray(arr);
        int[] prefix_sum = makePrefixsum(arr);
        System.out.println("Enter the number of quesries : ");
        int q = sc.nextInt();
        while(q-- > 0){
            System.out.println("Enter the range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefix_sum[r] + prefix_sum[l - 1];
            System.out.println(ans);
            
        }
    }
}
