package ch11;

public abstract class Shape {//추상 클래스
	int x,y;
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract void draw();//추상 메소드
}
