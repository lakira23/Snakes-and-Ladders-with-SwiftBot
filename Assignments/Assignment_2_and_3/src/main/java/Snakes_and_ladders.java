//________imports______________
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import swiftbot.Button;
import swiftbot.SwiftBotAPI;


//________CLASSES_______________
class Connectors {
	private int head;
	private int tail;

	public Connectors() {

	}

	private int assign_pos(ArrayList<Object> list_connectors) {
		return 0;
	}

	public int get_head() {
		return this.head;
	}

	public int get_tail() {
		return this.tail;
	}
}

class Snakes extends Connectors {

	public Snakes() {

	}
}

class Ladders extends Connectors {
	public Ladders() {

	}
}

class Users {
	int pos;
	public Users() {

	}

	public int get_pos() {
		return this.pos;
	}
}

public class Snakes_and_ladders {
	static String current_button = "";
	static SwiftBotAPI swiftBot = SwiftBotAPI.INSTANCE;
	static HashMap<String,Boolean> current_screen = new HashMap<>(Map.of(
			"Menu", true,
			"Game", false));
	static String user_name;
	

	private static void player_setup() {
		Scanner text = new Scanner(System.in);
		System.out.println("Please enter your name >>  ");
		user_name = text.nextLine();
		System.out.println("");
		System.out.println("The SwiftBot has been assigned the following name:");
		System.out.println("> SwiftBot");
	}

	private static void Board_setup() {

	}

	private static void Mode_selection() {

	}

	private static void Decide_start_player() {

	}



	private static void menu() {
		System.out.println("Press [Y] in the SwiftBot to start the game! ");

		while (current_screen.get("Menu")) {
			input();

			if (current_button == "Y") {
				System.out.println("");
				System.out.println("Welcome to Snakes and Ladders!");
				current_screen.replace("Menu", false);
				current_screen.replace("Game", true);

			}
		}
		player_setup();
		Board_setup();
		Mode_selection();
		Decide_start_player();
		//return back to the main code


	}

	public static void input() {
		try {
			swiftBot.disableButton(Button.A);
			swiftBot.disableButton(Button.B);
			swiftBot.disableButton(Button.X);
			swiftBot.disableButton(Button.Y);

			swiftBot.enableButton(Button.A, () -> {System.out.println(" ");System.out.println("A been pressed"); current_button = "A";});
			swiftBot.enableButton(Button.B, () -> {System.out.println(" ");System.out.println("B been pressed"); current_button = "B";});
			swiftBot.enableButton(Button.X, () -> {System.out.println(" ");System.out.println("X been pressed"); current_button = "X";});
			swiftBot.enableButton(Button.Y, () -> {System.out.println(" ");System.out.println("Y been pressed"); current_button = "Y";});


		}

		catch (Exception e) {
			System.out.println("please enter a correct key!!");

		}
	}
	public static void main(String[] args) {

		menu();
		while (current_screen.get("Game")) {
			//game
		}
	}
}




