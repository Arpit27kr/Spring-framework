package services;

import java.util.List;



import com.jpa.test.entities.course;

public interface courseservice {
	
	
	public List<course>getCourses();
	public course getcourse(long id);
	

}
