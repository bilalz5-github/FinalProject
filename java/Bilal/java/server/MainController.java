package Bilal.java.server;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/")
public class MainController {
	@GetMapping("/")
	public @ResponseBody GreetingJson greeting() {
		 return new GreetingJson("Welcome To Student And Course Management");
	}
	
	public static class GreetingJson {
        private final String message;

        public GreetingJson(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
