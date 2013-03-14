package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class SpreadingNewsTest {
  SpreadingNews spreadingnews = new SpreadingNews();

  @Test
  public void case1() {
    int[] supervisors = { -1 };
    assertEquals(0, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case2() {
    int[] supervisors = { -1, 0, 0 };
    assertEquals(2, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case3() {
    int[] supervisors = { -1, 0, 0, 2, 2 };
    assertEquals(3, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case4() {
    int[] supervisors = { -1, 0, 0, 1, 1, 2, 2, 3, 4 };
    assertEquals(4, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case5() {
    int[] supervisors = { -1, 0, 1, 2, 3 };
    assertEquals(4, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case6() {
    int[] supervisors = { -1, 0, 1, 2, 3, 3, 3 };
    assertEquals(6, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case7() {
    int[] supervisors = { -1, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 7, 8, 12, 13, 14, 16, 16, 16 };
    assertEquals(7, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case8() {
    int[] supervisors = { -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41 };
    assertEquals(42, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case9() {
    int[] supervisors = { -1, 0, 1, 0, 3, 2, 3, 2, 1, 4, 8, 6, 5, 10, 6, 14, 11, 10, 13, 14, 15, 12, 5, 9, 21, 24, 18, 24, 27, 9, 16, 15, 11, 20, 18, 25, 13, 19, 19, 12, 22, 36, 40, 29, 37, 39, 20, 31, 34, 7 };
    assertEquals(9, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case10() {
    int[] supervisors = { -1, 0, 0, 1, 2, 2, 5, 1, 3, 5, 7, 6, 10, 12, 6, 4, 13, 13, 4, 3, 14, 7, 16, 15, 16, 18, 10, 20, 19, 12, 24, 30, 28, 9, 15, 27, 33, 36, 20, 34, 34, 31, 35, 19, 35, 33, 29, 43, 8, 29 };
    assertEquals(10, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case11() {
    int[] supervisors = { -1, 0, 0, 2, 2, 1, 0, 6, 1, 8, 3 };
    assertEquals(4, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case12() {
    int[] supervisors = { -1, 0, 1, 0, 2, 0, 3, 4, 7, 3, 5, 4, 3, 12, 12, 4, 5, 5, 10, 16, 1, 13, 7, 21, 2, 23, 8, 1, 16, 28, 9, 11, 24, 16, 23, 13, 28, 24, 2, 24, 31, 40, 8, 39, 25, 7, 25, 20, 41, 23 };
    assertEquals(9, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case13() {
    int[] supervisors = { -1, 0, 1, 1, 2, 0, 0, 6, 3, 7, 9, 10, 9, 7, 6, 6, 12, 16, 10, 17, 1, 14, 20, 5, 21, 12, 5, 16, 21, 28, 22, 20 };
    assertEquals(7, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case14() {
    int[] supervisors = { -1, 0, 1, 1, 3, 1, 0, 4, 6, 4, 7, 8, 9, 11, 10, 5, 2, 0, 16, 15, 10, 20, 10, 11, 22, 20 };
    assertEquals(8, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case15() {
    int[] supervisors = { -1, 0, 1, 2, 3, 4, 5, 6, 2, 4, 5, 7, 9, 4, 10, 8, 14, 3, 1, 8, 6, 7, 4, 22, 14, 22, 2, 5, 17, 10, 27, 8, 10, 18, 18, 5, 24, 22, 20, 12 };
    assertEquals(10, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case16() {
    int[] supervisors = { -1, 0, 0, 0, 3, 0, 2, 5, 0, 1, 8, 9, 4, 6, 6, 5, 1, 10, 10, 1, 7, 4, 5, 21, 17, 4, 18, 7, 6, 5, 8, 8, 30, 9, 13, 15, 1, 31, 35, 14, 34, 24, 23, 4, 21, 27, 39, 21, 21, 25 };
    assertEquals(9, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case17() {
    int[] supervisors = { -1, 0, 1, 2, 2, 2, 4, 4, 6, 0, 6, 2, 0, 1, 13, 10, 9, 9, 14, 16, 3, 20, 4, 9, 16, 6, 13, 26, 5, 0, 4, 18, 18, 16, 24, 19, 24, 18, 9, 7, 11, 14, 3, 34, 21, 25, 41, 1, 10, 47 };
    assertEquals(8, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case18() {
    int[] supervisors = { -1, 0, 1, 0, 1, 0, 3, 4, 5, 3, 2, 5, 10, 5, 4, 1, 14, 1, 12, 1, 10, 11, 2, 22, 15, 14, 16, 14, 6, 9, 20, 9, 28, 25, 10, 32, 13, 21, 31, 9, 34, 37, 5, 23, 17, 22, 34, 33, 36, 32 };
    assertEquals(7, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case19() {
    int[] supervisors = { -1, 0, 1, 0, 3, 4, 4, 3, 6, 8, 8, 5, 10, 2, 10, 12, 12, 10, 2, 4, 14, 3, 5, 21, 14, 6, 10, 17, 12 };
    assertEquals(9, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case20() {
    int[] supervisors = { -1, 0, 0, 1, 0, 1, 4, 0, 2, 6, 4, 7, 9, 5, 9, 4, 13, 7, 0, 8, 16, 13, 20, 22, 2, 21, 11, 8, 27, 7, 8, 27, 4, 24, 12 };
    assertEquals(7, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case21() {
    int[] supervisors = { -1, 0, 1, 1, 2, 3, 5, 4, 5, 5, 4, 7, 9, 9, 9, 13, 1, 2, 2, 15, 10, 16, 18, 2, 5, 20, 0, 0, 9 };
    assertEquals(8, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case22() {
    int[] supervisors = { -1, 0, 1, 1, 3, 0, 3, 3, 2, 8, 2, 3, 6, 10, 4, 8, 3, 14, 13, 18, 3, 13, 14, 8, 8, 3, 0, 9, 26, 23, 17, 3 };
    assertEquals(10, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case23() {
    int[] supervisors = { -1, 0, 1, 1, 2, 3, 0, 1, 7, 5, 7, 5, 1, 0, 9, 5, 2, 9, 3, 0, 10, 8, 18, 6, 1, 15, 6, 7, 14, 28, 17, 6, 14, 2, 10, 29, 32, 1, 34, 9, 7, 7, 1, 27, 8, 32, 13, 13, 31, 38 };
    assertEquals(9, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case24() {
    int[] supervisors = { -1, 0, 0, 0, 3, 1, 0, 3, 3, 2, 4 };
    assertEquals(4, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case25() {
    int[] supervisors = { -1, 0, 0, 1, 0, 0, 5, 3, 5, 5, 8, 1, 1, 3, 7, 0, 10, 4, 15, 11, 9, 19, 17, 18, 0, 10, 3, 5, 15, 28, 7, 11, 1, 3, 9, 1, 28, 32, 8, 6, 39, 0, 29, 30, 17, 9, 10, 40, 32, 37 };
    assertEquals(7, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case26() {
    int[] supervisors = { -1, 0, 0, 0, 0, 4, 0, 4, 3, 6, 6, 9, 11, 4, 10, 12, 12, 4, 4, 11, 2, 1, 16, 7, 8, 24, 12, 9, 14, 4, 17, 3, 8, 19, 6, 25, 25, 12, 17, 13, 38, 10, 11, 24, 36, 16, 38, 26, 43, 19 };
    assertEquals(8, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case27() {
    int[] supervisors = { -1, 0, 1, 0, 3, 3, 4, 5, 3, 3, 5, 2, 0, 10, 1, 4, 10, 2, 15, 0, 13, 18, 16, 16, 18, 19, 14, 14, 1, 13, 6, 15, 15, 25, 30, 26, 21, 26, 11, 0, 17, 17, 12, 21, 15, 37, 38, 9, 11, 6 };
    assertEquals(8, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case28() {
    int[] supervisors = { -1, 0, 1, 2, 1, 1, 2, 1, 6, 1, 1, 3, 9, 1, 1, 4, 14, 12, 3, 14, 14, 20, 13, 16, 16, 17, 0, 22, 2, 9, 1, 17 };
    assertEquals(10, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case29() {
    int[] supervisors = { -1, 0, 1, 1, 3, 2, 4, 0, 4, 1, 9, 7, 6, 10, 11, 3, 14, 15, 3, 16, 8, 8, 15, 6, 18, 5, 1, 20, 16, 16, 16, 24, 5, 2, 1, 34, 30, 33, 14, 19, 19, 29, 20, 8, 14, 15, 33 };
    assertEquals(8, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case30() {
    int[] supervisors = { -1, 0, 0, 1, 0, 1, 4, 3, 1, 4, 9, 10, 11, 9, 3, 1, 13, 13, 14, 11, 13, 5, 19, 8, 14, 18, 19, 17, 9, 5, 12, 22, 29, 30, 30, 11, 21, 34, 12, 11, 0, 0, 17, 26, 29, 16, 36, 28, 46, 25 };
    assertEquals(9, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case31() {
    int[] supervisors = { -1, 0, 0, 0, 1, 3, 1, 1, 1, 7, 7, 0, 6, 5, 12, 11, 8, 10, 2, 13, 19, 4, 10, 17, 12, 10, 19, 18, 3, 24, 18, 15, 19, 7, 23, 4, 2, 3, 28, 4, 34, 27, 12, 42, 16, 13, 13, 8, 15, 13 };
    assertEquals(8, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case32() {
    int[] supervisors = { -1, 0, 0, 0, 0, 2, 5, 1, 4, 2, 9, 0, 1, 2, 8, 7, 9, 8, 9, 1, 2, 5, 1, 12, 0, 9, 11, 25, 9, 20, 1, 5, 10, 26, 11, 18, 8, 22, 10, 0, 33, 17, 17, 40, 23, 13, 20, 41 };
    assertEquals(8, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case33() {
    int[] supervisors = { -1, 0, 1, 1, 1, 1, 1, 5, 2, 7, 5, 6, 0, 8, 13, 6, 8, 10, 12, 16, 12, 9, 12, 15, 10, 10, 18, 20, 16, 9, 2, 30, 0, 27, 6, 28, 29, 7, 34, 38, 13, 32, 18, 29, 28, 0, 17, 19, 26, 25 };
    assertEquals(8, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case34() {
    int[] supervisors = { -1, 0, 1, 1, 1, 4, 4, 6, 7, 6, 3, 5, 9, 8, 12, 8, 2, 15, 11, 5, 10, 18, 13, 17, 1, 20, 25, 14, 27, 13, 5, 22, 5, 2, 14, 3, 21, 24, 27, 22, 13, 34, 38, 33, 26, 4, 13, 38, 12, 48 };
    assertEquals(11, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case35() {
    int[] supervisors = { -1, 0, 1, 1, 3, 1, 0, 1, 4, 2, 0, 6, 2, 8, 11, 1, 6, 4, 9, 15, 18, 20, 12, 14, 23, 12, 0, 8, 16, 1, 9, 28, 6, 14, 27, 11, 25, 4, 19, 17, 14, 35, 29, 12, 25, 7, 4, 2, 12, 22 };
    assertEquals(8, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case36() {
    int[] supervisors = { -1, 0, 1, 2, 2, 4, 5, 0, 5, 4, 1, 2, 9, 3, 7, 10, 13, 2, 16, 1, 1, 7, 0, 10, 23, 5, 13, 17, 19, 17, 18, 6, 14, 4, 3, 8, 0, 16, 27, 27, 4, 31, 7, 40, 32, 31, 30, 29, 47, 14 };
    assertEquals(9, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case37() {
    int[] supervisors = { -1, 0, 1, 1, 0, 0, 5, 3, 3, 1, 7, 1, 6, 6, 4, 7, 10, 11, 12, 14, 15, 14, 13, 6, 6, 9, 3, 5, 7, 13, 12, 8, 11, 3, 25, 17, 20, 1 };
    assertEquals(7, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case38() {
    int[] supervisors = { -1, 0, 0, 1, 1, 2, 3, 4, 3, 4, 1, 4, 0, 4, 2, 10, 3, 2, 12, 17, 10, 1, 11, 16, 1, 15, 16, 14, 7, 9, 7, 25, 7, 10, 27, 18, 25, 3, 25, 35, 39, 14, 7, 3, 6, 23, 41, 46, 21, 5 };
    assertEquals(9, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case39() {
    int[] supervisors = { -1, 0, 0, 2, 3, 3, 5, 1, 7, 3, 3, 1, 2, 10, 6, 1, 15, 16, 15, 13, 13, 18, 2, 19, 10, 10, 6, 24, 25, 14, 10, 2, 17, 14, 11, 2, 11, 33, 20, 32, 28, 21, 21, 7, 41, 2, 33, 14, 7, 36 };
    assertEquals(8, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case40() {
    int[] supervisors = { -1, 0, 1, 0, 3, 3, 3, 2, 4 };
    assertEquals(4, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case41() {
    int[] supervisors = { -1, 0, 0, 0, 3, 2, 5, 2, 4, 7 };
    assertEquals(4, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case42() {
    int[] supervisors = { -1, 0, 1, 1, 0, 0, 4, 6, 0, 6, 3, 2, 11, 7, 7, 0, 2, 8, 3, 15, 13, 11, 18, 6, 22, 8, 10, 25, 11, 24, 8, 3, 26, 6, 6, 33, 11, 31, 3, 36, 2, 29, 12, 39, 19, 8, 33, 10, 18, 32 };
    assertEquals(8, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case43() {
    int[] supervisors = { -1, 0, 1, 1, 3, 4, 1, 5, 1, 6, 0, 8, 5, 1, 8, 12, 15, 1, 17, 5 };
    assertEquals(7, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case44() {
    int[] supervisors = { -1, 0, 0, 0, 2, 4, 2, 1, 6, 8, 3, 5, 9, 10, 9, 12, 7, 4, 16, 10, 3 };
    assertEquals(6, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case45() {
    int[] supervisors = { -1, 0, 1, 2, 2, 3, 3, 4, 2, 3, 0, 10, 0, 9, 6, 12, 0, 7, 8, 14, 15, 4, 2, 2, 3, 7, 23, 15, 2, 16, 10, 23, 14, 0, 1, 16, 16, 32, 25, 20, 18, 33, 31, 22, 5, 2, 43, 7, 35, 24 };
    assertEquals(9, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case46() {
    int[] supervisors = { -1, 0 };
    assertEquals(1, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case47() {
    int[] supervisors = { -1, 0, 1, 0, 1, 0, 0, 4, 7, 0, 9, 7, 4, 8, 3, 13, 6, 10, 15, 16, 3, 10, 18, 20, 11, 22, 3, 9, 14, 13, 10, 28, 30, 32, 31, 14, 29, 36, 9, 5, 1, 30, 31, 35, 3, 0, 26, 8, 31, 5 };
    assertEquals(9, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case48() {
    int[] supervisors = { -1, 0, 1, 0, 3, 3, 2, 5, 5, 4, 5, 5, 0, 6, 2, 13, 0, 0, 11, 12, 14, 16, 13, 7, 9, 21, 8, 2, 14, 16, 15, 24, 19 };
    assertEquals(7, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case49() {
    int[] supervisors = { -1, 0, 0, 1, 3, 0, 0, 0, 2, 6, 3, 1, 9, 7, 9, 3, 9, 1, 0, 15, 14, 14 };
    assertEquals(6, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case50() {
    int[] supervisors = { -1, 0, 1, 2, 3, 2, 1, 5, 5, 5, 8, 6, 8, 3, 5, 3, 3, 15, 1, 7, 5, 6, 14, 8, 0, 16, 13, 14, 27, 8, 12, 6, 0, 30, 24, 11, 14, 32, 31, 31, 4, 21, 10, 14, 22, 28, 17, 35, 17 };
    assertEquals(9, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case51() {
    int[] supervisors = { -1, 0, 0, 2, 0, 0, 2, 1, 7, 6, 2, 9, 6, 12, 13, 6, 2, 5, 13, 17, 3, 1, 4, 16, 14, 5, 19, 21, 22, 4, 22, 12, 13, 11, 16, 15, 28, 23, 27, 4, 3, 38, 13, 42, 29, 33, 25, 37, 24, 40 };
    assertEquals(8, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case52() {
    int[] supervisors = { -1, 0, 1, 1, 2, 1, 1, 0, 6, 3, 6, 4, 4, 2, 1, 2, 1, 1, 1, 0, 17, 0, 5, 9, 13, 17 };
    assertEquals(9, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case53() {
    int[] supervisors = { -1, 0, 0, 2, 3, 0, 5, 0, 5, 8, 4 };
    assertEquals(4, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case54() {
    int[] supervisors = { -1, 0, 0, 0, 2, 2, 3, 2, 6, 5, 2 };
    assertEquals(5, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case55() {
    int[] supervisors = { -1, 0, 1, 2, 2, 1, 0, 0, 1, 0, 8, 9, 6, 1, 10, 13, 13, 2, 10, 8, 0, 2, 20, 17, 16, 20, 8, 13, 17, 24, 13, 18, 0, 31, 5, 23, 19, 19, 37, 2, 17, 40, 29, 23, 39, 30, 22, 22, 25, 11 };
    assertEquals(8, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case56() {
    int[] supervisors = { -1, 0, 1, 1, 0, 3, 1, 6, 0, 7, 8, 10, 4, 2, 3, 10, 14, 15, 4, 6, 4, 2, 6, 0, 13, 0, 14, 18 };
    assertEquals(6, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case57() {
    int[] supervisors = { -1, 0, 1, 1, 3, 2, 2, 4, 6, 6, 1, 5, 1, 5, 4, 7, 14, 3, 14, 3, 4, 1, 14, 12, 5, 8, 5, 19, 0, 15, 12, 20, 24, 28, 4, 15, 8, 22, 10, 29, 32, 35, 18, 27, 23, 39, 42, 17, 10, 28 };
    assertEquals(8, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case58() {
    int[] supervisors = { -1, 0, 0, 1, 0, 1, 0, 1, 1, 5, 1, 10, 10, 10, 9, 2, 10, 5, 3, 4, 3, 2, 21, 21, 7, 16, 6, 3, 12, 7, 22, 15, 23, 15, 4, 0, 24, 31, 27, 34, 31, 18, 41, 18, 41, 35, 39, 3, 23, 39 };
    assertEquals(7, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case59() {
    int[] supervisors = { -1, 0, 0, 1, 1, 1, 3, 1, 0, 1, 1, 2, 7, 8 };
    assertEquals(7, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case60() {
    int[] supervisors = { -1, 0, 1, 1, 0, 0, 1, 5, 7 };
    assertEquals(4, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case61() {
    int[] supervisors = { -1, 0, 0, 1, 2, 4, 5, 6, 0, 8, 1, 7, 7, 9, 5, 4, 9, 0, 13, 2, 12, 15, 21, 12, 2, 8, 22, 3, 9, 5, 29, 28, 7, 9, 8, 2, 13, 35, 12, 24, 34, 3, 31, 25, 35, 26, 22, 23, 0, 28 };
    assertEquals(9, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case62() {
    int[] supervisors = { -1, 0, 1, 2, 0, 2, 0, 6, 7, 7, 7, 10, 10, 10, 13, 11, 2, 0, 17, 4, 0, 17, 18, 17, 2, 16, 3, 19, 3, 8, 2, 20 };
    assertEquals(7, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case63() {
    int[] supervisors = { -1, 0, 1, 2, 1, 4, 1, 3, 0, 4, 4, 4, 3, 9, 10, 8, 4, 2, 8, 12, 4, 0, 12, 14, 13, 18, 13, 11, 7, 4, 3, 13, 31, 12, 28, 8, 17, 12, 2, 22, 37, 21, 6, 4, 33, 41, 17, 25, 13, 28 };
    assertEquals(10, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case64() {
    int[] supervisors = { -1, 0, 1, 0, 3, 2, 3, 3, 6, 3, 1, 2, 6, 7, 5, 1, 5, 16, 4, 6, 11, 10, 1, 15, 23, 7, 1, 26, 3, 19, 0, 24, 11, 32, 18, 7, 18, 10, 20, 4, 31, 19, 30, 36, 18, 9, 43, 5, 17, 42 };
    assertEquals(8, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case65() {
    int[] supervisors = { -1, 0, 0, 1, 1, 4, 4, 6, 3, 7, 5, 7, 3, 2, 9, 9, 14, 6, 15, 15, 11, 5, 16, 22, 2, 8, 19, 20, 21, 26, 23, 17, 11, 23, 22, 32, 21, 20, 13, 34, 18, 16, 14 };
    assertEquals(11, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case66() {
    int[] supervisors = { -1, 0, 0, 1, 2, 4, 4, 6, 5, 5, 9, 2, 9, 12, 1, 8, 6, 15, 17, 12, 19, 14, 15, 17, 10, 18, 23, 11, 19, 20, 24, 10, 25, 29, 14, 16, 32, 20, 25, 27, 32, 18, 30, 38 };
    assertEquals(11, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case67() {
    int[] supervisors = { -1, 0, 0, 2, 2, 1, 4, 1, 6, 3, 7, 7, 11, 11, 9, 5, 13, 13, 12 };
    assertEquals(6, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case68() {
    int[] supervisors = { -1, 0, 0, 1, 1, 3, 5, 2, 7, 4, 9, 3, 5, 7, 9, 2, 14, 6, 14, 17, 8, 15, 20, 19, 18, 13, 10, 8, 11, 16, 13, 19, 25, 10 };
    assertEquals(8, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case69() {
    int[] supervisors = { -1, 0, 0, 2, 3, 4, 1, 6, 7, 5, 8, 3, 5, 7, 13, 13, 2, 6, 12, 17, 18, 14, 9, 18, 10, 17, 25, 19, 19, 16, 21, 20, 10, 24, 30, 1, 26, 14, 31, 26, 11, 31, 4, 8, 15, 35, 27, 32, 9, 38 };
    assertEquals(10, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case70() {
    int[] supervisors = { -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals(49, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case71() {
    int[] supervisors = { -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48 };
    assertEquals(49, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case72() {
    int[] supervisors = { -1, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14 };
    assertEquals(8, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case73() {
    int[] supervisors = { -1, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 20, 20, 21, 21, 22, 22, 23, 23, 24 };
    assertEquals(9, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case74() {
    int[] supervisors = { -1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 10, 10, 11, 11, 13, 13, 13, 13, 13, 6, 6, 6, 6, 6, 6, 13 };
    assertEquals(9, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case75() {
    int[] supervisors = { -1, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 3, 3, 3, 4, 4, 5, 5, 5, 6, 2, 4, 5, 6, 2 };
    assertEquals(8, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case76() {
    int[] supervisors = { -1, 0, 0, 0, 2, 2, 5, 5, 1, 8, 9, 10, 11, 10, 13, 14 };
    assertEquals(7, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case77() {
    int[] supervisors = { -1, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 7, 8, 12, 13, 14, 16, 16, 16 };
    assertEquals(7, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case78() {
    int[] supervisors = { -1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 10, 10, 10, 15, 15, 15, 15, 16 };
    assertEquals(10, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case79() {
    int[] supervisors = { -1, 0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 6, 7, 7, 8, 8, 8, 9, 10, 10, 11, 11, 11, 12 };
    assertEquals(7, spreadingnews.minTime(supervisors));
  }

  @Test
  public void case80() {
    int[] supervisors = { -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 4, 2, 0, 11, 4, 4, 11, 11, 11, 18 };
    assertEquals(9, spreadingnews.minTime(supervisors));
  }

}
