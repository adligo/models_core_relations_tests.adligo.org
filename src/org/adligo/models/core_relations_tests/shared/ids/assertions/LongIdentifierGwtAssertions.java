package org.adligo.models.core_relations_tests.shared.ids.assertions;

import java.util.Iterator;
import java.util.TreeSet;

import org.adligo.models.core.shared.InvalidParameterException;
import org.adligo.models.core_relations.shared.ids.LongIdentifier;
import org.adligo.models.core_relations.shared.ids.LongIdentifierMutant;
import org.adligo.models.core_relations.shared.ids.StringIdentifierMutant;
import org.adligo.tests.shared.AAssertions;

public class LongIdentifierGwtAssertions extends AAssertions {


	public void constructorsAsserts() throws Exception {
		
		InvalidParameterException x;
		x = null;
		try {
			new LongIdentifierMutant(new LongIdentifierMutant());
		} catch (InvalidParameterException g) {
			x = g;
		}
		assertNotNull(x);
		assertEquals(LongIdentifierMutant.CONSTRUCTOR, x.getMethodName());
		assertEquals(LongIdentifierMutant.ID_CANT_BE_SET_TO_NULL, x.getMessage());
		
		LongIdentifierMutant lim = new LongIdentifierMutant(1L);
		LongIdentifier li = new LongIdentifier(lim);
		assertEquals(lim, li);
		assertEquals(li, lim);
		assertEquals(lim.getMemsize(), li.getMemsize());
		assertEquals("mut", li.getImmutableFieldName());
	}


	public void stringConstructorAsserts() throws Exception {
		InvalidParameterException x;
		x = null;
		try {
			new LongIdentifierMutant((Long) null);
		} catch (InvalidParameterException g) {
			x = g;
		}
		assertNotNull(x);
		assertEquals(LongIdentifierMutant.CONSTRUCTOR, x.getMethodName());
		
	
		
		LongIdentifierMutant id = new LongIdentifierMutant(1L);
		assertEquals(1L, id.getId());
	}
	
	public void toStringAsserts() throws Exception {
		LongIdentifierMutant id = new LongIdentifierMutant();
		assertEquals("LongIdentifierMutant [id=null]", id.toString());
		id = new LongIdentifierMutant(1L);
		assertEquals("LongIdentifierMutant [id=1]", id.toString());
		LongIdentifier li = new LongIdentifier(id);
		assertEquals("LongIdentifier [id=1]", li.toString());
	}
	
	public void equalsAsserts() throws Exception {
		LongIdentifierMutant a = new LongIdentifierMutant();
		LongIdentifierMutant b = new LongIdentifierMutant();
		
		assertEquals(a, b);
		b = new LongIdentifierMutant(1L);
		assertNotEquals(a, b);
		
		a = new LongIdentifierMutant(1L);
		assertEquals(a, b);
	}
	
	
	public void compairableAsserts() throws Exception {
		LongIdentifierMutant a = new LongIdentifierMutant(1L);
		LongIdentifierMutant b = new LongIdentifierMutant(2L);
		LongIdentifierMutant c = new LongIdentifierMutant(3L);
		
		TreeSet<LongIdentifierMutant> ts = new TreeSet<LongIdentifierMutant>();
		ts.add(a);
		ts.add(b);
		ts.add(c);
		
		Iterator<LongIdentifierMutant> it = ts.iterator();
		
		assertEquals(a, it.next());
		assertEquals(b, it.next());
		assertEquals(c, it.next());
	}
}
