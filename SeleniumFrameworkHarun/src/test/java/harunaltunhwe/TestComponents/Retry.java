package harunaltunhwe.TestComponents;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	int count = 0;
	int maxTry = 1;    // bedeutet mit dieser config, dass maximal 2 Versuche

	@Override
	public boolean retry(ITestResult result) {

		if (count < maxTry) {
			count++;
			return true;
		}

		return false;
	}

}
