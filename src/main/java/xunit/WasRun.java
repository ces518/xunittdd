package xunit;

public class WasRun extends TestCase {

    public boolean wasRun;
    public boolean wasSetUp;
    public String log;

    public WasRun(String name) {
        super(name);
    }

    @Override
    public void setUp() {
        this.wasSetUp = true;
        log = "setUp";
    }

    public void testMethod() {
        this.wasRun = true;
        log += " testMethod";
    }
}
