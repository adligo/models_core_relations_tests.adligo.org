package org.adligo.models.core;

import org.adligo.models.core.client.I_CustomInfo;
import org.adligo.models.core.client.I_StorageInfo;
import org.adligo.models.core.client.I_Validateable;
import org.adligo.models.core.client.ValidationException;

public class InvalidStorageInfo implements I_StorageInfo, I_Validateable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Class getDetailClass() {
		return InvalidStorageInfo.class;
	}

	@Override
	public I_CustomInfo toImmutable() throws ValidationException {
		return this;
	}

	@Override
	public I_CustomInfo toMutant() throws ValidationException {
		return this;
	}

	@Override
	public boolean isValidatable() {
		return true;
	}

	@Override
	public String getStoreName() {
		return "test";
	}

	@Override
	public void isValid() throws ValidationException {
		throw new ValidationException("InvalidStorageInfo!", I_Validateable.IS_VALID);
	}

}
