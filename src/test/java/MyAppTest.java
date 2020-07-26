import org.junit.Assert;
import org.junit.Test;

public class MyAppTest {

    @Test
    public void addTest() {
        int answer = Main.add(20, 40);
        Assert.assertEquals(answer, 60);
    }

    @Test
    public void multiplyTest() {
        int answer = Main.multiply(20, 40);
        Assert.assertEquals(answer, 800);
    }


}
