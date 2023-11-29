/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    let output = [];
    for (let i = 0; i < arr.length; i += size) {
        let temp = [];
        for (let j = i; j < i + size && j < arr.length; j++) {
            temp.push(arr[j]);
        }
        output.push(temp);
    }

    return output;
};
