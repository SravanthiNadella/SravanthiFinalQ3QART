package com.qart.batch.training.exceptions;

public class PoliticalLeaderNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1A;

	public PoliticalLeaderNotFoundException() {
		super();
	}

	public PoliticalLeaderNotFoundException(String message) {
		super(message);
	}

}
