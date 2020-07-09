package hashmaps;

public class app {

	public static void main(String[] args) {
		MorseTranslator translator = new MorseTranslator();
        translator.populateMorseMap();
        System.out.println(translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));

	}

}
