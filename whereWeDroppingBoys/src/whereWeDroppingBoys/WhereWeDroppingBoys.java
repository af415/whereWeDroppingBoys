package whereWeDroppingBoys;

import java.util.Random;
import java.util.Scanner;

public class WhereWeDroppingBoys {

	private static Random randomNum = new Random();

	private static String[] invalidGrids = { "a1", "a8", "a9", "a10", "b9",
			"b10", "c10", "f1", "g1", "j1", "j10" };

	public WhereWeDroppingBoys() {
		// nothing needed here
	}

	public static void main(String[] args) {
		System.out
				.println("Welcome Rodger Dodger ranger, do you want to drop at a grid or named location? (Enter 'Grid' or 'Name'");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if (input.equalsIgnoreCase("Grid")) {
			System.out.println("We are dropping at grid "
					+ WhereWeDroppingBoys.gridOption() + " boys.");
		} else if (input.equalsIgnoreCase("Name")) {
			System.out.println(WhereWeDroppingBoys.locationOption());
		} else {
			System.out.println("That is an unrecognised command SOLDIER!");
		}

	}

	private static String gridOption() {
		String result = null;
		final String gridLetters = "ABCDEFGHIJ";
		final int letters = 9;
		final char gridLetter = gridLetters.charAt(randomNum.nextInt(letters));
		String grid = String.valueOf(gridLetter + ""
				+ (1 + randomNum.nextInt(10)));
		boolean isValidGrid = true;
		for (String invalidGrid : invalidGrids) {
			if (invalidGrid.equalsIgnoreCase(grid)) {
				System.out.println(invalidGrid);
				isValidGrid = false;
				break;
			}
		}
		if (!isValidGrid) {
			grid = WhereWeDroppingBoys.gridOption();
		}

		result = grid;

		return result;
	}

	private static String locationOption() {
		String result = null;
		int max = 17;

		int dropIndex = 1 + randomNum.nextInt(max);

		for (NamedLocations dropLocation : NamedLocations.values()) {
			if (dropLocation.getIndex() == dropIndex) {
				result = "We are dropping at " + dropLocation.getLocationName()
						+ " boys.";
			}
		}
		return result;
	}

}
