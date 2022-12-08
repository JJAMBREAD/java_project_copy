package ch09_gamelevel_1021;

public class SpecialMove {
	private String moveName;
	private int moveTime;
	private String moveRange;
	

	
	public SpecialMove(String moveName, int moveTime, String moveRange) {
		super();
		this.moveName = moveName;
		this.moveTime = moveTime;
		this.moveRange = moveRange;
	}
	public String getMoveName() {
		return moveName;
	}
	public void setMoveName(String moveName) {
		this.moveName = moveName;
	}
	public int getMoveTime() {
		return moveTime;
	}
	public void setMoveTime(int moveTime) {
		this.moveTime = moveTime;
	}
	public String getMoveRange() {
		return moveRange;
	}
	public void setMoveRange(String moveRange) {
		this.moveRange = moveRange;
	}
	
	
	public void showMoveInfo() {
		System.out.println("필살기 이름: " + moveName + " 지속시간: " + moveTime + " 적용범위: "+ moveRange + "입니다.");
	}
	
}
