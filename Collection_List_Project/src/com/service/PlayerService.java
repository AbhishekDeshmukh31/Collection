package com.service;

import java.io.FileInputStream;
import java.util.Collections;
import java.util.List;

import com.dao.PlayerDao;
import com.entity.Player;

public class PlayerService {
	PlayerDao dao = null;

	public List<Player> getallplayerservice() {

		dao = new PlayerDao();
		List<Player> db = dao.getallplayers();
		for (Player player : db) {
			System.out.println(player);
		}
		return db;
	}

	public List<Player> getallbatsmanservice(int r) {

		dao = new PlayerDao();
		List<Player> db = dao.getallplayers();
		for (Player player : db) {

			if (player.getRuns() > r) {
				System.out.println(player);
			}
		}
		return db;
	}

	public List<Player> getallbowlerservice(int r) {

		dao = new PlayerDao();
		List<Player> db = dao.getallplayers();
		for (Player player : db) {

			if (player.getWickets() > r) {
				System.out.println(player);
			}
		}
		return db;
	}

	public List<Player> getallallroundersservice(int r, int w) {

		dao = new PlayerDao();
		List<Player> db = dao.getallplayers();
		for (Player player : db) {

			if (player.getRuns() > r && player.getWickets() > w) {
				System.out.println(player);
			}
		}
		return db;
	}

	public List<Player> getplayerteamservice(String s) { 

		dao = new PlayerDao();
		List<Player> db = dao.getallplayers();
		for (Player player : db) {

			if (player.getTeamname() == s) {
				System.out.println(player);
			}
		}
		return db;
	}

	public List<Player> playerjerseyservice(int j) {

		dao = new PlayerDao();
		List<Player> db = dao.getallplayers();
		for (Player player : db) {
			if (player.getJerseyno() == j) {
				System.out.println(player);
			}
		}
		return db;
	}

	public List<Player> playerbynameservice(String s) {

		dao = new PlayerDao();
		List<Player> db = dao.getallplayers();
		for (Player player : db) {
			if (player.getName().startsWith(s)) {
				System.out.println(player);
			}
		}
		return db;
	}
	public List<Player> playersortrunservice(int j) {

		dao = new PlayerDao();
		List<Player> db = dao.getallplayers();
		for (Player player : db) {
			if (player.getJerseyno() == j) {
				System.out.println(player);
			}
		}
		return db;
	}
}
