package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.ProductService.entities.LicenseTypeEntity;

public interface LicenseTypeService {
	
	LicenseTypeEntity saveLicenseType(LicenseTypeEntity licenseType);
	
	LicenseTypeEntity updateLicenseType(LicenseTypeEntity licenseType, long Id );
	
	void deleteLicenseType(long Id);
	
	List<LicenseTypeEntity> getAllLicenseType();
	
	Optional <LicenseTypeEntity> findByID (long id);

}
