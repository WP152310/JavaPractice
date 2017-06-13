package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {

	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		List<Music> list = new ArrayList<>();
		list.add(new Music("팔레트", "아이유"));
		map.put("발라드", list);
		list = new ArrayList<>();
		list.add(new Music("I LUV IT", "PSY"));
		list.add(new Music("맞지?", "언니쓰"));
		map.put("댄스", list);

		System.out.println("--<<멜론 장르별 차트>>--");
		printMap(map);

		map.get("댄스").set(1, new Music("SIGNAL", "트와이스"));
		System.out.println("--<<댄스 2위 곡 변경>>--");
		printMap(map);

		map.get("댄스").remove(0);
		System.out.println("--<<댄스 1위 곡 삭제>>--");
		printMap(map);

		map.clear();
		System.out.println("--<<전체 리스트 삭제>>--");
		printMap(map);
	}
/*
	public static void printMap(Map<String, List<Music>> map) {
		for (Map.Entry<String, List<Music>> entry : map.entrySet()) {
			System.out.printf("[%s]\n", entry.getKey());
			List<Music> list = entry.getValue();
			for (int i = 0, l = list.size(); i < l; i++) {
				System.out.print(i + 1);
				System.out.println(". " + list.get(i));
			}
		}
		System.out.println();
	}
*/
	public static void printMap(Map<String, List<Music>> map) {
		map.forEach((str, list)->{
			System.out.printf("[%s]\n", str);
			for (int i = 0, l = list.size(); i < l; i++) {
				System.out.print(i + 1);
				System.out.println(". " + list.get(i));
			}
		});
		System.out.println();
	}
}
