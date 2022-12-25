import static org.junit.Assert.*;

public class LC240Test {

    @org.junit.Test
    public void searchMatrixII() {
        boolean actual1 = LC240.searchMatrixII(new int[][] {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}}, 5);
        boolean actual2 = LC240.searchMatrixII(new int[][] {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}}, 20);

        assertTrue(actual1);
        assertFalse(actual2);

    }
}