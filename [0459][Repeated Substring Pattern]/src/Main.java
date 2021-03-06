import org.junit.Assert;
import org.junit.Test;

/**
 * @author: wangjunchao(王俊超)
 * @time: 2019-07-09 17:10
 **/
public class Main {
    @Test
    public void test1() {
        Solution solution = new Solution();
        Assert.assertEquals(true, solution.repeatedSubstringPattern("abab"));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        Assert.assertEquals(false, solution.repeatedSubstringPattern("abb"));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        Assert.assertEquals(true, solution.repeatedSubstringPattern("abcabcabcabc"));
    }
}
