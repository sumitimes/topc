package topc.easy;

import java.util.*;
import java.io.*;

// SRM 207 Division II Level Three - 1000
// brute force, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2915&rd=5853
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm207
public class CaptureThemAll {
    int dc[] = { 1, -1,  1, -1, 2, -2, -2,  2 };
    int dr[] = { 2, -2, -2,  2, 1, -1,  1, -1 };
    int n = 8;

    public int fastKnight(String knight, String rook, String queen) {
        int r[] = new int[3];
        int c[] = new int[3];

        extractPosition(r, c, 0, knight);
        extractPosition(r, c, 1, rook);
        extractPosition(r, c, 2, queen);

        int distq[][] = computeDist(r[2], c[2]);
        int distr[][] = computeDist(r[1], c[1]);

        return Math.min(
                distq[r[0]][c[0]] + distr[r[2]][c[2]],
                distr[r[0]][c[0]] + distq[r[1]][c[1]]);
    }

    private void extractPosition(int[] r, int[] c, int k, String pos) {
        c[k] = pos.charAt(0) - 'a';
        r[k] = pos.charAt(1) - '1';
    }

    private int[][] computeDist(int row, int col) {
        int dist[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], -1);
        }

        dist[row][col] = 0;

        boolean change = true;
        while (change) {
            change = false;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][j] > -1) {
                        for (int k = 0; k < dc.length; k++) {
                            int r = i + dr[k];
                            int c = j + dc[k];

                            if (valid(r, c) && (dist[r][c] == -1 || dist[i][j] + 1 < dist[r][c])) {
                                dist[r][c] = dist[i][j] + 1;
                                change = true;
                            }
                        }
                    }
                }
            }
        }

        return dist;
    }

    private boolean valid(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < n;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
