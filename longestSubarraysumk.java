//Longest Subarray with Sum K - positives 
//better solution

import java.util.*;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        HashMap<Long, Integer> map = new HashMap<>();
        long prefixsum = 0;
        int maxlen = 0;

        for (int i = 0; i < n; i++) {
            prefixsum += arr[i];

            if (prefixsum == k) {
                maxlen = Math.max(maxlen, i + 1);
            }

            long rem = prefixsum - k;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxlen = Math.max(maxlen, len);
            }

            if (!map.containsKey(prefixsum)) {
                map.put(prefixsum, i);
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        Solution sol = new Solution();
        int ans = sol.longestSubarray(arr, k);
        System.out.println("Length of longest subarray with sum " + k + " = " + ans);
    }
}
