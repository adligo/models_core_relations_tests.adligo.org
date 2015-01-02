package org.adligo.models.core_relations_tests.ids.assertions;

import org.adligo.models.core.shared.InvalidParameterException;
import org.adligo.models.core_relations.shared.ids.StringIdentifierMutant;
import org.adligo.tests.shared.AAssertions;
import org.adligo.xml_io_tests.shared.IsXmlIoSerializable;

public class StringIdentifierAssertions extends AAssertions {

	public void isSeralizableAsserts() throws IllegalStateException {
		assertTrue(IsXmlIoSerializable.isXmlIoSerializable(StringIdentifierMutant.class));
	}
}
