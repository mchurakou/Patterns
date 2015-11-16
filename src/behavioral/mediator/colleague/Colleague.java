package behavioral.mediator.colleague;

import behavioral.mediator.mediator.Mediator;

/**
 * Created by mikalai on 16.11.2015.
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public abstract void notify(String message);
}
