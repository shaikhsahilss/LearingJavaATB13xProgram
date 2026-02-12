package ReTryAnalayzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWithRetry {

    @Test(retryAnalyzer = RetryTest.class)

    public void testMethod() {

        System.out.println("Running test...");

        Assert.fail("Failing test for retry");

        System.out.println("Test Case not execute");

    }

}
//“How do you implement retry logic in TestNG?”
//We implement the IRetryAnalyzer interface, override the retry() method, and
// configure the maximum retry attempts. If a test fails, TestNG calls this logic
// and re-executes the test until the max retry count is reached.
//

// How do you know it worked?”
//
//In the TestNG report/logs, you’ll see multiple executions of the same test and the
// final summary shows total runs vs retries.