package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 520 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11511&rd=14545
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+520
public class SRMSystemTestPhase {
  static final long MOD = 1000000007L;
  static final int P = 1;
  static final int C = 2;
  int n;
  String[] desc;
  long[][][] memo;

  public int countWays(String[] description) {
    n = description.length;
    desc = description;
    memo = new long[n][4][4];
    return (int)solve(0, 3, 0);
  }

  long solve(int index, int passed, int challenged) {
    if (index == n) { return 1; }
    if (memo[index][passed][challenged] > 0) { return memo[index][passed][challenged] ; }

    long sum = 0;
    boolean s0 = desc[index].charAt(0) == 'Y';
    boolean s1 = desc[index].charAt(1) == 'Y';
    boolean s2 = desc[index].charAt(2) == 'Y';

    for (int i = (s0 ? 1 : 0); i < (s0 ? 4 : 1); i++) {
      for (int j = (s1 ? 1 : 0); j < (s1 ? 4 : 1); j++) {
        for (int k = (s2 ? 1 : 0); k < (s2 ? 4 : 1); k++) {

          int p = (i == P ? 1 : 0) + (j == P ? 1 : 0) + (k == P ? 1 : 0);
          int c = (i == C ? 1 : 0) + (j == C ? 1 : 0) + (k == C ? 1 : 0);

          if (p < passed) {
            sum += 1 * solve(index + 1, p, c);
          }
          if (p == passed && c >= challenged) {
            sum += 1 * solve(index + 1, p, c);
          }
        }
      }
    }

    sum %= MOD;
    memo[index][passed][challenged] = sum;
    return sum;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
