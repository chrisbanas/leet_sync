class OrderedStream {

    private String[] stream;
    private int currentIndex;

    public OrderedStream(int n) {
        this.stream = new String[n + 1];
        this.currentIndex = 1;
    }
    
    public List<String> insert(int idKey, String value) {
        this.stream[idKey] = value;

        List<String> output = new ArrayList<>();

        if (this.currentIndex != idKey) {
            return output;
        }

        for (int i = idKey; i < this.stream.length; i++) {
            if (this.stream[i] != null) {
                output.add(this.stream[i]);
            } else if (this.stream[i] == null) {
                break;
            }
        }

        currentIndex = idKey + output.size();

        return output;

    }
}

// Time O(n)
// Space O(n)

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */