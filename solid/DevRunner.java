package solid;

import java.util.ArrayList;
import java.util.List;


public class DevRunner {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Developer he = new BackEndDeveloper();
		Developer fe = new FrontEndDeveloper();
		List<Developer> devs = new ArrayList<Developer>();
		devs.add(he);
		devs.add(fe);
		Project p = new Project(devs);
		p.implement();
		

	}

}
