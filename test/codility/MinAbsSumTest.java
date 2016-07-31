package topc.test.codility;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.codility.*;

public class MinAbsSumTest {
    MinAbsSum sut = new MinAbsSum();

    @Test
    public void case1() {
        assertEquals(0, sut.solution(new int[] { 1, 5, 2, -2 }));
    }

    @Test
    public void case2() {
        assertEquals(5, sut.solution(new int[] { 5, 5, 5 }));
    }

    @Test
    public void case3() {
        assertEquals(5, sut.solution(new int[] { 5 }));
    }


    @Test
    public void case4() {
        assertEquals(1, sut.solution(new int[] { 5, 4 }));
    }


    @Test
    public void case5() {
        assertEquals(0, sut.solution(new int[] { 2, 3, 5 }));
    }


    @Test
    public void case6() {
        assertEquals(0, sut.solution(new int[] { 3, 3, 3, 4, 5 }));
    }

    @Test
    public void case7() {
        assertEquals(91, sut.solution(new int[] { -100, 3, 2, 4 }));
    }

    @Test
    public void case8() {
        int A[] = new int[] {60,35,43,85,4,-49,25,56,-91,63,81,23,94,83,79,-22,18,-74,58,-38,46,70,2,23,63,-78,87,-87,35,47,-33,14,-72,-77,21,-97,-85,-94,40,-50,88,66,-32,-72,0,-83,56,-25,31,76,-90,1,88,7,-51,74,52,-8,44,28,91,18,33,-99,-80,-8,75,-49,-21,-82,-3,-26,-14,-20,18,-27,80,-96,-50,90,-67,14,35,-11,14,2,-92,-63,-80,60,57,78,82,-3,9,-35,-22,-27,15,9,82,6,-69,-31,45,88,44,73,100,71,14,-73,-33,9,-30,29,-100,43,-43,97,-64,-82,-84,94,3,12,32,-68,-96,62,42,-79,18,48,21,-58,-13,43,-47,97,-14,45,100,-25,20,-57,-27,84,-29,-70,11,58,-52,43,80,-62,-89,91,24,-83,-79,54,-90,-33,-34,-30,35,45,83,-65,87,66,-82,83,-47,-17,-7,-36,65,-30,2,-8,35,-34,-34,-13,-64,71,-10,80,-62,85,20,-75,63,63,-17,8,43,-88,-65,-97,22,-54,32,-44,-61,-73,-4,21,-82,-99,-70,-59,-81,-71,0,-99,-30,68,78,-3,-38,10,45,-38,-70,13,-48,-65,-91,-54,-19,-86,-43,-67,-79,95,99,-71,81,20,62,23,76,37,79,-88,18,65,43,-68,-11,-80,12,2,96,18,22,-19,-80,-18,-100,-52,0,-56,4,84,-31,-7,82,-93,-35,-62,-50,-61,-84,23,-98,-10,7,-39,62,-33,-19,12,-98,27,2,-22,46,66,-31,4,-5,87,-5,-68,-1,-86,86,-100,12,10,-71,5,-26,73,-38,-28,-87,-41,-76,8,-39,-27,51,-49,27,-7,-92,72,96,-33,96,-47,-39,96,-42,89,-90,8,74,-92,-81,31,-10,55,-74,-69,-47,62,-17,47,-40,-56,77,-29,65,-10,-57,16,12,82,-84,-8,32,16,19,75,-48,54,-10,-87,67,-94,26,44,33,73,21,82,-32,56,66,99,-54,-25,-10,60,-66,77,-23,18,-9,-29,-53,97,-6,17,83,-36,-37,2,76,-24,-65,-57,-69,46,99,-52,68,-33,-78,-82,-96,38,93,73,-57,-42,11,12,-82,95,20,6,-90,-11,46,-94,7,72,-60,27,-90,97,-37,-89,-47,-97,-10,-59,-59,43,73,-100,34,13,83,40,-60,-87,-32,23,67,-68,-3,-2,88,75,-45,5,59,31,2,2,-54,3,-12,-97,-33,36,91,-66,-15,6,-38,-85,-40,-36,97,40,-35,-59,-11,-94,-84,-7,-84,83,-40,-83,72,95,-33,-86,38,-3,41,75,-7,-43,92,-10,4,86,59,84,73,10,49,-73,-91,-33,58,56,-3,85,-8,45,53,67,-94,67,-71,63,66,-92,34,-55,-19,-99,-87,17,-71,-48,50,84,-36,-54,-14,76,96,63,-18,-15,-74,48,-9,57,29,24,50,-19,-19,-39,-50,9,-23,-13,57,39,-19,-12,-37,80,-69,100,-65,63,-4,23,-68,82,37,56,48,-27,-43,-47,23,44,-60,43,-60,-14,-51,-54,-29,82,19,0,54,55,75,22,21,-87,97,4,68,-36,51,0,-82,88,11,18,82,84,-82,-90,90,-74,-53,-18,-69,-95,88,42,-87,95,33,92,64,80,52,54,-95,69,-97,24,-97,-14,1,51,-78,-93,75,-75,29,46,95,-13,91,-32,-16,-64,83,-40,-38,-8,-16,-13,49,5,71,16,-73,-77,42,29,58,70,-84,-1,97,-2,-42,-30,-40,20,53,80,59,-62,84,82,-45,83,-27,-98,71,-18,-64,-70,-74,37,-28,59,59,-63,24,-66,75,-49,-93,-61,94,-9,-49,50,42,5,-42,90,5,-29,-11,55,-53,95,-54,24,46,72,19,41,-20,-93,-84,-44,-43,23,-91,57,-88,-82,-20,38,-1,60,0,69,32,-54,-79,72,-87,-28,91,-5,-10,64,32,96,-67,82,-37,18,18,-66,-59,10,23,-10,-59,69,-30,74,72,98,67,-46,-72,-100,62,64,52,-31,-54,29,-28,-31,39,-35,-99,27,-98,-32,96,-15,50,74,-41,12,94,-16,-11,-74,16,81,-24,-55,68,80,66,-27,-19,50,81,-18,-2,96,-17,-51,-35,-45,45,-33,-85,47,75,94,16,100,54,-98,35,-82,7,-51,52,2,-23,82,-37,62,56,-16,44,-19,98,54,-66,-9,9,20,-65,-95,-66,58,-79,-66,-22,-68,-19,-56,85,-42,-66,-23,-18,43,75,27,49,18,-58,-87,43,57,-40,7,74,51,98,-34,68,-50,-70,28,-18,28,-85,-73,95,-91,-33,-60,-45,-23,-87,51,13,-46,92,-38,-90,49,-47,65,57,17,-38,63,-38,20,23,-24,95,46,92,82,-86,82,-24,45,29,50,50,-75,-3,-12,-78,3,-96,18,95,-54,-32,-49,-62,-75,13,46,72,58,-60,-24,73,76,35,32,-87,3,65,-100,-12,77,-11,-87,73,-55,22,30,-21,52,-64,-91,-7,76,-98,-38,59,10,64,13,17,-31,-12,80,-2,-97,25,-91,-50,-77,-18,76,37,-36,-85,-67,72,17,-2,11,16,-23,86,-49,32,-18,-90,59,-84,65,3,54,57,-84,-72,22,70,68,-25,29,-88,-96,-43,-37,-48,14,-80,-37,99,-62,-6,11,55,-76,83,-97,90,20,-69,-94,6,4,-20,-55,-12,-100,-65,61,-71,79,100,-6,44,-96,-14,96,-16,-40,30,0,-78,59,-52,-51,-20,52,-69,-32,26,-95,75,47,71,-84,93,-71,-10,-27,97,39,28,-60,-67,-44,26,76,-14,-23,-9,52,-10,5,-37,35,41,-53,-87,98,47,-80,-10,48,5,-29,-96,-64,-42,57,61,-31,-93,-82,-95,5,-50,66,49,88,75,50,80,31,52,44,84,36,34,1,-6,81,-85,-78,60,0,88,94,8,-51,56,-21,82,-57,-63,47,87,82,64,-78,91,-63,3,32,74,38,-63,-27,27,-14,-34,54,-23,-33,-16,-38,22,9,26,-16,-73,-69,52,94,-76,25,4,-93,-74,94,84,90,67,19,-78,-2,52,54,-25,-77,-78,-38,31,-50,28,89,-68,62,-59,-79,-17,95,56,-86,-75,-91,-15,69,-43,5,57,90,-20,-9,20,17,-14,-8,11,50,-22,92,-32,4,-96,35,-3,39,-61,41,-74,25,53,-61,55,-81,-7,30,42,-99,-5,-22,12,58,87,-20,9,-86,80,-14,-25,-49,80,16,-54,-93,-34,-31,-73,42,-62,-83,-85,64,-15,-16,58,95,79,86,-80,-5,-88,61,-21,43,-67,80,56,7,-14,6,35,-68,42,68,22,-18,73,13,94,-45,-40,44,50,-89,93,-96,90,26,100,-85,-88,-48,-31,29,0,7,100,42,28,-71,53,-39,6,61,-34,-12,-12,-53,-92,80,-16,-69,62,28,10,-47,-89,24,-100,80,-35,25,31,68,33,-50,-5,-39,0,-8,-42,-14,-10,46,-62,54,-6,-86,36,-31,26,44,-32,39,81,31,-40,14,27,-32,7,-95,15,-88,-61,18,23,54,-45,-6,-71,-17,-89,-42,-43,-71,91,31,47,28,-61,-84,-63,-45,-75,53,15,-6,30,94,89,16,50,81,-91,50,27,-47,73,61,-6,-95,93,5,-87,65,42,-97,-5,-33,-25,9,-51,-77,-34,-3,84,99,3,-79,-50,47,97,60,67,-45,-61,100,78,88,-95,12,-52,94,76,-92,48,7,97,-18,75,70,73,-8,-11,-84,74,36,43,31,70,84,-23,6,85,53,-70,56,36,-49,-39,1,-2,-15,72,5,-73,57,59,-52,19,40,-55,-37,35,67,-85,6,96,82,-71,-16,-78,43,7,-33,-24,52,92,72,71,31,2,-77,25,44,57,-25,-67,-61,-93,23,-68,82,-24,-32,16,-63,45,53,-53,21,53,58,-26,-10,48,-11,-68,95,-7,-29,-32,17,-34,59,77,-91,53,23,-72,96,-76,28,-61,-95,-70,-31,-32,-33,57,-94,-91,-17,-13,73,-34,45,-21,-79,37,52,-94,-7,-49,-76,15,-27,-24,-60,52,73,-26,-2,-46,100,-53,46,-40,80,76,-57,-24,56,50,-55,93,-2,-63,-68,-28,-62,-79,94,-80,-50,92,34,75,-72,-26,99,94,96,47,-33,-78,29,54,17,74,32,-19,-22,85,55,69,14,5,-96,55,75,-40,-27,-38,12,96,-81,-64,-56,23,95,-77,-80,78,7,4,-76,70,3,73,56,44,74,-74,26,-35,-1,17,-34,66,-96,-25,-81,74,41,52,40,-39,-97,-87,86,-85,60,-86,40,18,-24,-77,29,-42,75,-42,-77,-93,14,-8,-61,-66,76,72,-85,-58,32,-14,57,69,11,-32,28,53,33,-9,-41,-95,-46,99,-11,27,-63,-49,-72,63,71,-65,-35,98,-80,-95,-39,-57,-54,38,68,83,-30,-66,33,-34,-58,69,56,53,28,-44,38,58,-70,-15,11,-38,-8,54,-46,-25,-43,-59,82,1,26,-13,94,0,-7,-48,-78,-54,-3,-84,67,0,47,94,39,-79,44,-48,23,-92,27,91,-53,-28,-79,-66,74,52,46,58,-20,-89,-21,-66,22,-59,91,53,81,52,-51,47,-49,17,-41,-80,2,-43,27,40,64,40,-74,21,-64,-28,52,48,49,-23,36,-57,84,-81,-65,-77,41,88,10,-40,-83,64,76,-61,-67,-32,80,-24,-41,-96,-86,3,-79,52,65,-21,95,90,-89,-50,-30,-42,36,-31,56,-54,-34,43,51,-15,-66,-85,71,43,24,-80,85,-11,88,59,77,-35,-85,8,-69,-31,-49,4,22,-51,87,-14,-10,16,25,12,0,15,-50,-19,-60,-54,99,-12,-72,0,95,-43,73,96,-66,-85,54,96,40,1,-45,-87,68,-42,-70,59,62,93,92,-88,-53,-64,38,46,5,16,-44,9,73,-9,-40,31,-86,50,-42,44,52,-76,33,-5,-2,73,-62,78,-92,-30,6,-42,40,56,-37,-9,-48,47,-24,53,-16,-69,20,-34,100,-48,4,87,65,90,36,23,70,89,2,-18,-87,88,0,-18,-77,39,-80,41,-98,5,34,6,37,13,-69,-61,13,-24,22,-73,49,-47,2,-78,29,-17,62,78,1,67,-3,10,-49,-74,81,66,-22,-55,8,-25,76,76,35,-93,9,-35,63,-65,83,70,-38,-68,14,84,-75,82,83,49,11,-2,68,-67,7,-76,-73,65,-42,82,-14,-14,36,-36,20,-75,-41,-12,-44,9,-81,21,9,-13,-33,64,-66,14,7,-65,12,35,51,-97,-94};
        assertEquals(1, sut.solution(A));
    }

    @Test
    public void case9() {
        int A[] = new int[] {0,90,0,-20,10,10,-80,20,60,-70,90,100,-60,30,-50,70,70,0,40,90,-20,-80,60,-80,10,-20,-40,20,-20,-50,40,70,-60,30,-20,100,10,40,-20,-60,-40,-100,-80,20,-30,70,-20,-30,-90,-40,50,-40,50,60,-50,-70,40,-100,-90,-40,-20,-70,90,-100,50,-30,-40,-10,60,60,-40,-10,40,60,30,-40,100,50,-30,40,70,-10,30,60,-100,10,-70,40,-90,-80,90,-90,-50,-90,40,80,70,-40,60,30,80,40,50,0,-90,30,10,10,30,30,-40,-60,100,30,-20,-100,-100,20,10,-90,40,0,40,-90,0,40,100,-20,20,30,-20,10,50,-30,-70,80,90,30,100,100,-70,10,-40,10,-60,100,0,90,100,-50,-40,50,80,50,-30,-10,50,-40,-40,80,-100,-50,30,20,50,40,50,-50,-40,100,50,40,-60,40,-60,-100,0,20,-90,80,-10,-80,60,-50,-10,40,-90,-70,-20,40,-40,80,100,0,-10,30,-30,50,60,-60,100,-50,90,50,70,-20,20,60,20,100,-60,10,90,-50,-10,-100,-80,-40,-20,0,-90,10,-90,0,50,70,-90,-70,-50,-60,30,80,0,-90,-60,-10,-90,100,40,0,10,50,-10,20,-60,50,0,90,-60,30,-70,-20,70,30,0,10,30,-40,70,100,-80,-90,70,40,0,-30,-40,80,-40,0,-10,-50,60,-40,60,-40,70,80,-30,-80,-80,60,-10,0,-80,-40,-50,50,-70,-90,-40,-50,-20,-50,-20,-90,-10,-50,10,-70,-100,-40,80,-10,-50,70,100,30,60,90,-90,80,20,80,-60,100,-30,-90,30,-10,80,-70,-90,50,-30,-40,70,80,60,-20,-30,-60,-100,-10,80,100,-100,60,-80,-40,-60,40,-50,100,-20,40,100,-10,100,-90,30,20,-90,80,-50,60,70,80,0,20,50,-60,40,-70,-20,50,20,90,-70,60,-20,-50,-70,40,50,30,-80,30,50,20,70,30,80,70,-30,-50,40,-50,20,-60,-20,80,-40,100,-40,70,-50,40,40,-100,20,100,-100,-70,-60,-40,-30,-40,-60,-50,-20,90,40,70,-40,30,80,-40,40,-40,10,-80,70,-20,0,-100,70,0,-30,-70,0,30,100,70,-100,90,-80,-100,70,60,0,0,60,-90,20,-30,-100,40,60,-30,-20,-70,-90,100,100,-40,60,-60,-40,40,20,-90,100,90,-20,-70,40,-100,-50,-20,10,-60,50,70,90,-20,40,20,10,90,0,-10,-70,100,70,90,-70,80,-50,80,-60,-60,100,90,-30,-90,-100,-40,10,100,-10,80,-40,-60,-40,60,10,100,40,90,-10,-30,20,80,50,70,80,-90,30,-70,0,-70,-70,-20,-30,10,70,-70,50,30,20,-30,-20,80,10,-10,-10,30,-30,-70,40,90,80,40,-40,40,-20,40,100,40,-100,-50,-30,50,90,40,50,30,60,-70,-20,0,70,20,-100,-60,60,40,60,80,-60,-10,80,70,60,-20,-10,60,30,40,-10,90,60,50,40,50,-10,20,90,-100,10,-90,40,-30,-90,100,10,0,-80,10,60,20,10,-20,90,-90,40,20,-80,-30,90,-30,20,-60,-40,-80,10,-60,30,90,100,40,50,-80,100,-60,-40,0,-50,-40,80,100,90,50,-100,20,0,-100,0,80,-100,100,30,-40,50,0,20,-90,-20,-50,50,90,40,70,30,-30,-70,40,-80,10,100,20,-50,90,-50,40,60,-30,30,-50,-30,-80,40,60,-40,-80,-40,-60,50,-20,50,-50,20,-100,-20,-40,100,90,-100,30,-80,0,-10,-60,-30,-100,70,-60,70,-20,40,-20,60,70,0,-100,-20,-70,50,100,30,-10,90,50,30,30,100,-20,40,-30,-100,90,-10,10,30,10,-50,60,-10,10,20,60,20,-50,90,-90,-100,-80,-40,-90,30,20,-40,-40,-20,-50,-50,40,80,-100,60,-30,100,-60,-10,-50,90,-80,-80,-50,60,50,-80,-100,-80,-40,-100,20,-50,60,100,-100,-90,10,90,10,100,-80,90,10,-80,40,0,40,0,40,-100,-100,-10,-30,30,70,-60,0,-20,0,-10,40,100,90,-50,100,50,-90,10,-70,-90,60,80,-90,-60,-30,0,-30,-100,-50,-10,-50,-10,10,40,-80,-70,70,20,90,0,-50,-100,90,-50,-80,50,80,-20,-50,-70,40,60,-40,-40,-10,-100,0,-30,10,-30,80,0,-30,80,90,-90,-10,30,20,-50,80,-10,70,-60,-60,50,0,-80,50,-20,-60,100,70,-50,30,40,-80,-50,80,70,-40,40,100,-80,80,-30,100,30,-80,30,-80,-50,100,40,-60,30,-20,-80,0,70,20,-100,0,10,100,-40,40,-90,-100,-50,20,-20,20,20,30,-80,-40,-60,30,-80,-70,70,-60,-70,0,30,100,70,-50,80,-40,-50,-60,-60,-100,-90,-10,-80,100,20,70,-20,-60,-40,10,50,0,70,100,-10,90,10,-50,100,30,40,-100,-40,-40,-100,50,30,80,0,100,20,20,-90,0,40,100,-70,90,60,40,50,-100,-90,-100,-70,-10,20,-70,-40,0,-10,-50,90,80,30,-40,70,30,50,30,70,20,-30,100,-20,30,30,90,-40,0,70,90,70,-70,60,-50,-80,10,-30,0,-60,-80,-90,-90,70,-80,40,40,60,70,-100,-40,30,-90,100,30,-30,-60,60,-60,-100,-100,-100,0,-10,-70,-10,-20,80,10,-40,-80,50,40,70,100,40,90,70,-50,30,-40,0,20,10,-10,60,-30,10,70,100,-90,-50,-80,-10,-40,0,0,-10,-40,30,90,60,70,60,90,-80,-60,80,80,-60,100,-60,30,-50,50,-30,30,90,-70,-20,-80,-100,100,-40,-30,10,-90,-90,40,-70,-10,30,-50,30,-40,20,60,-60,10,-60,50,-40,0,40,-90,-80,60,-30,100,-100,-20,-80,90,-90,30,90,-50,-60,70,-40,70,10,-50,-80,-30,60,10,50,-100,80,50,-10,40,70,-60,-20,-70,-50,100,30,-100,-50,40,70,-20,-60,60,0,-100,-100,-60,-70,-20,10,-50,-50,-20,90,-50,-60,-30,-20,-30,10,-70,-10,80,-40,10,-60,-90,90,40,-50,-60,10,100,-10,-90,-60,-70,30,-90,-100,-20,-100,20,40,-40,70,90,100,40,-90,0,-10,90,-100,-100,-30,40,-60,20,-40,30,90,0,90,30,20,-100,60,-90,-100,-20,80,-100,90,20,-80,10,100,-20,0,-100,-20,80,-10,20,-100,50,-20,-80,70,80,40,0,-70,90,50,90,20,-50,-50,100,-100,-80,-30,20,20,20,-10,90,-100,30,0,70,50,60,-30,90,30,-80,-90,-90,-100,30,0,-60,-90,-60,-70,-100,10,20,-80,-90,-80,0,50,-90,-70,10,30,30,30,-90,-90,-80,-30,10,80,100,-60,0,70,-70,-50,-50,-100,50,70,70,-100,50,-70,10,-50,-10,-100,10,10,-30,50,-20,10,10,-80,40,80,40,100,-10,-90,20,-70,-20,-50,70,40,-10,40,40,0,100,-80,10,-70,50,0,20,20,30,-40,0,-10,80,100,-80,-10,0,40,-60,-40,40,20,-100,60,-100,100,-100,-80,-20,-20,-80,70,60,-10,40,90,0,40,-90,-90,-10,80,-80,-40,-50,-90,-60,-10,-100,70,100,-70,-50,-50,-60,90,90,-20,-100,-60,-50,-70,70,-70,90,50,90,100,0,0,10,70,-10,100,10,40,100,50,-40,-80,-70,70,50,-70,-70,80,30,-30,-50,-60,-50,-50,70,-10,90,-90,30,40,10,10,-20,0,-10,-30,-70,-30,100,-100,-40,0,-80,70,-40,80,70,20,40,80,-100,100,-80,0,40,-10,40,-100,-20,-40,-90,0,-80,80,-50,-60,-30,-40,-50,-50,0,-50,30,-40,-50,50,-80,70,90,-90,-90,-10,10,30,60,-100,-50,10,100,20,100,-100,40,40,-100,20,-30,30,-40,-100,100,-30,-80,90,60,70,60,-80,90,30,-80,-30,-20,60,90,90,-10,-100,40,20,-80,10,-50,-50,-60,-80,60,-40,-20,70,20,0,40,-70,-40,-20,60,-10,70,-80,60,-40,90,-70,10,30,50,10,-30,90,-30,40,100,80,100,-40,80,90,20,60,60,-50,10,-60,-60,-100,-70,80,-90,-90,40,-30,80,-30,-80,70,0,-40,-10,30,60,40,60,90,20,40,-50,-20,50,-90,-90,-80,-80,80,-80,-100,70,90,-90,10,-60,40,70,-60,-60,60,80,20,-30,-30,-100,-70,10,20,-40,70,50,100,-90,-40,-100,-30,70,-50,-30,-20,-100,0,-80,0,-80,10,70,-80,10,30,-30,-60,90,80,-60,-30,-50,40,-80,-20,50,-70,-80,20,30,20,50,-40,-60,-50,30,50,90,40,30,10,80,-100,40,90,-70,-100,20,90,-20,40,90,60,30,-20,-60,-10,80,-30,50,10,-40,-90,70,0,40,-10,30,100,-60,50,90,60,-50,90,90,60,-40,0,-40,-50,-20,10,-60,-50,80,-20,-40,50,-50,-70,70,-20,-70,-50,-10,10,-90,10,-10,70,40,0,40,-60,70,100,0,60,50,-30,-100,-10,20,-40,70,-10,10,0,-40,10,-60,60,-80,-100,-80,-90,90,50,20,70,-100,100,50,30,90,10,-20,90,20,-40,10,20,0,-30,10,-50,10,-100,60,70,70,30,-70,-30,10,-30,-20,60,-20,90,20,30,-50,30,100,-10,30,100,-90,30,0,-40,-80,80,-80,-80,30,-60,0,-60,-50,-50,-20,0,-40,50,60,-40,-40,-20,-30,0,60,80,-30,0,-30,-90,30,60,0,-100,-90,70,-80,100,-30,-20,90,60,40,10,-100,10,0,-80,-70,40,60,-80,-70,80,40,0,0,-20,40,-90,0,0,-10,-90,60,70,60,0,60,-90,50,30,-10,50,0,70,-50,-50,80,-100,90,-70,60,30,40,-10,-100,0,100,30,80,-10,-50,100,0,-50,-60,40,-40,100,-90,-10,0,100,-60,90,-50,30,80,10,40,-40,20,-10,-100,60,-70,100,70,-50,90,20,-80,-90,-30,-80,30,10,60,80,-60,70,50,0,-50,-60,50,-100,-50,20,50,-60,-80,0,-20,40,-40,10,60,-20,-10,90,40,60,30,-70,50,-100,80,-80,-100,100,-30,30,100,-40,-80,-20,-40,-10,-20,10,-50,-80,40,0,-100,-10,-80,0,-40,90,60,80,-40,90,10,-30,-10,-90,20,0,-10,-40,20,20,60,-40,0,-30,-50,-80,70,-90,40,-50,-100,70,-60,-10,80,30,40,-60,60,-60,40,40,80,-30,10,80,-50,-40,-50,50,0,80,-90,-80,0,-70,50,30,10,-70,10,-70,-30,70,100,60,-90,-90,90,90,60,20,-50,-20,-90,-80,-80,-70,60,80,70,70,90,-60,10,40,-30,60,100,30,40,20,50,40,-40,-80,-60,10,40,-20,50,90,30,-40,100,0,40,30,20,70,-40,50,70,-50,60,-30,0,20,50,-100,60,-30,90,-40,90,80,-50,40,-50,50,-80,80,60,-40,80,70,30,90,60,-60,-70,40,-50,-80,90,100,10,10,-30,10,100,50,-100,-100,10,-40,-50,-60,-70,60,-70,20,90,-70,-60,0,20,-30,-20,-60,80,40,-80,30,80,10,-30,-20,40,90,40,-90,-60,90,0,-10,40,-40,40,-70,-20,30,20,-70,-30,30,100,50,-50,0,80,-50,-10,-60,-10,10,0,-10,50,-100,-40,100,-100,-70,-80,60,50,-70,40,10,70,-70,-90,-50,20,-10,-40,0,-60,10,-50,50,-10,40,30,-60,-70,50,-100,-10,30,-10,20,-20,-30,70,-90,-50,40,-20,-30,80,40,-30,30,-10,10,30,60,-50,-30,-40,-30,90,20,60,50,-90,-70,-20,30,40,-90,-90,30,-90,100,50,-100,30,0,-10,90,-30,-20,10,90,90,80,-90,-70,-40,-80,30,10,-80,-20,-60,-30,-60,0,-10,40,30,30,20,-50,-20,-40,40,80,0,90,80,-90,100,-80,-70,0,0,90,-70,70,-90,-80,-60,50,10,-50,40,60,50,-30,80,80,10,100,40,40,90,70,30,-20,-100,0,-30,-60,40,-60,-40,-40,100,40,80,30,100,40,0,90,50,40,60,90,-50,60,10,-90,20,-80,50,-10,20,-70,-60,-90,60,-50,40,50,-20,-100,-80,10,80,-100,-60,20,70,80,40,60,-60,-90,30,-50,-30,-70,100,-40,60,-80,100,50,80,-10,-30,60,30,-30,60,-10,70,-90,20,0,50,-30,-80,80,-10,80,-50,-20,-20,-40,70,60,90,60,-100,-20,40,-60,100,-40,-90,-50,-50,20,20,-60,100,-50,-60,-100,-100,40,90,50,-30,10,20,100,70,70,-50,-10,60,10,-50,10,-100,0,60,10,-60,-70,50,-30,-40,50,30,-80,-10,20,-10,-70,-100,-20,-40,60,-30,80,-40,-10,0,-100,50,40,-50,10,60,-10,-80,90,10,-70,90,80,90,10,-30,0,-60,20,60,100,-70,-100,-80,-60,0,40,-30,0,-60,-50,0,0,-20,-100,-40,60,60,20,0,-20,0,90,-30,-50,90,10,60,10,-70,50,30,10,50,40,-70,70,-90,90,-70,50,-80,70,80,0,100,-80,10,90,-50,20,-50,-20,60,90,0,-90,-60,60,10,-60,80,-80,-10,-70,-70,-50,20,-40,-10,90,70,-90,0,10,40,-90,-90,-30,90,-90,20,10,0,-70,60,-70,-80,90,-80,-10,30,-100,70,10,10,-40,80,-20,20,-50,-100,-100,-30,-50,-30,50,-30,60,-20,-70,80,-40,90,90,70,0,80,-100,0,20,-90,70,60,70,-100,-100,-50,0,80,-100,-100,-90,100,90,80,20,-90,80,-30,-90,40,20,-20,-10,-50,40,0,20,-90,-10,-80,80,20,-80,0,50,-60,-20,20,-100,-50,30,30,-70,10,40,30,-80,90,-50,40,-100,30,20,-60,-10,-40,90,-80,10,100,30,60,40,90,10,100,-90,90,-20,50,50,-20,30,80,10,60,-80,30,50,-40,-70,40,70,50,30,-90,-10,20,70,20,40,30,90,80,60,-30,50,40,-50,70,20,90,60,10,-90,50,-50,-90,-20,80,0,-70,20,90,50,-100,-100,-10,-70,-60,10,30,10,-20,-60,-70,60,-20,-20,-100,-10,-60,80,-80,-100,-10,60,10,-100,-60,-60,20,100,-100,-40,30,80,-70,60,60,90,-70,90,0,-60,70,-60,70,-80,70,-40,-60,0,30,-90,100,90,-90,40,70,-20,-30,0,-50,60,40,-100,60,-50,70,90,-20,-50,-60,90,-80,-70,20,-60,50,20,50,0,0,0,-70,100,-40,-30,50,70,-30,0,0,50,90,-90,80,-30,10,100,-60,100,50,0,50,30,-90,30,60,40,-100,-100,-60,30,-50,30,-40,40,-10,90,-20,-30,-60,70,50,70,100,-90,0,30,80,-10,-10,70,70,100,80,-80,-30,-30,50,30,-70,10,0,-60,20,-100,0,30,20,-20,60,-40,60,0,20,-30,-80,10,-10,-90,40,-60,0,-80,-40,20,100,-10,50,-20,50,-70,-20,40,-20,-50,30,-30,-100,-100,-90,-20,80,-90,-30,0,30,-100,90,90,-60,100,-100,60,80,40,80,-100,100,-10,0,10,80,40,40,-20,70,80,-80,-90,-40,0,50,50,0,-20,40,40,70,-40,90,60,20,-90,-10,-80,-40,-70,10,60,90,0,-70,100,90,70,0,100,-30,50,100,20,-100,-70,60,-50,100,40,0,40,100,50,20,-80,-90,90,-80,50,90,20,-20,-50,100,100,40,40,60,-70,-90,60,80,60,100,60,50,90,50,-100};
        assertEquals(10, sut.solution(A));
    }

}