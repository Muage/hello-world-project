package ex08;

public class Stu {
	//�ʵ�
	private int no;
	private String name;
	private String dept;
	private double avg;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	//�޼ҵ�
	public void print() {
		String strNo = "�й� : " + no;
		System.out.println(strNo);
		System.out.println("�̸� : " + name);
		System.out.println("�а� : " + dept);
	}
}