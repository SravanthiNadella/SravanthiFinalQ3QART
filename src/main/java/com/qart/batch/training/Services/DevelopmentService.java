package com.qart.batch.training.PoliticalParties.Service.Mode
import java.util.List;

import com.finalq3.sba.policalparties.dto.DevelopmentDto;

public interface DevelopmentService {

	public DevelopmentDto createDevelopment(DevelopmentDto developmentDto);

	public DevelopmentDto updateDevelopment(DevelopmentDto developmentDto);

	public boolean deleteDevelopment(Long developmentId);

	public DevelopmentDto getDevelopmentById(Long developmentId);

	public List<DevelopmentDto> getAllDevelopments();

	public List<DevelopmentDto> getAllDevelopmentsByLeaderId(Long politicalLeaderId);
}
