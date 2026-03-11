import java.util.*;

public class TimeNeededtoBuyTickets2073 {
    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] tickets1 = {2,3,2};
        int k1 = 2;

        int[] tickets2 = {5,1,1,1};
        int k2 = 0;

        System.out.println(sol.timeRequiredToBuy(tickets1, k1)); // 6
        System.out.println(sol.timeRequiredToBuy(tickets2, k2)); // 8
    }
}

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        // ---------------------------------------------
        // Approach 1: Queue Simulation (Brute Force)
        // Time: O(total tickets)
        // Space: O(n)

        // Queue<Integer> q = new LinkedList<>();
        // int count = 0;
        // for(int i = 0; i < tickets.length; i++) {
        //     q.add(i);
        // }

        // while(!q.isEmpty()) {
        //     int i = q.remove();

        //     if(tickets[i] > 0) {
        //         tickets[i]--;
        //         count++;
        //     }
        //     if(i == k && tickets[i] == 0) {
        //         break;
        //     }
        //     if(tickets[i] > 0) {
        //         q.add(i);   
        //     }
        // }

        // return count;

        
    }
}