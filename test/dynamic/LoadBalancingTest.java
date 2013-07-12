package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class LoadBalancingTest {
  LoadBalancing loadbalancing = new LoadBalancing();

  @Test
  public void case1() {
    int[] chunkSizes = { 3072, 3072, 7168, 3072, 1024 };
    assertEquals(9216, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case2() {
    int[] chunkSizes = { 2048 };
    assertEquals(2048, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case3() {
    int[] chunkSizes = { 2048, 1024, 1024, 2048 };
    assertEquals(3072, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case4() {
    int[] chunkSizes = { 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304 };
    assertEquals(104857600, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case5() {
    int[] chunkSizes = {  };
    assertEquals(0, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case6() {
    int[] chunkSizes = { 434176 };
    assertEquals(434176, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case7() {
    int[] chunkSizes = { 2869248, 3368960 };
    assertEquals(3368960, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case8() {
    int[] chunkSizes = { 3189760, 1969152, 2827264 };
    assertEquals(4796416, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case9() {
    int[] chunkSizes = { 3892224, 2620416, 4001792, 1128448 };
    assertEquals(6512640, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case10() {
    int[] chunkSizes = { 2253824, 3233792, 668672, 3116032, 1232896 };
    assertEquals(5369856, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case11() {
    int[] chunkSizes = { 1908736, 2383872, 280576, 943104, 2446336, 3719168 };
    assertEquals(5908480, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case12() {
    int[] chunkSizes = { 2902016, 1619968, 2889728, 615424, 1824768, 372736, 3628032 };
    assertEquals(6949888, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case13() {
    int[] chunkSizes = { 1975296, 3416064, 1206272, 1199104, 4006912, 315392, 3771392, 1116160 };
    assertEquals(8539136, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case14() {
    int[] chunkSizes = { 3395584, 3946496, 36864, 2856960, 2195456, 1360896, 739328, 1778688, 1554432 };
    assertEquals(8933376, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case15() {
    int[] chunkSizes = { 1411072, 2110464, 1388544, 2362368, 1103872, 59392, 133120, 1184768, 1500160, 1332224 };
    assertEquals(6295552, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case16() {
    int[] chunkSizes = { 3050496, 947200, 1758208, 3763200, 630784, 3189760, 1256448, 2856960, 599040, 2598912, 202752, 1558528, 705536, 1774592, 3168256 };
    assertEquals(14030848, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case17() {
    int[] chunkSizes = { 3025920, 497664, 2781184, 2177024, 845824, 1563648, 2088960, 1811456, 3311616, 6144, 2838528, 2358272, 1030144, 3577856, 2316288, 249856, 2844672, 3380224, 3239936, 3140608 };
    assertEquals(21542912, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case18() {
    int[] chunkSizes = { 1160192, 3608576, 346112, 1018880, 3179520, 4111360, 13312, 3901440, 3415040, 1729536, 112640, 1935360, 4194304, 316416, 2263040, 3177472, 2910208, 2881536, 2677760, 607232, 763904, 3596288, 2754560, 4079616, 4132864 };
    assertEquals(29444096, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case19() {
    int[] chunkSizes = { 1108992, 818176, 278528, 3605504, 1881088, 594944, 1136640, 2747392, 4137984, 3846144, 3752960, 1255424, 1494016, 2325504, 707584, 2350080, 2283520, 3640320, 2700288, 81920, 3110912, 950272, 3286016, 3776512, 718848, 3619840, 1605632, 3132416, 362496, 263168 };
    assertEquals(30786560, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case20() {
    int[] chunkSizes = { 1981440, 1696768, 2514944, 3563520, 1326080, 2675712, 2722816, 1843200, 1269760, 3243008, 1122304, 2787328, 2188288, 1091584, 2243584, 1929216, 2001920, 3135488, 2984960, 3218432, 2497536, 1995776, 3871744, 3980288, 842752, 2403328, 3410944, 2215936, 3165184, 3249152, 3644416, 3939328, 925696, 3391488, 610304 };
    assertEquals(42842112, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case21() {
    int[] chunkSizes = { 1320960, 2312192, 3941376, 2969600, 868352, 608256, 517120, 3512320, 3555328, 2020352, 771072, 2491392, 974848, 2830336, 2910208, 2079744, 2255872, 1290240, 2580480, 3957760, 1782784, 2179072, 2264064, 1176576, 1979392, 57344, 3637248, 3868672, 702464, 694272, 2574336, 3723264, 4147200, 3992576, 2292736, 2887680, 246784, 296960, 3123200, 3852288 };
    assertEquals(44623872, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case22() {
    int[] chunkSizes = { 2023424, 2503680, 2306048, 1532928, 3194880, 131072, 510976, 708608, 668672, 636928, 3744768, 476160, 2391040, 1123328, 3174400, 3717120, 3489792, 3063808, 3000320, 3262464, 132096, 3506176, 1269760, 3656704, 4149248, 3570688, 3658752, 4133888, 1820672, 421888, 4084736, 3562496, 762880, 30720, 4108288, 2230272, 2248704, 2019328, 1429504, 3800064, 2387968, 2662400, 3368960, 201728, 2418688 };
    assertEquals(51648512, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case23() {
    int[] chunkSizes = { 4022272, 547840, 103424, 854016, 1501184, 3725312, 2119680, 2335744, 246784, 3732480, 677888, 1795072, 500736, 2571264, 3963904, 3433472, 4035584, 3927040, 3061760, 2991104, 2324480, 2880512, 4024320, 1625088, 1069056, 1837056, 2369536, 2156544, 1847296, 1064960, 1081344, 1546240, 3091456, 1165312, 1156096, 3151872, 2614272, 2677760, 2931712, 680960, 3372032, 1780736, 1751040, 3351552, 3255296, 2846720 };
    assertEquals(51900416, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case24() {
    int[] chunkSizes = { 505856, 301056, 2229248, 551936, 3828736, 3831808, 3883008, 695296, 39936, 1904640, 1337344, 227328, 3588096, 238592, 2157568, 2762752, 3348480, 32768, 1373184, 636928, 813056, 1734656, 1893376, 2849792, 1065984, 4168704, 1934336, 1249280, 1699840, 1549312, 3787776, 2822144, 2608128, 3854336, 2382848, 361472, 1014784, 405504, 468992, 354304, 3148800, 714752, 2638848, 2149376, 2984960, 2308096, 1763328 };
    assertEquals(43101184, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case25() {
    int[] chunkSizes = { 591872, 3399680, 3788800, 1694720, 3659776, 479232, 3633152, 2285568, 692224, 3364864, 954368, 663552, 1173504, 393216, 1774592, 919552, 3042304, 1576960, 3505152, 1256448, 1688576, 2438144, 3651584, 970752, 2738176, 803840, 244736, 1179648, 3703808, 1945600, 1848320, 4072448, 1316864, 3845120, 3125248, 3658752, 3824640, 64512, 2225152, 2433024, 2106368, 3881984, 1193984, 3750912, 3155968, 3706880, 2726912, 499712 };
    assertEquals(52826112, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case26() {
    int[] chunkSizes = { 1859584, 3296256, 3580928, 3575808, 3329024, 2813952, 473088, 3128320, 2411520, 28672, 64512, 2906112, 2679808, 537600, 1397760, 293888, 2081792, 3035136, 533504, 2237440, 678912, 2260992, 1430528, 90112, 1490944, 231424, 2496512, 3810304, 920576, 4041728, 2164736, 3045376, 615424, 2148352, 2388992, 811008, 3019776, 972800, 861184, 3750912, 2864128, 3108864, 845824, 2686976, 1682432, 273408, 4140032, 2902016, 2025472 };
    assertEquals(49012736, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case27() {
    int[] chunkSizes = { 2652160, 3392512, 138240, 3780608, 869376, 1323008, 2766848, 2604032, 2180096, 3702784, 745472, 3911680, 1994752, 3357696, 10240, 3311616, 1439744, 1430528, 805888, 3747840, 1383424, 792576, 702464, 2356224, 270336, 2482176, 3079168, 1796096, 657408, 2209792, 3291136, 4062208, 1709056, 1188864, 1135616, 2436096, 2647040, 3892224, 791552, 2192384, 446464, 304128, 2158592, 2108416, 3528704, 1880064, 140288, 2387968, 2719744, 607232 };
    assertEquals(49761280, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case28() {
    int[] chunkSizes = { 14336, 41984, 24576, 28672, 15360, 49152, 43008, 47104, 37888, 13312, 22528, 4096, 29696, 25600, 48128, 30720, 46080, 51200, 31744, 23552, 21504, 50176, 19456, 9216, 38912, 27648, 45056, 32768, 34816, 5120, 6144, 11264, 10240, 33792, 17408, 36864, 39936, 2048, 8192, 26624, 20480, 18432, 3072, 35840, 44032, 7168, 12288, 40960, 16384, 1024 };
    assertEquals(653312, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case29() {
    int[] chunkSizes = { 21504, 50176, 14336, 6144, 40960, 4096, 37888, 31744, 20480, 12288, 39936, 48128, 10240, 5120, 24576, 11264, 16384, 47104, 26624, 46080, 8192, 30720, 18432, 34816, 45056, 41984, 38912, 15360, 1024, 29696, 2048, 28672, 27648, 9216, 35840, 7168, 22528, 36864, 33792, 32768, 44032, 17408, 3072, 13312, 19456, 49152, 23552, 25600, 43008 };
    assertEquals(627712, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case30() {
    int[] chunkSizes = { 4157440, 4186112, 4158464, 4187136, 4185088, 4168704, 4169728, 4152320, 4156416, 4189184, 4148224, 4166656, 4161536, 4159488, 4192256, 4167680, 4194304, 4174848, 4190208, 4172800, 4171776, 4180992, 4149248, 4182016, 4145152, 4163584, 4144128, 4178944, 4147200, 4160512, 4162560, 4173824, 4151296, 4179968, 4176896, 4175872, 4177920, 4164608, 4154368, 4170752, 4146176, 4193280, 4150272, 4155392, 4188160, 4183040, 4153344, 4191232, 4184064, 4165632 };
    assertEquals(104230912, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case31() {
    int[] chunkSizes = { 1024, 26624, 103424, 24576, 1024, 26624, 103424, 24576, 1024, 26624, 103424, 24576, 1024, 26624, 103424, 24576, 1024, 26624, 103424, 24576, 1024, 26624, 103424, 24576, 1024, 26624, 103424, 24576, 1024, 26624, 103424, 24576, 1024, 26624, 103424, 24576, 1024, 26624, 103424, 24576, 1024, 26624, 1024, 24576, 1024, 26624, 1024, 24576, 1024, 26624 };
    assertEquals(845824, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case32() {
    int[] chunkSizes = { 1024, 26624, 1024, 26624, 1024, 26624, 1024, 26624, 1024, 26624, 1024, 26624, 1024, 26624, 1024, 26624, 1024, 26624, 1024, 26624, 1024, 26624, 1024, 26624, 1024, 26624, 1024, 1024, 24576, 103424, 24576, 103424, 24576, 103424, 24576, 103424, 24576, 103424, 24576, 103424, 24576, 103424, 24576, 103424, 24576, 103424, 24576, 103424, 24576, 24576 };
    assertEquals(845824, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case33() {
    int[] chunkSizes = { 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 26624, 26624, 26624, 26624, 26624, 26624, 26624, 26624, 26624, 26624, 26624, 26624, 26624, 24576, 24576, 24576, 24576, 24576, 24576, 24576, 24576, 24576, 24576, 24576, 24576, 103424, 103424, 103424, 103424, 103424, 103424, 103424, 103424, 103424, 103424 };
    assertEquals(845824, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case34() {
    int[] chunkSizes = { 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 26624, 26624, 26624, 26624, 26624, 26624, 26624, 26624, 26624, 26624, 26624, 26624, 26624, 103424, 103424, 103424, 103424, 103424, 103424, 103424, 103424, 103424, 103424, 24576, 24576, 24576, 24576, 24576, 24576, 24576, 24576, 24576, 24576, 24576, 24576 };
    assertEquals(845824, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case35() {
    int[] chunkSizes = { 26624, 103424, 26624, 103424, 1024, 103424, 1024, 24576, 1024, 26624, 26624, 1024, 1024, 24576, 1024, 103424, 24576, 26624, 26624, 24576, 24576, 24576, 24576, 24576, 1024, 1024, 26624, 24576, 1024, 26624, 1024, 103424, 1024, 103424, 26624, 24576, 26624, 1024, 24576, 103424, 1024, 1024, 26624, 26624, 1024, 24576, 103424, 26624, 103424, 103424 };
    assertEquals(845824, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case36() {
    int[] chunkSizes = { 4193280, 4167680, 4090880, 4169728, 4193280, 4167680, 4090880, 4169728, 4193280, 4167680, 4090880, 4169728, 4193280, 4167680, 4090880, 4169728, 4193280, 4167680, 4090880, 4169728, 4193280, 4167680, 4090880, 4169728, 4193280, 4167680, 4090880, 4169728, 4193280, 4167680, 4090880, 4169728, 4193280, 4167680, 4090880, 4169728, 4193280, 4167680, 4090880, 4169728, 4193280, 4167680, 4193280, 4169728, 4193280, 4167680, 4193280, 4169728, 4193280, 4167680 };
    assertEquals(104012800, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case37() {
    int[] chunkSizes = { 4167680, 4167680, 4167680, 4167680, 4090880, 4167680, 4169728, 4090880, 4193280, 4193280, 4193280, 4169728, 4090880, 4193280, 4169728, 4167680, 4167680, 4167680, 4193280, 4169728, 4167680, 4169728, 4090880, 4090880, 4193280, 4167680, 4169728, 4090880, 4090880, 4193280, 4167680, 4169728, 4167680, 4193280, 4169728, 4169728, 4193280, 4193280, 4193280, 4090880, 4169728, 4193280, 4167680, 4169728, 4090880, 4090880, 4193280, 4193280, 4169728, 4193280 };
    assertEquals(104012800, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case38() {
    int[] chunkSizes = { 3072, 3072, 7168, 3072, 1024 };
    assertEquals(9216, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case39() {
    int[] chunkSizes = { 10240, 10240, 8192, 8192, 8192 };
    assertEquals(24576, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case40() {
    int[] chunkSizes = { 8192, 7168, 6144, 4096, 4096 };
    assertEquals(15360, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case41() {
    int[] chunkSizes = { 1024, 3072, 6144, 7168, 8192, 12288, 13312 };
    assertEquals(25600, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case42() {
    int[] chunkSizes = { 48128, 45056, 63488, 58368, 37888, 60416, 23552, 41984 };
    assertEquals(189440, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case43() {
    int[] chunkSizes = { 1024, 2048, 3072, 4096, 5120, 6144, 7168, 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360 };
    assertEquals(61440, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case44() {
    int[] chunkSizes = { 30720, 19456, 13312, 10240, 10240, 4096 };
    assertEquals(44032, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case45() {
    int[] chunkSizes = { 10240, 11264, 12288, 13312, 14336 };
    assertEquals(33792, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case46() {
    int[] chunkSizes = { 5120, 4096, 4096, 3072, 2048 };
    assertEquals(9216, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case47() {
    int[] chunkSizes = { 4096, 4096, 4096, 5120, 7168 };
    assertEquals(12288, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case48() {
    int[] chunkSizes = { 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304, 4194304 };
    assertEquals(104857600, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case49() {
    int[] chunkSizes = { 4194304, 4194304, 4194304, 4188160, 4188160, 4194304, 4194304, 4194304, 4194304, 4194304, 4096000, 4096000, 4096000, 1024000, 1024000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000, 4096000 };
    assertEquals(90112000, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case50() {
    int[] chunkSizes = { 5120, 5120, 3072, 3072, 3072, 3072 };
    assertEquals(11264, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case51() {
    int[] chunkSizes = { 10240, 8192, 7168, 6144, 5120 };
    assertEquals(18432, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case52() {
    int[] chunkSizes = { 2048, 4096, 4096, 3072, 3072 };
    assertEquals(8192, loadbalancing.minTime(chunkSizes));
  }

  @Test
  public void case53() {
    int[] chunkSizes = { 3072, 3072, 5120, 3072, 4096 };
    assertEquals(9216, loadbalancing.minTime(chunkSizes));
  }

}
