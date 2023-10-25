class MyHashMap {

    private List<List<Integer>> map;

    public MyHashMap() {
        this.map = new ArrayList<>();
    }

    public void put(int key, int value) {
        if (!this.containsKey(key)) {
            List<Integer> input = new ArrayList<>();
            input.add(key);
            input.add(value);
            this.map.add(input);
        } else {
            int i = this.getIndex(key);
            this.map.get(i).remove(1);
            this.map.get(i).add(value);
        }
    }

    public int get(int key) {
        int i = this.getIndex(key);
        if (i != -1) {
            return this.map.get(i).get(1);
        }

        return i;
    }

    public void remove(int key) {
        int i = this.getIndex(key);
        if (i != -1) {
            this.map.remove(i);
        }
    }

    public boolean containsKey(int key) {
        for (List<Integer> entry : this.map) {
            if (entry.get(0) == key) {
                return true;
            }
        }

        return false;
    }

    private int getIndex(int key) {
        for (int i = 0; i < this.map.size(); i++) {
            if (this.map.get(i).get(0) == key) {
                return i;
            }
        }

        return -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */