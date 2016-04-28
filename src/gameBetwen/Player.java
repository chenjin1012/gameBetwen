package gameBetwen;

public abstract class Player {
	private String playName;
	private int winningTime;

	public abstract void inputName();

	public abstract int myFist();

	public String getPlayName() {
		return playName;
	}

	public void setPlayName(String playName) {
		this.playName = playName;
	}

	public int getWinningTime() {
		return winningTime;
	}

	public void setWinningTime(int winningTime) {
		this.winningTime = winningTime;
	}

}
