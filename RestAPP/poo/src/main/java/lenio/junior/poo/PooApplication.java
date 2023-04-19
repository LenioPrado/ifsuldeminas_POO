package lenio.junior.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.*;

@SpringBootApplication
@EntityScan("lenio.junior.poo.entities.Person")
public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);
	}

}
