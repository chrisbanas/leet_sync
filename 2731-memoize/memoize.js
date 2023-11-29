/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    const cache = {};

    return function(...args) {
        const key = JSON.stringify(args); // Serialize arguments to use as a cache key
        if (!cache.hasOwnProperty(key)) {
            cache[key] = fn.apply(this, args); // Call the original function and cache its result (recursion)
        }
        return cache[key]; // Return the cached result
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */