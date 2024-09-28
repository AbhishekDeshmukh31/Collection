package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.entity.Player;

public class PlayerDao {

	Player player = null;

	public List<Player> getallplayers() {

		List<Player> ipllist = new ArrayList<Player>();

		List<Player> csklist = new ArrayList<>();
		csklist.add(new Player("M.Dhoni", 7, 5545, 2, "CSK"));
		csklist.add(new Player("R.Gaikwad", 21, 2755, 0, "CSK"));
		csklist.add(new Player("R.Jadeja", 99, 2100, 89, "CSK"));

		List<Player> milist = new ArrayList<>();

		milist.add(new Player("R.Sharma", 45, 6231, 11, "MI"));
		milist.add(new Player("H.Pandya", 21, 3231, 59, "MI"));
		milist.add(new Player("J.Bumrah", 90, 231, 118, "MI"));

		List<Player> rcblist = new ArrayList<>();
		rcblist.add(new Player("V.Kohli", 18, 8988, 2, "RCB"));
		rcblist.add(new Player("G.Maxwell", 33, 2388, 47, "RCB"));
		rcblist.add(new Player("M.Siraj", 21, 188, 60, "RCB"));

		ipllist.addAll(csklist);
		ipllist.addAll(milist);
		ipllist.addAll(rcblist);

		return ipllist;

	}
}
