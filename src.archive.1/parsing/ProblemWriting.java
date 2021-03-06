package topc.parsing;

import java.util.*;
import java.io.*;

// SRM 152 Division II Level Three - 1000
// string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1763&rd=4565
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm152
public class ProblemWriting {
    int n;
    public String myCheckData(String dotForm) {
        n = dotForm.length();

        if (n > 25) {
            return "dotForm must contain between 1 and 25 characters, inclusive.";
        }
        if (n == 0) {
            return "dotForm is not in dot notation, check character 0.";
        }

        //int index = check(dotForm, 0);
        int index = check(dotForm);

        return index == -1 ? "" : String.format("dotForm is not in dot notation, check character %s.", index);
    }

    // state machine
    private int check(String text) {
        final int S0 = 0, S1 = 1, S2 = 2, S3 = 3;

        boolean valid = true;
        int STATE     = S0;

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            valid = true;

            switch (STATE) {
                case S0: 
                    if (Character.isDigit(c)) {
                        STATE = S1;
                    } else {
                        valid = false;
                    }
                    break;
                case S1:
                case S2:
                    if (c == '.') {
                        STATE = S2;
                    } else if (isOperator(c)) {
                        STATE = S3;
                    } else {
                        valid = false;
                    }
                    break;
                case S3:
                    if (c == '.') {
                        STATE = S3;
                    } else if (Character.isDigit(c)) {
                        STATE = S1;
                    } else {
                        valid = false;
                    }
            }

            if (!valid) { return i; }
        }

        return (STATE != S1) ? n : -1;
    }

    // recursive
    private int check(String text, int index) {
        if (index == n) { return -1; }
        if (index == n - 1) { return Character.isDigit(text.charAt(index)) ? -1 : index; }

        if (Character.isDigit(text.charAt(index))) {
            int k = index;

            k++;
            while (k < n && text.charAt(k) == '.') { k++; }

            if (k == n || !isOperator(text.charAt(k))) { return k; }

            k++;
            while (k < n && text.charAt(k) == '.') { k++; }

            return k == n ? k : check(text, k);
        } else {
            return index;
        }
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
