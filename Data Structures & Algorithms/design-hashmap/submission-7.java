class MyHashMap {
    private static class Node {
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    final int BUCKET_SIZE = 1024;
    List<List<Node>> bucket = null;

    public MyHashMap() {
        bucket = new ArrayList<>();
        for (int i = 0; i < BUCKET_SIZE; i++) {
            bucket.add(null);
        }
    }

    public void put(int key, int value) {
        int index = key % BUCKET_SIZE;
        List<Node> internalList = bucket.get(index);
        if (internalList == null) {
            internalList = new ArrayList<>();
            bucket.set(index, internalList);
        }

        for (Node node : internalList) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }
        Node newNode = new Node(key, value);
        internalList.add(newNode);
    }

    public int get(int key) {
        int index = key % BUCKET_SIZE;
        List<Node> internalList = bucket.get(index);
        if (internalList != null) {
            for (Node node : internalList) {
                if (node.key == key) {
                    return node.value;
                }
            }
        }
        return -1;
    }

    public void remove(int key) {
        int index = key % BUCKET_SIZE;
        List<Node> internalList = bucket.get(index);
        if (internalList != null) {
            Iterator<Node> iterator   = internalList.iterator();

            while(iterator.hasNext()){
                Node node = iterator.next();

                if(node.key == key){
                    iterator.remove();
                    return;
                }
            }

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