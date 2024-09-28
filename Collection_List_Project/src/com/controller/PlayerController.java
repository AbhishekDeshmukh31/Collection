package com.controller;

import java.util.List;

import com.entity.Player;
import com.service.PlayerService;

public class PlayerController {

	PlayerService service = null;

	public List<Player> getplayercontroller() {
		service = new PlayerService();
		List<Player> db = service.getallplayerservice();
		return db;

	}

	public List<Player> getbatsmancontroller(int r) {
		service = new PlayerService();
		List<Player> db = service.getallbatsmanservice(r);
		return db;

	}

	public List<Player> getteamcontroller(String s) {
		service = new PlayerService();
		List<Player> db = service.getplayerteamservice(s);
		return db;

	}

	public List<Player> getbowlercontroller(int i) {
		service = new PlayerService();
		List<Player> db = service.getallbowlerservice(i);
		return db;

	}

	public List<Player> getallroundercontroller(int r, int w) {
		service = new PlayerService();
		List<Player> db = service.getallallroundersservice(r, w);
		return db;
	}

	public List<Player> getjerseycontroller(int j) {
		service = new PlayerService();
		List<Player> db = service.playerjerseyservice(j);
		return db;

	}

	public List<Player> playernamecontroller(String s) {
		service = new PlayerService();
		List<Player> db = service.playerbynameservice(s);
		return db;

	}

}
