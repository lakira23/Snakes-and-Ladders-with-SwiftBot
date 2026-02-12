//________imports______________
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import swiftbot.Button;
import swiftbot.SwiftBotAPI;


//________CLASSES_______________
class Connectors {
	int head;
	int tail;
	
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

class Input_Handler{
	
	static SwiftBotAPI swiftBot = SwiftBotAPI.INSTANCE;
	public Input_Handler() {
		try {
			swiftBot.disableButton(Button.A);
			swiftBot.disableButton(Button.B);
			swiftBot.disableButton(Button.X);
			swiftBot.disableButton(Button.Y);

			swiftBot.enableButton(Button.A, () -> {userinput.add("Red"); System.out.println("A been pressed");});
			swiftBot.enableButton(Button.B, () -> {userinput.add("Blue"); System.out.println("B been pressed");});
			swiftBot.enableButton(Button.X, () -> {userinput.add("Green"); System.out.println("X been pressed");});
			swiftBot.enableButton(Button.Y, () -> {userinput.add("White"); System.out.println("Y been pressed");});


		}

		catch (Exception e) {
			System.out.println("please enter a correct key!!");
			
		}
		
	}
}

public class Snakes_and_ladders {
	static boolean game_status = true;
 
	

	public static void main(String[] args) {
		
		Map<String,Boolean> game_screen = new HashMap<>();
		
		game_screen.put("Menu", true);
		game_screen.put("Game", false);
//		System.out.println("Press [Y] in the SwiftBot to start");
//		
//		//System.out.println("test");
		
		while (game_status) {
			
		}
	}
	
	

}
