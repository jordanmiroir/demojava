package com.example.demo;

import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserService userService;

	/*@Test
		public void testConnexionBdd() {
			//Given

			//when
			long nbUser = userRepository.count();
			//Then
			Assert.assertTrue(nbUser > 0);
	}*/

	@Test
		public void testhistoriserAction()throws Exception {
		userService.historiserAction(4,"Nourrir");
	}
	@Test
		public void testOneToMany(){
			//Given

			//When
			User u1 = userRepository.findOne(41);
			List<Historique> r = u1.getHistoriques();


			//Then
			Assert.assertTrue(r.size() == 1);
	}



}

