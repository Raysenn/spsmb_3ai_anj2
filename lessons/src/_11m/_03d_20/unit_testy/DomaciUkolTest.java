//package _11m._03d_20.unit_testy;
//
//import _10m._21d_17.DomaciUkol;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class DomaciUkolTest {
//
//    @Test
//    public void obsahObdelnika() {
//        assertEquals(1, DomaciUkol.obsahObdelnika(1,1));
//    }
//
//    @Test
//    public void obsahPravouhlehoTrojuhelnika() {
//        assertEquals(2, DomaciUkol.obsahPravouhlehoTrojuhelnika(2,2));
//    }
//
//    @Test
//    public void obvodPravouhlehoTrojuhelnika() {
//        assertEquals(7,DomaciUkol.obvodPravouhlehoTrojuhelnika(2,2));
//    }
//
//
//    @Test
//    public void objemKoule() {
//    }
//
//    @Test
//    public void obsahKruhu() {
//        double x = DomaciUkol.obsahKruhu(1);
//        assertEquals(true, 3.13 <= x && x <= 3.15);
//    }
//
//    @Test
//    public void obvodKruhu() {
//    }
//
//    @Test
//    public void povrchkrychle() {
//    }
//
//    @Test
//    public void objemKrychle() {
//        int objem = DomaciUkol.objemKrychle( 5);
//        assertEquals(125, objem);
//    }
//
//    @Test
//    public void printBoard() {
//        String[][] expected = {{"██", "  "}, {"  ","██"}};
//        assertArrayEquals(expected, DomaciUkol.printBoard(2, 2));
//    }
//
//
//    @Test
//    public void faktorial() {
//        long l=DomaciUkol.faktorial((byte) 3);
//        assertEquals(6, l);
//    }
//
//    @Test
//    public void faktorialRekurzivne() {
//    }
//
//    @Test
//    public void povrchKoule() {
//        double x = DomaciUkol.povrchKoule(1);
//        assertTrue(12.55 <= x && x <= 12.57);
//    }
//}