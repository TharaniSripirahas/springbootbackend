package com.Sgic.DefectTracker.ProductService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sgic.DefectTracker.ProductService.entities.LicenseTypeEntity;
import com.Sgic.DefectTracker.ProductService.repository.LicenseTypeRepository;
import com.Sgic.DefectTracker.ProductService.service.LicenseTypeService;

@RestController
@RequestMapping("api/v1")

public class LicenseTypeController {
	@Autowired
	LicenseTypeService licenseTypeRepository;
	
	
	@PostMapping("/LicenseType")
	public HttpStatus createNote(@RequestBody LicenseTypeEntity licenseTypeEntity) {
		licenseTypeRepository.saveLicenseType(licenseTypeEntity);
		return HttpStatus.CREATED;
	}

	@GetMapping("/LicenseType")
	public List<LicenseTypeEntity> getLicenseTypeEntity() {
		return licenseTypeRepository.getAllLicenseType();

	}
	
	@GetMapping("/LicenseType/{id}")
	public Optional<LicenseTypeEntity> getLicenseTypeEntity(@PathVariable("id") Long id){
	return licenseTypeRepository.findByID(id);
	}

	@PutMapping("/LicenseType/{id}")
	public ResponseEntity<Object> updateEmployee(@RequestBody LicenseTypeEntity license, @PathVariable long id) {

		Optional<LicenseTypeEntity> LicenseTypeOptional = licenseTypeRepository.findByID(id);

		if (!LicenseTypeOptional.isPresent())
			return ResponseEntity.notFound().build();

		license.setId(id);

		licenseTypeRepository.saveLicenseType(license);

		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("/LicenseType/{id}")
	public ResponseEntity<LicenseTypeEntity>deleteLicenseType(@PathVariable long id) {
		licenseTypeRepository.deleteLicenseType(id);
		return new ResponseEntity<LicenseTypeEntity>(HttpStatus.NO_CONTENT);
	}
	
}
