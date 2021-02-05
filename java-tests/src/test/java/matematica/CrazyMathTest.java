package matematica;

import alura.math.CrazyMath;
import org.junit.Assert;
import org.junit.Test;

public class CrazyMathTest {

    @Test
    public void numberHigherThan30(){
        CrazyMath crazyMath = new CrazyMath();
        Assert.assertEquals(132, crazyMath.crazyAccount(33), 0.00001);
    }

    @Test
    public void numberHigherThan10AndLowerThan30(){
        CrazyMath crazyMath = new CrazyMath();
        Assert.assertEquals(20*3, crazyMath.crazyAccount(20), 0.00001);
    }

    @Test
    public void numberLowerThan10(){
        CrazyMath crazyMath = new CrazyMath();
        Assert.assertEquals(5*2, crazyMath.crazyAccount(5), 0.00001);
    }
}
