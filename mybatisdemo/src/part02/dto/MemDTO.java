package part02.dto;

public class MemDTO {//멤버변수
	private int num;
	private String name;
	private  int age;
	private String loc;
	
	public MemDTO() {//생성자
		
	}
	
	public MemDTO(String name, int age, String loc) {//생성자
		super();
		this.name = name;
		this.age = age;
		this.loc = loc;
	}
	
	public MemDTO(int num, String name, int age, String loc) {//생성자
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.loc = loc;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	

}//end 
