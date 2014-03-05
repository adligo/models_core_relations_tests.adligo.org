package org.adligo.models.core_relations_tests.ids;

import org.adligo.models.core_relations_tests.ids.assertions.VersionedLongIdentifierAssertions;
import org.adligo.models.core_relations_tests.shared.ids.assertions.VersionedLongIdentifierGwtAssertions;
import org.adligo.tests.ATest;
import org.adligo.tests.shared.AssertionStats;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class VersionedLongIdentifierTests extends ATest {
	private static AssertionStats stats = new AssertionStats();
	private static VersionedLongIdentifierAssertions assertions = new VersionedLongIdentifierAssertions();
	private static VersionedLongIdentifierGwtAssertions gwtAssertions = new VersionedLongIdentifierGwtAssertions();
	
	public VersionedLongIdentifierTests() {
		assertions.setTest(this);
		gwtAssertions.setTest(this);
	}
	
	@AfterClass
	public static void afterClass() {
		stats.logAssertionStats(VersionedLongIdentifierTests.class, 
				assertions, 
				gwtAssertions);
	}
	
	@Test
	public void testStorageIdentifierConstructors() throws Exception {
		gwtAssertions.constructorsAsserts();
	}

	@Test
	public void testCopyConstructor() throws Exception {
		gwtAssertions.copyConstructorAsserts();
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
