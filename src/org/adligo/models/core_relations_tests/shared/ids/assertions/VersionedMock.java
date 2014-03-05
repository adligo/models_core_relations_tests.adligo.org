package org.adligo.models.core_relations_tests.shared.ids.assertions;

import org.adligo.models.core.shared.I_Versioned;
import org.adligo.models.core.shared.I_StorageIdentifier;
import org.adligo.models.core.shared.I_StorageInfo;
import org.adligo.models.core.shared.ValidationException;

public class VersionedMock implements I_Versioned {
	private I_StorageIdentifier id;
	private Integer version;
	private I_StorageInfo storageInfo;
	
	public I_StorageIdentifier getId() {
		return id;
	}
	public void setId(I_StorageIdentifier id) {
		this.id = id;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	@Override
	public I_StorageInfo getStorageInfo() {
		return storageInfo;
	}
	@Override
	public boolean isStored() throws ValidationException {
		return false;
	}
	public void setStorageInfo(I_StorageInfo storageInfo) {
		this.storageInfo = storageInfo;
	}
	
}
