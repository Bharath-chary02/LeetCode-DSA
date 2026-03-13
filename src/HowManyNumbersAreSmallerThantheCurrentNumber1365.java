import java.util.*;

public class HowManyNumbersAreSmallerThantheCurrentNumber1365 {
    public static void main(String[] args) {

        int[] nums = {8, 1, 2, 2, 3};

        Solution obj = new Solution();
        int[] ans = obj.smallerNumbersThanCurrent(nums);

        System.out.println(Arrays.toString(ans));
    }
}

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        // ---------------------------------------------
        // Approach 1: Sorting + HashMap
        // Time: O(n log n)
        // Space: O(n)
    
        // HashMap<Integer, Integer> mp = new HashMap<>();
        // int n = nums.length;
        // int[] cp = new int[n];
        // for(int i = 0; i < n; i++) {
        //     cp[i] = nums[i];
        // }
        // Arrays.sort(nums);
        // for(int i = 0; i < n; i++) {
        //     if(!mp.containsKey(nums[i])) {
        //         mp.put(nums[i], i);
        //     }
        // }

        // int[] res = new int[n];
        // for(int i = 0; i < n; i++) {
        //     res[i] = mp.get(cp[i]);
        // }

        // return res;

        // ---------------------------------------------
        // Approach 2: Frequency + Prefix Sum (Optimal)
        // Time: O(n)
        // Space: O(1) because range is fixed (101)

        int n = nums.length;
        int[] freq = new int[101];
        for(int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }
        for(int i = 1; i < 101; i++) {
            freq[i] = freq[i - 1] + freq[i];
        }
        for(int i = 0; i < n; i++) {
            if(nums[i] == 0) {
                nums[i] = 0;
                continue;
            }
            nums[i] = freq[nums[i] - 1];
        }

        return nums;
    }
}