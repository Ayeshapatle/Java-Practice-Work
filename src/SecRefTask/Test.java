package SecRefTask;

public class Test {
	public static void main(String[] args) {

		Student s = new Student();
		s.setName("Ayesha");
		s.setMobno(88845559);

		College c = new College();
		c.setClgname("MPCE");
		c.setClgid(555);
		c.setClgaddr("Bhandara");
		c.setStu(s);

		University un = new University();
		un.setUname("Nagpur University");
		un.setUid("abcd");
		un.setUmobno(1111111);
		un.setClg(c);

		System.out.println("Student name: " + s.getName());
		System.out.println("Student mobile no: " + s.getMobno());
		System.out.println("College name: " + c.getClgname());
		System.out.println("College Id is: " + c.getClgid());
		System.out.println("College Address is " + c.getClgaddr());
		System.out.println("Student name in College" + c.getStu().getName());
		System.out.println("University name is: " + un.getUname());
		System.out.println("University Id is" + un.getUid());
		System.out.println("University contact no: " + un.getUmobno());
		System.out.println("College Id in University details: " + un.getClg().getClgid());
		System.out.println("College Name in University details:" + un.getClg().getClgname());

	}

}
