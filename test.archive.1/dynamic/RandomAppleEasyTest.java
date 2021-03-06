package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class RandomAppleEasyTest {
  double DELTA = 1.0e-09;
  RandomAppleEasy randomappleeasy = new RandomAppleEasy();

  @Test
  public void case1() {
    int[] red = { 5 };
    int[] green = { 8 };
    assertEquals(0.38461538461538464, randomappleeasy.theRed(red, green), DELTA * 0.38461538461538464);
  }

  @Test
  public void case2() {
    int[] red = { 1, 2 };
    int[] green = { 1, 1 };
    assertEquals(0.5888888888888888, randomappleeasy.theRed(red, green), DELTA * 0.5888888888888888);
  }

  @Test
  public void case3() {
    int[] red = { 2, 5, 6, 4, 9, 10, 6, 2 };
    int[] green = { 2, 5, 6, 4, 9, 10, 6, 2 };
    assertEquals(0.4999999999999999, randomappleeasy.theRed(red, green), DELTA * 0.4999999999999999);
  }

  @Test
  public void case4() {
    int[] red = { 2, 5, 6, 4, 9, 10, 6, 2 };
    int[] green = { 6, 7, 4, 5, 3, 2, 9, 1 };
    assertEquals(0.5429014970733334, randomappleeasy.theRed(red, green), DELTA * 0.5429014970733334);
  }

  @Test
  public void case5() {
    int[] red = { 5, 1, 2, 8, 4, 1, 1, 2, 3, 4, 5, 2, 10, 2, 6, 2, 8, 7, 9, 3 };
    int[] green = { 4, 7, 1, 1, 10, 3, 4, 1, 6, 2, 7, 6, 10, 5, 2, 9, 3, 8, 1, 8 };
    assertEquals(0.46460213827476854, randomappleeasy.theRed(red, green), DELTA * 0.46460213827476854);
  }

  @Test
  public void case6() {
    int[] red = { 5, 1, 2, 8, 4, 1, 1, 2, 3, 4, 5, 2, 10, 2, 6, 2, 8, 7, 9, 3, 4, 7, 1, 1, 10, 3, 4, 1, 6, 2, 7, 6, 10, 5, 2, 9, 3, 8, 1, 8, 8, 5, 7, 5, 10, 7, 4, 4, 9, 8 };
    int[] green = { 2, 7, 3, 2, 2, 6, 1, 10, 3, 9, 2, 7, 5, 4, 7, 3, 3, 2, 9, 2, 9, 5, 8, 4, 1, 1, 1, 2, 2, 6, 9, 10, 10, 10, 1, 6, 1, 5, 2, 10, 8, 6, 7, 4, 9, 5, 2, 1, 6, 3 };
    assertEquals(0.5072370758536262, randomappleeasy.theRed(red, green), DELTA * 0.5072370758536262);
  }

  @Test
  public void case7() {
    int[] red = { 6, 10, 5, 1, 8, 10, 1, 8, 9, 2, 3, 4, 3, 3, 3, 6, 7, 4, 10, 8, 8, 9, 10, 2, 4, 7, 6, 4, 8, 2, 3, 8, 5, 5, 1, 3, 10, 3, 2, 7, 10, 3, 7, 3, 10, 4, 7, 10, 3, 7 };
    int[] green = { 7, 10, 2, 9, 3, 9, 3, 6, 3, 10, 6, 6, 8, 2, 6, 8, 2, 7, 7, 8, 1, 7, 7, 8, 6, 5, 7, 6, 2, 7, 6, 10, 4, 8, 7, 9, 3, 9, 8, 1, 1, 6, 7, 7, 10, 8, 5, 3, 6, 2 };
    assertEquals(0.48605724542918993, randomappleeasy.theRed(red, green), DELTA * 0.48605724542918993);
  }

  @Test
  public void case8() {
    int[] red = { 9, 4, 7, 4, 8, 4, 3, 5, 2, 10, 10, 3, 10, 8, 1, 3, 8, 5, 10, 2, 6, 6, 5, 3, 7, 4, 4, 9, 3, 1, 7, 5, 7, 6, 9, 8, 8, 8, 9, 1, 6, 3, 7, 1, 2, 5, 2, 6, 10, 4 };
    int[] green = { 5, 7, 6, 1, 4, 10, 3, 1, 8, 1, 5, 9, 1, 4, 4, 6, 9, 1, 7, 1, 6, 2, 8, 5, 3, 6, 4, 5, 9, 2, 7, 10, 7, 9, 2, 4, 4, 1, 10, 8, 9, 4, 7, 7, 1, 9, 3, 1, 9, 4 };
    assertEquals(0.5178352708850019, randomappleeasy.theRed(red, green), DELTA * 0.5178352708850019);
  }

  @Test
  public void case9() {
    int[] red = { 5, 8, 1, 7, 6, 5, 10, 10, 8, 1, 6, 10, 2, 4, 10, 9, 8, 5, 3, 9, 10, 6, 6, 9, 10, 5, 10, 7, 7, 4, 3, 6, 3, 5, 8, 2, 1, 2, 5, 8, 1, 9, 6, 6, 4, 9, 6, 1, 8, 3 };
    int[] green = { 10, 4, 10, 7, 6, 4, 4, 4, 3, 4, 4, 6, 2, 1, 8, 4, 3, 9, 2, 9, 5, 7, 7, 4, 10, 8, 2, 3, 1, 9, 7, 10, 9, 4, 5, 9, 7, 4, 4, 9, 7, 5, 10, 5, 2, 9, 1, 5, 8, 2 };
    assertEquals(0.5129452414945551, randomappleeasy.theRed(red, green), DELTA * 0.5129452414945551);
  }

  @Test
  public void case10() {
    int[] red = { 9, 4, 9, 8, 7, 4, 7, 8, 1, 3, 4, 8, 6, 4, 5, 1, 4, 2, 10, 5, 10, 5, 5, 3, 8, 10, 6, 6, 3, 5, 6, 5, 2, 9, 2, 1, 8, 2, 10, 8, 2, 3, 7, 1, 1, 6, 5, 1, 8, 10 };
    int[] green = { 7, 6, 4, 1, 9, 5, 7, 7, 2, 3, 6, 3, 6, 8, 5, 2, 6, 9, 4, 8, 4, 8, 4, 8, 6, 10, 10, 1, 4, 2, 7, 2, 6, 4, 1, 7, 7, 7, 7, 1, 2, 1, 4, 3, 1, 7, 9, 9, 1, 1 };
    assertEquals(0.5144483442732466, randomappleeasy.theRed(red, green), DELTA * 0.5144483442732466);
  }

  @Test
  public void case11() {
    int[] red = { 9, 8, 8, 9, 3, 8, 8, 7, 9, 9, 1, 10, 4, 9, 7, 6, 8, 1, 4, 1, 1, 7, 10, 1, 2, 10, 5, 9, 9, 3, 4, 10, 2, 4, 4, 2, 7, 9, 5, 1, 8, 4, 3, 5, 10, 6, 10, 4, 8, 10 };
    int[] green = { 4, 2, 3, 3, 7, 5, 10, 1, 4, 1, 7, 2, 2, 10, 10, 4, 9, 7, 4, 1, 1, 10, 3, 2, 6, 9, 9, 5, 10, 8, 3, 1, 6, 1, 3, 9, 7, 6, 2, 10, 10, 7, 6, 3, 10, 5, 6, 7, 10, 5 };
    assertEquals(0.5225818608097335, randomappleeasy.theRed(red, green), DELTA * 0.5225818608097335);
  }

  @Test
  public void case12() {
    int[] red = { 9, 9, 5, 9, 9, 5, 9, 8, 5, 1, 6, 4, 5, 4, 2, 6, 9, 10, 5, 9, 10, 1, 8, 8, 3, 7, 10, 3, 1, 4, 2, 4, 3, 3, 2, 7, 3, 2, 8, 4, 3, 9, 7, 7, 4, 1, 1, 10, 10, 5 };
    int[] green = { 10, 3, 4, 1, 6, 3, 1, 6, 7, 5, 1, 9, 9, 5, 6, 5, 9, 6, 10, 10, 1, 7, 10, 6, 7, 8, 7, 1, 8, 1, 9, 9, 10, 8, 2, 3, 10, 4, 3, 8, 9, 3, 9, 7, 8, 9, 4, 6, 3, 9 };
    assertEquals(0.47769043789224547, randomappleeasy.theRed(red, green), DELTA * 0.47769043789224547);
  }

  @Test
  public void case13() {
    int[] red = { 8, 9, 3, 1, 2, 7, 4, 4, 4, 6, 1, 6, 9, 1, 3, 6, 2, 2, 8, 3, 9, 7, 1, 7, 7, 4, 10, 4, 8, 4, 7, 5, 5, 8, 1, 7, 5, 2, 9, 7, 10, 7, 7, 1, 7, 1, 4, 4, 7, 3 };
    int[] green = { 3, 2, 10, 4, 8, 10, 3, 6, 9, 2, 5, 1, 2, 4, 7, 6, 10, 6, 10, 7, 6, 10, 3, 4, 6, 7, 4, 6, 10, 5, 6, 4, 3, 8, 6, 2, 9, 5, 6, 3, 3, 2, 5, 8, 1, 8, 10, 6, 5, 2 };
    assertEquals(0.48032358025892197, randomappleeasy.theRed(red, green), DELTA * 0.48032358025892197);
  }

  @Test
  public void case14() {
    int[] red = { 1, 5, 1, 7, 6, 2, 8, 1, 6, 10, 5, 3, 10, 2, 6, 8, 10, 10, 6, 7, 5, 3, 3, 10, 3, 6, 10, 8, 9, 7, 8, 2, 4, 6, 9, 10, 3, 2, 2, 5, 6, 4, 1, 8, 8, 1, 8, 7, 8, 4 };
    int[] green = { 6, 10, 9, 2, 4, 3, 3, 4, 8, 8, 6, 7, 4, 7, 10, 6, 9, 1, 7, 10, 10, 7, 3, 6, 4, 8, 6, 10, 9, 6, 8, 6, 3, 10, 6, 6, 10, 6, 9, 2, 2, 8, 7, 4, 10, 6, 5, 1, 10, 5 };
    assertEquals(0.4723755998839298, randomappleeasy.theRed(red, green), DELTA * 0.4723755998839298);
  }

  @Test
  public void case15() {
    int[] red = { 6, 8, 6, 9, 5, 10, 9, 1, 1, 10, 4, 6, 1, 6, 9, 3, 6, 9, 7, 10, 6, 5, 8, 8, 4, 7, 9, 5, 3, 10, 5, 8, 10, 2, 1, 5, 4, 2, 6, 6, 9, 10, 4, 5, 6, 6, 3, 5, 4, 2 };
    int[] green = { 4, 9, 6, 10, 10, 5, 7, 5, 7, 9, 7, 9, 9, 1, 4, 3, 7, 7, 10, 2, 6, 9, 4, 9, 3, 10, 2, 5, 7, 2, 10, 6, 2, 1, 8, 8, 8, 5, 9, 2, 9, 6, 7, 5, 7, 1, 10, 4, 8, 2 };
    assertEquals(0.4900258811893775, randomappleeasy.theRed(red, green), DELTA * 0.4900258811893775);
  }

  @Test
  public void case16() {
    int[] red = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    int[] green = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    assertEquals(0.5000000000000001, randomappleeasy.theRed(red, green), DELTA * 0.5000000000000001);
  }

  @Test
  public void case17() {
    int[] red = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    int[] green = { 2, 8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3, 4, 4, 5, 2, 2, 4, 9 };
    assertEquals(0.6600647147059199, randomappleeasy.theRed(red, green), DELTA * 0.6600647147059199);
  }

  @Test
  public void case18() {
    int[] red = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    int[] green = { 8, 5, 3, 8, 8, 10, 4, 2, 10, 9, 7, 6, 1, 3, 9, 7, 1, 3, 5, 9, 7, 6, 1, 10, 1, 1, 7, 2, 4, 9, 10, 4, 5, 5, 7, 1, 7, 7, 2, 9, 5, 10, 7, 4, 8, 9, 9, 3, 10, 2 };
    assertEquals(0.6334003246104043, randomappleeasy.theRed(red, green), DELTA * 0.6334003246104043);
  }

  @Test
  public void case19() {
    int[] red = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    int[] green = { 4, 6, 10, 9, 5, 1, 8, 7, 4, 7, 2, 6, 5, 3, 1, 10, 8, 4, 8, 3, 7, 1, 2, 7, 6, 8, 6, 5, 2, 3, 1, 1, 2, 5, 7, 1, 8, 2, 8, 8, 8, 8, 4, 4, 6, 10, 10, 9, 2, 9 };
    assertEquals(0.6489879942885978, randomappleeasy.theRed(red, green), DELTA * 0.6489879942885978);
  }

  @Test
  public void case20() {
    int[] red = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    int[] green = { 3, 7, 7, 1, 4, 9, 1, 2, 3, 6, 1, 10, 5, 8, 9, 4, 6, 2, 3, 1, 2, 7, 5, 1, 7, 2, 9, 10, 9, 5, 2, 5, 4, 10, 9, 9, 1, 9, 8, 8, 9, 4, 9, 4, 8, 2, 1, 8, 4, 5 };
    assertEquals(0.6515827362758583, randomappleeasy.theRed(red, green), DELTA * 0.6515827362758583);
  }

  @Test
  public void case21() {
    int[] red = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    int[] green = { 10, 7, 6, 2, 1, 10, 10, 7, 9, 4, 5, 9, 5, 10, 10, 3, 6, 6, 4, 4, 4, 8, 5, 4, 9, 1, 9, 9, 1, 7, 9, 2, 10, 9, 10, 8, 3, 3, 9, 3, 9, 10, 1, 8, 9, 2, 6, 9, 7, 2 };
    assertEquals(0.6147075184473111, randomappleeasy.theRed(red, green), DELTA * 0.6147075184473111);
  }

  @Test
  public void case22() {
    int[] red = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    int[] green = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(0.9090909090909088, randomappleeasy.theRed(red, green), DELTA * 0.9090909090909088);
  }

  @Test
  public void case23() {
    int[] red = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] green = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    assertEquals(0.09090909090909087, randomappleeasy.theRed(red, green), DELTA * 0.09090909090909087);
  }

  @Test
  public void case24() {
    int[] red = { 2, 8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3, 4, 4, 5, 2, 2, 4, 9 };
    int[] green = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    assertEquals(0.3399352852940808, randomappleeasy.theRed(red, green), DELTA * 0.3399352852940808);
  }

  @Test
  public void case25() {
    int[] red = { 8, 5, 3, 8, 8, 10, 4, 2, 10, 9, 7, 6, 1, 3, 9, 7, 1, 3, 5, 9, 7, 6, 1, 10, 1, 1, 7, 2, 4, 9, 10, 4, 5, 5, 7, 1, 7, 7, 2, 9, 5, 10, 7, 4, 8, 9, 9, 3, 10, 2 };
    int[] green = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    assertEquals(0.36659967538959487, randomappleeasy.theRed(red, green), DELTA * 0.36659967538959487);
  }

  @Test
  public void case26() {
    int[] red = { 4, 6, 10, 9, 5, 1, 8, 7, 4, 7, 2, 6, 5, 3, 1, 10, 8, 4, 8, 3, 7, 1, 2, 7, 6, 8, 6, 5, 2, 3, 1, 1, 2, 5, 7, 1, 8, 2, 8, 8, 8, 8, 4, 4, 6, 10, 10, 9, 2, 9 };
    int[] green = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    assertEquals(0.35101200571140295, randomappleeasy.theRed(red, green), DELTA * 0.35101200571140295);
  }

  @Test
  public void case27() {
    int[] red = { 3, 7, 7, 1, 4, 9, 1, 2, 3, 6, 1, 10, 5, 8, 9, 4, 6, 2, 3, 1, 2, 7, 5, 1, 7, 2, 9, 10, 9, 5, 2, 5, 4, 10, 9, 9, 1, 9, 8, 8, 9, 4, 9, 4, 8, 2, 1, 8, 4, 5 };
    int[] green = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    assertEquals(0.3484172637241423, randomappleeasy.theRed(red, green), DELTA * 0.3484172637241423);
  }

  @Test
  public void case28() {
    int[] red = { 10, 7, 6, 2, 1, 10, 10, 7, 9, 4, 5, 9, 5, 10, 10, 3, 6, 6, 4, 4, 4, 8, 5, 4, 9, 1, 9, 9, 1, 7, 9, 2, 10, 9, 10, 8, 3, 3, 9, 3, 9, 10, 1, 8, 9, 2, 6, 9, 7, 2 };
    int[] green = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    assertEquals(0.3852924815526904, randomappleeasy.theRed(red, green), DELTA * 0.3852924815526904);
  }

  @Test
  public void case29() {
    int[] red = { 1 };
    int[] green = { 10 };
    assertEquals(0.09090909090909091, randomappleeasy.theRed(red, green), DELTA * 0.09090909090909091);
  }

  @Test
  public void case30() {
    int[] red = { 10 };
    int[] green = { 1 };
    assertEquals(0.9090909090909091, randomappleeasy.theRed(red, green), DELTA * 0.9090909090909091);
  }

  @Test
  public void case31() {
    int[] red = { 1 };
    int[] green = { 1 };
    assertEquals(0.5, randomappleeasy.theRed(red, green), DELTA * 0.5);
  }

  @Test
  public void case32() {
    int[] red = { 4, 4 };
    int[] green = { 8, 2 };
    assertEquals(0.48148148148148145, randomappleeasy.theRed(red, green), DELTA * 0.48148148148148145);
  }

  @Test
  public void case33() {
    int[] red = { 8, 4, 4 };
    int[] green = { 9, 7, 5 };
    assertEquals(0.4287444808453212, randomappleeasy.theRed(red, green), DELTA * 0.4287444808453212);
  }

  @Test
  public void case34() {
    int[] red = { 5, 10, 4, 1 };
    int[] green = { 1, 10, 9, 5 };
    assertEquals(0.44566774356248046, randomappleeasy.theRed(red, green), DELTA * 0.44566774356248046);
  }

  @Test
  public void case35() {
    int[] red = { 4, 10, 6, 4, 4 };
    int[] green = { 5, 10, 2, 3, 5 };
    assertEquals(0.5335477129559417, randomappleeasy.theRed(red, green), DELTA * 0.5335477129559417);
  }

  @Test
  public void case36() {
    int[] red = { 2, 8, 3, 7, 1, 3 };
    int[] green = { 2, 1, 10, 4, 5, 6 };
    assertEquals(0.46248262975750154, randomappleeasy.theRed(red, green), DELTA * 0.46248262975750154);
  }

  @Test
  public void case37() {
    int[] red = { 3, 3, 7, 3, 9, 7, 2 };
    int[] green = { 7, 8, 10, 2, 3, 5, 2 };
    assertEquals(0.48062182146563864, randomappleeasy.theRed(red, green), DELTA * 0.48062182146563864);
  }

  @Test
  public void case38() {
    int[] red = { 8, 2, 2, 10, 9, 2, 2, 10 };
    int[] green = { 2, 8, 10, 9, 5, 2, 2, 5 };
    assertEquals(0.5085180573898116, randomappleeasy.theRed(red, green), DELTA * 0.5085180573898116);
  }

  @Test
  public void case39() {
    int[] red = { 7, 5, 8, 7, 10, 1, 4, 2, 5 };
    int[] green = { 6, 1, 8, 6, 7, 2, 1, 8, 2 };
    assertEquals(0.5471841651621961, randomappleeasy.theRed(red, green), DELTA * 0.5471841651621961);
  }

  @Test
  public void case40() {
    int[] red = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] green = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(0.5, randomappleeasy.theRed(red, green), DELTA * 0.5);
  }

  @Test
  public void case41() {
    int[] red = { 7, 7, 7, 10, 10, 7, 7, 8, 10, 9, 7, 10, 8, 9, 7, 7, 6, 9, 9, 10, 6, 6, 6, 6, 10, 10, 6, 8, 7, 7, 9, 9, 9, 9, 8, 10, 9, 9, 7, 8, 10, 7, 9, 9, 6, 9, 8, 10, 7, 7 };
    int[] green = { 6, 6, 8, 10, 8, 10, 9, 10, 6, 8, 7, 10, 9, 10, 6, 8, 8, 6, 9, 9, 8, 9, 7, 9, 8, 6, 10, 8, 8, 10, 9, 7, 10, 7, 7, 10, 9, 9, 7, 9, 7, 9, 8, 10, 7, 10, 7, 7, 10, 8 };
    assertEquals(0.4951046340219333, randomappleeasy.theRed(red, green), DELTA * 0.4951046340219333);
  }

  @Test
  public void case42() {
    int[] red = { 6, 10, 9, 7, 6, 6, 9, 6, 7, 10, 9, 10, 9, 6, 7, 8, 9, 9, 6, 8, 9, 9, 7, 8, 7, 7, 9, 10, 10, 7, 10, 9, 7, 8, 9, 8, 9, 10, 7, 10, 6, 6, 8, 6, 6, 6, 9, 6, 9, 8 };
    int[] green = { 10, 7, 7, 6, 9, 6, 6, 10, 6, 8, 7, 8, 8, 8, 8, 7, 6, 8, 9, 9, 10, 7, 8, 9, 10, 10, 6, 8, 7, 7, 9, 6, 10, 9, 9, 8, 7, 7, 9, 10, 10, 7, 8, 8, 10, 7, 9, 9, 6, 8 };
    assertEquals(0.4974815816662419, randomappleeasy.theRed(red, green), DELTA * 0.4974815816662419);
  }

  @Test
  public void case43() {
    int[] red = { 6, 10, 10, 10, 10, 8, 10, 9, 7, 6, 9, 6, 10, 6, 10, 9, 6, 8, 7, 8, 6, 6, 8, 6, 10, 9, 9, 7, 6, 7, 7, 8, 10, 7, 6, 7, 8, 9, 8, 7, 10, 8, 7, 9, 6, 6, 10, 10, 8, 9 };
    int[] green = { 9, 8, 6, 7, 6, 7, 7, 6, 6, 6, 8, 7, 6, 10, 7, 7, 8, 9, 10, 9, 9, 10, 9, 9, 8, 10, 7, 10, 9, 10, 9, 10, 6, 10, 9, 8, 9, 9, 9, 7, 6, 7, 6, 6, 8, 7, 6, 9, 8, 10 };
    assertEquals(0.4999916360212732, randomappleeasy.theRed(red, green), DELTA * 0.4999916360212732);
  }

  @Test
  public void case44() {
    int[] red = { 10, 10, 8, 8, 10, 6, 6, 8, 8, 8, 7, 10, 9, 9, 9, 7, 8, 10, 8, 10, 9, 8, 6, 8, 7, 6, 6, 10, 10, 10, 9, 8, 6, 8, 10, 7, 7, 8, 9, 8, 6, 6, 10, 10, 9, 9, 7, 8, 10, 7 };
    int[] green = { 9, 6, 9, 6, 7, 8, 6, 8, 6, 8, 8, 10, 8, 6, 6, 9, 6, 6, 6, 7, 6, 8, 9, 6, 6, 6, 10, 7, 9, 8, 8, 7, 10, 10, 9, 9, 10, 10, 7, 10, 9, 9, 7, 7, 8, 9, 9, 8, 9, 8 };
    assertEquals(0.5111980890585633, randomappleeasy.theRed(red, green), DELTA * 0.5111980890585633);
  }

  @Test
  public void case45() {
    int[] red = { 9, 9, 10, 8, 8, 8, 10, 6, 6, 7, 9, 6, 10, 10, 10, 9, 10, 9, 9, 7, 10, 9, 10, 10, 9, 7, 7, 7, 6, 7, 6, 7, 8, 9, 10, 6, 7, 9, 7, 8, 8, 9, 6, 7, 9, 9, 7, 6, 8, 8 };
    int[] green = { 7, 6, 9, 7, 10, 8, 10, 10, 10, 6, 10, 7, 7, 10, 8, 9, 9, 10, 6, 6, 9, 7, 9, 10, 6, 7, 9, 8, 6, 9, 6, 9, 8, 10, 6, 7, 8, 8, 7, 8, 7, 9, 6, 8, 9, 7, 7, 7, 9, 9 };
    assertEquals(0.5037241813708578, randomappleeasy.theRed(red, green), DELTA * 0.5037241813708578);
  }

  @Test
  public void case46() {
    int[] red = { 9, 8, 8, 9, 9, 8, 9, 10, 8, 9, 9, 8, 10, 10, 8, 10, 8, 8, 9, 9, 9, 9, 9, 10, 9, 9, 10, 8, 9, 8, 9, 8, 8, 10, 8, 10, 9, 10, 9, 8, 10, 10, 8, 8, 9, 8, 9, 9, 9, 8 };
    int[] green = { 2, 2, 3, 1, 1, 3, 3, 3, 3, 3, 1, 1, 1, 2, 2, 3, 3, 3, 2, 2, 1, 3, 3, 2, 3, 1, 1, 2, 2, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 2, 2, 1, 2, 3, 2, 3, 3, 1, 3, 2 };
    assertEquals(0.8158975952122257, randomappleeasy.theRed(red, green), DELTA * 0.8158975952122257);
  }

  @Test
  public void case47() {
    int[] red = { 9, 8, 8, 9, 10, 9, 8, 9, 8, 8, 8, 10, 9, 10, 10, 10, 10, 10, 8, 8, 8, 8, 10, 10, 8, 9, 9, 8, 9, 10, 10, 9, 9, 9, 9, 8, 10, 9, 8, 10, 9, 8, 8, 8, 8, 8, 9, 8, 10, 10 };
    int[] green = { 3, 1, 3, 2, 1, 3, 3, 1, 1, 3, 3, 1, 2, 3, 3, 2, 1, 2, 1, 3, 1, 1, 1, 3, 1, 1, 2, 3, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 3, 2, 3, 1, 1, 3, 3, 1, 2, 1, 3, 2 };
    assertEquals(0.8256922945449038, randomappleeasy.theRed(red, green), DELTA * 0.8256922945449038);
  }

  @Test
  public void case48() {
    int[] red = { 9, 10, 8, 9, 8, 9, 10, 9, 9, 8, 10, 8, 8, 9, 8, 9, 10, 9, 8, 9, 8, 10, 8, 8, 8, 10, 9, 10, 8, 10, 10, 10, 9, 9, 9, 10, 9, 9, 10, 10, 10, 9, 10, 10, 9, 9, 8, 8, 9, 10 };
    int[] green = { 3, 1, 3, 1, 2, 2, 3, 1, 1, 3, 2, 1, 3, 3, 3, 1, 2, 2, 3, 2, 2, 1, 2, 1, 2, 3, 1, 2, 3, 3, 3, 1, 1, 1, 2, 2, 1, 1, 3, 3, 3, 1, 3, 1, 1, 2, 1, 1, 3, 3 };
    assertEquals(0.8207457602548267, randomappleeasy.theRed(red, green), DELTA * 0.8207457602548267);
  }

  @Test
  public void case49() {
    int[] red = { 2, 1, 1, 2, 2, 1, 2, 3, 1, 2, 2, 1, 3, 3, 1, 3, 1, 1, 2, 2, 2, 2, 2, 3, 2, 2, 3, 1, 2, 1, 2, 1, 1, 3, 1, 3, 2, 3, 2, 1, 3, 3, 1, 1, 2, 1, 2, 2, 2, 1 };
    int[] green = { 9, 9, 10, 8, 8, 10, 10, 10, 10, 10, 8, 8, 8, 9, 9, 10, 10, 10, 9, 9, 8, 10, 10, 9, 10, 8, 8, 9, 9, 9, 8, 8, 9, 8, 8, 9, 8, 8, 9, 9, 9, 8, 9, 10, 9, 10, 10, 8, 10, 9 };
    assertEquals(0.17122328982831436, randomappleeasy.theRed(red, green), DELTA * 0.17122328982831436);
  }

  @Test
  public void case50() {
    int[] red = { 2, 1, 1, 2, 3, 2, 1, 2, 1, 1, 1, 3, 2, 3, 3, 3, 3, 3, 1, 1, 1, 1, 3, 3, 1, 2, 2, 1, 2, 3, 3, 2, 2, 2, 2, 1, 3, 2, 1, 3, 2, 1, 1, 1, 1, 1, 2, 1, 3, 3 };
    int[] green = { 10, 8, 10, 9, 8, 10, 10, 8, 8, 10, 10, 8, 9, 10, 10, 9, 8, 9, 8, 10, 8, 8, 8, 10, 8, 8, 9, 10, 9, 9, 8, 8, 8, 8, 9, 8, 8, 9, 10, 9, 10, 8, 8, 10, 10, 8, 9, 8, 10, 9 };
    assertEquals(0.17617366630785636, randomappleeasy.theRed(red, green), DELTA * 0.17617366630785636);
  }

  @Test
  public void case51() {
    int[] red = { 2, 3, 1, 2, 1, 2, 3, 2, 2, 1, 3, 1, 1, 2, 1, 2, 3, 2, 1, 2, 1, 3, 1, 1, 1, 3, 2, 3, 1, 3, 3, 3, 2, 2, 2, 3, 2, 2, 3, 3, 3, 2, 3, 3, 2, 2, 1, 1, 2, 3 };
    int[] green = { 10, 8, 10, 8, 9, 9, 10, 8, 8, 10, 9, 8, 10, 10, 10, 8, 9, 9, 10, 9, 9, 8, 9, 8, 9, 10, 8, 9, 10, 10, 10, 8, 8, 8, 9, 9, 8, 8, 10, 10, 10, 8, 10, 8, 8, 9, 8, 8, 10, 10 };
    assertEquals(0.1865240168559933, randomappleeasy.theRed(red, green), DELTA * 0.1865240168559933);
  }

  @Test
  public void case52() {
    int[] red = { 5, 1, 2, 8, 4, 1, 1, 2, 3, 4, 5, 2, 10, 2, 6, 2, 8, 7, 9, 3 };
    int[] green = { 4, 7, 1, 1, 10, 3, 4, 1, 6, 2, 7, 6, 10, 5, 2, 9, 3, 8, 1, 8 };
    assertEquals(0.46460213827476854, randomappleeasy.theRed(red, green), DELTA * 0.46460213827476854);
  }

  @Test
  public void case53() {
    int[] red = { 2, 5, 6, 4, 9, 10, 6, 2 };
    int[] green = { 6, 7, 4, 5, 3, 2, 9, 1 };
    assertEquals(0.5429014970733334, randomappleeasy.theRed(red, green), DELTA * 0.5429014970733334);
  }

  @Test
  public void case54() {
    int[] red = { 10, 7, 2, 8, 4, 1, 1, 2, 3, 4, 5, 2, 10, 2, 6, 2, 8, 7, 9, 3, 10, 10, 8, 8, 9, 5, 8, 7, 9, 3, 10, 10, 8, 8, 9, 7, 2, 8, 4, 1, 1, 2, 3, 4, 5, 2, 10, 2, 6, 2 };
    int[] green = { 10, 7, 2, 8, 4, 1, 1, 2, 3, 4, 5, 2, 10, 2, 6, 2, 8, 7, 9, 3, 10, 10, 8, 8, 9, 5, 8, 7, 9, 3, 10, 10, 8, 8, 9, 7, 2, 8, 4, 1, 1, 2, 3, 4, 5, 2, 10, 2, 6, 2 };
    assertEquals(0.4999999999999996, randomappleeasy.theRed(red, green), DELTA * 0.4999999999999996);
  }

  @Test
  public void case55() {
    int[] red = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };
    int[] green = { 5, 8, 9, 2, 5, 8, 9, 2, 5, 8, 9, 2, 5, 8, 9, 2, 5, 8, 9, 2, 5, 8, 9, 2, 5, 8, 9, 2, 5, 8, 9, 2, 5, 8, 9, 2, 5, 8, 9, 2, 5, 8, 9, 2, 5, 8, 9, 2, 5, 9 };
    assertEquals(0.3321663358376393, randomappleeasy.theRed(red, green), DELTA * 0.3321663358376393);
  }

  @Test
  public void case56() {
    int[] red = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] green = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    assertEquals(0.4999999999999996, randomappleeasy.theRed(red, green), DELTA * 0.4999999999999996);
  }

  @Test
  public void case57() {
    int[] red = { 8, 5, 2, 2, 9, 7, 9, 4, 1, 9, 5, 8, 9, 1, 7, 3, 4, 1, 5, 8, 3, 7, 7, 1, 10, 1, 6, 6, 9, 9, 2, 7, 9, 9, 6, 1, 6, 3, 7, 5, 6, 10, 6, 6, 3, 8, 1, 3, 3, 4 };
    int[] green = { 8, 5, 2, 2, 9, 7, 9, 4, 1, 9, 5, 8, 9, 1, 7, 3, 4, 1, 5, 8, 3, 7, 7, 1, 10, 1, 6, 6, 9, 9, 2, 7, 9, 9, 6, 1, 6, 3, 7, 5, 6, 10, 6, 6, 3, 8, 1, 3, 3, 4 };
    assertEquals(0.4999999999999996, randomappleeasy.theRed(red, green), DELTA * 0.4999999999999996);
  }

  @Test
  public void case58() {
    int[] red = { 1, 1, 2, 10, 9, 8, 1, 7, 6, 5 };
    int[] green = { 3, 3, 4, 4, 5, 5, 7, 8, 9, 10 };
    assertEquals(0.4578987403432567, randomappleeasy.theRed(red, green), DELTA * 0.4578987403432567);
  }

  @Test
  public void case59() {
    int[] red = { 5, 1, 2, 8, 4, 1, 1, 2, 3, 4, 5, 2, 10, 2, 6, 2, 8, 7, 9, 3, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
    int[] green = { 4, 7, 1, 1, 10, 3, 4, 1, 6, 2, 7, 6, 10, 5, 2, 9, 3, 8, 1, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
    assertEquals(0.49094618666565465, randomappleeasy.theRed(red, green), DELTA * 0.49094618666565465);
  }

  @Test
  public void case60() {
    int[] red = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] green = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(0.49999999999999994, randomappleeasy.theRed(red, green), DELTA * 0.49999999999999994);
  }

  @Test
  public void case61() {
    int[] red = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] green = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals(0.5, randomappleeasy.theRed(red, green), DELTA * 0.5);
  }

  @Test
  public void case62() {
    int[] red = { 8, 9, 6, 3, 10, 4, 3, 3, 9, 4, 4, 5, 4, 2, 6, 10, 1, 2, 2, 9, 7, 5, 6, 7, 8, 10, 3, 8, 3, 3, 1, 4, 9, 8, 1, 9, 9, 1, 5, 10, 4, 4, 5, 6, 7, 1, 5, 1, 4 };
    int[] green = { 5, 1, 2, 5, 7, 7, 9, 6, 10, 7, 9, 1, 5, 8, 2, 10, 4, 2, 9, 8, 10, 8, 9, 1, 6, 2, 8, 8, 3, 4, 2, 8, 8, 10, 2, 3, 8, 6, 3, 6, 10, 6, 5, 8, 10, 2, 6, 7, 8 };
    assertEquals(0.46728728828417426, randomappleeasy.theRed(red, green), DELTA * 0.46728728828417426);
  }

  @Test
  public void case63() {
    int[] red = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] green = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
    assertEquals(0.25, randomappleeasy.theRed(red, green), DELTA * 0.25);
  }

  @Test
  public void case64() {
    int[] red = { 5, 1, 2, 4, 1, 1, 2, 3, 4, 5, 2, 10, 2, 6, 2, 8, 7, 9, 3, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
    int[] green = { 4, 7, 1, 1, 10, 3, 4, 1, 6, 2, 7, 6, 10, 5, 2, 9, 3, 8, 1, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
    assertEquals(0.4833259138875869, randomappleeasy.theRed(red, green), DELTA * 0.4833259138875869);
  }

  @Test
  public void case65() {
    int[] red = { 5, 1, 2, 8, 4, 1, 1, 2, 3, 4, 5, 2, 10, 2, 6, 2, 8, 7, 9, 3, 10, 10, 6, 4, 5, 3, 10, 2, 10, 2, 5, 6, 3, 2, 5, 6, 7, 3, 4, 2 };
    int[] green = { 4, 7, 1, 1, 10, 3, 4, 1, 6, 2, 7, 6, 10, 5, 2, 9, 3, 8, 1, 8, 4, 5, 6, 7, 8, 10, 4, 5, 6, 3, 5, 4, 2, 4, 10, 4, 6, 5, 4, 6 };
    assertEquals(0.4795399528534544, randomappleeasy.theRed(red, green), DELTA * 0.4795399528534544);
  }

  @Test
  public void case66() {
    int[] red = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    int[] green = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    assertEquals(0.5000000000000001, randomappleeasy.theRed(red, green), DELTA * 0.5000000000000001);
  }

  @Test
  public void case67() {
    int[] red = { 1, 4, 5, 4, 3, 1, 2, 3, 6, 3, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
    int[] green = { 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 };
    assertEquals(0.37761897654088844, randomappleeasy.theRed(red, green), DELTA * 0.37761897654088844);
  }

  @Test
  public void case68() {
    int[] red = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] green = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(0.5, randomappleeasy.theRed(red, green), DELTA * 0.5);
  }

  @Test
  public void case69() {
    int[] red = { 5, 1, 2, 8, 4, 1, 1, 2, 3, 4, 5, 2, 10, 2, 6, 2, 8, 7, 9, 3, 5, 1, 2, 8, 4, 1, 1, 2, 3, 4, 5, 2, 10, 2, 6, 2, 8, 7, 9, 3, 5, 1, 2, 8, 4, 1, 1, 2, 3, 4 };
    int[] green = { 5, 1, 2, 8, 4, 1, 1, 2, 3, 4, 5, 2, 10, 2, 6, 2, 8, 7, 9, 3, 5, 1, 2, 8, 4, 1, 1, 2, 3, 4, 5, 2, 10, 2, 6, 2, 8, 7, 9, 3, 5, 1, 2, 8, 4, 1, 1, 2, 3, 4 };
    assertEquals(0.49999999999999967, randomappleeasy.theRed(red, green), DELTA * 0.49999999999999967);
  }

  @Test
  public void case70() {
    int[] red = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    int[] green = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    assertEquals(0.5, randomappleeasy.theRed(red, green), DELTA * 0.5);
  }

  @Test
  public void case71() {
    int[] red = { 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    int[] green = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    assertEquals(0.5930700755048613, randomappleeasy.theRed(red, green), DELTA * 0.5930700755048613);
  }

  @Test
  public void case72() {
    int[] red = { 5, 1, 2, 8, 4, 1, 1, 2, 3, 4, 5, 2, 10, 2, 6, 2, 8, 7, 9, 3, 3, 4, 5, 6, 7, 4, 4, 3, 1, 2, 3, 4, 5, 6, 6, 7, 8, 7, 8, 5 };
    int[] green = { 4, 7, 1, 1, 10, 3, 4, 1, 6, 2, 7, 6, 10, 5, 2, 9, 3, 8, 1, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    assertEquals(0.3805430925238606, randomappleeasy.theRed(red, green), DELTA * 0.3805430925238606);
  }

  @Test
  public void case73() {
    int[] red = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] green = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
    assertEquals(0.3333333333333333, randomappleeasy.theRed(red, green), DELTA * 0.3333333333333333);
  }

  @Test
  public void case74() {
    int[] red = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] green = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(0.49999999999999994, randomappleeasy.theRed(red, green), DELTA * 0.49999999999999994);
  }

  @Test
  public void case75() {
    int[] red = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
    int[] green = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
    assertEquals(0.5000000000000001, randomappleeasy.theRed(red, green), DELTA * 0.5000000000000001);
  }

  @Test
  public void case76() {
    int[] red = { 4, 7, 1, 1, 10, 3, 4, 1, 6, 2, 7, 6, 10, 5, 2, 9, 3, 8, 1, 8, 4, 7, 1, 1, 10, 3, 4, 1, 6, 2, 7, 6, 10, 5, 2, 9, 3, 8, 1, 8, 2, 3, 4, 5, 7, 1, 5, 3, 1, 3 };
    int[] green = { 4, 7, 1, 1, 9, 3, 4, 1, 5, 2, 9, 3, 8, 1, 8, 3, 7, 1, 1, 10, 3, 9, 1, 6, 2, 7, 3, 10, 5, 2, 9, 3, 3, 1, 8, 2, 1, 4, 5, 6, 2, 7, 6, 10, 7, 1, 5, 3, 1, 3 };
    assertEquals(0.5078036447352833, randomappleeasy.theRed(red, green), DELTA * 0.5078036447352833);
  }

  @Test
  public void case77() {
    int[] red = { 4, 3, 2, 1, 5, 6, 7, 8, 9, 9, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 2, 3, 4, 5, 6, 5, 6, 5, 4, 3, 2, 3, 4, 5, 6, 7, 8, 9, 4, 5, 3, 2, 1, 2, 3, 6, 4, 2, 3, 1 };
    int[] green = { 3, 2, 3, 4, 5, 6, 7, 8, 9, 3, 1, 3, 4, 5, 6, 7, 5, 3, 5, 4, 6, 5, 3, 4, 5, 3, 3, 2, 5, 5, 5, 5, 5, 4, 3, 4, 3, 4, 5, 3, 4, 5, 6, 7, 8, 9, 5, 6, 4, 5 };
    assertEquals(0.487613236964089, randomappleeasy.theRed(red, green), DELTA * 0.487613236964089);
  }

  @Test
  public void case78() {
    int[] red = { 2, 3, 4, 5, 6, 7, 3, 3, 4, 3, 4, 5, 4, 3, 4, 5, 6, 7, 6, 5, 4, 3, 4, 5, 6, 7, 8, 6, 5, 4, 5, 6, 7, 8, 7, 6, 5, 4, 5, 6, 7, 8, 9, 7, 5, 4, 5, 6, 3, 3 };
    int[] green = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    assertEquals(0.3393384683923623, randomappleeasy.theRed(red, green), DELTA * 0.3393384683923623);
  }

  @Test
  public void case79() {
    int[] red = { 1, 2, 3, 5, 6, 5, 4, 5, 6, 5, 4, 5, 6, 5, 4, 5, 6, 5, 4, 5, 6, 5, 4, 5, 6, 5, 4, 6, 2, 5, 4, 5, 6, 5, 4, 5, 6, 5, 4, 5, 6, 5, 4, 5, 6 };
    int[] green = { 1, 2, 3, 2, 1, 5, 6, 4, 7, 8, 9, 6, 5, 4, 8, 9, 6, 5, 4, 5, 8, 9, 6, 5, 4, 5, 6, 5, 4, 5, 6, 5, 4, 5, 6, 5, 4, 5, 6, 5, 4, 5, 6, 5, 4 };
    assertEquals(0.4800472611558422, randomappleeasy.theRed(red, green), DELTA * 0.4800472611558422);
  }

  @Test
  public void case80() {
    int[] red = { 5, 1, 2, 8, 4, 1, 1, 2, 3, 4, 5, 2, 10, 2, 6, 2, 8, 7, 9, 3, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 };
    int[] green = { 4, 7, 1, 1, 10, 3, 4, 1, 6, 2, 7, 6, 10, 5, 2, 9, 3, 8, 1, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 };
    assertEquals(0.49014616999401694, randomappleeasy.theRed(red, green), DELTA * 0.49014616999401694);
  }

}
