package org.adligo.models.core_relations_tests.ids.assertions;

import org.adligo.models.core_relations.shared.ids.LongIdentifierMutant;
import org.adligo.models.core_relations.shared.ids.StringIdentifierMutant;
import org.adligo.tests.shared.AAssertions;
import org.adligo.xml_io_tests.shared.IsXmlIoSerializable;

public class LongIdentifierAssertions extends AAssertions {

	@Override
	public String getPackage() {
		return StringIdentifierMutant.class.getPackage().getName();
	}

	public void isSeralizableAsserts() throws IllegalStateException {
		assertTrue(IsXmlIoSerializable.isXmlIoSerializable(LongIdentifierMutant.class));
	}
}
