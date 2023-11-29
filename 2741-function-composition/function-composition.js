/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    return function(x) {
        let result = x;
        for (let i = functions.length - 1; i >= 0; i--) {
            result = functions[i](result);
        }
        return result;
    };
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */

 // We need to work from the end going back towards the front and JavaScript has a builting function called reduceRight that is doing the same things as this loop

 /* return functions.reduceRight(function(acc, fn) {
            return fn(acc);
        }, x);

*/