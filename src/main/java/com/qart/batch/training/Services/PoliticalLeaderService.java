package com.qart.batch.training.PoliticalLeader.Service;
import java.util.List;

import com.qart.batch.training.PoliticalLeaderDto;

public interface PoliticalLeaderService {

	public PoliticalLeaderDto registerPoliticalLeader(PoliticalLeaderDto leaderDto);

	public PoliticalLeaderDto updatePoliticalLeader(PoliticalLeaderDto leaderDto);

	public boolean deletePoliticalLeader(Long politicalLeaderId);

	public PoliticalLeaderDto getPoliticalLeaderById(Long politicalLeaderId);

	public List<PoliticalLeaderDto> getAllPoliticalLeaders();

	public List<PoliticalLeaderDto> getPoliticalLeadersByPartyId(Long politicalLeaderId);

}
