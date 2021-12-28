package com.ciklum.backend.controller;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import com.ciklum.backend.model.GameData;
import com.ciklum.backend.model.TotalGameScores;
import com.ciklum.backend.model.UserData;
import com.ciklum.backend.service.BackendService;

public class BackendControllerTest {

	@InjectMocks
	private BackendController BackendController;
	
	@Mock
	private BackendService backendService;
	
	@Mock
	private GameData gameData;
	
	@Mock
	private TotalGameScores totalGameScores;
	
	@SuppressWarnings("deprecation")
	@Before
	public void inti() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getDataTest() {
		HashMap<String, UserData> data = new HashMap<>();
		data.put("test", new UserData());
		Mockito.when(gameData.getUserData()).thenReturn(data );
		ResponseEntity<UserData> responseentity = BackendController.getData("test");
		Assert.assertNotNull(responseentity);
	}
	
	@Test
	public void playTest() {
		HashMap<String, UserData> data = new HashMap<>();
		data.put("test", new UserData());
		Mockito.when(gameData.getUserData()).thenReturn(data);
		ResponseEntity<UserData> responseentity = BackendController.play("test");
		Assert.assertNotNull(responseentity);
	}
	
	@Test
	public void getTotalScoreInfoTest() {
		ResponseEntity<TotalGameScores> responseentity = BackendController.getTotalScoreInfo();
		Assert.assertNotNull(responseentity);
	}
	
	@Test
	public void resetTest() {
		BackendController.reset("");
		Assert.assertNotNull(BackendController);
	}
}
