package com.ciklum.backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The MatchData
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MatchData {

	/**
	 * The playerOneResult
	 */
	private String playerOneResult;
	
	/**
	 * The playerTwoResult
	 */
	private String playerTwoResult;
	
	/**
	 * The winner
	 */
	private String winner;
}
