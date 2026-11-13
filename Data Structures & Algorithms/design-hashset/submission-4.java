class MyHashSet {
    final int SIZE = 1000;
    List<List<Integer>> bucket = null;
    public MyHashSet() {
        bucket = new ArrayList<>(SIZE);
        for(int i = 0; i<SIZE;i++){
            bucket.add(null);
        }
    }
    
    public void add(int key) {
        //calculate the index using hash
        int index = Math.floorMod(key,SIZE);
        // based on index found calculate the bucket
        List<Integer> innerList = bucket.get(index);
        // then check in inner list if key exist 
        if(innerList != null){
            if(!innerList.contains(key)){
                innerList.add(key);
            }
        }else{
            innerList = new ArrayList<>();
            innerList.add(key);
            bucket.set(index,innerList);
        }
        
        // if not then add key to that inner list
        // update the external list with at  index
    }
    
    public void remove(int key) {
        //calculate the index usinng hash
        int index = Math.floorMod(key,SIZE);
        // get the list which is at that index
        List<Integer> innerList = bucket.get(index);
        // check if key exist in that inner list
        if(innerList != null && innerList.contains(key)){
                innerList.remove(Integer.valueOf(key));
            }
        }
        // if exist remove that 
        // if not exist then do nothing
    
    
    public boolean contains(int key) {
        //calculate the index usinng hash
        int index = Math.floorMod(key,SIZE);
        // get the list which is at that index
         List<Integer> innerList = bucket.get(index);
        // check if key exist in that inner list
        if(innerList != null && innerList.contains(key)){
                return true;
        }
        return false;
        // if key exist return true
        // else return false
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */