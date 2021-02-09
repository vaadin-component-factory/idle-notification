package com.vaadin.componentfactory;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;

@Route("DemoOne")
public class DemoOne extends Div {

    public DemoOne() {
        VaadinSession.getCurrent().getSession().setMaxInactiveInterval(65);

        IdleNotification idleNotification = new IdleNotification();
        idleNotification
                .setMessage("Your session will expire in " + IdleNotification.MessageFormatting.SECS_TO_TIMEOUT
                        + " seconds.");
        idleNotification.addExtendSessionButton("Extend session");
        idleNotification.addRedirectButton("Logout now", "logout");
        idleNotification.addCloseButton();
        idleNotification.setExtendSessionOnOutsideClick(false);

        UI.getCurrent().add(idleNotification);
    }
}
