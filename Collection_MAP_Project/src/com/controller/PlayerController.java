package com.controller;

import java.util.List;
import java.util.Map;

import com.entity.Player;
import com.service.PlayerService;

public class PlayerController {

	PlayerService service = null;

	public void getplayercontroller() {
		service = new PlayerService();
		service.getallplayerService();

	}

	public void getbatsmancontroller(int y) {
		service = new PlayerService();
		service.getallbatsmanbyyearservice(y);

	}

	public void getbowlercontroller(int y) {
		service = new PlayerService();
		service.getbowlerbyyearService(y);

	}

	public void getplayernamecontroller(String n) {
		service = new PlayerService();
		service.getplayerbynameService(n);

	}

	public void getallroundercontroller(int r, int w) {
		service = new PlayerService();
		service.getallrounderService(r, w);

	}

	public void getallbatsmancontroller(int r) {
		service = new PlayerService();
		service.getallbatsmanService(r);

	}
	
	

}