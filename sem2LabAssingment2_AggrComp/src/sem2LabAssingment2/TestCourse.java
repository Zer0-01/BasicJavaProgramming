package sem2LabAssingment2;

public class TestCourse {

	public static void main(String[] args) {
		
		/*course1******/
		Course course1 = new Course("Programming II");
		course1.addStudent("Siti Aminah Muhammad");
		course1.addStudent("Halim Zainal Abidin");
		course1.addStudent("Jason Lim");
		course1.addStudent("Izzatul Khairiah");
		course1.addStudent("Amir Hadif");
		course1.addStudent("Ahmad Zaki");

		System.out.println("Number of student in " + course1.getName() + " course: " + course1.getNumberOfStudents());
		
		String[] students = course1.getStudents();
		
	
		for (int i = 0; i < course1.getNumberOfStudents(); i++) {
			System.out.println(students[i]);
		}
		
		System.out.println();
		
		/*course2************/
		
		Course course2 = new Course("Database System");
		course2.addStudent("Aida Nabieha");
		course2.addStudent("Faris Izwanhh");
		course2.addStudent("Izzul");
		course2.addStudent("El");
		course2.addStudent("Vivi");
		course2.addStudent("Ahmad Haziq");
		course2.addStudent("Anwar");
		course2.addStudent("Saiful");


		
		System.out.println("Number of student in " + course2.getName() + " course: " + course2.getNumberOfStudents());
		
		String[] students2 = course2.getStudents();
		
	
		for (int i = 0; i < course2.getNumberOfStudents(); i++) {
			System.out.println(students2[i]);
		}
		
		System.out.println();
		
		Course course3 = new Course("Multimedia Application");
		course3.addStudent("Faiz");
		course3.addStudent("Amin");
		course3.addStudent("Khairul");
		course3.addStudent("Anwar");
		course3.addStudent("Nik");
		course3.addStudent("Amin");
		course3.addStudent("Izzah");
		course3.addStudent("Najib");
		course3.addStudent("Arif");
		course3.addStudent("Firdaus");
		course3.addStudent("Farhan");
		course3.addStudent("Aminah");
		
		System.out.println("Number of student in " + course3.getName() + " course: " + course3.getNumberOfStudents());
		
		String[] students3 = course3.getStudents();
		
	
		for (int i = 0; i < course3.getNumberOfStudents(); i++) {
			System.out.println(students3[i]);
		}
	}

}
