package org.adligo.models.core_relations_tests.shared.ids.assertions;

import java.util.Iterator;
import java.util.TreeSet;

import org.adligo.models.core.shared.InvalidParameterException;
import org.adligo.models.core_relations.shared.ids.LongIdentifierMutant;
import org.adligo.models.core_relations.shared.ids.StringIdentifierMutant;
import org.adligo.models.core_relations.shared.ids.VersionedLongIdentifier;
import org.adligo.models.core_relations.shared.ids.VersionedLongIdentifierMutant;
import org.adligo.tests.shared.AAssertions;

public class VersionedLongIdentifierGwtAssertions extends AAssertions {

	@Override
	public String getPackage() {
		return StringIdentifierMutant.class.getPackage().getName();
	}

	public void constructorsAsserts() throws Exception {
		
		InvalidParameterException x;
		x = null;
		try {
			new VersionedLongIdentifier(null);
		} catch (InvalidParameterException g) {
			x = g;
		}
		assertNotNull(x);
		assertEquals(VersionedLongIdentifierMutant.CONSTRUCTOR, x.getMethodName());
		assertEquals(VersionedLongIdentifierMutant.DOES_NOT_ACCEPT_NULLS, x.getMessage());
		
		VersionedLongIdentifier vli = new VersionedLongIdentifier();
		assertEquals(961, vli.hashCode());
	}


	public void copyConstructorAsserts() throws Exception {
		InvalidParameterException x;
		x = null;
		try {
			new VersionedLongIdentifier(new VersionedLongIdentifier());
		} catch (InvalidParameterException g) {
			x = g;
		}
		assertNotNull(x);
		assertEquals(VersionedLongIdentifierMutant.SET_ID, x.getMethodName());
		assertEquals(VersionedLongIdentifierMutant.ID_MAY_NOT_BE_SET_TO_NULL, x.getMessage());
	
		
		x = null;
		try {
			VersionedLongIdentifierMutant mut = new VersionedLongIdentifierMutant();
			mut.setId(1L);
			new VersionedLongIdentifier(mut);
		} catch (InvalidParameterException g) {
			x = g;
		}
		assertNotNull(x);
		assertEquals(VersionedLongIdentifierMutant.SET_VERSION, x.getMethodName());
		assertEquals(VersionedLongIdentifierMutant.VERSION_MAY_NOT_BE_SET_TO_NULL, x.getMessage());
		
		VersionedLongIdentifierMutant mut = new VersionedLongIdentifierMutant();
		mut.setId(1L);
		mut.setVersion(0);
		VersionedLongIdentifier vli = new VersionedLongIdentifier(mut);
		assertEquals(vli, mut);
		assertEquals(mut, vli);
		assertEquals(mut.hashCode(), vli.hashCode());
		assertEquals(mut.getId(), vli.getId());
		assertEquals(mut.getVersion(), vli.getVersion());
		assertEquals(24, vli.getMemsize());
		
	}
	
	public void toStringAsserts() throws Exception {
		VersionedLongIdentifierMutant id = new VersionedLongIdentifierMutant();
		assertEquals("VersionedLongIdentifierMutant [id=null, version=null]", id.toString());
		
		id.setId(1L);
		assertEquals("VersionedLongIdentifierMutant [id=1, version=null]", id.toString());
		id.setVersion(0);
		assertEquals("VersionedLongIdentifierMutant [id=1, version=0]", id.toString());
		
		VersionedLongIdentifier vli = new VersionedLongIdentifier(id);
		assertEquals("VersionedLongIdentifier [id=1, version=0]", vli.toString());
	}
	
	public void equalsAsserts() throws Exception {
		VersionedLongIdentifierMutant a = new VersionedLongIdentifierMutant();
		VersionedLongIdentifierMutant b = new VersionedLongIdentifierMutant();
		
		assertEquals(a, b);
		b = new VersionedLongIdentifierMutant();
		b.setId(1L);
		assertNotEquals(a, b);
		
		a = new VersionedLongIdentifierMutant();
		a.setId(1L);
		assertEquals(a, b);
		
		a.setVersion(1);
		assertNotEquals(a, b);
		b.setVersion(1);
		assertEquals(a, b);
	}
	
	
	public void compairableAsserts() throws Exception {
		VersionedLongIdentifierMutant a = new VersionedLongIdentifierMutant();
		VersionedLongIdentifierMutant b = new VersionedLongIdentifierMutant();
		VersionedLongIdentifierMutant c = new VersionedLongIdentifierMutant();
		
		a.setId(1L);
		b.setId(2L);
		b.setVersion(1);
		c.setId(2L);
		c.setVersion(2);
		
		TreeSet<VersionedLongIdentifierMutant> ts = new TreeSet<VersionedLongIdentifierMutant>();
		ts.add(a);
		ts.add(b);
		ts.add(c);
		
		Iterator<VersionedLongIdentifierMutant> it = ts.iterator();
		
		assertEquals(a, it.next());
		assertEquals(b, it.next());
		assertEquals(c, it.next());
	}
}
