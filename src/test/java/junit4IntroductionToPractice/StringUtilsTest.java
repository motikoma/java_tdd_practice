package junit4IntroductionToPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


// TODO
// [] aaaを入力すると、aaaを返す
// [] HelloWorldを入力すると、hello_worldを返す
// [] practiceJunitを入力すると、practice_junitを返す

class StringUtilsTest {

    @Test
    void test_aaa() {
        assertEquals("aaa", StringUtils.toSnackCase("aaa"));
    }

    @Test
    void test_HelloWorld() {
        assertEquals("hello_world", StringUtils.toSnackCase("HelloWorld"));
    }

    @Test
    void test_practiceJunit() {
        assertEquals("practice_junit", StringUtils.toSnackCase("practiceJunit"));
    }
}