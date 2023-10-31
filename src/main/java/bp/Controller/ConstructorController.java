package bp.Controller;

import bp.Services.GreetingsService;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class ConstructorController {

    private final GreetingsService greetingsService;

    //Qalifier tell what class to inject into which controller   @Primary ca sa injecteze ce e annotat de cate ori e frameworku in dubii
 //in caz de same name bean se pot folosii profile in properties  spring.profiles.active=profileName
    //Qalifier("nume bean") in implementation sa il numesti asa
    //@Profile("profile name", " profile name2", "default")
    public ConstructorController(@Qualifier("greetingsServiceConstructor") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }


    public String greeting(){
       return greetingsService.greeting();
    }

}
