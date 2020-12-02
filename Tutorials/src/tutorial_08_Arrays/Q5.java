package tutorial_08_Arrays;

public class Q5 {

	public static void main(String[] args) {
		String[][] animals = { 	{ "dog", "cat", "fish", "bird", "worm" }, 
								{ "lion", "baboon", "bison", "beaver" },
								{ "bear", "bat", "ant", "bobcat", "buffalo", "elephant" },
								{ "crab", "coyote", "cow", "frog", "goat", "grizzly" } 
								};
		
		for (int i = 0; i < animals.length; i++) {
			System.out.print("[" + i + "][" + 0 + "]" + animals[i][0] + " --");
			for (int j = 1; j < animals[i].length; j++) {
				System.out.print("[" + i + "][" + j + "]" + animals[i][j] + " ");
			}
			System.out.println();
		}

	}

}
// [0][0]dog --[0][1]cat [0][2]fish [0][3]bird [0][4]worm
// [1][0]lion 
