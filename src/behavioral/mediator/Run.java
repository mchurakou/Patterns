package behavioral.mediator;

import behavioral.mediator.colleague.Alarm;
import behavioral.mediator.colleague.TV;
import behavioral.mediator.mediator.ConcreteMediator;

/**
 * Created by mikalai on 16.11.2015.
 */
public class Run {
    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();
        TV tv = new TV(m);
        Alarm alarm = new Alarm(m);

        m.setAlarm(alarm);
        m.setTv(tv);

        alarm.send("din din");

        tv.send("online");
    }
}
