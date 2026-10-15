class MyHashSet {

    final int ARRAY_SIZE = 1024;
    List<List<Integer>> bucket = null;
    public MyHashSet() {
        bucket = new ArrayList<>(ARRAY_SIZE);
        for(int i =0; i<ARRAY_SIZE;i++){
            bucket.add(null);
        }
    }
    
    public void add(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> internalList = bucket.get(index);
        if(internalList == null){
            List<Integer> newList = new ArrayList<>();
            newList.add(key);
            bucket.set(index,newList);
        }else if(!internalList.contains(key)){
            internalList.add(key);
        }
    }
    
    public void remove(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> internalList = bucket.get(index);
        if(internalList != null && internalList.contains(key)){
            internalList.remove(Integer.valueOf(key));
        }
        
    }
    
    public boolean contains(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> internalList = bucket.get(index);
        if(internalList != null && internalList.contains(key)){
            return true;
        }
    return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */