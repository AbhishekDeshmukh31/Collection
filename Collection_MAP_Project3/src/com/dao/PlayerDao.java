package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.entity.Player;

public class PlayerDao<alliplTeamsdb> {

	public Map<Integer, Map<String, List<Player>>> getallplayers() {

		// Map representing years
		Map<Integer, Map<String, List<Player>>> Yearsipl = new HashMap<>();

		// Map representing players of teams of ipl of 4 years
		Map<String, List<Player>> iplTeamsdb24 = new HashMap<>();

		// List of csk players
		List<Player> csk2024 = new ArrayList<>();
		csk2024.add(new Player("S.Dube", 12, 396, 2, "CSK", "2024"));	
		csk2024.add(new Player("R.Gaikwad", 21, 583, 0, "CSK","2024"));
		csk2024.add(new Player("R.Jadeja", 99, 267, 8, "CSK","2024"));
		csk2024.add(new Player("D.Mitchell", 55, 318, 1, "CSK","2024"));
		csk2024.add(new Player("T.Deshpande", 25, 20, 17, "CSK","2024"));

		// List of mi players
		List<Player> mi2024 = new ArrayList<>();
		mi2024.add(new Player("R.Sharma", 45, 417, 0, "MI","2024"));
		mi2024.add(new Player("H.Pandya", 15, 216, 11, "MI","2024"));
		mi2024.add(new Player("J.Bumrah", 99, 21, 20, "MI","2024"));
		mi2024.add(new Player("I.Kishan", 11, 320, 0, "MI","2024"));
		mi2024.add(new Player("P.Chawla", 41, 21, 16, "MI","2024"));

		// List of rcb players
		List<Player> rcb2024 = new ArrayList<>();
		rcb2024.add(new Player("V.Kohli", 18, 741, 0, "RCB","2024"));
		rcb2024.add(new Player("C.Green", 33, 298, 10, "RCB","2024"));
		rcb2024.add(new Player("M.Siraj", 21, 38, 15, "RCB","2024"));
		rcb2024.add(new Player("F.Duplesiss", 13, 438, 0, "RCB","2024"));
		rcb2024.add(new Player("L.Ferguson", 5, 103, 9, "RCB","2024"));

		// List of kkr players
		List<Player> kkr2024 = new ArrayList<>();
		kkr2024.add(new Player("S.Iyer", 16, 351, 0, "KKR","2024"));
		kkr2024.add(new Player("V.Chakravarthy", 71, 18, 21, "KKR","2024"));
		kkr2024.add(new Player("P.Salt", 6, 435, 0, "KKR","2024"));
		kkr2024.add(new Player("A.Russell", 33, 222, 20, "KKR","2024"));
		kkr2024.add(new Player("S.Narine", 99, 488, 17, "KKR","2024"));

		iplTeamsdb24.put("CSK", csk2024);
		iplTeamsdb24.put("MI", mi2024);
		iplTeamsdb24.put("RCB", rcb2024);
		iplTeamsdb24.put("KKR", kkr2024);

		// add data for year 2024
		Yearsipl.put(2024, iplTeamsdb24);

		// <-------for year 2023------------>

		// Map representing team and player performances in 2023

		Map<String, List<Player>> iplTeamsdb23 = new HashMap<>();

		// List of csk players
		List<Player> csk2023 = new ArrayList<>();
		csk2023.add(new Player("S.Dube", 12, 418, 5, "CSK","2023"));
		csk2023.add(new Player("R.Gaikwad", 21, 590, 0, "CSK","2023"));
		csk2023.add(new Player("R.Jadeja", 99, 197, 20, "CSK","2023"));
		csk2023.add(new Player("D.Mitchell", 55, 672, 0, "CSK","2023"));
		csk2023.add(new Player("T.Deshpande", 25, 14, 21, "CSK","2023"));

		// List of mi players
		List<Player> mi2023 = new ArrayList<>();
		mi2023.add(new Player("R.Sharma", 45, 332, 0, "MI","2023"));
		mi2023.add(new Player("H.Pandya", 15, 216, 7, "MI","2023"));
		mi2023.add(new Player("J.Bumrah", 99, 21, 14, "MI","2023"));
		mi2023.add(new Player("I.Kishan", 11, 454, 0, "MI","2023"));
		mi2023.add(new Player("P.Chawla", 41, 31, 22, "MI","2023"));

		// List of rcb players
		List<Player> rcb2023 = new ArrayList<>();
		rcb2023.add(new Player("V.Kohli", 18, 639, 0, "RCB","2023"));
		rcb2023.add(new Player("C.Green", 33, 400, 10, "RCB","2023"));
		rcb2023.add(new Player("M.Siraj", 21, 38, 19, "RCB","2023"));
		rcb2023.add(new Player("F.Duplesiss", 13, 730, 0, "RCB","2023"));
		rcb2023.add(new Player("L.Ferguson", 5, 83, 11, "RCB","2023"));

		// List of kkr players
		List<Player> kkr2023 = new ArrayList<>();
		kkr2023.add(new Player("S.Iyer", 16, 404, 0, "KKR","2023"));
		kkr2023.add(new Player("V.Chakravarthy", 71, 11, 20, "KKR","2023"));
		kkr2023.add(new Player("P.Salt", 6, 474, 0, "KKR","2023"));
		kkr2023.add(new Player("A.Russell", 33, 227, 7, "KKR","2023"));
		kkr2023.add(new Player("S.Narine", 99, 488, 11, "KKR","2023"));

		iplTeamsdb23.put("CSK", csk2023);
		iplTeamsdb23.put("MI", mi2023);
		iplTeamsdb23.put("RCB", rcb2023);
		iplTeamsdb23.put("KKR", kkr2023);

		Yearsipl.put(2023, iplTeamsdb23);

		// <-------for year 2022------------>

		// Map representing team and player performances in 2023

		Map<String, List<Player>> iplTeamsdb22 = new HashMap<>();

		// List of csk players
		List<Player> csk2022 = new ArrayList<>();
		csk2022.add(new Player("S.Dube", 12, 289, 5, "CSK","2022"));
		csk2022.add(new Player("R.Gaikwad", 21, 369, 0, "CSK","2022"));
		csk2022.add(new Player("R.Jadeja", 99, 67, 18, "CSK","2022"));
		csk2022.add(new Player("D.Mitchell", 55, 318, 0, "CSK","2022"));
		csk2022.add(new Player("T.Deshpande", 25, 10, 16, "CSK","2022"));

		// List of mi players
		List<Player> mi2022 = new ArrayList<>();
		mi2022.add(new Player("R.Sharma", 45, 367, 0, "MI","2022"));
		mi2022.add(new Player("H.Pandya", 15, 209, 10, "MI","2022"));
		mi2022.add(new Player("J.Bumrah", 99, 21, 16, "MI","2022"));
		mi2022.add(new Player("I.Kishan", 11, 418, 0, "MI","2022"));
		mi2022.add(new Player("P.Chawla", 41, 21, 13, "MI","2022"));

		// List of rcb players
		List<Player> rcb2022 = new ArrayList<>();
		rcb2022.add(new Player("V.Kohli", 18, 341, 0, "RCB","2022"));
		rcb2022.add(new Player("C.Green", 33, 301, 9, "RCB","2022"));
		rcb2022.add(new Player("M.Siraj", 21, 8, 24, "RCB","2022"));
		rcb2022.add(new Player("F.Duplesiss", 13, 468, 0, "RCB","2022"));
		rcb2022.add(new Player("L.Ferguson", 5, 63, 18, "RCB","2022"));

		// List of kkr players
		List<Player> kkr2022 = new ArrayList<>();
		kkr2022.add(new Player("S.Iyer", 16, 401, 0, "KKR","2022"));
		kkr2022.add(new Player("V.Chakravarthy", 21, 16, 21, "KKR","2022"));
		kkr2022.add(new Player("P.Salt", 6, 361, 0, "KKR","2022"));
		kkr2022.add(new Player("A.Russell", 33, 335, 12, "KKR","2022"));
		kkr2022.add(new Player("S.Narine", 99, 88, 17, "KKR","2022"));

		iplTeamsdb22.put("CSK", csk2022);
		iplTeamsdb22.put("MI", mi2022);
		iplTeamsdb22.put("RCB", rcb2022);
		iplTeamsdb22.put("KKR", kkr2022);

		Yearsipl.put(2022, iplTeamsdb22);

		// <-------for year 2021------------>

		// Map representing team and player performances in 2023

		Map<String, List<Player>> iplTeamsdb21 = new HashMap<>();

		// List of csk players
		List<Player> csk2021 = new ArrayList<>();
		csk2021.add(new Player("S.Dube", 12, 216, 4, "CSK","2021"));
		csk2021.add(new Player("R.Gaikwad", 21, 635, 0, "CSK","2021"));
		csk2021.add(new Player("R.Jadeja", 99, 167, 14, "CSK","2021"));
		csk2021.add(new Player("D.Mitchell", 55, 406, 0, "CSK","2021"));
		csk2021.add(new Player("T.Deshpande", 25, 20, 21, "CSK","2021"));

		// List of mi players
		List<Player> mi2021 = new ArrayList<>();
		mi2021.add(new Player("R.Sharma", 45, 381, 0, "MI","2021"));
		mi2021.add(new Player("H.Pandya", 15, 146, 12, "MI","2021"));
		mi2021.add(new Player("J.Bumrah", 99, 21, 21, "MI","2021"));
		mi2021.add(new Player("I.Kishan", 11, 317, 0, "MI","2021"));
		mi2021.add(new Player("P.Chawla", 41, 21, 13, "MI","2021"));

		// List of rcb players
		List<Player> rcb2021 = new ArrayList<>();
		rcb2021.add(new Player("V.Kohli", 18, 513, 0, "RCB","2021"));
		rcb2021.add(new Player("C.Green", 33, 211, 10, "RCB","2021"));
		rcb2021.add(new Player("M.Siraj", 21, 18, 28, "RCB","2021"));
		rcb2021.add(new Player("F.Duplesiss", 13, 410, 0, "RCB","2021"));
		rcb2021.add(new Player("L.Ferguson", 5, 19, 16, "RCB","2021"));

		// List of kkr players
		List<Player> kkr2021 = new ArrayList<>();
		kkr2021.add(new Player("S.Iyer", 16, 478, 0, "KKR","2021"));
		kkr2021.add(new Player("V.Chakravarthy", 71, 18, 21, "KKR","2021"));
		kkr2021.add(new Player("P.Salt", 6, 383, 0, "KKR","2021"));
		kkr2021.add(new Player("A.Russell", 33, 182, 11, "KKR","2021"));
		kkr2021.add(new Player("S.Narine", 99, 488, 16, "KKR","2021"));

		iplTeamsdb21.put("CSK", csk2021);
		iplTeamsdb21.put("MI", mi2021);
		iplTeamsdb21.put("RCB", rcb2021);
		iplTeamsdb21.put("KKR", kkr2021);

		Yearsipl.put(2021, iplTeamsdb21);

		return Yearsipl;

	}
}
