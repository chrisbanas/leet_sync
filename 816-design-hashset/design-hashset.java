class MyHashSet {

  private List<Integer> set;

  public MyHashSet() {
    this.set = new ArrayList<>();
  }

  public void add(int key) {
    if (!contains(key)) {
      this.set.add(key);
    }
  }

  public void remove(int key) {
    for (int i = 0; i < this.set.size(); i++) {
        if (this.set.get(i) == key) {
            this.set.remove(i);
            break;
        }
    }
  }

  public boolean contains(int key) {
    for (int x: this.set) {
      if (x == key) {
        return true;
      }
    }
    return false;
  }

  public void printSet() {
    System.out.println(this.set);
  }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */