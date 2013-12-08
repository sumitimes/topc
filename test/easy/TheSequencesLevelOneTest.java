package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class TheSequencesLevelOneTest {
    TheSequencesLevelOne thesequenceslevelone = new TheSequencesLevelOne();

    @Test
    public void case1() {
        int[] sequence = { 1, 2, 3, 4, 5, 6, 7 };
        assertArrayEquals(new int[] { 0, 0, 4, 4, 4, 7, 7 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case2() {
        int[] sequence = { 1000000000, 999999995 };
        assertArrayEquals(new int[] { 1000000000, 999999994 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case3() {
        int[] sequence = { 4, 7, 7, 4 };
        assertArrayEquals(new int[] { 4, 7, 7, 4 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case4() {
        int[] sequence = { 44, 47, 77, 74, 474, 444, 747, 7777777 };
        assertArrayEquals(new int[] { 44, 48, 77, 72, 472, 444, 748, 7777777 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case5() {
        int[] sequence = { 25, 33, 41 };
        assertArrayEquals(new int[] { 24, 32, 40 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case6() {
        int[] sequence = { 85, 15, 52 };
        assertArrayEquals(new int[] { 84, 14, 52 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case7() {
        int[] sequence = { 33, 39, 11, 86 };
        assertArrayEquals(new int[] { 32, 40, 12, 84 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case8() {
        int[] sequence = { 326051437, 21417563, 549646417, 26239573, 167851001, 374079501, 257655784, 80835681, 301413357, 69909135, 194041605, 84970744, 40873981, 366496749, 436291073, 278840199, 35766291, 33557677, 37215529, 4890852, 466701607, 106923811, 168544291, 473038165, 82426873, 392289611, 675016434, 247776868, 36629217, 706221269, 653352031, 222071041, 597007, 3615545, 950090227, 116752252, 118341523, 86546365, 170427799, 659598369, 37379061, 8670529, 391749388, 119255907, 336971125, 480572137, 160567226, 683447134 };
        assertArrayEquals(new int[] { 326051436, 21417564, 549646416, 26239572, 167851000, 374079500, 257655784, 80835680, 301413357, 69909136, 194041604, 84970744, 40873980, 366496748, 436291072, 278840198, 35766290, 33557676, 37215528, 4890852, 466701606, 106923810, 168544292, 473038164, 82426872, 392289611, 675016433, 247776868, 36629216, 706221268, 653352032, 222071040, 597008, 3615544, 950090228, 116752252, 118341524, 86546364, 170427800, 659598368, 37379060, 8670529, 391749388, 119255906, 336971124, 480572136, 160567225, 683447135 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case9() {
        int[] sequence = { 456277933, 213861391, 611472343, 52809583, 26251201, 175661017, 136135827, 359490601, 656926309, 34644511, 28813551, 202752005, 250903, 150953622, 400354782, 686164677, 367082665, 289056665, 144208961, 188605873, 236348519, 178898386, 86708232, 68665077, 719413689, 1740977, 442531277, 250585851, 119372137, 192772201, 14555683, 50647921 };
        assertArrayEquals(new int[] { 456277932, 213861392, 611472344, 52809582, 26251200, 175661017, 136135828, 359490600, 656926308, 34644512, 28813552, 202752004, 250904, 150953621, 400354780, 686164676, 367082664, 289056664, 144208960, 188605872, 236348518, 178898384, 86708232, 68665076, 719413688, 1740977, 442531276, 250585852, 119372136, 192772200, 14555684, 50647920 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case10() {
        int[] sequence = { 601621399, 8980027, 486774961, 220504717, 680257989, 679854070, 536672876, 192515623, 128804733, 57109680, 262342369, 625828105, 564329608, 131182390, 226140876, 248711871, 33763105, 6526001, 49267979, 52946171, 453525721, 101289133, 304123425, 442118270, 67942657, 42676069, 460347889, 700148239, 250532866, 54363401, 851267489 };
        assertArrayEquals(new int[] { 601621398, 8980027, 486774960, 220504716, 680257988, 679854070, 536672876, 192515624, 128804732, 57109680, 262342368, 625828105, 564329608, 131182388, 226140876, 248711872, 33763104, 6526000, 49267980, 52946172, 453525720, 101289132, 304123424, 442118271, 67942656, 42676068, 460347888, 700148239, 250532864, 54363400, 851267488 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case11() {
        int[] sequence = { 625352806, 211859640, 70953719, 186085236, 19683399, 661662373, 332152311, 116936619, 105043116, 240430121, 758987917, 491315149, 109615219, 469069513, 4703685, 553902119, 573534711, 15405770, 345474073, 38371241, 26304961, 36982251, 240524737, 260860997, 116869479, 695134189, 9856897, 132727579, 771804541, 119711629, 61474687, 1993265, 222807552, 113190751, 125370429, 97979506, 30391025 };
        assertArrayEquals(new int[] { 625352805, 211859640, 70953720, 186085236, 19683398, 661662372, 332152310, 116936620, 105043116, 240430120, 758987916, 491315148, 109615219, 469069512, 4703685, 553902118, 573534710, 15405768, 345474073, 38371240, 26304960, 36982252, 240524736, 260860996, 116869480, 695134188, 9856896, 132727580, 771804540, 119711628, 61474686, 1993264, 222807552, 113190752, 125370428, 97979504, 30391025 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case12() {
        int[] sequence = { 163781818, 10440641, 36600877, 179722713, 576539745, 102239781, 488947089, 274074595, 331592376, 390256887, 50335433, 105690055, 428097499, 725063961, 289453753, 455212561, 653533551, 67270876, 607818885, 103267725, 595950717, 49556358, 59540376, 42860571, 28976353, 3025309, 103093156, 892697482, 134671853, 59821561, 50643601 };
        assertArrayEquals(new int[] { 163781816, 10440640, 36600876, 179722712, 576539744, 102239781, 488947088, 274074596, 331592376, 390256888, 50335432, 105690056, 428097500, 725063960, 289453752, 455212560, 653533552, 67270876, 607818884, 103267724, 595950716, 49556356, 59540376, 42860572, 28976353, 3025309, 103093156, 892697480, 134671852, 59821560, 50643600 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case13() {
        int[] sequence = { 126908701, 167931713, 415289261, 178213201, 682701328, 299487105, 700817710, 113881783, 272651156, 477228097, 237757033, 893010145, 15214483 };
        assertArrayEquals(new int[] { 126908700, 167931712, 415289260, 178213200, 682701328, 299487104, 700817708, 113881782, 272651156, 477228096, 237757032, 893010144, 15214484 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case14() {
        int[] sequence = { 112931689, 60485151, 6473182, 66762317, 308315634, 10599486, 230010817 };
        assertArrayEquals(new int[] { 112931688, 60485152, 6473180, 66762316, 308315632, 10599484, 230010816 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case15() {
        int[] sequence = { 667415473, 261574081, 414942301, 547596651, 73435177, 313830440, 530819521, 7818981, 43436159, 358595209, 15185845, 239846734, 57559271, 51924685, 505755580, 17563001, 483260516, 862897841, 493496026, 852544848, 155265663, 93502521, 32312137, 4764301, 150633605, 11073109 };
        assertArrayEquals(new int[] { 667415472, 261574080, 414942300, 547596651, 73435176, 313830440, 530819520, 7818980, 43436160, 358595209, 15185844, 239846733, 57559271, 51924684, 505755580, 17563000, 483260516, 862897840, 493496024, 852544848, 155265663, 93502521, 32312136, 4764300, 150633604, 11073108 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case16() {
        int[] sequence = { 601013575, 771876790, 71313480, 41146301, 122846556, 131018593, 868878121, 42076531, 740697557, 619569409 };
        assertArrayEquals(new int[] { 601013574, 771876791, 71313480, 41146301, 122846556, 131018592, 868878120, 42076531, 740697556, 619569408 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case17() {
        int[] sequence = { 312840401, 7656526, 451039817, 3460867, 53073945, 26998479, 592933461, 271929124, 293743777, 517142305, 501399361, 159336148, 185394433, 50869922, 50890065, 327724189, 199760711, 18903751, 789222661, 77993476, 511396804, 53117101, 681162225, 237289207, 119138216, 850328911, 253761476, 310692889, 618600041 };
        assertArrayEquals(new int[] { 312840400, 7656524, 451039816, 3460868, 53073944, 26998480, 592933460, 271929124, 293743776, 517142304, 501399360, 159336148, 185394433, 50869920, 50890064, 327724188, 199760712, 18903752, 789222660, 77993476, 511396804, 53117100, 681162224, 237289206, 119138216, 850328912, 253761476, 310692888, 618600040 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case18() {
        int[] sequence = { 252522538, 106872031, 73937521, 798876863, 534266276, 176755553, 214125305, 631025356, 763104869, 176826761, 66921358 };
        assertArrayEquals(new int[] { 252522536, 106872031, 73937521, 798876862, 534266276, 176755552, 214125304, 631025356, 763104868, 176826760, 66921358 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case19() {
        int[] sequence = { 325241431, 29410876, 101726097, 265636341, 136618483, 122491709, 112775230, 23767966, 583051876, 54918913, 32488501, 288088033, 738138369, 27753111, 184699117, 429421777, 614902313, 217268821 };
        assertArrayEquals(new int[] { 325241432, 29410876, 101726096, 265636340, 136618482, 122491708, 112775229, 23767964, 583051876, 54918913, 32488500, 288088032, 738138368, 27753110, 184699116, 429421776, 614902312, 217268821 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case20() {
        int[] sequence = { 108967669, 418792123, 400997919, 101449330, 181687393, 31983337 };
        assertArrayEquals(new int[] { 108967668, 418792122, 400997919, 101449328, 181687392, 31983336 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case21() {
        int[] sequence = { 167851001 };
        assertArrayEquals(new int[] { 167851000 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case22() {
        int[] sequence = { 336971125 };
        assertArrayEquals(new int[] { 336971124 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case23() {
        int[] sequence = { 160567226 };
        assertArrayEquals(new int[] { 160567225 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case24() {
        int[] sequence = { 4890852 };
        assertArrayEquals(new int[] { 4890852 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case25() {
        int[] sequence = { 26239573 };
        assertArrayEquals(new int[] { 26239572 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case26() {
        int[] sequence = { 1 };
        assertArrayEquals(new int[] { 0 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case27() {
        int[] sequence = { 1000000000 };
        assertArrayEquals(new int[] { 1000000000 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case28() {
        int[] sequence = { 653352031, 168544291, 597007, 106923811, 659598369, 336971125, 116752252, 301413357, 3615545, 278840199, 80835681, 194041605, 392289611, 8670529, 35766291, 118341523, 326051437, 379268590, 950090227, 391749388, 36629217, 69909135, 150378796, 4890852, 26239573, 170427799, 436291073, 86546365, 480572137, 33557677, 675016434, 473038165, 167851001, 222071041, 160567226, 40873981, 374079501, 683447134, 84970744, 21417563, 706221269, 466701607, 37379061, 37215529, 549646417, 82426873, 366496749, 119255907, 247776868, 257655784 };
        assertArrayEquals(new int[] { 653352032, 168544292, 597008, 106923810, 659598368, 336971124, 116752252, 301413357, 3615544, 278840198, 80835680, 194041604, 392289611, 8670529, 35766290, 118341524, 326051436, 379268589, 950090228, 391749388, 36629216, 69909136, 150378796, 4890852, 26239572, 170427800, 436291072, 86546364, 480572136, 33557676, 675016433, 473038164, 167851000, 222071040, 160567225, 40873980, 374079500, 683447135, 84970744, 21417564, 706221268, 466701606, 37379060, 37215528, 549646416, 82426872, 366496748, 119255906, 247776868, 257655784 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case29() {
        int[] sequence = { 74219097, 70778345, 250903, 178898386, 400354782, 438442529, 213861391, 50647921, 136135827, 63360106, 250585851, 68665077, 122674666, 34644511, 359490601, 150953622, 367082665, 719413689, 64330753, 202752005, 1740977, 339141601, 292941209, 192772201, 86708232, 136198441, 299339510, 555958105, 437904637, 63932449, 442531277, 28813551, 46521319, 186501223, 488776302, 437791390, 26251201, 456277933, 236010407, 188605873, 582531183, 52809583, 656926309, 144208961, 104482891, 611472343, 289056665, 175661017, 14555683, 439816011 };
        assertArrayEquals(new int[] { 74219096, 70778344, 250904, 178898384, 400354780, 438442529, 213861392, 50647920, 136135828, 63360104, 250585852, 68665076, 122674664, 34644512, 359490600, 150953621, 367082664, 719413688, 64330752, 202752004, 1740977, 339141600, 292941208, 192772200, 86708232, 136198440, 299339509, 555958104, 437904636, 63932449, 442531276, 28813552, 46521320, 186501224, 488776302, 437791389, 26251200, 456277932, 236010408, 188605872, 582531184, 52809582, 656926308, 144208960, 104482892, 611472344, 289056664, 175661017, 14555684, 439816012 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case30() {
        int[] sequence = { 455546031, 226140876, 320516971, 647333037, 211859640, 625352806, 56829267, 70953719, 758987917, 544418701, 1993265, 4476636, 125370429, 695134189, 491315149, 97979506, 132727579, 116936619, 573534711, 116869479, 186085236, 260860997, 200494798, 9856897, 771804541, 257244835, 4703685, 332152311, 81507655, 661662373, 38371241, 119711629, 469069513, 67311553, 36982251, 61474687, 113190751, 240524737, 345474073, 15405770, 105043116, 109615219, 70778793, 423188885, 209071424, 30391025, 393186914, 211951915, 398713617, 553902119 };
        assertArrayEquals(new int[] { 455546032, 226140876, 320516972, 647333036, 211859640, 625352805, 56829268, 70953720, 758987916, 544418700, 1993264, 4476636, 125370428, 695134188, 491315148, 97979504, 132727580, 116936620, 573534710, 116869480, 186085236, 260860996, 200494798, 9856896, 771804540, 257244834, 4703685, 332152310, 81507656, 661662372, 38371240, 119711628, 469069512, 67311552, 36982252, 61474686, 113190752, 240524736, 345474073, 15405768, 105043116, 109615219, 70778792, 423188885, 209071424, 30391025, 393186913, 211951915, 398713616, 553902118 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case31() {
        int[] sequence = { 294777488, 194536441, 291407005, 40269139, 450525713, 552455051, 538865644, 427316101, 196845041, 1840327, 25942713, 149281340, 389121363, 14829018, 246995321, 64825601, 203465941, 31269601, 531386521, 368415841, 107509221, 335803055, 107845205, 41111601, 811705545, 297753661, 135195896, 147039971, 105095949, 51228521, 37994251, 196465633, 589677587, 40823481, 505147591, 15052549, 641080801, 364023762, 456892043, 197272882, 540395692, 561782221, 103135000, 163038313, 144254384, 91915253, 153032691, 330411001, 601131217, 17353261 };
        assertArrayEquals(new int[] { 294777488, 194536440, 291407004, 40269138, 450525712, 552455050, 538865644, 427316100, 196845040, 1840328, 25942712, 149281340, 389121362, 14829017, 246995320, 64825600, 203465941, 31269600, 531386520, 368415840, 107509220, 335803055, 107845204, 41111600, 811705545, 297753660, 135195896, 147039970, 105095949, 51228520, 37994250, 196465633, 589677588, 40823480, 505147592, 15052548, 641080800, 364023760, 456892044, 197272880, 540395692, 561782221, 103135000, 163038312, 144254384, 91915252, 153032691, 330411000, 601131216, 17353260 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case32() {
        int[] sequence = { 50477734, 261574081, 505755580, 414942301, 667415473, 811416463, 313830440, 150633605, 808417748, 547596651, 239846734, 368634529, 175664125, 307740785, 109137988, 57559271, 2934266, 489955201, 114462269, 85115161, 358595209, 493496026, 4764301, 816269961, 7818981, 248171353, 191041648, 175526846, 862897841, 32312137, 373783843, 483260516, 43436159, 70562761, 155265663, 197046297, 73435177, 518678245, 498727741, 852544848, 125192278, 530819521, 393618551, 15185845, 11073109, 189268951, 17563001, 93502521, 51924685, 144640225 };
        assertArrayEquals(new int[] { 50477735, 261574080, 505755580, 414942300, 667415472, 811416464, 313830440, 150633604, 808417748, 547596651, 239846733, 368634528, 175664125, 307740784, 109137988, 57559271, 2934267, 489955200, 114462268, 85115160, 358595209, 493496024, 4764300, 816269960, 7818980, 248171352, 191041648, 175526844, 862897840, 32312136, 373783844, 483260516, 43436160, 70562760, 155265663, 197046297, 73435176, 518678244, 498727740, 852544848, 125192277, 530819520, 393618552, 15185844, 11073108, 189268952, 17563000, 93502521, 51924684, 144640224 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case33() {
        int[] sequence = { 631623917, 246676570, 122775913, 5484811, 236306497, 170927461, 598521637, 19163761, 512120673, 889943464, 283182534, 6895937, 680345261, 49486465, 374821406, 133611688, 897950775, 6144985, 40913201, 664463745, 28475326, 159222273, 289151647, 122443105, 577607501, 275225491, 684689809, 155821, 176473665, 138297331, 69345415, 52659133, 489351811, 348720691, 313747405, 188486651, 382282839, 716735591, 295481649, 287659897, 699041550, 498490546, 427963876, 831600387, 267579871, 546050422, 108351264, 377970536, 791597317, 7433429 };
        assertArrayEquals(new int[] { 631623916, 246676570, 122775912, 5484812, 236306497, 170927460, 598521637, 19163760, 512120672, 889943464, 283182532, 6895936, 680345260, 49486465, 374821405, 133611688, 897950774, 6144985, 40913201, 664463744, 28475324, 159222273, 289151646, 122443104, 577607500, 275225492, 684689808, 155820, 176473664, 138297332, 69345416, 52659132, 489351812, 348720692, 313747404, 188486652, 382282838, 716735592, 295481648, 287659897, 699041548, 498490545, 427963876, 831600388, 267579872, 546050421, 108351264, 377970536, 791597317, 7433428 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case34() {
        int[] sequence = { 333120351, 669898601, 196127875, 328437569, 151226205, 18181525, 606566617, 38282536, 36808450, 124592189, 169745492, 74202640, 15529138, 30415086, 852601, 443114781, 23534155, 25705788, 74432701, 78564403, 859407685, 434750965, 719906254, 140954881, 9558836, 884849057, 75543237, 827355406, 247283506, 54872229, 214644046, 37435123, 204338391, 719201914, 705153, 40747177, 373857136, 178401601, 259151712, 60158017, 191897326, 366934345, 249849701, 209803657, 245122156, 122027171, 261338905, 429941953, 55704871, 123910885 };
        assertArrayEquals(new int[] { 333120352, 669898600, 196127876, 328437568, 151226204, 18181524, 606566616, 38282536, 36808450, 124592188, 169745492, 74202640, 15529136, 30415084, 852600, 443114780, 23534154, 25705788, 74432701, 78564402, 859407684, 434750964, 719906252, 140954880, 9558836, 884849056, 75543237, 827355404, 247283505, 54872228, 214644045, 37435124, 204338392, 719201912, 705152, 40747176, 373857136, 178401601, 259151712, 60158016, 191897324, 366934344, 249849700, 209803657, 245122156, 122027171, 261338904, 429941953, 55704872, 123910885 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case35() {
        int[] sequence = { 107799271, 410130883, 106258801, 169037023, 513899717, 215330671, 185087449, 5764771, 234532105, 15838255, 570931849, 417019726, 925738029, 737677315, 126247087, 40086151, 371428417, 194481717, 889728925, 381128815, 15290101, 5615081, 282437316, 41789476, 7417126, 271667553, 577996947, 11375851, 905017051, 201694245, 328584026, 207779481, 299553233, 136402003, 26582989, 323804015, 11136651, 323386401, 34217126, 213688513, 815196361, 191882695, 283859137, 158164553, 383045677, 381703249, 239776505, 17709913, 13777213, 520702093 };
        assertArrayEquals(new int[] { 107799272, 410130882, 106258800, 169037022, 513899716, 215330672, 185087448, 5764772, 234532104, 15838256, 570931848, 417019724, 925738028, 737677316, 126247086, 40086151, 371428416, 194481716, 889728924, 381128816, 15290100, 5615080, 282437316, 41789476, 7417124, 271667552, 577996948, 11375852, 905017050, 201694244, 328584025, 207779481, 299553233, 136402004, 26582988, 323804016, 11136650, 323386400, 34217127, 213688512, 815196361, 191882696, 283859136, 158164552, 383045677, 381703248, 239776504, 17709912, 13777212, 520702092 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case36() {
        int[] sequence = { 355366237, 79386337, 314222014, 152704201, 63257361, 2114041, 250581469, 683216389, 325337969, 2510773, 621626685, 773142976, 770254685, 68314981, 467020047, 421056011, 106185163, 479416827, 297131221, 767733793, 32861485, 12322623, 107761321, 270164947, 17307388, 273580009, 28045465, 87718363, 310837407, 173948251, 159361671, 286843421, 510282169, 186996013, 211217254, 206237982, 58249855, 130029957, 201104965, 1192137, 228784987, 667338735, 219372301, 946441545, 89313181, 69690457, 727992321, 153445145, 188395565, 4137603 };
        assertArrayEquals(new int[] { 355366236, 79386336, 314222013, 152704200, 63257360, 2114040, 250581468, 683216388, 325337968, 2510772, 621626684, 773142976, 770254684, 68314981, 467020048, 421056012, 106185163, 479416826, 297131220, 767733792, 32861484, 12322624, 107761320, 270164948, 17307388, 273580008, 28045465, 87718364, 310837408, 173948250, 159361671, 286843420, 510282168, 186996012, 211217252, 206237983, 58249856, 130029956, 201104964, 1192136, 228784988, 667338735, 219372300, 946441545, 89313180, 69690456, 727992321, 153445145, 188395564, 4137602 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case37() {
        int[] sequence = { 81280772, 232556545, 291956119, 108696961, 39017161, 29134561, 121013839, 215091457, 87459821, 137297364, 318973201, 366674037, 395197943, 174964637, 855869004, 176908321, 107758045, 144014753, 111438801, 271973371, 34370351, 58366213, 12124814, 23526913, 191079576, 541414756, 38503921, 291860905, 584404661, 5072950, 256713031, 485833375, 608692736, 540028801, 17412418, 681554093, 700149945, 355213037, 243320951, 41490697, 161301441, 166214121, 87719146, 131397553, 123703776, 52079102, 10856539, 529261885, 650968501, 69353644 };
        assertArrayEquals(new int[] { 81280772, 232556544, 291956119, 108696960, 39017160, 29134560, 121013840, 215091457, 87459820, 137297364, 318973200, 366674036, 395197943, 174964636, 855869004, 176908320, 107758044, 144014752, 111438800, 271973372, 34370350, 58366212, 12124812, 23526912, 191079576, 541414756, 38503920, 291860905, 584404660, 5072949, 256713030, 485833376, 608692736, 540028800, 17412416, 681554092, 700149944, 355213036, 243320952, 41490696, 161301441, 166214120, 87719144, 131397553, 123703776, 52079100, 10856538, 529261884, 650968500, 69353644 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case38() {
        int[] sequence = { 46212046, 88952228, 147442021, 92756335, 4550563, 332372104, 94236481, 580009948, 248640337, 740856025, 383902349, 25463081, 194598103, 296241063, 224886507, 159570685, 82954226, 152187751, 384430591, 147307618, 42089545, 437641165, 66843844, 265119085, 723769294, 66082329, 485807461, 351606751, 354425729, 62081887, 2018037, 238654921, 468786009, 51399241, 415651, 89228166, 506370996, 537713281, 35260225, 72122596, 837327310, 60205657, 72347137, 340262583, 183417961, 250025179, 477486711, 23272894, 404332776, 69391797 };
        assertArrayEquals(new int[] { 46212047, 88952228, 147442020, 92756335, 4550564, 332372104, 94236480, 580009948, 248640336, 740856025, 383902348, 25463081, 194598103, 296241064, 224886508, 159570684, 82954224, 152187752, 384430592, 147307616, 42089544, 437641164, 66843844, 265119085, 723769292, 66082328, 485807460, 351606752, 354425729, 62081887, 2018037, 238654920, 468786008, 51399240, 415652, 89228167, 506370996, 537713281, 35260225, 72122596, 837327309, 60205656, 72347136, 340262584, 183417960, 250025180, 477486712, 23272893, 404332776, 69391796 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case39() {
        int[] sequence = { 369447762, 310822629, 333694454, 626417427, 62812305, 340143447, 296120146, 378392411, 337624731, 149032599, 311712585, 25241950, 517940941, 28760894, 43824701, 60948330, 215897801, 464266769, 1935031, 150690909, 4764981, 66753391, 571477681, 11570614, 215250497, 433513396, 63250521, 445251893, 36130108, 28461313, 285035461, 59939227, 235523865, 500475199, 150464886, 64049267, 170717511, 165623101, 367944127, 119797649, 370703611, 448283191, 194307359, 17473306, 33774913, 189034513, 238451581, 125258981, 61691737, 450443945 };
        assertArrayEquals(new int[] { 369447760, 310822628, 333694452, 626417428, 62812304, 340143447, 296120146, 378392412, 337624732, 149032600, 311712584, 25241951, 517940941, 28760893, 43824700, 60948328, 215897801, 464266768, 1935031, 150690908, 4764980, 66753392, 571477680, 11570615, 215250497, 433513396, 63250520, 445251892, 36130108, 28461312, 285035460, 59939228, 235523864, 500475199, 150464884, 64049268, 170717512, 165623101, 367944128, 119797648, 370703612, 448283192, 194307358, 17473304, 33774912, 189034512, 238451580, 125258980, 61691736, 450443945 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case40() {
        int[] sequence = { 502600371, 769752958, 69385256, 336887995, 18581907, 507202403, 207166201, 289310011, 105920641, 42551266, 97677909, 712060625, 326739128, 721542056, 16543801, 161996142, 399209633, 230503681, 549197741, 169581361, 285263595, 230386939, 491345478, 120059921, 82528201, 58525921, 64485841, 214273809, 100993369, 99894865, 490206721, 527239000, 112580455, 234568501, 258365121, 66146041, 180595881, 214918711, 474388031, 531869822, 226686977, 16371026, 31965957, 38702881, 407790424, 159019751, 124146205, 376363, 400599193, 105654876 };
        assertArrayEquals(new int[] { 502600371, 769752956, 69385256, 336887996, 18581906, 507202402, 207166200, 289310012, 105920640, 42551264, 97677909, 712060624, 326739128, 721542056, 16543800, 161996142, 399209632, 230503680, 549197740, 169581360, 285263594, 230386940, 491345477, 120059920, 82528201, 58525920, 64485841, 214273808, 100993368, 99894865, 490206720, 527239000, 112580454, 234568500, 258365121, 66146040, 180595880, 214918711, 474388032, 531869821, 226686976, 16371026, 31965956, 38702881, 407790424, 159019752, 124146204, 376362, 400599192, 105654876 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case41() {
        int[] sequence = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
        assertArrayEquals(new int[] { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case42() {
        int[] sequence = { 13, 29, 45, 9, 1, 37, 27, 33, 2, 26, 24, 28, 31, 44, 34, 46, 8, 48, 17, 7, 38, 36, 19, 10, 22, 14, 18, 40, 43, 25, 35, 42, 11, 12, 21, 23, 15, 39, 16, 4, 30, 32, 6, 47, 3, 41, 5, 20 };
        assertArrayEquals(new int[] { 12, 28, 44, 8, 0, 36, 28, 32, 0, 24, 24, 28, 32, 44, 35, 44, 8, 48, 16, 7, 36, 36, 20, 8, 21, 14, 16, 40, 42, 24, 35, 42, 12, 12, 21, 24, 14, 40, 16, 4, 28, 32, 7, 48, 4, 40, 4, 20 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case43() {
        int[] sequence = { 16, 4, 6, 19, 5, 8, 27, 29, 15, 25, 7, 17, 18, 26, 24, 3, 23, 13, 28, 32, 1, 10, 30, 21, 31, 22, 9, 12, 2, 20, 11, 14 };
        assertArrayEquals(new int[] { 16, 4, 7, 20, 4, 8, 28, 28, 14, 24, 7, 16, 16, 24, 24, 4, 24, 12, 28, 32, 0, 8, 28, 21, 32, 21, 8, 12, 0, 20, 12, 14 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case44() {
        int[] sequence = { 9, 27, 5, 3, 15, 25, 8, 12, 7, 13, 19, 29, 18, 20, 31, 23, 10, 17, 1, 22, 2, 14, 26, 28, 30, 4, 6, 11, 21, 16, 24 };
        assertArrayEquals(new int[] { 8, 28, 4, 4, 14, 24, 8, 12, 7, 12, 20, 28, 16, 20, 32, 24, 8, 16, 0, 21, 0, 14, 24, 28, 28, 4, 7, 12, 21, 16, 24 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case45() {
        int[] sequence = { 3, 30, 1, 22, 37, 8, 29, 13, 2, 34, 27, 28, 19, 10, 33, 7, 32, 11, 16, 5, 35, 24, 26, 14, 25, 15, 4, 23, 17, 6, 31, 9, 36, 12, 20, 18, 21 };
        assertArrayEquals(new int[] { 4, 28, 0, 21, 36, 8, 28, 12, 0, 35, 28, 28, 20, 8, 32, 7, 32, 12, 16, 4, 35, 24, 24, 14, 24, 14, 4, 24, 16, 7, 32, 8, 36, 12, 20, 16, 21 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case46() {
        int[] sequence = { 30, 26, 15, 20, 2, 28, 8, 14, 25, 4, 27, 5, 18, 21, 13, 31, 12, 19, 6, 22, 3, 24, 1, 11, 7, 23, 17, 29, 16, 10, 9 };
        assertArrayEquals(new int[] { 28, 24, 14, 20, 0, 28, 8, 14, 24, 4, 28, 4, 16, 21, 12, 32, 12, 20, 7, 21, 4, 24, 0, 12, 7, 24, 16, 28, 16, 8, 8 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case47() {
        int[] sequence = { 1, 11, 3, 4, 9, 12, 10, 8, 5, 6, 13, 2, 7 };
        assertArrayEquals(new int[] { 0, 12, 4, 4, 8, 12, 8, 8, 4, 7, 12, 0, 7 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case48() {
        int[] sequence = { 1000000000, 999999999, 999999998, 999999997, 999999996, 999999995, 999999994, 999999993, 999999992, 999999991 };
        assertArrayEquals(new int[] { 1000000000, 1000000000, 999999996, 999999996, 999999996, 999999994, 999999994, 999999992, 999999992, 999999992 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case49() {
        int[] sequence = { 27, 55 };
        assertArrayEquals(new int[] { 28, 56 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case50() {
        int[] sequence = { 998 };
        assertArrayEquals(new int[] { 996 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case51() {
        int[] sequence = { 27 };
        assertArrayEquals(new int[] { 28 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case52() {
        int[] sequence = { 15 };
        assertArrayEquals(new int[] { 14 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case53() {
        int[] sequence = { 4, 10 };
        assertArrayEquals(new int[] { 4, 8 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case54() {
        int[] sequence = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        assertArrayEquals(new int[] { 0, 0, 4, 4, 4, 7, 7, 8, 8, 8, 12, 12, 12, 14, 14, 16, 16, 16, 20, 20, 21, 21, 24, 24, 24, 24, 28, 28, 28, 28, 32, 32, 32, 35, 35, 36, 36, 36, 40, 40, 40, 42, 42, 44, 44, 44, 48, 48, 49, 49 }, thesequenceslevelone.find(sequence));
    }

    @Test
    public void case55() {
        int[] sequence = { 44, 47, 77, 74, 474, 444, 747, 999999999 };
        assertArrayEquals(new int[] { 44, 48, 77, 72, 472, 444, 748, 1000000000 }, thesequenceslevelone.find(sequence));
    }

}
