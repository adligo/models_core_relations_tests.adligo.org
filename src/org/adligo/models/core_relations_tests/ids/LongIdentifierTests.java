package org.adligo.models.core_relations_tests.ids;

import org.adligo.models.core_relations_tests.ids.assertions.LongIdentifierAssertions;
import org.adligo.models.core_relations_tests.shared.ids.assertions.LongIdentifierGwtAssertions;
import org.adligo.tests.ATest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class LongIdentifierTests extends ATest {
	private static LongIdentifierAssertions assertions = new LongIdentifierAssertions();
	private static LongIdentifierGwtAssertions gwtAssertions = new LongIdentifierGwtAssertions();
	
	public LongIdentifierTests() {
		assertions.setTest(this);
		gwtAssertions.setTest(this);
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
