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
		//user ser1=userrepo.save(ser);
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
		
		
		java.util.Optional<user>opt=userrepo.findById(5);
		
		user user=opt.get();
		user.setName("Aman");
		userrepo.save(user);
		
		// delete the record
		
		userrepo.deleteById(5);
		
		
	
		
		System.out.println(opt.get());
		
		
		
		 
		
		
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
