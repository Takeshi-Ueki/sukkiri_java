package chapter16_Q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<>();
				
		heros.add(new Hero("田中"));
		heros.add(new Hero("佐藤"));
		
		for (Hero hero : heros) {
			System.out.println(hero.getName());
		}
		
		Map<Hero, Integer> heroes = new HashMap<>();
		
		Hero h1 = new Hero("立花");
		Hero h2 = new Hero("小畑");
		
		heroes.put(h1, 3);
		heroes.put(h2, 7);
		
		for(Hero key : heroes.keySet()) {
			int value = heroes.get(key);
			System.out.println(key.getName() + "が倒した敵=" + value);
		}
	}
}
