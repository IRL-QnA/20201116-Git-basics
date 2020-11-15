import java.util.Scanner;

class Person {
	protected String name;							//����� �̸�
	protected String age;							//����� ����
	protected String address;						//����� �ּ�
}

class Student extends Person {						//Student is a Person�̹Ƿ� ��Ӱ����̴�.
	private String school;							//�л��� �б�
	private String major;							//�л��� �а�
	private String classNumber;						//�л��� �й�
	
	private double[] point = new double[8];			//8�б� ��������� �����ϴ� �迭
	
	public double[] getPoint() {return point;}					//point�� ������
	public void setPoint(double[] point) {this.point = point;}	//point�� ������
	
	//�̸�, ����, �ּ�, �б�, �а�, �й��� �� ���� �Է��ϴ� �������Լ�
	public Student(String name, String age, String address, String school, String major, String classNumber) {
		super.name = name;
		super.age = age;
		super.address = address;
		this.school = school;
		this.major = major;
		this.classNumber = classNumber;
	}
	
	//8�б� ��������� ����� ��ȯ�ϴ� �޼ҵ�
	public double average() {
		double sum = 0;
		for(int i=0; i<5; i++) {
			sum += getPoint()[i];
		}
		return sum/8;
	}
	
	//8�б� ������� �� �ְ������� ��ȯ�ϴ� �޼ҵ�
	public double maxGrade() {
		double max=0;
		for(int i=0; i<8; i++) {
			if(max < getPoint()[i]) {
				max = getPoint()[i];
			}
		}
		return max;	
	}
	
	//8�б� ������� �� ���������� ��ȯ�ϴ� �޼ҵ�
	public double minGrade() {
		double min=10;
		for(int i=0; i<8; i++) {
			if(min > getPoint()[i]) {
				min = getPoint()[i];
			}
		}
		return min;
	}
	
	//�л��� ���������� ����ϴ� toString�Լ�
	public String toString() {
		return String.format(super.name + " (�Ҽ�: " + this.school + " " + this.major + ", �й�: " + this.classNumber + ")");
	}
}




public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//�л��� ���������� �Է¹޴´�
		System.out.print("�̸�: ");
		String name = input.nextLine();
		System.out.print("����: ");
		String age = input.nextLine();
		System.out.print("�ּ�: ");
		String address = input.nextLine();
		System.out.print("�б�: ");
		String school = input.nextLine();
		System.out.print("�а�: ");
		String major = input.nextLine();
		System.out.print("�й�: ");
		String classNumber = input.nextLine();
		
		//Student ��ü s1�� ������ �Է��Ѵ�
		Student s1 = new Student(name, age, address, school, major, classNumber);
		
		System.out.println("-------------------------");
		
		//8�б� ������ �Է¹޴´�
		System.out.println("8�б� ������ ������� �Է��ϼ���");
		for(int i=1; i<=8; i++) {
			System.out.print(i + "�б� ���� �� ");
			s1.getPoint()[i-1] = input.nextDouble();
		}
		
		System.out.println("-------------------------");
		
		//��������, �ְ�����, ��������, ��������� ����Ѵ�.
		System.out.println(s1);
		System.out.println("�л��� 8�б� ���� �ְ� ������ " + s1.maxGrade() + ", ���� ������ " + s1.minGrade() + "��");
		System.out.println("�� ��� ������ " + s1.average() + "�� �Դϴ�.");

	}

}