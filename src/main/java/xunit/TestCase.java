package xunit;

import java.lang.reflect.Method;

/**
 * Composite Pattern 적용
 */
public class TestCase implements Test {

    protected final String name;

    public TestCase(String name) {
        this.name = name;
    }

    /**
     * TemplateMethod Pattern 적용
     */
    public void run(TestResult testResult) {
        testResult.testStarted();
        setUp();

        try {
            Method method = getClass().getMethod(name);
            method.invoke(this);
        } catch (Exception e) {
            testResult.testFailed();
        }
        tearDown();
    }

    public void setUp() {

    }

    public void tearDown() {

    }
}
