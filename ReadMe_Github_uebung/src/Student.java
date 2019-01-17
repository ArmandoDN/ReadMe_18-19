
public class Student {

	
	private String name;
	private int geburtsjahr;
	private String studiengang;

	
	/**
	 * 
	 * @param name
	 * @param geburtsjahr
	 * @param studiengang
	 */
	
	public Student(String name, int geburtsjahr, String studiengang) {
		super();
		this.name = name;
		this.geburtsjahr = geburtsjahr;
		this.studiengang = studiengang;
	}

	/**
	 * ausgabe
	 */
	public void ausgeben(){
		
		System.out.println(name + "/" + studiengang + "alter ist" + geburtsjahr);
	}
	
	public int getAlter(){
		
		return (2019-geburtsjahr);
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Student s1 = new Student ("Armando" , 1996 , "IMA");
		s1.ausgeben();
	}

}
