package hashmaps;

import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {
	
	Map<String, String> morse = new HashMap<>();

	public MorseTranslator() {

	}
	public void populateMorseMap() {
		
		
		morse.put(".---", "J");
		morse.put(".-", "A");
		morse.put("...-","V");
		morse.put("..", "I");
		morse.put("...", "S");
		morse.put("-.-.", "C");
		morse.put("---", "O");
		morse.put(".-..", "L");
		morse.put("-.-", "K");
		morse.put("/", " ");
	}
	
	public String translate(String input) {
		
		String[] split = input.split(" ");
		StringBuilder build = new StringBuilder();
		for (String x: split) {
			String letter = morse.get(x);
			build.append(letter);
		}
		String ret=build.toString();
		
		
		return ret;
		
	}


}
