package com.ciklum.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ciklum.backend.model.GameData;
import com.ciklum.backend.model.TotalGameScores;
import com.ciklum.backend.model.UserData;
import com.ciklum.backend.service.BackendService;

/**
 * The BackendController
 *
 */
@RestController
public class BackendController {

	/**
	 * The backendService
	 *
	 */
	private BackendService backendService;
	
	/**
	 * The gameData
	 *
	 */
	private GameData gameData;
	
	/**
	 * The totalGameScores
	 *
	 */
	private TotalGameScores totalGameScores;

	/**
	 * The BackendController
	 * 
	 * @param backendService
	 * 			The backendService
	 * @param gameData
	 * 			The gameData
	 * @param totalGameScores
	 * 			The totalGameScores
	 */
	public BackendController(BackendService backendService,GameData gameData,TotalGameScores totalGameScores) {
		super();
		this.backendService = backendService;
		this.gameData = gameData;
		this.totalGameScores = totalGameScores;
	}


	/**
	 * The play
	 * 
	 * @param userName
	 * 			The userName
	 * 
	 * @return UserData
	 */
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/play/{username}")
	public ResponseEntity<UserData> play(@PathVariable(value = "username") String userName) {
		backendService.getMatchData(gameData,totalGameScores,userName);
		return ResponseEntity.ok(gameData.getUserData().get(userName));
	}
	
	/**
	 * The play
	 * 
	 * @param userName
	 * 			The userName
	 * 
	 * @return UserData
	 */
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/data/{username}")
	public ResponseEntity<UserData> getData(@PathVariable(value = "username") String userName) {
		return ResponseEntity.ok(gameData.getUserData().get(userName));
	}
	
	/**
	 * The getTotalScoreInfo
	 * 
	 * @return TotalGameScores
	 */
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/totalscores")
	public ResponseEntity<TotalGameScores> getTotalScoreInfo() {
		return ResponseEntity.ok(totalGameScores);
	}
	
	/**
	 * The reset
	 * 
	 */
	@CrossOrigin(origins="http://localhost:4200")
	@DeleteMapping("/reset/{username}")
	public void reset(@PathVariable(value = "username") String userName) {
		gameData.getUserData().remove(userName);
	}
	

}
