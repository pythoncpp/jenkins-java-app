import org.junit.Assert;
import org.junit.Test;

public class MyAppTest {

    @Test
    public void addTest() {
        int answer = Main.add(20, 40);
        Assert.assertEquals(answer, 60);
    }
}
