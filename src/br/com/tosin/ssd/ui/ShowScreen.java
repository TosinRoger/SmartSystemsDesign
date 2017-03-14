package br.com.tosin.ssd.ui;

import br.com.tosin.ssd.models.environment.*;
import br.com.tosin.ssd.utils.CONST;

import java.util.Scanner;

public class ShowScreen {
	
	public void showWorldRender(ObjectInWorld[][] matrix) {
		
		for (int i = 0; i < (matrix.length + 4); i++) {
			System.out.print("=");
		}
		System.out.print("\n");
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.format("%3d ", (matrix.length - i));
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == null)
					System.out.print((char)CONST.CODE_BLANK);
				else 
					System.out.print((char)matrix[i][j].code);
			}
			System.out.print("\n");
		}
		
		System.out.print("    ");
		for (int i = 0; i < matrix[0].length; i++) {
			int temp = i + 1;
			if (temp > 9) 
				temp = temp -10;
			
			System.out.format("%1d", temp);
		}
		System.out.print("\n");
		
		for (int i = 0; i < (matrix.length + 4); i++) {
			System.out.print("=");
		}
		System.out.print("\n");
		
	}

	public void showWon() {
		System.out.println("\n");
		System.out.println("========================================================");
		System.out.println("CONGRATULATIONS!!!!!");
		System.out.println("You arrived at the target! \\o/");
		System.out.println("========================================================");
		System.out.println("\n\n");

		System.out.println("Press enter to continue");

		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}

}
