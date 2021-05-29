package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@SpringBootTest
public class Test extends AbstractTestNGSpringContextTests {
    @Autowired
    SomeService someService;

    @org.testng.annotations.Test
    public void test() {
    }
}
