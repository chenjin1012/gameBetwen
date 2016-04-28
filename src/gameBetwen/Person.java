package gameBetwen;

import java.util.Scanner;

public class Person extends Player {

	@Override
	public void inputName() {
		//System.out.println("please input your name:");
		Scanner input = new Scanner(System.in);
		String name=input.nextLine();
		super.setPlayName(name);
       // TODO Auto-generated method stub
		
	}

	@Override
	public int myFist() {
		System.out.println("input the number of action(1:scissors,2:rock,3:paper)");
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		if(num==1)
			System.out.println("your time:scissors");
		else if(num==2)
			System.out.println("your time:rock");
		else 
			System.out.println("your time:paper");
		return num;
			// TODO Auto-generated method stub
		
	}


}
