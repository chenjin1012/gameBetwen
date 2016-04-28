package gameBetwen;

import java.util.Random;
import java.util.Scanner;

public class Computer extends Player {

	@Override
	public void inputName() {
		// System.out.println("please choice the person of computer");// TODO
		// Auto-generated
		// method
		// stub
		System.out.println("1: Tom 2: Lucy 3: Tina");
		System.out.println("input the choice of name number:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch (num) {
		case 1:
			this.setPlayName("Tom");
			break;
		case 2:
			this.setPlayName("Lucy");
			break;
		case 3:
			this.setPlayName("Tina");
			break;

		default:
			System.out.println("wrong number!");
			break;
		}
	}

	@Override
	public int myFist() {
		Random num = new Random();
		int number = num.nextInt(3);

		return number;
		// TODO Auto-generated method stub

	}

}
