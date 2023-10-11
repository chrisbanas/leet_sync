class Solution {
   public boolean backspaceCompare(String s, String t) {
    StringBuilder newS = new StringBuilder();
    StringBuilder newT = new StringBuilder();

    int sBackSpace = 0;
    int tBackSpace = 0;

    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == '#') {
        sBackSpace++;
      } else {
        if (sBackSpace > 0) {
          sBackSpace--;
        } else {
          newS.insert(0, s.charAt(i));
        }
      }
    }

    for (int i = t.length() - 1; i >= 0; i--) {
      if (t.charAt(i) == '#') {
        tBackSpace++;
      } else {
        if (tBackSpace > 0) {
          tBackSpace--;
        } else {
          newT.insert(0, t.charAt(i));
        }
      }
    }

    return newS.toString().equals(newT.toString());

  }
}