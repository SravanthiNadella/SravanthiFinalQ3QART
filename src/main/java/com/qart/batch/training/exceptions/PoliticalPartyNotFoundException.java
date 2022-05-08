package com.qart.batch.training.exceptions;

public class PoliticalPartyNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1A;

	public PoliticalPartyNotFoundException() {
		super();
	}

	public PoliticalPartyNotFoundException(String message) {
		super(message);
	}

}
