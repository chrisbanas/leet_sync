class ProductOfNumbers {

    private List<Integer> product;

    public ProductOfNumbers() {
        this.product = new ArrayList<>();
    }
    
    public void add(int num) {
        this.product.add(num);
    }
    
    public int getProduct(int k) {
        int output = 1;

        int counter = k;
        int i = this.product.size() - 1;

        while (counter > 0) {
            output *= this.product.get(i);
            counter--;
            i--;
        }

        return output;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */