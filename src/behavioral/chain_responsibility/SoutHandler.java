package behavioral.chain_responsibility;

/**
 * Created by mikalai on 11.11.2015.
 */
public class SoutHandler extends Handler {
    @Override
    public void handle(String str) {
        System.out.println(str);
    }
}
