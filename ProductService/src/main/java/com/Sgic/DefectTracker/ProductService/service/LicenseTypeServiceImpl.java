package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.ProductService.entities.LicenseTypeEntity;
import com.Sgic.DefectTracker.ProductService.repository.LicenseTypeRepository;

@Service
public class LicenseTypeServiceImpl implements LicenseTypeService{

	@Autowired
	LicenseTypeRepository licenseTypeRepository;

	@Override
	public LicenseTypeEntity saveLicenseType(LicenseTypeEntity licenseType) {
	// TODO Auto-generated method stub
	return licenseTypeRepository.save(licenseType);
	}

	@Override
	public LicenseTypeEntity updateLicenseType(LicenseTypeEntity licenseType, long id) {
	// TODO Auto-generated method stub
	return licenseTypeRepository.save(licenseType);
	}

	@Override
	public void deleteLicenseType(long id) {
		licenseTypeRepository.deleteById(id);

	}

	@Override
	public List<LicenseTypeEntity> getAllLicenseType() {
	// TODO Auto-generated method stub
	return licenseTypeRepository.findAll();
	}

	@Override
	public Optional<LicenseTypeEntity> findByID(long id) {
	// TODO Auto-generated method stub
	return licenseTypeRepository.findById(id);
	}
}
