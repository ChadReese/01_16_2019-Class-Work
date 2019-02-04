import java.util.ArrayList;

public class StudentDriver3 {

	public static void main(String[] args) {
		ArrayList<Student> roster = new ArrayList<>();
		Student temp = new Student("Bugs","Bunny",123456789);
		Student temp2 = new Student("Daffy","Duck",987654321);
		roster.add(temp);
		roster.add(temp2);
		temp = roster.get(0);
		
		System.out.println("Number of student objects in arraylist is "+roster.size());
		
		//linear search of ArrayList
		boolean success = false;
		for(int i=0;i<roster.size();i++) {
			if(roster.get(i).getEid() == 987654321) {
				System.out.println("Found at index "+i);
				success = true;
				break;
			}
		}
		System.out.println("Success status = "+success);
		
		System.out.println("is Student 987654321 in the roster? "+roster.contains(new Student("","",987654321)));
	}

}
