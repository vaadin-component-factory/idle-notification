package com.vaadin.componentfactory;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Route("DemoFive")
public class Demo5 extends Div {
    private final Logger LOG = LoggerFactory.getLogger("DEMO5");
    public Demo5() {
        VaadinSession.getCurrent().getSession().setMaxInactiveInterval(30);

        IdleNotification idleNotification = new IdleNotification(5);
        idleNotification.setSecondsBeforeNotification(25);
        idleNotification.setAfterExpiredMessage("Your session has expired");
        idleNotification.setExtendSessionOnOutsideClick(true);

        UI.getCurrent().add(idleNotification);

        idleNotification.addCloseButton();
        idleNotification.addRedirectButton("REDIRECT", "#");
        idleNotification.addExtendSessionButton("EXTEND SESSION");

        idleNotification.addRedirectListener(redirectEvent -> LOG.warn("REDIRECT !"));
        idleNotification.addCloseListener(closeEvent -> LOG.warn("CLOSE !"));
        idleNotification.addExtendSessionListener(extendSessionEvent -> LOG.warn("EXTEND SESSION !"));
        idleNotification.addOpenListener(openEvent -> LOG.warn("OPEN !"));
        idleNotification.addTimeoutListener(timeoutEvent -> LOG.warn("TIMED OUT !"));
    }
}
