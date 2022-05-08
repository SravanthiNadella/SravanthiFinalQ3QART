package com.qart.batch.training.dto;

import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class DevelopmentDto {
	
	private Long PoliticalLeaderID;
	@NotNull
	private String Developmenttitle;
	@NotEmpty
	@Length(min = 5, max = 100)
	private String activity;
	@NotEmpty
	@Length(min = 5, max = 100)
	private String budget;
	@NotEmpty
	@Length(min = 2, max = 100)
	private String state;
	@NotNull
	@Min(3)
	@Max(50)
	private Integer activityMonth;
	@NotNull
	@Min(1)
	@Max(12)
	private Integer activityYear;
	@NotNull
	@Min(2020)
	@Max(2040)

	public Long getPoliticalLeaderID() {
		return politicalLeaderId;
	}

	public void setPoliticalLeaderID(Long politicalLeaderIdoliticalLeaderID) {
		this.politicalLeaderID = politicalLeaderID;
	}

	public String getDevelopmentTitle() {
		return developmenttitle;
	}

	public void setDevelopmentTitle(String developmenttitle) {
		this.developmenttitle = developmenttitle;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getActivityMonth() {
		return activityMonth;
	}

	public void setActivityMonth(Integer activityMonth) {
		this.activityMonth = activityMonth;
	}

	public Integer getActivityYear() {
		return activityYear;
	}

	public void setActivityYear(Integer activityYear) {
		this.activityYear = activityYear;
	}

	@Override
	public int hashCode() {
		return Objects.hash(activity, activityMonth, activityYear, budget, politicalLeaderId, developmenttitle, state);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DevelopmentDto other = (DevelopmentDto) obj;
		return Objects.equals(activity, other.activity) 
				&& Objects.equals(activityMonth, other.activityMonth)
				&& Objects.equals(activityYear, other.activityYear) 
				&& Objects.equals(budget, other.budget)
				&& Objects.equals(developmenttitle, other.developmenttitle)
				&& Objects.equals(politicalLeaderId, other.politicalLeaderId)
				&& Objects.equals(state, other.state) 
				&& Objects.equals(title, other.title);
	}

}
