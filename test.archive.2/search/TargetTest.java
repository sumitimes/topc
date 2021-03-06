package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class TargetTest {
    Target target = new Target();

    @Test
    public void case1() {
        int n = 5;
        assertArrayEquals(new String[] { "#####", "#   #", "# # #", "#   #", "#####" }, target.draw(n));
    }

    @Test
    public void case2() {
        int n = 9;
        assertArrayEquals(new String[] { "#########", "#       #", "# ##### #", "# #   # #", "# # # # #", "# #   # #", "# ##### #", "#       #", "#########" }, target.draw(n));
    }

    @Test
    public void case3() {
        int n = 13;
        assertArrayEquals(new String[] { "#############", "#           #", "# ######### #", "# #       # #", "# # ##### # #", "# # #   # # #", "# # # # # # #", "# # #   # # #", "# # ##### # #", "# #       # #", "# ######### #", "#           #", "#############" }, target.draw(n));
    }

    @Test
    public void case4() {
        int n = 17;
        assertArrayEquals(new String[] { "#################", "#               #", "# ############# #", "# #           # #", "# # ######### # #", "# # #       # # #", "# # # ##### # # #", "# # # #   # # # #", "# # # # # # # # #", "# # # #   # # # #", "# # # ##### # # #", "# # #       # # #", "# # ######### # #", "# #           # #", "# ############# #", "#               #", "#################" }, target.draw(n));
    }

    @Test
    public void case5() {
        int n = 21;
        assertArrayEquals(new String[] { "#####################", "#                   #", "# ################# #", "# #               # #", "# # ############# # #", "# # #           # # #", "# # # ######### # # #", "# # # #       # # # #", "# # # # ##### # # # #", "# # # # #   # # # # #", "# # # # # # # # # # #", "# # # # #   # # # # #", "# # # # ##### # # # #", "# # # #       # # # #", "# # # ######### # # #", "# # #           # # #", "# # ############# # #", "# #               # #", "# ################# #", "#                   #", "#####################" }, target.draw(n));
    }

    @Test
    public void case6() {
        int n = 25;
        assertArrayEquals(new String[] { "#########################", "#                       #", "# ##################### #", "# #                   # #", "# # ################# # #", "# # #               # # #", "# # # ############# # # #", "# # # #           # # # #", "# # # # ######### # # # #", "# # # # #       # # # # #", "# # # # # ##### # # # # #", "# # # # # #   # # # # # #", "# # # # # # # # # # # # #", "# # # # # #   # # # # # #", "# # # # # ##### # # # # #", "# # # # #       # # # # #", "# # # # ######### # # # #", "# # # #           # # # #", "# # # ############# # # #", "# # #               # # #", "# # ################# # #", "# #                   # #", "# ##################### #", "#                       #", "#########################" }, target.draw(n));
    }

    @Test
    public void case7() {
        int n = 29;
        assertArrayEquals(new String[] { "#############################", "#                           #", "# ######################### #", "# #                       # #", "# # ##################### # #", "# # #                   # # #", "# # # ################# # # #", "# # # #               # # # #", "# # # # ############# # # # #", "# # # # #           # # # # #", "# # # # # ######### # # # # #", "# # # # # #       # # # # # #", "# # # # # # ##### # # # # # #", "# # # # # # #   # # # # # # #", "# # # # # # # # # # # # # # #", "# # # # # # #   # # # # # # #", "# # # # # # ##### # # # # # #", "# # # # # #       # # # # # #", "# # # # # ######### # # # # #", "# # # # #           # # # # #", "# # # # ############# # # # #", "# # # #               # # # #", "# # # ################# # # #", "# # #                   # # #", "# # ##################### # #", "# #                       # #", "# ######################### #", "#                           #", "#############################" }, target.draw(n));
    }

    @Test
    public void case8() {
        int n = 33;
        assertArrayEquals(new String[] { "#################################", "#                               #", "# ############################# #", "# #                           # #", "# # ######################### # #", "# # #                       # # #", "# # # ##################### # # #", "# # # #                   # # # #", "# # # # ################# # # # #", "# # # # #               # # # # #", "# # # # # ############# # # # # #", "# # # # # #           # # # # # #", "# # # # # # ######### # # # # # #", "# # # # # # #       # # # # # # #", "# # # # # # # ##### # # # # # # #", "# # # # # # # #   # # # # # # # #", "# # # # # # # # # # # # # # # # #", "# # # # # # # #   # # # # # # # #", "# # # # # # # ##### # # # # # # #", "# # # # # # #       # # # # # # #", "# # # # # # ######### # # # # # #", "# # # # # #           # # # # # #", "# # # # # ############# # # # # #", "# # # # #               # # # # #", "# # # # ################# # # # #", "# # # #                   # # # #", "# # # ##################### # # #", "# # #                       # # #", "# # ######################### # #", "# #                           # #", "# ############################# #", "#                               #", "#################################" }, target.draw(n));
    }

    @Test
    public void case9() {
        int n = 37;
        assertArrayEquals(new String[] { "#####################################", "#                                   #", "# ################################# #", "# #                               # #", "# # ############################# # #", "# # #                           # # #", "# # # ######################### # # #", "# # # #                       # # # #", "# # # # ##################### # # # #", "# # # # #                   # # # # #", "# # # # # ################# # # # # #", "# # # # # #               # # # # # #", "# # # # # # ############# # # # # # #", "# # # # # # #           # # # # # # #", "# # # # # # # ######### # # # # # # #", "# # # # # # # #       # # # # # # # #", "# # # # # # # # ##### # # # # # # # #", "# # # # # # # # #   # # # # # # # # #", "# # # # # # # # # # # # # # # # # # #", "# # # # # # # # #   # # # # # # # # #", "# # # # # # # # ##### # # # # # # # #", "# # # # # # # #       # # # # # # # #", "# # # # # # # ######### # # # # # # #", "# # # # # # #           # # # # # # #", "# # # # # # ############# # # # # # #", "# # # # # #               # # # # # #", "# # # # # ################# # # # # #", "# # # # #                   # # # # #", "# # # # ##################### # # # #", "# # # #                       # # # #", "# # # ######################### # # #", "# # #                           # # #", "# # ############################# # #", "# #                               # #", "# ################################# #", "#                                   #", "#####################################" }, target.draw(n));
    }

    @Test
    public void case10() {
        int n = 41;
        assertArrayEquals(new String[] { "#########################################", "#                                       #", "# ##################################### #", "# #                                   # #", "# # ################################# # #", "# # #                               # # #", "# # # ############################# # # #", "# # # #                           # # # #", "# # # # ######################### # # # #", "# # # # #                       # # # # #", "# # # # # ##################### # # # # #", "# # # # # #                   # # # # # #", "# # # # # # ################# # # # # # #", "# # # # # # #               # # # # # # #", "# # # # # # # ############# # # # # # # #", "# # # # # # # #           # # # # # # # #", "# # # # # # # # ######### # # # # # # # #", "# # # # # # # # #       # # # # # # # # #", "# # # # # # # # # ##### # # # # # # # # #", "# # # # # # # # # #   # # # # # # # # # #", "# # # # # # # # # # # # # # # # # # # # #", "# # # # # # # # # #   # # # # # # # # # #", "# # # # # # # # # ##### # # # # # # # # #", "# # # # # # # # #       # # # # # # # # #", "# # # # # # # # ######### # # # # # # # #", "# # # # # # # #           # # # # # # # #", "# # # # # # # ############# # # # # # # #", "# # # # # # #               # # # # # # #", "# # # # # # ################# # # # # # #", "# # # # # #                   # # # # # #", "# # # # # ##################### # # # # #", "# # # # #                       # # # # #", "# # # # ######################### # # # #", "# # # #                           # # # #", "# # # ############################# # # #", "# # #                               # # #", "# # ################################# # #", "# #                                   # #", "# ##################################### #", "#                                       #", "#########################################" }, target.draw(n));
    }

    @Test
    public void case11() {
        int n = 45;
        assertArrayEquals(new String[] { "#############################################", "#                                           #", "# ######################################### #", "# #                                       # #", "# # ##################################### # #", "# # #                                   # # #", "# # # ################################# # # #", "# # # #                               # # # #", "# # # # ############################# # # # #", "# # # # #                           # # # # #", "# # # # # ######################### # # # # #", "# # # # # #                       # # # # # #", "# # # # # # ##################### # # # # # #", "# # # # # # #                   # # # # # # #", "# # # # # # # ################# # # # # # # #", "# # # # # # # #               # # # # # # # #", "# # # # # # # # ############# # # # # # # # #", "# # # # # # # # #           # # # # # # # # #", "# # # # # # # # # ######### # # # # # # # # #", "# # # # # # # # # #       # # # # # # # # # #", "# # # # # # # # # # ##### # # # # # # # # # #", "# # # # # # # # # # #   # # # # # # # # # # #", "# # # # # # # # # # # # # # # # # # # # # # #", "# # # # # # # # # # #   # # # # # # # # # # #", "# # # # # # # # # # ##### # # # # # # # # # #", "# # # # # # # # # #       # # # # # # # # # #", "# # # # # # # # # ######### # # # # # # # # #", "# # # # # # # # #           # # # # # # # # #", "# # # # # # # # ############# # # # # # # # #", "# # # # # # # #               # # # # # # # #", "# # # # # # # ################# # # # # # # #", "# # # # # # #                   # # # # # # #", "# # # # # # ##################### # # # # # #", "# # # # # #                       # # # # # #", "# # # # # ######################### # # # # #", "# # # # #                           # # # # #", "# # # # ############################# # # # #", "# # # #                               # # # #", "# # # ################################# # # #", "# # #                                   # # #", "# # ##################################### # #", "# #                                       # #", "# ######################################### #", "#                                           #", "#############################################" }, target.draw(n));
    }

    @Test
    public void case12() {
        int n = 49;
        assertArrayEquals(new String[] { "#################################################", "#                                               #", "# ############################################# #", "# #                                           # #", "# # ######################################### # #", "# # #                                       # # #", "# # # ##################################### # # #", "# # # #                                   # # # #", "# # # # ################################# # # # #", "# # # # #                               # # # # #", "# # # # # ############################# # # # # #", "# # # # # #                           # # # # # #", "# # # # # # ######################### # # # # # #", "# # # # # # #                       # # # # # # #", "# # # # # # # ##################### # # # # # # #", "# # # # # # # #                   # # # # # # # #", "# # # # # # # # ################# # # # # # # # #", "# # # # # # # # #               # # # # # # # # #", "# # # # # # # # # ############# # # # # # # # # #", "# # # # # # # # # #           # # # # # # # # # #", "# # # # # # # # # # ######### # # # # # # # # # #", "# # # # # # # # # # #       # # # # # # # # # # #", "# # # # # # # # # # # ##### # # # # # # # # # # #", "# # # # # # # # # # # #   # # # # # # # # # # # #", "# # # # # # # # # # # # # # # # # # # # # # # # #", "# # # # # # # # # # # #   # # # # # # # # # # # #", "# # # # # # # # # # # ##### # # # # # # # # # # #", "# # # # # # # # # # #       # # # # # # # # # # #", "# # # # # # # # # # ######### # # # # # # # # # #", "# # # # # # # # # #           # # # # # # # # # #", "# # # # # # # # # ############# # # # # # # # # #", "# # # # # # # # #               # # # # # # # # #", "# # # # # # # # ################# # # # # # # # #", "# # # # # # # #                   # # # # # # # #", "# # # # # # # ##################### # # # # # # #", "# # # # # # #                       # # # # # # #", "# # # # # # ######################### # # # # # #", "# # # # # #                           # # # # # #", "# # # # # ############################# # # # # #", "# # # # #                               # # # # #", "# # # # ################################# # # # #", "# # # #                                   # # # #", "# # # ##################################### # # #", "# # #                                       # # #", "# # ######################################### # #", "# #                                           # #", "# ############################################# #", "#                                               #", "#################################################" }, target.draw(n));
    }

}
