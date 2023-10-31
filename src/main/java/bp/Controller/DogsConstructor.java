package bp.Controller;

import bp.Services.GreetingsCats;
import bp.Services.GreetingsDogs;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DogsConstructor {

        GreetingsDogs greetingsDogs;

    public DogsConstructor(@Qualifier("greetingsDogs") GreetingsDogs greetingsDogs) {
        this.greetingsDogs = greetingsDogs;
    }

    public String greeting(){
            return greetingsDogs.greeting();
        }

    }


