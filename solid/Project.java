package solid;

import java.util.List;

public class Project {
	
	 private static List<Developer> developers;

	    public Project(List<Developer> devs) {
	        Project.developers = devs;
	    }

	    public static void implement() {
	        developers.forEach(d->d.Develop());
	    }

}
