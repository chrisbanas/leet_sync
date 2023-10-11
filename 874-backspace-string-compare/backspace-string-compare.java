class Solution {
  public boolean backspaceCompare(String s, String t) {
    StringBuilder newS = new StringBuilder();
    StringBuilder newT = new StringBuilder();

    int sBackSpace = 0;
    int tBackSpace = 0;

    insertChar(s, newS, sBackSpace);

    insertChar(t, newT, tBackSpace);

    return newS.toString().equals(newT.toString());

  }

  private void insertChar(String s, StringBuilder newS, int sBackSpace) {
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
  }
  
}