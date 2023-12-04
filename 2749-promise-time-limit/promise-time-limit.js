/**
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
var timeLimit = function(fn, t) {
    return async (...args) => {
        let timeoutId;

        // Create a promise that resolves when the function completes
        const resultPromise = Promise.resolve(fn(...args));

        // Create a promise that rejects after the specified time limit
        const timeoutPromise = new Promise((_, reject) => {
        timeoutId = setTimeout(() => {
            reject("Time Limit Exceeded");
        }, t);
        });

        // Wait for either the function to complete or the timeout to occur
        const result = await Promise.race([resultPromise, timeoutPromise]);

        // Clear the timeout if the function completes before the timeout
        clearTimeout(timeoutId);

        return result;
    };
};

/**
 * const limited = timeLimit((t) => new Promise(res => setTimeout(res, t)), 100);
 * limited(150).catch(console.log) // "Time Limit Exceeded" at t=100ms
 */