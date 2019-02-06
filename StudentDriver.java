
public class StudentDriver {

	public static void main(String[] args) {
		Student bugs = new Student("Bugs","Bunny", 1234567);
		Student daffy = new Student("Daffy","Duck", 1234568);
		//bugs.setFName("Bugs");
		//bugs.setLName("Bunny");
		//bugs.setEid(900968998);
		System.out.println("The first name of the student is "+bugs.getFName());
		System.out.println("The last name of the student is "+bugs.getLName());
		System.out.println("The Eagle ID of the student is "+bugs.getEid());
		daffy.changeCount();
		System.out.println("Count is "+daffy.getClassCount());

	}

}
