package org.adligo.models.core_relations_tests.ids.assertions;

import org.adligo.models.core_relations.shared.ids.StringIdentifierMutant;
import org.adligo.models.core_relations.shared.ids.VersionedLongIdentifierMutant;
import org.adligo.tests.shared.AAssertions;
import org.adligo.xml_io_tests.shared.IsXmlIoSerializable;

public class VersionedLongIdentifierAssertions extends AAssertions {

	public void isSeralizableAsserts() throws IllegalStateException {
		assertTrue(IsXmlIoSerializable.isXmlIoSerializable(VersionedLongIdentifierMutant.class));
	}
}
