import java.util.*;

public class ImplementStackusingQueues225 {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(1);
        System.out.println(obj.pop());
        System.out.println(obj.top());
        System.out.println(obj.empty());
    }
}

    class MyStack {

        // ---------------------------------------------
        // Approach 1: Two Queues (Pop Costly)
        // Time: push -> O(1), pop -> O(n), top -> O(n)
        // Space: O(n)

        // public MyStack() {
            
        // }

        // Queue<Integer> q1 = new LinkedList<>();
        // Queue<Integer> q2 = new LinkedList<>();
        
        // public void push(int x) {
        //     if(!q1.isEmpty()) {
        //         q1.add(x);
        //         return;
        //     } else {
        //         q2.add(x);
        //     }
        // }
        
        // public int pop() {
        //     if(q1.isEmpty()) {
        //         int n = q2.size() - 1;
        //         while(n-- > 0) {
        //             q1.add(q2.remove());
        //         }

        //         return q2.remove();
        //     }
        //     if(q2.isEmpty()) {
        //         int n = q1.size() - 1;
        //         while(n-- > 0) {
        //             q2.add(q1.remove());
        //         }

        //         return q1.remove();
        //     }

        //     return -1;
            
        // }
        
        // public int top() {
        //     if(q1.isEmpty()) {
        //         int n = q2.size() - 1;
        //         while(n-- > 0) {
        //             q1.add(q2.remove());
        //         }
                
        //         int v = q2.remove();
        //         q1.add(v);

        //         return v;
        //     }
        //     if(q2.isEmpty()) {
        //         int n = q1.size() - 1;
        //         while(n-- > 0) {
        //             q2.add(q1.remove());
        //         }
        //         int v = q1.remove();
        //         q2.add(v);

        //         return v;
        //     }

        //     return -1;
        // }
        
        // public boolean empty() {
        //     if(q1.isEmpty() && q2.isEmpty()) {
        //         return true;
        //     }

        //     return false;
        // }

        
    }