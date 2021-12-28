package com.ciklum.backend.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.ciklum.backend.model.GameData;
import com.ciklum.backend.model.TotalGameScores;
import com.ciklum.backend.model.UserData;

public class BackendServiceImplTest {
	
	@InjectMocks
	private BackendServiceImpl backendServiceImpl;

	
	@SuppressWarnings("deprecation")
	@Before
	public void inti() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getMatchDataTest() {
		GameData GameData = backendServiceImpl.getMatchData(new GameData(), new TotalGameScores(), "x");
		Assert.assertNotNull(GameData);
	}
	
	@Test
	public void getMatchDataTest1() {
		com.ciklum.backend.model.GameData game = new GameData();
		HashMap<String, UserData> hashList = new HashMap<>();
		hashList.put("x", new UserData("",new ArrayList<>(),new ArrayList<>()));
		game.setUserData(hashList );
		GameData GameData = backendServiceImpl.getMatchData(game , new TotalGameScores(), "x");
		Assert.assertNotNull(GameData);
	}
	
	@Test
	public void getMatchDataTest2() {
		com.ciklum.backend.model.GameData game = new GameData();
		HashMap<String, UserData> hashList = new HashMap<>();
		hashList.put("x", new UserData("",new ArrayList<>(),new ArrayList<>()));
		game.setUserData(hashList );
		GameData GameData = backendServiceImpl.getMatchData(game , new TotalGameScores(), "x");
		Assert.assertNotNull(GameData);
	}
	
}
