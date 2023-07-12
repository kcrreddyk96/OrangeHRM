package OrangeHRM.testComponents;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListeners implements IRetryAnalyzer {
    /**
     * @param iTestResult
     * @return
     */

    int count = 0;
    int maxTry = 2;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (count < maxTry) {
            count++;
            return true;
        }
        return false;
    }
}
