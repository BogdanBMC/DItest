package bp;

import bp.Controller.CatsConstructor;
import bp.Controller.ConstructorController;
import bp.Controller.DogsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DiExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiExampleApplication.class, args);
		ConstructorController constructorController = (ConstructorController)ctx.getBean("constructorController");
		System.out.println("-----------");

		System.out.println(constructorController.greeting());

		CatsConstructor catsConstructor = (CatsConstructor) ctx.getBean("catsConstructor");
		System.out.println(catsConstructor.greeting());

		DogsConstructor dogsConstructor = (DogsConstructor) ctx.getBean("dogsConstructor");
		System.out.println(dogsConstructor.greeting());

	}

	}

