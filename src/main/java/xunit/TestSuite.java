package xunit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSuite implements Test {

    List<Test> tests = new ArrayList<>();

    public TestSuite() {
    }

    public TestSuite(Class<? extends Test> clazz) {
        Arrays.stream(clazz.getMethods())
            .filter(m -> m.getName().startsWith("test"))
            .forEach(t -> {
                try {
                    add(clazz.getConstructor(String.class).newInstance(t.getName()));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
    }

    public void add(Test test) {
        tests.add(test);
    }

    public void run(TestResult result) {
        tests.forEach(t -> t.run(result));
    }
}
