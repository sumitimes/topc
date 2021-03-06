package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class MirrorPathTest {
  MirrorPath mirrorpath = new MirrorPath();

  @Test
  public void case1() {
    String[] map = { "#.#", "#.#", "#.#" };
    assertArrayEquals(new String[] { "#|#", "#|#", "#|#" }, mirrorpath.path(map));
  }

  @Test
  public void case2() {
    String[] map = { "############", "#######/....", "######//####", "#####//#####", "####//######", "..../#######", "############" };
    assertArrayEquals(new String[] { "############", "#######/----", "######//####", "#####//#####", "####//######", "----/#######", "############" }, mirrorpath.path(map));
  }

  @Test
  public void case3() {
    String[] map = { "##.#####", "##./`/`#", "#/..../#", "#`....`#", "##`/`/.#", "######.#" };
    assertArrayEquals(new String[] { 
        "##|#####", 
        "##|/`/`#", 
        "#/++++/#", 
        "#`++++`#", 
        "##`/`/|#", 
        "######|#" }, mirrorpath.path(map));
  }

  @Test
  public void case4() {
    String[] map = { "###", "...", "###" };
    assertArrayEquals(new String[] { "###", "---", "###" }, mirrorpath.path(map));
  }

  @Test
  public void case5() {
    String[] map = { "###", "#/.", "#`.", "###" };
    assertArrayEquals(new String[] { "###", "#/-", "#`-", "###" }, mirrorpath.path(map));
  }

  @Test
  public void case6() {
    String[] map = { "#######", "##/..`#", "##.##.#", "##.##.#", "...../#", "##.####", "##.####" };
    assertArrayEquals(new String[] { "#######", "##/--`#", "##|##|#", "##|##|#", "--+--/#", "##|####", "##|####" }, mirrorpath.path(map));
  }

  @Test
  public void case7() {
    String[] map = { "###########.#", "#/........./.", "#.#########.#", "#`........./#", "#############" };
    assertArrayEquals(new String[] { "###########|#", "#/---------/-", "#|#########|#", "#`---------/#", "#############" }, mirrorpath.path(map));
  }

  @Test
  public void case8() {
    String[] map = { "########.##", "#./......`#", "#../.`....#", "#.`...../.#", "#....`.../#", "###.#######" };
    assertArrayEquals(new String[] { "########|##", "#./-----+`#", "#.|/-`..||#", "#.`+-+--/|#", "#..|.`---/#", "###|#######" }, mirrorpath.path(map));
  }

  @Test
  public void case9() {
    String[] map = { "##################################################", "#.........../.........`....................../..`#", "#..../........................................../#", "#............................................`..`#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#./.................../............`.............#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#.`../................`........................./#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#.....................`............/.............#", "#....`............................................", "#................................................#", "#................................................#", "############.#####################################" };
    assertArrayEquals(new String[] { "##################################################", "#.........../---------`....................../--`#", "#..../------+---------+----------------------+--/#", "#....|......|.........|......................`--`#", "#....|......|.........|.........................|#", "#....|......|.........|.........................|#", "#....|......|.........|.........................|#", "#....|......|.........|.........................|#", "#....|......|.........|.........................|#", "#....|......|.........|.........................|#", "#....|......|.........|.........................|#", "#....|......|.........|.........................|#", "#....|......|.........|.........................|#", "#....|......|.........|.........................|#", "#....|......|.........|.........................|#", "#....|......|.........|.........................|#", "#....|......|.........|.........................|#", "#....|......|.........|.........................|#", "#....|......|.........|.........................|#", "#....|......|.........|.........................|#", "#....|......|.........|.........................|#", "#....|......|.........|.........................|#", "#./--+------+---------/------------`............|#", "#.|..|......|.........|............|............|#", "#.|..|......|.........|............|............|#", "#.|..|......|.........|............|............|#", "#.|..|......|.........|............|............|#", "#.`--/------+---------`------------+------------/#", "#....|......|.........|............|.............#", "#....|......|.........|............|.............#", "#....|......|.........|............|.............#", "#....|......|.........|............|.............#", "#....|......|.........|............|.............#", "#....|......|.........|............|.............#", "#....|......|.........|............|.............#", "#....|......|.........|............|.............#", "#....|......|.........|............|.............#", "#....|......|.........|............|.............#", "#....|......|.........|............|.............#", "#....|......|.........|............|.............#", "#....|......|.........|............|.............#", "#....|......|.........|............|.............#", "#....|......|.........|............|.............#", "#....|......|.........|............|.............#", "#....|......|.........|............|.............#", "#....|......|.........`------------/.............#", "#....`------+-------------------------------------", "#...........|....................................#", "#...........|....................................#", "############|#####################################" }, mirrorpath.path(map));
  }

  @Test
  public void case10() {
    String[] map = { "##################################################", "#./`../`../`../`../`../`../`../`../`../`../`../`.#", "#/..`/..`/..`/..`/..`/..`/..`/..`/..`/..`/..`/./.#", "#`.............................................`.#", "#.`.............................................`#", "#./............................................./#", "#/............................................./.#", "#`.............................................`.#", "#.`.............................................`#", "#./............................................./#", "#/............................................./.#", "#`.............................................`.#", "#.`.............................................`#", "#./............................................./#", "#/............................................./.#", "#`.............................................`.#", "#.`.............................................`#", "#./............................................./#", "#/............................................./.#", "#`.............................................`.#", "#.`.............................................`#", "#./............................................./#", "#/............................................./.#", "#`.............................................`.#", "#.`.............................................`#", "#./............................................./#", "#/............................................./.#", "#`.............................................`.#", "#.`.............................................`#", "#./............................................./#", "#/............................................./.#", "#`.............................................`.#", "#.`.............................................`#", "#./............................................./#", "#/............................................./.#", "#`.............................................`.#", "#.`.............................................`#", "#./............................................./#", "#/............................................./.#", "#`.............................................`.#", "#.`.............................................`#", "#./............................................./#", "#/............................................./.#", "#`.............................................`.#", "#.`.............................................`#", "................................................/#", ".............................................../.#", "#./.../`../`../`../`../`../`../`../`../`../`...`.#", "#.`/`/..`/..`/..`/..`/..`/..`/..`/..`/..`/..`/`/.#", "##################################################" };
    assertArrayEquals(new String[] { "##################################################", "#./`../`../`../`../`../`../`../`../`../`../`../`.#", "#/++`/++`/++`/++`/++`/++`/++`/++`/++`/++`/++`/+/.#", "#`+++++++++++++++++++++++++++++++++++++++++++++`.#", "#.`+++++++++++++++++++++++++++++++++++++++++++++`#", "#./+++++++++++++++++++++++++++++++++++++++++++++/#", "#/+++++++++++++++++++++++++++++++++++++++++++++/.#", "#`+++++++++++++++++++++++++++++++++++++++++++++`.#", "#.`+++++++++++++++++++++++++++++++++++++++++++++`#", "#./+++++++++++++++++++++++++++++++++++++++++++++/#", "#/+++++++++++++++++++++++++++++++++++++++++++++/.#", "#`+++++++++++++++++++++++++++++++++++++++++++++`.#", "#.`+++++++++++++++++++++++++++++++++++++++++++++`#", "#./+++++++++++++++++++++++++++++++++++++++++++++/#", "#/+++++++++++++++++++++++++++++++++++++++++++++/.#", "#`+++++++++++++++++++++++++++++++++++++++++++++`.#", "#.`+++++++++++++++++++++++++++++++++++++++++++++`#", "#./+++++++++++++++++++++++++++++++++++++++++++++/#", "#/+++++++++++++++++++++++++++++++++++++++++++++/.#", "#`+++++++++++++++++++++++++++++++++++++++++++++`.#", "#.`+++++++++++++++++++++++++++++++++++++++++++++`#", "#./+++++++++++++++++++++++++++++++++++++++++++++/#", "#/+++++++++++++++++++++++++++++++++++++++++++++/.#", "#`+++++++++++++++++++++++++++++++++++++++++++++`.#", "#.`+++++++++++++++++++++++++++++++++++++++++++++`#", "#./+++++++++++++++++++++++++++++++++++++++++++++/#", "#/+++++++++++++++++++++++++++++++++++++++++++++/.#", "#`+++++++++++++++++++++++++++++++++++++++++++++`.#", "#.`+++++++++++++++++++++++++++++++++++++++++++++`#", "#./+++++++++++++++++++++++++++++++++++++++++++++/#", "#/+++++++++++++++++++++++++++++++++++++++++++++/.#", "#`+++++++++++++++++++++++++++++++++++++++++++++`.#", "#.`+++++++++++++++++++++++++++++++++++++++++++++`#", "#./+++++++++++++++++++++++++++++++++++++++++++++/#", "#/+++++++++++++++++++++++++++++++++++++++++++++/.#", "#`+++++++++++++++++++++++++++++++++++++++++++++`.#", "#.`+++++++++++++++++++++++++++++++++++++++++++++`#", "#./+++++++++++++++++++++++++++++++++++++++++++++/#", "#/+++++++++++++++++++++++++++++++++++++++++++++/.#", "#`+++++++++++++++++++++++++++++++++++++++++++++`.#", "#.`+++++++++++++++++++++++++++++++++++++++++++++`#", "#./+++++++++++++++++++++++++++++++++++++++++++++/#", "#/+++++++++++++++++++++++++++++++++++++++++++++/.#", "#`+++++++++++++++++++++++++++++++++++++++++++++`.#", "#.`+++++++++++++++++++++++++++++++++++++++++++++`#", "---+++++++++++++++++++++++++++++++++++++++++++++/#", "---++++++++++++++++++++++++++++++++++++++++++++/.#", "#./+++/`++/`++/`++/`++/`++/`++/`++/`++/`++/`+++`.#", "#.`/`/..`/..`/..`/..`/..`/..`/..`/..`/..`/..`/`/.#", "##################################################" }, mirrorpath.path(map));
  }

  @Test
  public void case11() {
    String[] map = { "##########################", "..........................", "##########################" };
    assertArrayEquals(new String[] { "##########################", "--------------------------", "##########################" }, mirrorpath.path(map));
  }

  @Test
  public void case12() {
    String[] map = { "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#", "#.#" };
    assertArrayEquals(new String[] { "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#", "#|#" }, mirrorpath.path(map));
  }

  @Test
  public void case13() {
    String[] map = { "###.#", "#/./#", "#`.`#", "#/./#", "#`.`#", "#/./#", "#`.`#", "#/./#", "#`.`#", "#/./#", "#`.`#", "#/./#", "#.###" };
    assertArrayEquals(new String[] { "###|#", "#/-/#", "#`-`#", "#/-/#", "#`-`#", "#/-/#", "#`-`#", "#/-/#", "#`-`#", "#/-/#", "#`-`#", "#/-/#", "#|###" }, mirrorpath.path(map));
  }

  @Test
  public void case14() {
    String[] map = { "##.########", "#.........#", "..`.`.....#", "#..`......#", "#.`.`.`...#", "#....`....#", "#...`.`.`.#", "#.........#", "#.....`./.#", "#.........#", "###########" };
    assertArrayEquals(new String[] { "##|########", "#.|.......#", "--`-`.....#", "#.|`|.....#", "#.`-`-`...#", "#...|`|...#", "#...`-`-`.#", "#.....|.|.#", "#.....`-/.#", "#.........#", "###########" }, mirrorpath.path(map));
  }

  @Test
  public void case15() {
    String[] map = { "##################################################", "...............................................`.#", "................................................`#", "#./...........................................`..#", "#/...........................................`...#", "#../........................................`....#", "#.../......................................./....#", "#................................................#", "#................................................#", "#................................................#", "#........../.....................................#", "#........................./......................#", "#................................................#", "#...................../..........................#", "#.......`........................................#", "#..................................`.............#", "#.................`..............................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#.............../................................#", "#..................................`.............#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#................................................#", "#...`......................................../...#", "#..`........................................../..#", "#`............................................../#", "#.`............................................/.#", "##################################################" };
    assertArrayEquals(new String[] { "##################################################", "-----------------------------------------------`.#", "-----------------------------------------------+`#", "#./-------------------------------------------`||#", "#/+------------------------------------------`|||#", "#||/----------------------------------------`||||#", "#|||/---------------------------------------/||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||....../.................................||||#", "#||||...................../..................||||#", "#||||........................................||||#", "#||||................./......................||||#", "#||||...`....................................||||#", "#||||..............................`.........||||#", "#||||.............`..........................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||.........../............................||||#", "#||||..............................`.........||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#||||........................................||||#", "#|||`----------------------------------------/|||#", "#||`------------------------------------------/||#", "#`+--------------------------------------------+/#", "#.`--------------------------------------------/.#", "##################################################" }, mirrorpath.path(map));
  }

  @Test
  public void case16() {
    String[] map = { "##.########", "#.........#", "..`.`.....#", "#..`......#", "#.`.`.`...#", "#....`....#", "#...`.`.`.#", "#.........#", "#.....`./.#", "#.........#", "###########" };
    assertArrayEquals(new String[] { "##|########", "#.|.......#", "--`-`.....#", "#.|`|.....#", "#.`-`-`...#", "#...|`|...#", "#...`-`-`.#", "#.....|.|.#", "#.....`-/.#", "#.........#", "###########" }, mirrorpath.path(map));
  }

  @Test
  public void case17() {
    String[] map = { "########.##", "#./......`#", "#../.`....#", "#.`...../.#", "#....`.../#", "###.#######" };
    assertArrayEquals(new String[] { "########|##", "#./-----+`#", "#.|/-`..||#", "#.`+-+--/|#", "#..|.`---/#", "###|#######" }, mirrorpath.path(map));
  }

}
