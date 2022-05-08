package com.qart.batch.training.dto;

import java.util.Objects;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class PoliticalLeaderDto {

	Private Long PoliticalLeaderId;
	@NotNull
	private Long politicalPartyId;
	@NotNull
	@Length(min = 5, max = 100)
	//@Column(unique = true)
	private String LeaderName;
	@NotNull
	@Length(min = 5, max = 100)
	private String LeaderState;
	@NotNull
	@Length(min = 5, max = 100)
	Private String PartyName
	@NotNull
	@Length(min = 3, max = 100)
	Private String FounderName;
	@NotNull
	@Length(min = 3, max = 100)

	public Long getPoliticalLeaderId() {
		return politicalLeaderId;
	}

	public void setPoliticalLeaderId(Long candidateId) {
		this.politicalLeaderId = candidateId;
	}

	public Long getPoliticalPartyId() {
		return politicalPartyId;
	}

	public void setPoliticalPartyId(Long partyId) {
		this.politicalPartyId = partyId;
	}

	public String getLeaderName() {
		return leaderName;
	}

	public void setLeaderName(String LeaderName) {
		this.leaderName = leaderName;
	}

	public String getLeaderState() {
		return leaderState;
	}

	public void setLeaderState(String leaderState) {
		this.leaderState = leaderState;
	}
	
	public String getPartyName() {
		return PartyName;
	}
	
	public void setPartyName(String PartyName){
		this.partyName = partyName;
	}
	public String getFounderName() {
		return FounderName;
	}
	
	public void setFounderName(String FounderName){
		this.foundername = founderName;

	@Override
	public int hashCode() {
		return Objects.hash(politicalLeaderId, partyId, leaderName, leaderState, partyName, founderName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoliticalLeaderDto other = (PoliticalLeaderDto) obj;
		return Objects.equals(politicalLeaderId, other.politicalLeaderId)
				&& Objects.equals(partyId, other.partyId)
				&& Objects.equals(leaderName, other.leaderName)
				&& Objects.equals(leaderState, other.leaderState)
				&& Objects.equals(partyName, other.partyName)
				&& Objects.equals(founderName, other.founderName);
	}

}
