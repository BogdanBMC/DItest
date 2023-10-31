package bp.Services;


import org.springframework.stereotype.Service;



@Service
public class GreetingsServiceConstructor implements GreetingsService {

    @Override
    public String greeting() {
        return "greetings from constructor";
    }
}
