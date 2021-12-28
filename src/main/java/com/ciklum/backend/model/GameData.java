package com.ciklum.backend.model;

import java.util.HashMap;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;


/**
 * The GameData
 *
 */
@Service
@Scope("application")
@Getter
@Setter
public class GameData {
	
	/**
	 * The userData
	 *
	 */
	private HashMap<String, UserData> userData = new HashMap<>();
	
}
