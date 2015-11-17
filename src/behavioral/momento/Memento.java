package behavioral.momento;

/**
 * Created by mikalai on 17.11.2015.
 */
public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
