package org.adligo.models.core_relations_tests.ids;

import org.adligo.models.core_relations_tests.ids.assertions.StringIdentifierAssertions;
import org.adligo.models.core_relations_tests.shared.ids.assertions.StringIdentifierGwtAssertions;
import org.adligo.tests.ATest;
import org.adligo.tests.shared.AssertionStats;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class StringIdentifierTests extends ATest {
	private static AssertionStats stats = new AssertionStats();
	private static StringIdentifierAssertions assertions = new StringIdentifierAssertions();
	private static StringIdentifierGwtAssertions gwtAssertions = new StringIdentifierGwtAssertions();
	
	public StringIdentifierTests() {
		assertions.setTest(this);
		gwtAssertions.setTest(this);
	}
	
	@AfterClass
	public static void afterClass() {
		stats.logAssertionStats(StringIdentifierTests.class, 
				assertions, 
				gwtAssertions);
	}
	
	@Test
	public void testStorageIdentifierConstructors() throws Exception {
		gwtAssertions.constructorsAsserts();
	}

	@Test
	public void testStringConstructor() throws Exception {
		gwtAssertions.stringConstructorAsserts();
	}
	
	@Test
	public void testToString() throws Exception {
		gwtAssertions.toStringAsserts();
	}
	
	@Test
	public void testEquals() throws Exception {
		gwtAssertions.equalsAsserts();
	}
	
	@Test
	public void testCompairable() throws Exception {
		gwtAssertions.compairableAsserts();
	}
	
	@Test
	public void testIsSeralizable() throws IllegalStateException {
		assertions.isSeralizableAsserts();
	}
	
	
	
}
