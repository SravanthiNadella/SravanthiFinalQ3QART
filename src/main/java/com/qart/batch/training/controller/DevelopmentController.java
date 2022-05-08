package com.qart.batch.training.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qart.batch.training.dto.DevelopmentDto;
import com.qart.batch.training.service.DevelopmentService;

@RestController
@RequestMapping("/developments")
public class DevelopmentController {

	@Autowired
	private DevelopmentService developmentService;

	@PostMapping
	public ResponseEntity<?> addDevelopment(@Valid @RequestBody DevelopmentDto developmentDto, BindingResult result) {
		if (result.hasErrors()) {
			throw new InvalidDataException("Development Data is not valid");
		}
		developmentService.createDevelopment(developmentDto);
		return ResponseEntity.ok(developmentDto);

	}

	@PutMapping
	public ResponseEntity<?> updateDevelopment(@Valid @RequestBody DevelopmentDto developmentDto,
			BindingResult result) {
		if (result.hasErrors()) {
			throw new InvalidDataException("Development Data is not valid");
		}
		developmentService.updateDevelopment(developmentDto);
		return ResponseEntity.ok(developmentDto);

	}

	@DeleteMapping("/{leaderid}")
	public ResponseEntity<?> deleteDevelopment(@PathVariable Long leaderid) {

		developmentService.deleteDevelopment(leaderid);
		return ResponseEntity.ok(true);

	}


	}

	@GetMapping("by-leader-id/{politicalLeaderId}")
	public ResponseEntity<?> getAllDevelopmentsByPoliticalLeaderId(@PathVariable Long politicalLeaderId) {

		List<DevelopmentDto> allDevelopmentsByLeaderId = developmentService
				.getAllDevelopmentsByLeaderId(politicalLeaderId);
		return ResponseEntity.ok(allDevelopmentsByLeaderId);

	}

}
