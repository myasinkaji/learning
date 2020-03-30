package ir.mtyn.learning.test.parameterizedtest.p1;


import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


public class Test1 {

    @BeforeEach
    public void be() {
        System.out.println("here");
    }

    @Test
    public void test() {
        Assert.assertEquals(1, 1);
    }

}
