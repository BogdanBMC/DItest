package bp.Controller;


import bp.Services.GreetingsCats;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class CatsConstructor {

    GreetingsCats greetingsCats;

    public CatsConstructor(@Qualifier("greetingsCats") GreetingsCats greetingsCats) {
        this.greetingsCats = greetingsCats;
    }

    public String greeting(){
        return greetingsCats.greeting();
    }

}
