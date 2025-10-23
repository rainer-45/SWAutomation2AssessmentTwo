package example.org;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGSample {


    public class SampleTest {
        @Test
        public void verifyMath() {
            int result = 2 + 2;
            Assert.assertEquals(result, 4, "Math check");
        }
    }
}
