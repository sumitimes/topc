package topc.search;

import java.util.*;
import java.io.*;

// SRM 560 Division II Level Three - 1000
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12298&rd=15182
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+560
public class DrawingPointsDivTwo {
  public int maxSteps(String[] points) {
    int height = points.length;
    int width = points[0].length();
    boolean t[][] = new boolean[height + 21][width + 21];

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        t[i][j] = points[i].charAt(j) == '*';
      }
    }

    for (int k = 1; k <= 21; k++) {
      for (int i = height + k - 1; i >= 0; i--) {
        for (int j = width + k - 1; j >= 0; j--) {
          t[i][j] |= (i > 0 && t[i - 1][j]) | (j > 0 && t[i][j - 1]) | (i > 0 && j > 0 && t[i - 1][j - 1]);
        }
      }

      for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
          boolean square = true;
          for (int y = i; y <= i + k; y++) {
            for (int x = j; x <= j + k; x++) {
              square &= t[y][x];
            }
          }
          if (square && points[i].charAt(j) != '*') {
            return k - 1;
          }
        }
      }
    }

    return -1;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
