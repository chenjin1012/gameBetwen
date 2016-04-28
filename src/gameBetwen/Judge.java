package gameBetwen;

public class Judge {
	private int total;
	private Person person = new Person();
	private Computer computer = new Computer();
	
	public void startGame()
	{
		System.out.println("\t*********game start***********");
		System.out.println("\t1:scissors,2:rock,3:paper");//Ðû²¼¿ªÊ¼
	}
	public void askName()
	{
		System.out.println("please choice the person of computer");
		computer.inputName();
		System.out.println("please input person name:");
		person.inputName();
		System.out.println(computer.getPlayName()+"VS"+person.getPlayName());
		
	}
	public void playGame()
	{
		String ret=null;

		do {
			System.out.println(person.getPlayName()+"time:");

		} while (ret.equals("y"));
	}
	
}
