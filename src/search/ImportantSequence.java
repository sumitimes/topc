package topc.search;

import java.util.*;
import java.io.*;

// SRM 540 Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11842&rd=14732
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+540
public class ImportantSequence {
    public static final long INF = Long.MAX_VALUE;
    public int getCount(int[] B, String operators) {
        int n      = B.length;
        long[] val = new long[n];
        long[] sig = new long[n];

        long op = operators.charAt(0) == '+' ? 1 : -1;
        val[0]  = op * B[0];
        sig[0]  = op * -1;

        for (int i = 1; i < n; i++) {
            op     = operators.charAt(i) == '+' ? 1 : -1;
            val[i] = op * B[i] + -1 * op * val[i - 1];
            sig[i] = -1 * op * sig[i - 1];
        }

        long lo = 1;
        long hi = INF;
        for (int i = 0; i < n; i++) {
            if (sig[i] == -1) {
                hi = Math.min(hi, val[i] - 1);
            } else if (sig[i] == 1) {
                lo = Math.max(lo, -1 * val[i] + 1);
            }
        }

        if (lo > hi) {
            return 0;
        } else if (hi == INF) {
            return -1;
        } else {
            return (int)(hi - lo + 1);
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
