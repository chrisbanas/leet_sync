class Solution {
public int countStudents(int[] students, int[] sandwiches) {
    int line0 = 0;
    int line1 = 0;

    for (int student : students) {
      if (student == 0) {
        line0++;
      } else {
        line1++;
      }
    }

    int i = 0;
    while (line0 > 0 || line1 > 0) {
      if (sandwiches[i] == 0 && line0 > 0) {
        line0--;
      } else if (sandwiches[i] == 1 && line1 > 0) {
        line1--;
      } else {
        return line0 + line1;
      }
      i++;
    }

    return 0;

  }
}