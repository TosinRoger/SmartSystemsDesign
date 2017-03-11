package br.com.tosin.ssd.ui;

import br.com.tosin.ssd.utils.CONSTANTS_DIRECTIONS;

import java.util.Scanner;

/**
 * Created by roger on 11/03/17.
 */
public class InteractClientUser extends CONSTANTS_DIRECTIONS {

    public static String getDirection() {
        String direction = "";

        printDirections();

        while (direction.isEmpty()) {
            System.out.println("Enter the direction to move the agent: ");

            Scanner scanner = new Scanner(System.in);
            String result = scanner.nextLine();

            result = result.toUpperCase();

            if (isDirection(result))
                direction = result;
            else
                System.out.println("The direction is wrong!");

        }
        return direction;
    }

    private static void printDirections() {
        System.out.println(
                "The direction is:" + "\n" +
                        NORTH + " north" + "\n" +
                        SOUTH + " south" + "\n" +
                        WEST + " west" + "\n" +
                        EAST + " east" + "\n" +
                        NORTHEAST + " northeast"+ "\n" +
                        NORTHWEST + " northweast" + "\n" +
                        SOUTH_WEST + " south weast" + "\n" +
                        SOUTHEAST + " southeast" + "\n"
        );
    }

    private static boolean isDirection(String result) {
        if (result.equals(NORTH))
            return true;
        else if (result.equals(SOUTH))
            return true;
        else if (result.equals(WEST))
            return true;
        else if (result.equals(EAST))
            return true;
        else if (result.equals(NORTHEAST))
            return true;
        else if (result.equals(NORTHWEST))
            return true;
        else if (result.equals(SOUTH_WEST))
            return true;
        else if (result.equals(SOUTHEAST))
            return true;
        return false;
    }
}
