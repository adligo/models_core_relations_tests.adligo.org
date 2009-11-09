package org.adligo.models.core.gwt_tests.french.client;

import org.adligo.models.core.client.EmailAssertions;
import org.adligo.models.core.client.ModelsCoreMockGwtSetup;
import org.adligo.tests.client.AGwtTest;

public class FrEmailGwtTests extends AGwtTest {

	@Override
	protected void gwtSetUp() throws Exception {
		// TODO Auto-generated method stub
		super.gwtSetUp();
		ModelsCoreMockGwtSetup.init();
	}
	
	@Override
	public String getModuleName() {
		return ModelsCoreMockGwtSetup.FRENCH_MODULE_NAME;
	}
	
	public void testFrenchProperyFile() throws Exception {
		EmailAssertions.assertInvalidParameterExceptions("fr ", this);
	}
}