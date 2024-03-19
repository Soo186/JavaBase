package object_class;

public class Rectangle {
	//멤버변수(필드)
	//생성자
	//메서드
	private int width; //넓이   //private == 접근 제한
	private int height; //높이

	public Rectangle(int width, int height) throws Exception {  //커맨드 +n
		if (width <= 0 || height <= 0){
			throw new Exception("넓이와 높이는 플러스 값이어야 합니다." );
		}
		this.width = width;
		this.height = height;
	}

	//getter , setter 메서드  getter :읽기 전용 , setter : 음수 안되게


	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	//면적 메서드
	int getArea()
	{
		return width * height;
	}
}
