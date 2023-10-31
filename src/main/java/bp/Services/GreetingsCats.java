package bp.Services;


import org.springframework.stereotype.Service;

@Service
public class GreetingsCats implements GreetingsService {
    @Override
    public String greeting() {
        return "i like cats";
    }
}
