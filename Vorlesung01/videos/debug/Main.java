package debug;

public class Main {

	public static void main(String[] args) {
		Person persons [] = new Person[10];
		
		persons[0] = new Student("Timo", "Helm", "19833292", "abc879");
		persons[1] = new Student("Sina", "Karel", "19833272", "abc899");
		persons[2] = new Student("Markus", "Schmidt", "19833212", "abc812");
		persons[3] = new Student("Sharon", "Tunir", "19833203", "abc843");
		persons[4] = new Student("Alex", "Jung", "19833213", "abc873");
		persons[5] = new Student("Chris", "Meyer", "19833265", "abc882");
		persons[6] = new Professor("Maren", "Schuhmacher", "19343455", "SHM");
		persons[7] = new Professor("Sebastian", "Baumgarten", "19888276", "BMG");
		persons[8] = new Professor("Mirko", "Schrübbler", "12898646", "SBL");
		persons[9] = new Professor("Antonia", "Marlekowsi", "15017728", "MLK");
		
		
		int studentCounter = 0;
		int profCounter = 0;
		
		Lecture mathe = new Lecture("Mathe", (Professor)persons[9]);
		Lecture programmieren = new Lecture("Programmieren", (Professor)persons[8]);
		
		
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] instanceof Student) {
				mathe.addStudent((Student) persons[i]);
				programmieren.addStudent((Student) persons[i]);
				System.out.println("Student " + (++studentCounter) + ")\n" + persons[i]);
			}
			if (persons[i] instanceof Professor) {
				System.out.println("Professor " + (++profCounter) + ")\n" + persons[i]);
			}
		}
		
		
		System.out.println("\n\n" + mathe + "\n\n");
		System.out.println(programmieren);
	}

}
