import java.util.*;

// ---------------------------------------------
// LRU Cache using HashMap + Doubly Linked List
// Time Complexity: O(1) for get() and put()
// Space Complexity: O(capacity)

public class LRUCache146 {

    static class Node {
        int key, value;
        Node prev, next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            prev = next = null;
        }

    }

    int limit = 0;
    HashMap<Integer, Node> map = new HashMap<>();
    public Node head = new Node(-1, -1);
    public Node tail = new Node(-1, -1);

    public void add(Node newNode) {
        Node oldnext = head.next;
        head.next = newNode;
        oldnext.prev = newNode;
        newNode.next = oldnext;
        newNode.prev = head;
    }

        public void del(Node oldNode) {
        Node oldnext = oldNode.next;
        Node oldprev = oldNode.prev;

        oldprev.next = oldnext;
        oldnext.prev = oldprev;
        }

    public LRUCache(int capacity) {
        limit = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) {
            return -1;
        }

        int ans = map.get(key).value;

        Node old = map.get(key);
        
        del(old);
        add(old);

        return ans;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
            Node old = map.get(key);
            del(old);
            map.remove(key);
        }

        if(map.size() == limit) {
            Node old = tail.prev;
            map.remove(old.key);
            del(old);
        } 

        Node newNode = new Node(key, value);
        add(newNode);
        map.put(key, newNode);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */