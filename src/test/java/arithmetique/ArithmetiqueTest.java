package arithmetique;

import org.junit.Assert;
import org.junit.Test;

public class ArithmetiqueTest {

    @Test
    public void additionTest(){
        Assert.assertTrue(2==(1+1));
    }


    @Test
    public void multiplicationTest(){
        Assert.assertTrue(2==(2*1));
    }


    @Test
    public void soustractionTest(){
        Assert.assertTrue(2==(2-0));
    }
}
