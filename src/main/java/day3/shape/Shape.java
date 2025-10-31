package day3.shape;

public abstract class Shape {
	//필드
	private int sx;
	private int sy;
	private int ex;
	private int ey;
	private int w;
	//생성자
	public Shape () {
	}
	
	public Shape(int sx, int sy, int ex, int ey) {
		this.sx = sx;
		this.sy = sy;
		this.ex = ex;
		this.ey = ey;
	}
	//getter/setter
	public int getSx() {
		return sx;
	}
	public void setSx(int sx) {
		this.sx = sx;
	}
	public int getSy() {
		return sy;
	}
	public void setSy(int sy) {
		this.sy = sy;
	}
	public int getEx() {
		return ex;
	}
	public void setEx(int ex) {
		this.ex = ex;
	}
	public int getEy() {
		return ey;
	}
	public void setEy(int ey) {
		this.ey = ey;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	//method
	public abstract void draw();
	
	@Override
	public String toString() {
		return "Shape [sx=" + sx + ", sy=" + sy + ", ex=" + ex + ", ey=" + ey + ", w=" + w + "]";
	}
}
