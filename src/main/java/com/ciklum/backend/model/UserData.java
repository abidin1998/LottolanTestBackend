package com.ciklum.backend.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The UserData
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserData {
	
	/**
	 * The userName
	 */
	private String userName;

	/**
	 * The roundsPlayed
	 */
	private List<Integer> roundsPlayed;

	/**
	 * The machesData
	 */
	private List<MatchData> machesData;
}
