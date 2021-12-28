package com.ciklum.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ciklum.backend.model.GameData;
import com.ciklum.backend.model.MatchData;
import com.ciklum.backend.model.TotalGameScores;
import com.ciklum.backend.model.UserData;

/**
 * The BackendServiceImpl
 *
 */
@Service
public class BackendServiceImpl implements BackendService {
	
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
	@Override
	public GameData getMatchData(GameData gameData,TotalGameScores totalGameScores,String name) {
		UserData userdata = new UserData();
		List<Integer> rounds= new ArrayList<>();
		rounds.add(1);
		userdata.setRoundsPlayed(rounds);
		userdata.setUserName(name);
		List<MatchData> machesData  = new ArrayList<>();
		MatchData maches = new MatchData();
		playMethod(totalGameScores, maches);
		maches.setPlayerOneResult("Rock");
		machesData.add(maches);
		userdata.setMachesData(machesData);
		if(gameData.getUserData().containsKey(name)) {
			gameData.getUserData().get(name).getRoundsPlayed().add(1);
			gameData.getUserData().get(name).getMachesData().add(maches);
		} else {
			gameData.getUserData().put(name, userdata);
		}
		totalGameScores.setTotalRounds(totalGameScores.getTotalRounds()+1);
		return gameData;
	}

	/**
	 * The playMethod
	 * 
	 * @param totalGameScores
	 * 			The totalGameScores
	 * @param maches
	 * 			The maches
	 */
	private void playMethod(TotalGameScores totalGameScores, MatchData maches) {
		int result = (int) Math.floor(Math.random()*(2-0+1)+0);
		switch(result) {
		case 0:
			maches.setPlayerTwoResult("Rock");
			maches.setWinner("Draw");
			totalGameScores.setDraws(totalGameScores.getDraws()+1);
			break;
		case 1:
			maches.setPlayerTwoResult("Paper");
			maches.setWinner("Player 2 wins");
			totalGameScores.setSecondPlayerWins(totalGameScores.getSecondPlayerWins()+1);
			break;
		case 2:
			maches.setPlayerTwoResult("Scissors");
			maches.setWinner("Player 1 wins");
			totalGameScores.setFirstPlayerWins(totalGameScores.getFirstPlayerWins()+1);
			break;
		}
	}

}
