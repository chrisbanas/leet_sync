class TimeLimitedCache {
  constructor() {
    this.cache = new Map();
  }

  set(key, value, duration) {
    const currentTime = Date.now();
    const expirationTime = currentTime + duration;

    if (this.cache.has(key)) {
      const entry = this.cache.get(key);
      if (entry.expirationTime > currentTime) {
        // Key already exists and is not expired, update the value and duration
        entry.value = value;
        entry.expirationTime = expirationTime;
        return true;
      }
    }

    // Key doesn't exist or is expired, add a new entry
    this.cache.set(key, { value, expirationTime });
    return false;
  }

  get(key) {
    const currentTime = Date.now();
    if (this.cache.has(key)) {
      const entry = this.cache.get(key);
      if (entry.expirationTime > currentTime) {
        // Key exists and is not expired, return the value
        return entry.value;
      } else {
        // Key is expired, remove it from the cache
        this.cache.delete(key);
      }
    }
    return -1;
  }

  count() {
    const currentTime = Date.now();
    let count = 0;
    this.cache.forEach((entry) => {
      if (entry.expirationTime > currentTime) {
        count++;
      } else {
        // Key is expired, remove it from the cache
        this.cache.delete(entry);
      }
    });
    return count;
  }
}