package com.qart.batch.training.PoliticalParty.Service;
import java.util.List;

import com.finalq3.sba.policalparties.dto.PoliticalLeaderDto;
import com.finalq3.sba.policalparties.dto.PoliticalPartyDto;

public interface PoliticalPartyService {

	public PoliticalPartyDto registerParty(PoliticalPartyDto politicalPartyDto);

	public PoliticalPartyDto updateParty(PoliticalPartyDto politicalPartyDto);

	public boolean deleteParty(Long partyId);

	public PoliticalPartyDto getPartyById(Long partyId);

	public List<PoliticalPartyDto> getAllParties();


}
