import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        boolean expected = true;
        boolean actual = new  Solution().isValidSerialization(preorder);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        String preorder = "1,#";
        boolean expected = false;
        boolean actual = new  Solution().isValidSerialization(preorder);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        String preorder = "9,3,4,#,#,1,#,#,#,2,#,6,#,#";
        boolean expected = false;
        boolean actual = new  Solution().isValidSerialization(preorder);

        Assert.assertEquals(expected, actual);
    }
}
