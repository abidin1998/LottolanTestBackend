package com.ciklum.backend.service;

import com.ciklum.backend.model.GameData;
import com.ciklum.backend.model.TotalGameScores;

/**
 * The BackendService
 *
 */
public interface BackendService {
	
	/**
	 * The getMatchData
	 * 
	 * @param gameData
	 * 			The gameData
	 * @param totalGameScores
	 * 			The totalGameScores
	 * @param name
	 * 			The name
	 * @return GameData
	 */
	GameData getMatchData(GameData gameData,TotalGameScores totalGameScores,String name);
}
