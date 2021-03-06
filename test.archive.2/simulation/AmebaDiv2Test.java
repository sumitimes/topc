package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class AmebaDiv2Test {
    AmebaDiv2 amebadiv2 = new AmebaDiv2();

    @Test
    public void case1() {
        int[] X = { 2, 1, 3, 1, 2 };
        int A = 1;
        assertEquals(4, amebadiv2.simulate(X, A));
    }

    @Test
    public void case2() {
        int[] X = { 1, 4, 9, 16, 25, 36, 49 };
        int A = 10;
        assertEquals(10, amebadiv2.simulate(X, A));
    }

    @Test
    public void case3() {
        int[] X = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 1024, 2048 };
        int A = 1;
        assertEquals(512, amebadiv2.simulate(X, A));
    }

    @Test
    public void case4() {
        int[] X = { 817, 832, 817, 832, 126, 817, 63, 63, 126, 817, 832, 287, 823, 817, 574 };
        int A = 63;
        assertEquals(252, amebadiv2.simulate(X, A));
    }

    @Test
    public void case5() {
        int[] X = { 1000000000 };
        int A = 1000000000;
        assertEquals(2000000000, amebadiv2.simulate(X, A));
    }

    @Test
    public void case6() {
        int[] X = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912 };
        int A = 1;
        assertEquals(1073741824, amebadiv2.simulate(X, A));
    }

    @Test
    public void case7() {
        int[] X = { 255 };
        int A = 510;
        assertEquals(510, amebadiv2.simulate(X, A));
    }

    @Test
    public void case8() {
        int[] X = { 144, 288, 674, 288, 72, 373, 674, 72 };
        int A = 674;
        assertEquals(1348, amebadiv2.simulate(X, A));
    }

    @Test
    public void case9() {
        int[] X = { 321, 39, 642, 710, 528, 710, 710, 264, 264, 642, 264, 264, 321, 321, 39 };
        int A = 830;
        assertEquals(830, amebadiv2.simulate(X, A));
    }

    @Test
    public void case10() {
        int[] X = { 741, 992, 992, 396, 396, 992, 396, 741, 792, 396, 396, 396, 792, 992, 992, 396, 792, 992, 396, 792, 396, 396 };
        int A = 792;
        assertEquals(1584, amebadiv2.simulate(X, A));
    }

    @Test
    public void case11() {
        int[] X = { 257, 961, 961, 514, 257, 487, 514, 514, 961, 961, 961, 257, 961, 257, 961, 487, 961, 961, 514, 487, 514, 257, 961, 257, 961, 961, 257, 487, 514 };
        int A = 487;
        assertEquals(974, amebadiv2.simulate(X, A));
    }

    @Test
    public void case12() {
        int[] X = { 806, 806, 31, 118, 31, 998, 59, 806, 806, 322, 59, 335, 335, 118, 322, 31, 31, 118, 806, 118, 59, 322, 322, 62, 31, 59, 806, 998, 62, 947, 62, 31, 806, 947, 806, 322 };
        int A = 59;
        assertEquals(236, amebadiv2.simulate(X, A));
    }

    @Test
    public void case13() {
        int[] X = { 290, 670, 290, 908, 676, 580, 908, 563, 290, 670, 290, 908, 563, 563, 670, 953, 563, 145, 580, 676, 670, 670, 580, 563, 670, 670, 908, 676, 908, 145, 563, 670, 580, 908, 908, 676, 676, 580, 290, 953, 290, 290, 908 };
        int A = 670;
        assertEquals(1340, amebadiv2.simulate(X, A));
    }

    @Test
    public void case14() {
        int[] X = { 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222, 222 };
        int A = 222;
        assertEquals(444, amebadiv2.simulate(X, A));
    }

    @Test
    public void case15() {
        int[] X = { 384, 192, 192, 384, 663, 663, 384, 192, 555, 192, 555, 192, 384, 663, 663, 192, 555, 663, 384, 192, 384, 192, 663, 663, 384, 192, 192, 192, 555, 663, 192, 384, 663, 384, 663, 384, 192, 555, 555, 384, 384, 384, 663, 192, 663, 384, 384, 663, 555, 192, 555, 192, 192, 192, 555, 555, 192 };
        int A = 555;
        assertEquals(1110, amebadiv2.simulate(X, A));
    }

    @Test
    public void case16() {
        int[] X = { 786, 393, 728, 682, 728, 728, 682, 728, 393, 786, 393, 682, 393, 393, 728, 682, 393, 393, 682, 786, 728, 682, 728, 728, 393, 786, 786, 786, 393, 728, 682, 682, 393, 393, 728, 393, 786, 728, 728, 728, 682, 393, 393, 393, 682, 393, 786, 728, 393, 786, 786, 786, 786, 786, 728, 393, 682, 786, 786, 728, 786, 682, 786, 786 };
        int A = 728;
        assertEquals(1456, amebadiv2.simulate(X, A));
    }

    @Test
    public void case17() {
        int[] X = { 262, 262, 262, 208, 524, 524, 262, 524, 524, 262, 208, 524, 262, 208, 208, 262, 524, 262, 524, 524, 262, 524, 208, 208, 524, 208, 262, 208, 262, 524, 262, 524, 524, 524, 208, 208, 524, 208, 262, 524, 262, 208, 262, 524, 524, 524, 524, 208, 524, 524, 262, 524, 524, 208, 524, 524, 208, 208, 524, 262, 262, 524, 208, 262, 208, 208, 524, 524, 262, 524, 262 };
        int A = 524;
        assertEquals(1048, amebadiv2.simulate(X, A));
    }

    @Test
    public void case18() {
        int[] X = { 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483, 483 };
        int A = 483;
        assertEquals(966, amebadiv2.simulate(X, A));
    }

    @Test
    public void case19() {
        int[] X = { 957, 170, 340, 346, 342, 680, 692, 925, 957, 692, 925, 957, 342, 680, 957, 85, 957, 340, 342, 340, 342, 85, 925, 170, 666, 170, 680, 666, 666, 692, 666, 170, 925, 666, 692, 85, 925, 925, 170, 85, 680, 680, 957, 666, 692, 692, 85, 692, 340, 346, 680, 692, 340, 85, 680, 666, 340, 170, 170, 666, 925, 666, 346, 340, 666, 692, 85, 666, 346, 680, 957, 925, 666, 85, 85, 85, 346, 340, 85, 342, 957, 346, 85, 340, 340 };
        int A = 340;
        assertEquals(1360, amebadiv2.simulate(X, A));
    }

    @Test
    public void case20() {
        int[] X = { 952, 952, 692, 476, 476, 972, 972, 476, 972, 486, 298, 598, 346, 692, 486, 346, 476, 938, 476, 486, 598, 692, 692, 952, 938, 486, 598, 598, 952, 598, 598, 972, 972, 952, 692, 972, 486, 952, 346, 298, 486, 486, 346, 298, 486, 952, 476, 938, 486, 298, 692, 952, 598, 346, 298, 952, 952, 598, 938, 972, 952, 972, 346, 298, 972, 486, 692, 938, 598, 238, 598, 346, 486, 692, 952, 486, 238, 938, 938, 346, 298, 692, 598, 346, 346, 486, 346, 486, 938, 476, 952, 938 };
        int A = 952;
        assertEquals(1904, amebadiv2.simulate(X, A));
    }

    @Test
    public void case21() {
        int[] X = { 748, 748, 464, 748, 928, 748, 928, 464, 892, 420, 892, 892, 420, 851, 420, 892, 748, 748, 892, 844, 844, 844, 851, 892, 464, 464, 420, 928, 420, 420, 464, 420, 844, 420, 420, 851, 851, 928, 748, 928, 928, 928, 420, 851, 748, 844, 464, 748, 464, 420, 420, 748, 748, 748, 892, 464, 748, 420, 928, 892, 748, 851, 748, 851, 928, 748, 928, 748, 464, 420, 420, 420, 851, 748, 892, 892, 928, 892, 844, 420, 928, 464, 420, 892, 928, 748, 851, 748, 928, 420, 748, 748, 420, 928, 928, 928, 892, 928, 844 };
        int A = 748;
        assertEquals(1496, amebadiv2.simulate(X, A));
    }

    @Test
    public void case22() {
        int[] X = { 282, 689, 689, 689, 837, 564, 689, 689, 837, 167, 837, 282, 282, 282, 282, 564, 282, 689, 689, 837, 167, 689, 689, 564, 282, 167, 282, 837, 689, 689, 689, 282, 689, 837, 837, 689, 167, 689, 282, 689, 837, 837, 167, 837, 167, 282, 837, 689, 689, 282, 167, 689, 837, 689, 689, 564, 837, 282, 564, 167, 282, 837, 689, 282, 564, 282, 689, 282, 689, 689, 837, 564, 167, 837, 282, 282, 282, 282, 167, 564, 689, 837, 564, 689, 282, 564, 282, 564, 167, 564, 689, 689, 564, 282, 689, 689, 282, 167, 837, 564, 837, 837, 167, 282, 167, 167 };
        int A = 837;
        assertEquals(1674, amebadiv2.simulate(X, A));
    }

    @Test
    public void case23() {
        int[] X = { 824, 206, 206, 103, 103, 824, 206, 412, 103, 824, 412, 103, 103, 103, 206, 206, 824, 206, 103, 824, 824, 103, 206, 103, 824, 206, 824, 103, 412, 206, 103, 103, 412, 412, 103, 824, 206, 103, 103, 103, 206, 206, 103, 412, 412, 412, 103, 206, 103, 103, 824, 103, 824, 103, 412, 103, 412, 824, 103, 103, 103, 412, 103, 206, 103, 103, 824, 103, 206, 824, 103, 103, 824, 206, 824, 206, 824, 412, 824, 412, 412, 412, 824, 824, 824, 103, 103, 412, 824, 103, 103, 412, 103, 206, 206, 206, 412, 412, 824, 206, 412, 824, 824, 824, 824, 103, 824, 824, 206, 206, 412, 103, 824 };
        int A = 412;
        assertEquals(1648, amebadiv2.simulate(X, A));
    }

    @Test
    public void case24() {
        int[] X = { 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298 };
        int A = 298;
        assertEquals(596, amebadiv2.simulate(X, A));
    }

    @Test
    public void case25() {
        int[] X = { 40, 703, 428, 728, 646, 40, 364, 646, 160, 428, 80, 364, 728, 728, 364, 728, 703, 160, 703, 160, 40, 646, 364, 428, 726, 428, 40, 646, 428, 160, 728, 364, 646, 728, 646, 728, 646, 703, 40, 80, 428, 728, 728, 160, 726, 726, 728, 40, 160, 428, 726, 428, 364, 160, 160, 726, 646, 728, 160, 728, 364, 728, 364, 728, 428, 364, 703, 703, 646, 364, 80, 646, 646, 726, 80, 646, 428, 428, 428, 703, 726, 646, 40, 80, 364, 364, 40, 364, 646, 160, 160, 726, 646, 160, 728, 726, 728, 364, 80, 703, 364, 40, 364, 646, 726, 364, 364, 160, 428, 40, 646, 428, 728, 160, 726, 364, 646, 646, 80, 80, 40, 160, 364, 40, 728, 726, 728 };
        int A = 40;
        assertEquals(320, amebadiv2.simulate(X, A));
    }

    @Test
    public void case26() {
        int[] X = { 545, 259, 545, 138, 935, 705, 518, 935, 518, 935, 259, 935, 215, 545, 138, 138, 935, 517, 935, 935, 646, 518, 705, 215, 545, 259, 215, 705, 518, 215, 138, 705, 517, 545, 259, 518, 138, 646, 935, 215, 517, 646, 518, 935, 646, 259, 518, 518, 138, 138, 517, 545, 215, 138, 545, 705, 705, 259, 138, 138, 518, 517, 705, 518, 545, 138, 545, 518, 259, 545, 259, 259, 517, 646, 517, 545, 545, 646, 935, 935, 215, 138, 517, 518, 646, 646, 518, 138, 138, 518, 138, 518, 138, 518, 215, 215, 517, 259, 138, 705, 545, 138, 646, 518, 215, 646, 518, 545, 259, 517, 518, 259, 935, 518, 545, 545, 646, 517, 215, 545, 705, 545, 545, 518, 215, 215, 705, 517, 517, 259, 545, 935, 138, 935 };
        int A = 138;
        assertEquals(276, amebadiv2.simulate(X, A));
    }

    @Test
    public void case27() {
        int[] X = { 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703, 703 };
        int A = 703;
        assertEquals(1406, amebadiv2.simulate(X, A));
    }

    @Test
    public void case28() {
        int[] X = { 926, 926, 320, 926, 320, 926, 320, 320, 926, 320, 926, 926, 320, 320, 320, 926, 926, 926, 320, 320, 926, 926, 320, 926, 926, 320, 926, 926, 926, 926, 926, 926, 320, 926, 926, 320, 926, 320, 320, 320, 320, 320, 926, 926, 320, 320, 320, 320, 320, 926, 926, 926, 926, 926, 320, 926, 926, 926, 320, 320, 926, 320, 926, 926, 926, 926, 320, 926, 926, 926, 926, 320, 926, 926, 320, 320, 320, 320, 926, 926, 320, 926, 926, 320, 320, 320, 320, 926, 926, 320, 926, 926, 320, 926, 926, 320, 320, 926, 926, 320, 926, 926, 926, 320, 320, 926, 320, 926, 926, 320, 926, 320, 320, 320, 926, 320, 320, 926, 926, 320, 926, 926, 320, 320, 926, 926, 320, 320, 320, 926, 926, 926, 320, 926, 320, 926, 926, 926, 320, 320, 320, 320, 926, 926, 926, 926, 926, 320 };
        int A = 320;
        assertEquals(640, amebadiv2.simulate(X, A));
    }

    @Test
    public void case29() {
        int[] X = { 685, 467, 685, 685, 685, 582, 934, 582, 934, 467, 934, 685, 934, 934, 685, 685, 934, 934, 934, 685, 582, 934, 685, 934, 582, 934, 685, 934, 582, 934, 934, 582, 934, 685, 685, 685, 685, 685, 934, 467, 582, 685, 582, 467, 685, 934, 685, 467, 582, 582, 934, 685, 685, 467, 685, 582, 934, 467, 467, 934, 685, 685, 582, 934, 934, 934, 467, 467, 685, 934, 582, 934, 685, 582, 685, 934, 685, 467, 685, 934, 582, 467, 582, 685, 467, 685, 934, 467, 467, 934, 685, 934, 467, 685, 934, 582, 582, 934, 467, 685, 467, 467, 934, 467, 685, 934, 685, 467, 582, 467, 934, 685, 467, 467, 467, 685, 685, 582, 582, 582, 467, 685, 582, 685, 685, 934, 685, 685, 685, 685, 934, 467, 582, 685, 467, 467, 582, 685, 467, 685, 685, 685, 685, 685, 582, 582, 582, 582, 685, 582, 934, 934, 934, 582, 685 };
        int A = 467;
        assertEquals(1868, amebadiv2.simulate(X, A));
    }

    @Test
    public void case30() {
        int[] X = { 400, 25, 794, 200, 25, 400, 50, 794, 400, 185, 794, 200, 50, 25, 200, 185, 794, 800, 400, 910, 50, 572, 50, 572, 25, 910, 910, 100, 200, 25, 572, 50, 910, 910, 794, 100, 100, 50, 800, 800, 572, 50, 185, 25, 50, 572, 200, 400, 400, 572, 572, 185, 50, 50, 572, 25, 25, 910, 50, 100, 50, 50, 200, 800, 400, 800, 50, 800, 200, 572, 400, 185, 794, 794, 800, 800, 794, 572, 572, 910, 25, 200, 800, 25, 572, 400, 794, 910, 400, 185, 572, 910, 200, 794, 25, 185, 25, 200, 185, 400, 100, 100, 800, 200, 200, 25, 100, 794, 910, 100, 50, 25, 200, 910, 50, 50, 400, 800, 572, 100, 50, 910, 50, 25, 794, 185, 50, 100, 572, 800, 25, 25, 572, 100, 572, 200, 794, 185, 800, 910, 910, 800, 910, 100, 910, 25, 200, 50, 25, 100, 50, 572, 100, 400, 50, 400, 50, 100, 400, 400, 800, 185 };
        int A = 572;
        assertEquals(1144, amebadiv2.simulate(X, A));
    }

    @Test
    public void case31() {
        int[] X = { 943, 714, 435, 425, 425, 435, 943, 737, 737, 425, 435, 714, 435, 425, 435, 943, 737, 850, 850, 435, 850, 714, 737, 850, 425, 435, 943, 435, 850, 737, 850, 435, 737, 714, 435, 737, 425, 435, 425, 435, 737, 714, 850, 737, 714, 425, 714, 714, 850, 425, 737, 425, 714, 425, 737, 737, 425, 425, 714, 435, 425, 425, 425, 737, 943, 943, 850, 714, 714, 943, 714, 943, 435, 943, 850, 435, 943, 435, 425, 943, 425, 425, 435, 943, 714, 943, 435, 850, 850, 425, 425, 737, 943, 425, 435, 714, 943, 943, 435, 943, 425, 943, 850, 425, 943, 943, 435, 435, 714, 850, 425, 850, 714, 943, 435, 737, 943, 435, 943, 943, 714, 737, 737, 435, 943, 425, 943, 850, 850, 435, 850, 435, 435, 943, 850, 737, 435, 850, 425, 943, 714, 737, 737, 425, 737, 850, 714, 943, 850, 737, 850, 737, 425, 850, 943, 943, 435, 714, 425, 425, 943, 943, 850, 737, 850, 943, 714, 943, 435 };
        int A = 943;
        assertEquals(1886, amebadiv2.simulate(X, A));
    }

    @Test
    public void case32() {
        int[] X = { 353, 353, 592, 353, 1, 353, 923, 592, 592, 1, 923, 353, 1, 353, 592, 923, 353, 923, 592, 1, 592, 353, 1, 923, 923, 353, 592, 1, 1, 353, 353, 1, 1, 1, 1, 353, 353, 1, 923, 1, 592, 353, 1, 923, 592, 923, 923, 923, 592, 923, 592, 923, 353, 592, 1, 1, 592, 592, 1, 923, 592, 1, 1, 1, 353, 592, 353, 1, 353, 353, 592, 1, 592, 923, 592, 353, 353, 353, 1, 592, 1, 592, 1, 592, 1, 592, 353, 1, 1, 353, 1, 1, 353, 592, 923, 353, 1, 592, 592, 592, 592, 353, 923, 592, 592, 923, 1, 353, 592, 353, 353, 592, 923, 923, 1, 353, 923, 592, 1, 592, 592, 923, 923, 1, 353, 923, 1, 592, 592, 1, 353, 353, 353, 592, 592, 923, 353, 592, 1, 592, 592, 1, 1, 592, 1, 1, 353, 923, 592, 923, 923, 923, 1, 592, 1, 592, 353, 1, 592, 353, 923, 353, 592, 923, 592, 353, 1, 592, 353, 923, 923, 353, 592, 592, 592, 1 };
        int A = 1;
        assertEquals(2, amebadiv2.simulate(X, A));
    }

    @Test
    public void case33() {
        int[] X = { 66, 186, 620, 354, 39, 354, 708, 372, 538, 354, 354, 620, 708, 620, 186, 39, 744, 186, 354, 620, 733, 39, 620, 354, 372, 186, 733, 733, 66, 66, 39, 372, 372, 39, 66, 744, 354, 538, 372, 733, 708, 744, 186, 66, 372, 733, 538, 186, 733, 66, 708, 733, 186, 744, 66, 354, 620, 620, 708, 372, 66, 39, 186, 733, 708, 372, 354, 620, 708, 744, 372, 620, 744, 186, 620, 744, 39, 708, 538, 39, 620, 708, 186, 66, 708, 39, 372, 620, 39, 733, 186, 186, 620, 39, 186, 39, 744, 733, 372, 620, 744, 66, 538, 66, 354, 354, 538, 620, 538, 186, 708, 620, 744, 372, 354, 744, 372, 39, 354, 733, 744, 372, 372, 744, 66, 733, 66, 708, 708, 186, 66, 620, 39, 708, 354, 538, 39, 354, 620, 744, 538, 620, 744, 733, 708, 186, 66, 538, 66, 39, 66, 372, 538, 733, 372, 620, 66, 39, 186, 620, 620, 744, 708, 538, 186, 354, 66, 66, 708, 66, 39, 733, 66, 186, 354, 620, 372, 372, 538, 354, 66, 744, 744 };
        int A = 39;
        assertEquals(78, amebadiv2.simulate(X, A));
    }

    @Test
    public void case34() {
        int[] X = { 707, 707, 9, 707, 707, 707, 707, 707, 707, 707, 9, 707, 9, 9, 9, 9, 9, 707, 707, 9, 707, 9, 707, 707, 9, 707, 9, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 9, 9, 707, 707, 9, 9, 707, 9, 707, 9, 707, 707, 9, 707, 9, 9, 9, 707, 707, 707, 9, 9, 9, 707, 9, 707, 9, 9, 707, 707, 9, 9, 707, 707, 707, 9, 9, 9, 707, 9, 9, 9, 707, 707, 9, 9, 9, 707, 707, 9, 9, 9, 9, 9, 707, 9, 707, 707, 707, 9, 9, 707, 9, 707, 707, 707, 9, 707, 707, 707, 707, 9, 707, 707, 707, 707, 707, 9, 707, 707, 707, 9, 707, 707, 707, 9, 707, 9, 9, 9, 9, 707, 9, 9, 9, 707, 707, 707, 9, 9, 9, 9, 707, 9, 9, 9, 707, 9, 707, 9, 9, 707, 9, 707, 9, 9, 9, 707, 707, 707, 9, 707, 707, 9, 9, 707, 9, 707, 9, 707, 9, 9, 707, 9, 9, 707, 707, 707, 707, 707, 9, 707, 707, 707, 707, 707, 707, 707, 9, 9, 9, 9, 707 };
        int A = 9;
        assertEquals(18, amebadiv2.simulate(X, A));
    }

    @Test
    public void case35() {
        int[] X = { 65, 346, 706, 692, 706, 346, 65, 652, 65, 706, 173, 65, 326, 326, 65, 692, 65, 692, 326, 346, 652, 652, 692, 692, 326, 346, 346, 173, 692, 692, 652, 652, 326, 65, 692, 706, 326, 326, 173, 65, 652, 65, 326, 173, 692, 326, 326, 65, 692, 173, 173, 65, 706, 65, 173, 706, 652, 692, 173, 326, 692, 692, 65, 65, 326, 173, 326, 692, 65, 65, 346, 65, 706, 65, 652, 173, 706, 652, 346, 346, 652, 692, 173, 65, 652, 173, 326, 65, 173, 173, 652, 346, 173, 692, 173, 692, 173, 706, 65, 65, 692, 652, 346, 692, 326, 65, 692, 652, 65, 173, 326, 706, 173, 706, 692, 346, 692, 346, 65, 326, 173, 65, 346, 326, 706, 346, 706, 692, 65, 692, 173, 706, 173, 65, 173, 652, 326, 692, 173, 692, 652, 326, 706, 652, 652, 173, 173, 692, 65, 706, 346, 692, 346, 652, 652, 652, 173, 326, 326, 65, 65, 326, 692, 692, 173, 346, 173, 652, 652, 326, 652, 706, 65, 173, 692, 346, 706, 326, 706, 346, 326, 692, 346, 652, 652, 692, 652, 706, 346, 706, 65, 652, 706, 706, 692, 346, 706 };
        int A = 706;
        assertEquals(1412, amebadiv2.simulate(X, A));
    }

    @Test
    public void case36() {
        int[] X = { 782, 391, 391, 782, 804, 782, 804, 782, 391, 804, 391, 391, 782, 804, 391, 391, 782, 782, 782, 391, 391, 804, 804, 804, 804, 391, 391, 782, 804, 804, 782, 804, 391, 804, 804, 782, 391, 782, 391, 804, 391, 782, 391, 391, 804, 391, 804, 782, 782, 782, 782, 804, 391, 804, 804, 804, 804, 782, 804, 804, 391, 782, 782, 782, 391, 391, 391, 804, 804, 804, 391, 391, 391, 782, 804, 782, 391, 804, 391, 804, 804, 782, 804, 804, 782, 804, 804, 391, 391, 782, 391, 804, 782, 782, 782, 804, 804, 782, 804, 391, 391, 782, 782, 782, 782, 804, 782, 804, 804, 804, 391, 782, 782, 391, 782, 804, 391, 391, 804, 782, 804, 782, 391, 391, 391, 804, 391, 804, 391, 391, 804, 804, 391, 804, 391, 804, 782, 804, 804, 804, 391, 391, 804, 391, 391, 782, 391, 782, 782, 782, 782, 804, 391, 804, 782, 804, 804, 782, 782, 804, 782, 391, 804, 782, 782, 391, 804, 804, 782, 391, 391, 804, 391, 782, 391, 804, 804, 804, 804, 782, 782, 782, 391, 782, 782, 391, 804, 391, 804, 804, 804, 391, 391, 804, 804, 391, 391, 782, 391, 804 };
        int A = 804;
        assertEquals(1608, amebadiv2.simulate(X, A));
    }

    @Test
    public void case37() {
        int[] X = { 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150 };
        int A = 150;
        assertEquals(300, amebadiv2.simulate(X, A));
    }

    @Test
    public void case38() {
        int[] X = { 732, 90, 90, 90, 90, 16, 180, 180, 16, 180, 16, 360, 90, 732, 32, 32, 366, 732, 90, 732, 180, 32, 32, 90, 732, 366, 90, 16, 360, 360, 180, 16, 32, 360, 366, 32, 16, 32, 16, 366, 180, 180, 180, 732, 180, 180, 732, 90, 366, 732, 366, 366, 16, 732, 32, 360, 360, 16, 180, 16, 732, 732, 366, 16, 366, 16, 180, 360, 180, 360, 16, 32, 90, 366, 32, 366, 180, 32, 366, 16, 180, 32, 16, 32, 32, 16, 732, 32, 16, 16, 366, 360, 32, 366, 16, 732, 32, 180, 732, 180, 360, 180, 360, 732, 16, 360, 366, 90, 360, 366, 366, 32, 732, 90, 32, 732, 732, 32, 366, 90, 366, 360, 32, 360, 732, 360, 366, 90, 32, 180, 366, 32, 360, 180, 32, 16, 32, 32, 732, 32, 16, 180, 32, 16, 366, 180, 360, 732, 180, 16, 360, 360, 366, 90, 32, 360, 360, 360, 16, 32, 16, 360, 366, 360, 32, 16, 16, 32, 732, 366, 180, 180, 32, 360, 366, 360, 90, 90, 16, 360, 180, 32, 16, 32, 16, 90, 180, 16, 366, 16, 366, 732, 366, 360, 180, 90, 16, 366, 366, 180 };
        int A = 16;
        assertEquals(64, amebadiv2.simulate(X, A));
    }

    @Test
    public void case39() {
        int[] X = { 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147, 147 };
        int A = 147;
        assertEquals(294, amebadiv2.simulate(X, A));
    }

    @Test
    public void case40() {
        int[] X = { 99, 508, 396, 99, 326, 971, 396, 652, 326, 396, 652, 326, 396, 971, 508, 396, 971, 99, 396, 971, 652, 396, 652, 508, 326, 971, 99, 508, 396, 396, 326, 99, 396, 326, 508, 652, 99, 508, 99, 971, 99, 508, 508, 508, 652, 652, 326, 508, 508, 971, 508, 971, 99, 971, 652, 396, 508, 652, 396, 99, 508, 396, 652, 396, 396, 971, 396, 971, 326, 652, 971, 652, 971, 971, 508, 508, 652, 971, 396, 326, 99, 652, 99, 508, 652, 396, 508, 508, 652, 326, 508, 652, 326, 652, 652, 652, 652, 508, 508, 508, 396, 99, 99, 508, 652, 652, 396, 508, 508, 326, 396, 396, 326, 99, 652, 508, 396, 326, 396, 652, 326, 971, 508, 971, 326, 508, 326, 652, 326, 971, 971, 396, 971, 396, 971, 971, 99, 326, 99, 326, 99, 652, 508, 326, 508, 971, 326, 652, 652, 652, 396, 971, 971, 326, 326, 396, 508, 326, 396, 326, 99, 652, 508, 971, 971, 326, 396, 652, 971, 652, 396, 971, 508, 508, 396, 971, 652, 508, 971, 396, 326, 971, 971, 396, 508, 396, 99, 326, 652, 326, 326, 396, 652, 326, 326, 971, 508, 971, 396, 971 };
        int A = 971;
        assertEquals(1942, amebadiv2.simulate(X, A));
    }

    @Test
    public void case41() {
        int[] X = { 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62 };
        int A = 62;
        assertEquals(124, amebadiv2.simulate(X, A));
    }

    @Test
    public void case42() {
        int[] X = { 817, 120, 480, 60, 817, 817, 120, 240, 240, 817, 480, 480, 480, 480, 60, 240, 817, 60, 120, 120, 240, 60, 480, 240, 817, 120, 60, 120, 60, 120, 240, 817, 240, 817, 817, 60, 120, 480, 60, 480, 240, 240, 817, 817, 120, 240, 817, 60, 240, 120, 240, 480, 817, 480, 120, 240, 240, 120, 480, 480, 120, 240, 240, 240, 817, 120, 240, 817, 480, 817, 480, 480, 120, 817, 480, 60, 817, 60, 60, 480, 60, 60, 60, 480, 817, 240, 240, 120, 60, 60, 120, 120, 120, 120, 817, 817, 240, 60, 240, 480, 120, 817, 120, 60, 120, 120, 120, 240, 480, 120, 120, 240, 480, 480, 240, 240, 120, 120, 120, 60, 817, 240, 480, 480, 817, 817, 60, 120, 120, 120, 480, 817, 60, 480, 120, 120, 240, 480, 120, 240, 240, 817, 480, 480, 120, 240, 240, 60, 480, 60, 480, 60, 240, 120, 60, 817, 120, 120, 60, 240, 480, 817, 480, 817, 60, 60, 480, 480, 240, 120, 480, 240, 120, 120, 480, 120, 120, 120, 120, 60, 120, 240, 817, 60, 817, 60, 817, 240, 120, 240, 60, 120, 480, 60, 60, 817, 480, 120, 120, 817 };
        int A = 60;
        assertEquals(960, amebadiv2.simulate(X, A));
    }

    @Test
    public void case43() {
        int[] X = { 30, 869, 777, 889, 777, 60, 777, 60, 30, 892, 892, 889, 30, 777, 869, 30, 30, 869, 889, 892, 30, 889, 777, 30, 892, 869, 889, 777, 892, 60, 892, 30, 889, 892, 889, 892, 777, 889, 869, 777, 869, 869, 60, 60, 892, 30, 892, 892, 777, 60, 777, 30, 892, 30, 869, 892, 869, 869, 889, 892, 777, 869, 30, 889, 777, 60, 892, 889, 889, 777, 869, 60, 869, 892, 60, 889, 889, 777, 869, 889, 777, 60, 869, 777, 60, 777, 869, 869, 869, 889, 777, 889, 30, 892, 777, 60, 892, 869, 30, 889, 892, 30, 892, 889, 892, 60, 869, 892, 777, 30, 892, 892, 892, 892, 60, 777, 889, 869, 869, 889, 892, 30, 892, 889, 777, 892, 30, 889, 777, 60, 889, 869, 869, 777, 892, 30, 889, 30, 777, 889, 60, 777, 892, 892, 60, 892, 60, 892, 30, 869, 777, 869, 777, 889, 892, 869, 889, 869, 30, 30, 777, 777, 869, 30, 60, 60, 869, 60, 30, 777, 892, 777, 60, 869, 869, 30, 869, 889, 869, 60, 869, 30, 30, 889, 30, 30, 889, 777, 869, 869, 777, 60, 30, 777, 889, 889, 60, 889, 30, 892 };
        int A = 30;
        assertEquals(120, amebadiv2.simulate(X, A));
    }

    @Test
    public void case44() {
        int[] X = { 112, 28, 56, 28, 516, 258, 112, 516, 56, 516, 56, 258, 516, 516, 56, 56, 516, 516, 56, 112, 516, 112, 56, 516, 112, 112, 516, 56, 516, 258, 28, 112, 258, 258, 28, 112, 516, 112, 56, 112, 258, 56, 516, 28, 516, 112, 258, 56, 516, 56, 56, 56, 28, 258, 56, 112, 56, 112, 56, 258, 258, 56, 258, 56, 258, 112, 56, 56, 516, 516, 516, 258, 28, 28, 56, 516, 112, 112, 516, 28, 516, 112, 258, 516, 112, 516, 28, 516, 516, 516, 516, 516, 28, 112, 56, 112, 56, 112, 516, 258, 28, 258, 28, 258, 28, 56, 28, 258, 516, 112, 112, 258, 516, 516, 112, 56, 28, 258, 28, 516, 28, 516, 258, 112, 112, 112, 516, 258, 258, 258, 516, 112, 56, 112, 56, 258, 258, 258, 516, 56, 112, 516, 112, 516, 28, 258, 56, 258, 28, 56, 28, 516, 28, 56, 258, 112, 56, 56, 28, 112, 258, 28, 258, 258, 56, 28, 28, 28, 112, 112, 258, 258, 258, 56, 516, 258, 28, 112, 28, 258, 516, 56, 28, 28, 28, 516, 258, 56, 56, 56, 112, 56, 258, 56, 56, 516, 258, 258, 56, 258 };
        int A = 28;
        assertEquals(224, amebadiv2.simulate(X, A));
    }

    @Test
    public void case45() {
        int[] X = { 146, 584, 73, 634, 850, 317, 292, 292, 73, 850, 890, 292, 317, 73, 146, 890, 584, 850, 890, 634, 890, 73, 317, 73, 890, 584, 634, 850, 317, 146, 317, 634, 146, 73, 73, 146, 146, 317, 634, 850, 890, 292, 634, 890, 146, 146, 73, 73, 317, 146, 317, 292, 850, 317, 146, 445, 445, 146, 445, 73, 292, 584, 890, 890, 317, 850, 317, 445, 146, 146, 890, 634, 584, 73, 73, 317, 292, 850, 317, 292, 584, 584, 292, 146, 146, 73, 890, 850, 73, 445, 445, 890, 445, 634, 850, 634, 73, 850, 850, 850, 146, 445, 850, 73, 584, 445, 584, 584, 317, 292, 584, 317, 890, 292, 146, 850, 317, 584, 445, 73, 850, 146, 146, 634, 584, 634, 634, 634, 850, 317, 445, 317, 73, 146, 890, 292, 890, 890, 890, 584, 146, 292, 146, 292, 445, 73, 317, 850, 445, 292, 146, 634, 890, 292, 634, 292, 317, 890, 890, 890, 584, 73, 146, 634, 73, 146, 634, 73, 890, 317, 850, 634, 146, 850, 584, 445, 146, 850, 317, 850, 292, 292, 292, 445, 634, 317, 146, 317, 317, 890, 317, 850, 146, 584, 317, 445, 850, 292, 634, 317 };
        int A = 292;
        assertEquals(1168, amebadiv2.simulate(X, A));
    }

    @Test
    public void case46() {
        int[] X = { 794, 945, 822, 397, 822, 794, 397, 397, 397, 945, 794, 945, 397, 822, 794, 822, 945, 822, 397, 945, 945, 794, 822, 945, 945, 397, 945, 397, 945, 822, 945, 794, 794, 822, 945, 945, 794, 397, 794, 397, 822, 794, 794, 397, 822, 945, 397, 945, 397, 945, 945, 822, 397, 794, 822, 945, 397, 794, 945, 397, 822, 822, 822, 822, 397, 822, 945, 794, 822, 945, 945, 945, 945, 945, 794, 945, 945, 397, 397, 945, 822, 397, 945, 945, 794, 822, 822, 397, 397, 397, 397, 794, 794, 822, 397, 945, 794, 945, 945, 794, 794, 822, 397, 397, 945, 945, 794, 822, 397, 794, 397, 397, 822, 794, 945, 822, 794, 822, 397, 397, 397, 397, 822, 945, 397, 397, 794, 945, 794, 794, 397, 945, 945, 397, 822, 397, 822, 794, 945, 794, 945, 945, 794, 822, 945, 945, 794, 397, 397, 822, 945, 794, 945, 945, 397, 794, 397, 822, 822, 794, 397, 945, 945, 794, 397, 794, 794, 822, 397, 397, 945, 945, 397, 945, 822, 794, 945, 794, 397, 822, 794, 945, 945, 945, 822, 822, 397, 794, 794, 794, 822, 397, 397, 794, 794, 794, 822, 822, 945, 822 };
        int A = 397;
        assertEquals(1588, amebadiv2.simulate(X, A));
    }

    @Test
    public void case47() {
        int[] X = { 1, 4, 9, 16, 25, 36, 49 };
        int A = 10;
        assertEquals(10, amebadiv2.simulate(X, A));
    }

    @Test
    public void case48() {
        int[] X = { 8, 4, 2, 1 };
        int A = 1;
        assertEquals(2, amebadiv2.simulate(X, A));
    }

    @Test
    public void case49() {
        int[] X = { 817, 832, 817, 832, 126, 817, 63, 63, 126, 817, 832, 287, 823, 817, 574 };
        int A = 63;
        assertEquals(252, amebadiv2.simulate(X, A));
    }

    @Test
    public void case50() {
        int[] X = { 4, 3, 1, 2 };
        int A = 1;
        assertEquals(4, amebadiv2.simulate(X, A));
    }

    @Test
    public void case51() {
        int[] X = { 8, 4 };
        int A = 4;
        assertEquals(8, amebadiv2.simulate(X, A));
    }

    @Test
    public void case52() {
        int[] X = { 8, 2, 4 };
        int A = 2;
        assertEquals(8, amebadiv2.simulate(X, A));
    }

    @Test
    public void case53() {
        int[] X = { 2, 1 };
        int A = 1;
        assertEquals(2, amebadiv2.simulate(X, A));
    }

    @Test
    public void case54() {
        int[] X = { 1 };
        int A = 1;
        assertEquals(2, amebadiv2.simulate(X, A));
    }

    @Test
    public void case55() {
        int[] X = { 1, 8, 4, 16, 2 };
        int A = 1;
        assertEquals(4, amebadiv2.simulate(X, A));
    }

    @Test
    public void case56() {
        int[] X = { 3, 2, 1 };
        int A = 1;
        assertEquals(2, amebadiv2.simulate(X, A));
    }

    @Test
    public void case57() {
        int[] X = { 4, 2, 1 };
        int A = 1;
        assertEquals(2, amebadiv2.simulate(X, A));
    }

    @Test
    public void case58() {
        int[] X = { 4, 1, 3, 1, 2 };
        int A = 1;
        assertEquals(4, amebadiv2.simulate(X, A));
    }

    @Test
    public void case59() {
        int[] X = { 2, 1, 3, 1, 2, 1 };
        int A = 1;
        assertEquals(4, amebadiv2.simulate(X, A));
    }

    @Test
    public void case60() {
        int[] X = { 4, 2, 1 };
        int A = 2;
        assertEquals(4, amebadiv2.simulate(X, A));
    }

    @Test
    public void case61() {
        int[] X = { 4, 2 };
        int A = 2;
        assertEquals(4, amebadiv2.simulate(X, A));
    }

    @Test
    public void case62() {
        int[] X = { 4, 1, 2 };
        int A = 1;
        assertEquals(4, amebadiv2.simulate(X, A));
    }

    @Test
    public void case63() {
        int[] X = { 4, 2, 8 };
        int A = 2;
        assertEquals(4, amebadiv2.simulate(X, A));
    }

    @Test
    public void case64() {
        int[] X = { 1, 2, 1 };
        int A = 1;
        assertEquals(4, amebadiv2.simulate(X, A));
    }

}
