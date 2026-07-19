class MyHashMap {

    class Node{
        int key;
        int value;
        Node next;

        Node(int key , int value){
            this.key = key;
            this.value = value;
        }

    }

    Node[] buckets;
    int SIZE = 1000; 
    public MyHashMap() {
        buckets = new Node[SIZE];
    }
    
    public void put(int key, int value) {
        int index = key %  SIZE;
        if(buckets[index] == null){
            buckets[index] = new Node(key,value);
            return;
        }
        Node current = buckets[index];

        while(true){
            
            if(current.key == key){
                current.value = value;
                return;
            }
            if(current.next == null){
                break;   
            }
            current = current.next;
        }
        current.next = new Node(key,value);  
    }
    
    public int get(int key) {
        int index = key %  SIZE;
        Node current = buckets[index];
        while(current != null){
            if(current.key == key){
                return current.value;
            }
            current = current.next;
        }
    return -1;
    }
    
    public void remove(int key) {
        int index = key %  SIZE;
        Node current = buckets[index];
        Node prev = null;

        while(current != null){
            if(current.key == key){
                if(prev == null){
                    buckets[index] = current.next;
                }else{
                    prev.next = current.next;
                }
            return;
            }
            prev = current;
            current = current.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */