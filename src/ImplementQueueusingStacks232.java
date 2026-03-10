import java.util.*;

public class ImplementQueueusingStacks232 {
    public static void main(String[] args) {

        MyQueue obj = new MyQueue();

        obj.push(1);
        obj.push(2);
        obj.push(3);

        System.out.println(obj.peek()); // 1
        System.out.println(obj.pop());  // 1
        System.out.println(obj.peek()); // 2
        System.out.println(obj.empty()); // false
    }
}

class MyQueue {

    // ---------------------------------------------
    // Approach 1: Brute Force
    // Time: O(n)
    // Space: O(n)

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        int top = -1;
        while(!s1.isEmpty()) {
            top = s1.pop();
            if(s1.isEmpty()) {
                break;
            }
            s2.push(top);
        }

        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return top;
    }
    
    public int peek() {
        int top = -1;
        while(!s1.isEmpty()) {
            top = s1.pop();
            s2.push(top);
        }

        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return top;
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}
