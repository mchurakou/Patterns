package behavioral.mediator.mediator;

import behavioral.mediator.colleague.Colleague;

/**
 * Created by mikalai on 16.11.2015.
 */
public abstract  class Mediator {
    public abstract void send(String message, Colleague colleague);
}
