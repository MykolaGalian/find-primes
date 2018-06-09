package lab2.l1;

import org.junit.Test;

import static org.junit.Assert.*;

public class lab_2Test {

    @Test
    public void testPrimeArray() //тест метода который принимает верхний предел диапазона нахождения простых чисел,
    {                               // возвращает массив Integer[] простых чисел из диапазона 2..n
        Integer[] expectedResult= new Integer[4];
        expectedResult[0] = 2;
        expectedResult[1] = 3;
        expectedResult[2] = 5;
        expectedResult[3] = 7;


        Integer [] result = lab_2.PrimeArray(10);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testPrimeArrayString() //тест метод который  принимает массив Integer[] простых чисел, возвращает массив String []
                                       //  простых чисел в бинарной форме
    {
        Integer[] Array2= new Integer[4];
        Array2[0] = 2;
        Array2[1] = 3;
        Array2[2] = 5;
        Array2[3] = 7;

        String[] expectedResult = new String[4];
        expectedResult[0] = "10";
        expectedResult[1] = "11";
        expectedResult[2] = "101";
        expectedResult[3] = "111";


        String [] result = lab_2.PrimeArrayString(Array2);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testPrimeStringMaxOne()  //  тест - метод принимает строковый массив String [] простых чисел в бинарной форме, возвращает -первое- простое число
                                           //в строковом виде с максимальным количеством едениц в бинарной форме
    {
        String[] Array = new String[4];
        Array[0] = "10";
        Array[1] = "11";
        Array[2] = "101";
        Array[3] = "111";

        String expectedResult = "111";

        String result = lab_2.PrimeStringMaxOne(Array);

        assertEquals(expectedResult, result);
    }
}