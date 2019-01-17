
public class Student {

	
	private String name;
	private int geburtsjahr;
	private String studiengang;
	
	public Student(String name, int geburtsjahr, String studiengang) {
		super();
		this.name = name;
		this.geburtsjahr = geburtsjahr;
		this.studiengang = studiengang;
	}

	public void ausgeben(){
		
		System.out.println(name + "/" + studiengang);
	}
	
	public static void main(String[] args) {

		Student s1 = new Student ("Armando" , 1996 , "IMA");
		s1.ausgeben();
	}

}
