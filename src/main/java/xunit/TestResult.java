package xunit;

public class TestResult {

    int runCount = 0;
    int errorCount;

    public void testStarted() {
        this.runCount++;
    }

    public void testFailed() {
        this.errorCount++;
    }

    public String getSummary() {
        return this.runCount + " run, " + errorCount + " failed";
    }
}
