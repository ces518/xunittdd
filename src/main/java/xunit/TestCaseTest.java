package xunit;

public class TestCaseTest extends TestCase {

    public TestCaseTest(String name) {
        super(name);
    }

    public void testTemplateMethod() {
        WasRun wasRun = new WasRun("testMethod");
        Assert.assertEquals(false, wasRun.wasRun);
        wasRun.run();
        Assert.assertEquals("setUp testMethod", wasRun.log);
        Assert.assertEquals(true, wasRun.wasRun);
    }
}
