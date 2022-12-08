package ch09_gamelevel_1021;

public class UltraLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("눈에 보이지 않을 정도로 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("하늘까지 jump 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("트리플 악셀을 밟습니다.");		
	}

	
	@Override
	public void showLevelMessage() {
		System.out.println("***** 울트라 레벨 입니다. *****");
	}


}
