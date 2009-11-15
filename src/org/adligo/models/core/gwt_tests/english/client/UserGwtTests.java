package org.adligo.models.core.gwt_tests.english.client;

import org.adligo.models.core.client.ModelsCoreMockGwtSetup;
import org.adligo.models.core.client.ModelsCoreRegistry;
import org.adligo.models.core.client.UserAssertions;
import org.adligo.models.core.client.UserMutant;
import org.adligo.tests.client.AGwtTest;

public class UserGwtTests extends AGwtTest {

	public void testErrorStrings() throws Exception {
		UserAssertions.assertMutators(this, "");
		UserAssertions.assertConstructors(this, "");
	}


	@Override
	public String getModuleName() {
		return ModelsCoreMockGwtSetup.ENGLISH_MODULE_NAME;
	}
	
	@Override
	protected void gwtSetUp() throws Exception {
		// TODO Auto-generated method stub
		super.gwtSetUp();
		ModelsCoreRegistry.init();
		ModelsCoreMockGwtSetup.init();
	}
}
