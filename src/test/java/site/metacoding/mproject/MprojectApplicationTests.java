package site.metacoding.mproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootTest
class MprojectApplicationTests {

	@Test
	@GetMapping("/")
	public String main(){
		return "/mainForm";
	}

}
