package bp.Services;

import org.springframework.stereotype.Service;

@Service
public class GreetingsDogs implements  GreetingsService{
    @Override
    public String greeting() {
        return "i like dogs";
    }
}
