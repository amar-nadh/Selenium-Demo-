package WebDriver.TestNg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation testannotation, @SuppressWarnings("rawtypes") Class testClass, @SuppressWarnings("rawtypes") Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		
		IRetryAnalyzer retry = testannotation.getRetryAnalyzer();
		
		System.out.println(testannotation);
		
		if (retry == null)	{
			testannotation.setRetryAnalyzer(Retry.class);
		}
		
	}

}
