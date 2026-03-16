import java.util.Scanner;
import swiftbot.SwiftBotAPI;

public class test_speed_motor {

    static SwiftBotAPI swiftbot = SwiftBotAPI.INSTANCE;

    // ---- MOTOR SETTINGS ----
    static int BASE_POWER = 50;

    // motor symmetry correction
    // increase if robot drifts left
    // decrease if robot drifts right
    static int MOTOR_OFFSET = 0;

    // ---- MOVEMENT SETTINGS ----
    static int PULSE_TIME = 50;     // milliseconds per pulse
    static int NUM_PULSES = 17;     // number of pulses for ~25cm


    //straight
//    Current settings:
//    	Base power: 50
//    	Motor offset: -5
//    	Pulse time: 50
//    	Pulse count: 50
    
    //90 degress
    //pulse = 14

    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("\nChoose test:");
            System.out.println("1 = Forward");
            System.out.println("2 = Turn Left 90");
            System.out.println("3 = Turn Right 90");
            System.out.println("4 = Change motor offset");
            System.out.println("5 = Change pulse count");
            System.out.println("6 = Change pulse time");
            System.out.println("7 = change motor power");
            System.out.println("0 = Exit");

            int choice = scan.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {

                case 1:
                    moveForward();
                    break;

                case 2:
                    turnLeft();
                    break;

                case 3:
                    turnRight();
                    break;

                case 4:
                    System.out.println("Enter new motor offset:");
                    MOTOR_OFFSET = scan.nextInt();
                    break;

                case 5:
                    System.out.println("Enter pulse count:");
                    NUM_PULSES = scan.nextInt();
                    break;

                case 6:
                    System.out.println("Enter pulse time (ms):");
                    PULSE_TIME = scan.nextInt();
                    break;
                    
                case 7:
                	System.out.println("enter motor power");
                	BASE_POWER = scan.nextInt();
                	break;
            }

            System.out.println("\nCurrent settings:");
            System.out.println("Base power: " + BASE_POWER);
            System.out.println("Motor offset: " + MOTOR_OFFSET);
            System.out.println("Pulse time: " + PULSE_TIME);
            System.out.println("Pulse count: " + NUM_PULSES);
        }

        scan.close();
    }

    // ---- MOVEMENT FUNCTIONS ----

    public static void moveForward() throws InterruptedException {

        System.out.println("Testing forward movement...");

        for (int i = 0; i < NUM_PULSES; i++) {

            if (i % 2 == 0) {
            	swiftbot.move(BASE_POWER + MOTOR_OFFSET - 1, BASE_POWER, PULSE_TIME);

            } 
            else {
            	swiftbot.move(BASE_POWER + MOTOR_OFFSET, BASE_POWER, PULSE_TIME);

            }

         
            Thread.sleep(40);
        }
    }

    public static void turnLeft() {

        System.out.println("Testing left turn...");

        for (int i = 0; i < NUM_PULSES; i++) {

            swiftbot.move(
                -BASE_POWER,
                BASE_POWER,
                PULSE_TIME
            );

            sleep(40);
        }
    }

    public static void turnRight() {

        System.out.println("Testing right turn...");

        for (int i = 0; i < NUM_PULSES; i++) {

            swiftbot.move(
                BASE_POWER,
                -BASE_POWER,
                PULSE_TIME
            );

            sleep(40);
        }
    }

    // ---- UTILITY ----

    private static void sleep(int time) {

        try {
            Thread.sleep(time);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}