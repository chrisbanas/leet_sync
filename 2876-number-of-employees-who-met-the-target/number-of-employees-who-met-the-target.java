class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int targetMet = 0;
        
        for (int hour : hours) {
            if (hour >= target) {
                targetMet++;
            }
        }

        return targetMet;
    }
}