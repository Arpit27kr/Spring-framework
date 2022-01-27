package com.jpa.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.userrepo;
import com.jpa.test.entities.user;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@SpringBootApplication
public class BootjpaApplication {

	public static void main(String[] args) {
		
		ApplicationContext context= SpringApplication.run(BootjpaApplication.class, args);
		userrepo userrepo=context.getBean(userrepo.class);
		
		//user ser=new user();
		//ser.setId(0);
		//ser.setCity("bab");
		//ser.setName("Arpit");
		//ser.setStatus("I am java developer");
		//user ser1=userrepo.save(ser);    // saving the data in database
		//System.out.println();
		
		
		
		
		/*
		 * user user1 =new user(); user1.setName("uttam"); user1.setCity("delhi");
		 * user1.setStatus("python");
		 * 
		 * 
		 * user user2 =new user(); user2.setName("ankit"); user2.setCity("up");
		 * user2.setStatus("java");
		 */
		
		
		// Saving data in database
		/*
		 * List<user>users=List.of(user1,user2); userrepo.saveAll(users);
		 * System.out.println(users);
		 */
		
		
		//updating the data in database
		
		
		/*
		 * java.util.Optional<user>opt=userrepo.findById(5);
		 * 
		 * user user=opt.get(); user.setName("Aman"); userrepo.save(user);
		 * 
		 * // delete the record
		 * 
		 * userrepo.deleteById(5);
		 * 
		 * 
		 * 
		 * 
		 * System.out.println(opt.get());
		 * 
		 * 
		 * 
		 */
		
		
	 
	// using finder methods in springboot
		
		System.out.println("down");
		// 1.  if we have to find by one entry like name then just create method of findbyname in userrepo and use it.
		// System.out.println(userrepo.findByName("uttam"));
		 
		// 2. if we have to find the records by two enries like name and password
		
		
		    //  System.out.println(userrepo.findByNameAndCity("uttam","delhi"));
		
		 //3. take help from this link 5.1.3 in query creation
		//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.repositories
		  

		     
		      // added  record  in  database  of   ----> aman 
		      
			/*
			 * user ser1=new user(); ser1.setName("aman"); ser1.setCity("bihar");
			 * ser1.setId(3); ser1.setStatus("jpp");
			 * 
			 * userrepo.save(ser1); System.out.println(ser1);
			 * 
			 */
		
		
		
		//5 . FIRING THE QUERY IN SPRING BOOT JPQL QUERY
		
		//METHOD CREATED IN USERREPO INTERFACE NOW WE HAVE TO USER THE METHOD 
	
		  List<user>alluser=userrepo.getAlluser(); alluser.forEach(e->{
		  System.out.println(e); });
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
