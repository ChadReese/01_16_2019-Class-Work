import java.util.*;
public class StudentDriver2 {

	public static void main(String[] args) {
		Student [] roster = new Student[3];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Enter student first name");
			String fName = input.next();
			System.out.println("Enter student last name");
			String lName = input.next();
			System.out.println("Enter student Eagle ID");
			int eid = input.nextInt();
			Student temp = new Student(fName,eid,lName);
			roster[i] = temp;
					
		}
			//sort by last name
		for(int i=0;i<3;i++) {
			for(int j=1;j<3;j++) {
				if(!roster[i].getLName().equals(roster[j].getLName())) {
					Student temp = roster[i];
					roster[i] = roster[j];
					roster[j] = temp;
				}
			}
		}
		for(int i=0;i<3;i++) {
			System.out.println(roster[i].getLName());
		}
	}

}
