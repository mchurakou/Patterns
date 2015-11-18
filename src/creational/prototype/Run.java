package creational.prototype;

/**
 * Created by mikalai on 19.11.2015.
 */
public class Run {
    public static void main(String args[]) throws CloneNotSupportedException {
        Cookie prot = new CoconutCookie();
        CookieMachine cm = new CookieMachine(prot);
        for (int i = 0; i < 100; i++) {
            Cookie tempCookie = cm.makeCookie();
            System.out.println(tempCookie);
        }
    }
}
