package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 477 Division II Level Three - 1000
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10875&rd=14157
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+477
public class CarelessSecretary {
  long MOD = 1000000007L;
  long[] fact;
  int n;
  int k;
  long[][] memo;

  public int howMany(int N, int K) {
    n = N;
    k = K;
    fact = buildFactTable(N);
    memo = new long[k][1 << (k + 1)];

    long res1 = count(0, 0);
    long res2 = count();
    long res3 = countInEx();

    assert res1 == res2 : "solutions 1 and 2 don't match";
    assert res1 == res3 : "solutions 1 and 3 don't match";

    return (int)res1;
  }

  // count using the inclusion-exclusion principle
  long countInEx() {
    long[][] bc = binomialCoefficient(k, MOD);
    long res = fact[n];

    for (int i = 1; i < k + 1; i++) {
      if (i % 2 == 0) {
        res += bc[k][i] * fact[n - i];
      } else {
        res -= (bc[k][i] * fact[n - i]) % MOD;
        res += MOD;
      }
      res %= MOD;
    }

    return res;
  }

  long count() {
    long[][] dp = new long[n + 1][k + 1];

    dp[0][0] = 1;
    for (int i = 1; i < n + 1; i++) {
      for (int j = 0; j < Math.min(i, k) + 1; j++) {
        if (j == 0) {
          dp[i][j] = i * dp[i - 1][j] % MOD;
          continue;
        }
        if (j == 1 && i <= j) { continue; }
        if (j == 1) {
          dp[i][j] = (i - j) * (dp[i - 2][j - 1] + dp[i - 1][j]) % MOD;
          continue;
        }
        dp[i][j] += (i - j) * (dp[i - 2][j - 1] + dp[i - 1][j]);
        dp[i][j] += (j - 1) * (dp[i - 2][j - 2] + dp[i - 1][j - 1]);
        dp[i][j] %= MOD;
      }
    }

    return dp[n][k];
  }

  long count(int i, int mask) {
    if (i == k) { return fact[n - k]; }
    if (memo[i][mask] > 0) { return memo[i][mask]; }

    int used = countOnes(mask);
    long sum = 0;

    for (int j = 0; j < k; j++) {
      if (j != i && (mask & 1 << j) == 0) { 
        sum += count(i + 1, mask | (1 << j));
        sum %= MOD;
      }
    }

    sum += (n - k - i + used) * count(i + 1, mask);
    sum %= MOD;

    memo[i][mask] = sum;
    return sum;
  }

  public static long[][] binomialCoefficient(long n, long mod) {
    long[][] bc = new long[(int)n + 1][(int)n + 1];
    if (mod == 1) { return bc; }

    for (int i = 0; i < n + 1; i++) {
      bc[i][0] = 1;
      for (int j = 1; j < i + 1; j++) {
        bc[i][j] = bc[i - 1][j - 1] + bc[i - 1][j];
        bc[i][j] = (bc[i][j] >= mod) ? (bc[i][j] - mod) : bc[i][j];
      }
    }

    return bc;
  }

  long[] buildFactTable(int n) {
    long[] fact = new long[n + 1];
    fact[0] = 1;
    for (int i = 1; i < fact.length; i++) {
      fact[i] = i * fact[i - 1] % MOD;
    }
    return fact;
  }

  int countOnes(int mask) {
    int n = 0;
    while (mask != 0) {
      n++;
      mask = mask & (mask - 1);
    }
    return n;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
