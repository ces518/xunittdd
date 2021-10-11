package xunit;

public class TestResult {

    int runCount = 0;

    public void testStarted() {
        this.runCount++;
    }

    public String getSummary() {
        return this.runCount + " run, 0 failed";
    }
}
