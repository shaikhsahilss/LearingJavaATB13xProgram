package ReTryAnalayzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer {
    private int count = 0;
    private static final int maxTry = 2; // retry twice max

    @Override
    public boolean retry(ITestResult result) {
        if (count < maxTry) {
            count++;
            return true;   // re-run the test
        }
        return false;     // stop retrying
    }
}
