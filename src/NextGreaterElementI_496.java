import java.util.*;

public class NextGreaterElementI_496 {
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        int[] ans = obj.nextGreaterElement(nums1, nums2);

        System.out.println(Arrays.toString(ans));
    }
}

class Solution {

    // ---------------------------------------------
    // Approach: Monotonic Stack + HashMap
    // Time: O(n + k)
    // Space: O(n)

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        Stack<Integer> s = new Stack<>();

        for(int i = nums2.length - 1; i >= 0; i--) {
            while(s.size() > 0 && s.peek() < nums2[i]) {
                s.pop();
            }

            if(s.isEmpty()) {
                mp.put(nums2[i], -1);
            } else {
                mp.put(nums2[i], s.peek());
            }

            s.add(nums2[i]);
        }

        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) {
            ans[i] = mp.get(nums1[i]);
        }

        return ans;
    }
}