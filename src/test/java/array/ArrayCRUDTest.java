package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayCRUDTest {
    @Test
    public void getArray(){
        ArrayCRUD arrayCRUD = new ArrayCRUD(10);
        int[] expectedArray = arrayCRUD.getArr();
        assertEquals(expectedArray.length, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getByIndex_biggerThanSize(){
        int index = 10;
        ArrayCRUD arrayCRUD = new ArrayCRUD(index);
        arrayCRUD.getByIndex(index + 1);
    }

    @Test
    public void insertInIndex(){

    }

    @Test
    public void deleteByIndex(){

    }
}
