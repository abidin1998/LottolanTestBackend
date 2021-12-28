package com.ciklum.backend.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;

/**
 * The TotalGameScores
 *
 */
@Service
@Scope("application")
@Getter
@Setter
public class TotalGameScores {

	/**
	 * The totalRounds
	 */
	private int totalRounds=0;
	
	/**
	 * The firstPlayerWins
	 */
	private int firstPlayerWins=0;
	
	/**
	 * The secondPlayerWins
	 */
	private int secondPlayerWins=0;
	
	/**
	 * The draws
	 */
	private int draws=0;
}
