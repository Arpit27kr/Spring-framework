package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jpa.test.entities.course;

@Service
public class courseserviceimpl implements courseservice {
	
	
	List<course>list;
	
	public courseserviceimpl()
	{
		
		list=new ArrayList<>();
		list.add(new course(145,"java","Very good"));
		list.add(new course(1652,"spring boot","really good"));	
	}
	
	

	@Override
	public List<course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}



	@Override
	public course getcourse(long id) {
		// TODO Auto-generated method stub
		course c=null;
		for(course co:list)
		{
			if(co.getId()==id)
			{
				c=co;
				break;
			}
		}
		
		return c;
	}



	

}
