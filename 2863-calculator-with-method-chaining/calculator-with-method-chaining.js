class Calculator {
    /** 
     * @param {number} value
     */
    constructor(value) {
        this.value = value;
        this.error = null;
    }

    /** 
     * @param {number} value
     * @return {Calculator}
     */
    add(value) {
        if (this.error) return this;
        this.value += value;
        return this;
    }

    /** 
     * @param {number} value
     * @return {Calculator}
     */
    subtract(value) {
        if (this.error) return this;
        this.value -= value;
        return this;
    }

    /** 
     * @param {number} value
     * @return {Calculator}
     */  
    multiply(value) {
        if (this.error) return this;
        this.value *= value;
        return this;
    }

    /** 
     * @param {number} value
     * @return {Calculator}
     */
    divide(value) {
        if (this.error) return this;
        if (value === 0) {
            this.error = "Division by zero is not allowed";
        } else {
            this.value /= value;
        }
        return this;
    }

    /** 
     * @param {number} value
     * @return {Calculator}
     */
    power(value) {
        if (this.error) return this;
        this.value = Math.pow(this.value, value);
        return this;
    }

    /** 
     * @return {number|string}
     */
    getResult() {
        if (this.error) return this.error;
        return this.value;
    }
}
