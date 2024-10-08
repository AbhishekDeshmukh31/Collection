package com.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.dao.PlayerDao;
import com.entity.Player;

public class PlayerService {
	PlayerDao dao;

	public void getallplayerService() {

		dao = new PlayerDao();
		Map<Integer, Map<String, List<Player>>> years = dao.getallplayers();
		Set<Integer> inneryears = years.keySet();

		for (Integer integer : inneryears) {

			System.out.println(integer);

			Map<String, List<Player>> innermap = years.get(integer);
			Set<String> inputyears = innermap.keySet();
			for (String s : inputyears) {
				System.out.println();
				System.out.println(s);
				for (Player p : innermap.get(s)) {
					System.out.println(p);
				}
			}
		}

	}

	public void getallbatsmanbyyearservice(int year) {

		dao = new PlayerDao();
		List<Player> player = new ArrayList<Player>();
		Map<Integer, Map<String, List<Player>>> years = dao.getallplayers();
		Set<Integer> inneryears = years.keySet();

		for (Integer y : inneryears) {
			if (y == year) {
				Map<String, List<Player>> teamName = years.get(y);
				Set<String> teamNames = teamName.keySet();
				for (String s : teamNames) {
					for (Player p : teamName.get(s)) {
						if (p.getRuns() > 350) {
							player.add(p);
						}
					}
				}
			}

		}

		for (Player player2 : player) {
			System.out.println(player2);
		}
	}

	public void getbowlerbyyearService(int year) {

		List<Player> player = new ArrayList<Player>();
		dao = new PlayerDao();
		Map<Integer, Map<String, List<Player>>> years = dao.getallplayers();
		Set<Integer> inneryears = years.keySet();

		for (Integer i : inneryears) {
			if (i == year) {
				Map<String, List<Player>> innermap = years.get(i);
				Set<String> teamname = innermap.keySet();
				for (String s : teamname) {
					for (Player p : innermap.get(s)) {

						if (p.getWickets() > 15) {

							System.out.println(p);
						}
					}
				}
			}
		}

	}

	public void getplayerbynameService(String name) {

		// List<Player> player = new ArrayList<Player>();
		dao = new PlayerDao();
		Map<Integer, Map<String, List<Player>>> years = dao.getallplayers();
		Set<Integer> inneryears = years.keySet();

		for (Integer i : inneryears) {

			Map<String, List<Player>> innermap = years.get(i);
			Set<String> teamname = innermap.keySet();
			for (String s : teamname) {
				for (Player p : innermap.get(s)) {

					if (p.getName() == name) {

						System.out.println(p);
					}

				}
			}
		}

	}

	public void getallrounderService(int runs, int wickets) {

		dao = new PlayerDao();
		Map<Integer, Map<String, List<Player>>> years = dao.getallplayers();
		Set<Integer> inneryears = years.keySet();

		for (Integer i : inneryears) {

			Map<String, List<Player>> innermap = years.get(i);
			Set<String> teamname = innermap.keySet();
			for (String s : teamname) {
				List<Player> player = innermap.get(s);
				for (Player p : player) {

					if (p.getRuns() > runs && p.getWickets() > wickets) {

						System.out.println(p);
					}
				}
			}
		}

	}

	public void getallbatsmanService(int runs) {

		List<Player> player = new ArrayList<Player>();
		dao = new PlayerDao();
		Map<Integer, Map<String, List<Player>>> years = dao.getallplayers();
		Set<Integer> inneryears = years.keySet();

		for (Integer i : inneryears) {

			Map<String, List<Player>> innermap = years.get(i);
			Set<String> teamname = innermap.keySet();
			for (String s : teamname) {
				for (Player p : innermap.get(s)) {

					if (p.getRuns() > runs) {

						System.out.println(p);

					}
				}
			}
		}

	}

}
