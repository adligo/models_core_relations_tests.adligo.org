package org.adligo.models.core_relations_tests.shared.ids.assertions;

import java.util.Iterator;
import java.util.TreeSet;

import org.adligo.models.core.shared.InvalidParameterException;
import org.adligo.models.core_relations.shared.ids.StringIdentifier;
import org.adligo.models.core_relations.shared.ids.StringIdentifierMutant;
import org.adligo.tests.shared.AAssertions;

public class StringIdentifierGwtAssertions extends AAssertions {

	@Override
	public String getPackage() {
		return StringIdentifierMutant.class.getPackage().getName();
	}

	public void constructorsAsserts() throws Exception {
		
		InvalidParameterException x;
		x = null;
		try {
			new StringIdentifierMutant(new StringIdentifierMutant());
		} catch (InvalidParameterException g) {
			x = g;
		}
		assertNotNull(x);
		assertEquals(StringIdentifierMutant.CONSTRUCTOR, x.getMethodName());
		assertEquals(StringIdentifierMutant.KEY_CANT_BE_SET_TO_EMPTY, x.getMessage());
		
		StringIdentifierMutant mut = new StringIdentifierMutant("hey");
		StringIdentifier o = new StringIdentifier(mut);
		assertEquals(mut, o);
		assertEquals(mut.compareTo(o), o.compareTo(mut));
		assertEquals(mut.hashCode(), o.hashCode());
		assertEquals(mut.getKey(), o.getKey());
		assertEquals("mut", o.getImmutableFieldName());
		
	}


	public void stringConstructorAsserts() throws Exception {
		InvalidParameterException x;
		x = null;
		try {
			new StringIdentifierMutant((String) null);
		} catch (InvalidParameterException g) {
			x = g;
		}
		assertNotNull(x);
		assertEquals(StringIdentifierMutant.CONSTRUCTOR, x.getMethodName());
		
		x = null;
		try {
			new StringIdentifierMutant("");
		} catch (InvalidParameterException g) {
			x = g;
		}
		assertNotNull(x);
		assertEquals(StringIdentifierMutant.CONSTRUCTOR, x.getMethodName());
		
		StringIdentifierMutant id = new StringIdentifierMutant("you");
		assertEquals("you", id.getKey());
	}
	
	public void toStringAsserts() throws Exception {
		StringIdentifierMutant mutant = new StringIdentifierMutant();
		assertEquals("StringIdentifierMutant [key=null]", mutant.toString());
		mutant = new StringIdentifierMutant("keyVal");
		assertEquals("StringIdentifierMutant [key=keyVal]", mutant.toString());
		
		StringIdentifier id = new StringIdentifier(mutant);
		assertEquals("StringIdentifier [key=keyVal]", id.toString());
	}
	
	public void equalsAsserts() throws Exception {
		StringIdentifierMutant a = new StringIdentifierMutant();
		StringIdentifierMutant b = new StringIdentifierMutant();
		
		assertEquals(a, b);
		b = new StringIdentifierMutant("some_key");
		
		a = new StringIdentifierMutant(b);
		assertEquals(a, b);
	}
	
	
	public void compairableAsserts() throws Exception {
		StringIdentifierMutant a = new StringIdentifierMutant("a");
		StringIdentifierMutant b = new StringIdentifierMutant("b");
		StringIdentifierMutant c = new StringIdentifierMutant("c");
		
		TreeSet<StringIdentifierMutant> ts = new TreeSet<StringIdentifierMutant>();
		ts.add(a);
		ts.add(b);
		ts.add(c);
		
		Iterator<StringIdentifierMutant> it = ts.iterator();
		
		assertEquals(a, it.next());
		assertEquals(b, it.next());
		assertEquals(c, it.next());
	}
}
