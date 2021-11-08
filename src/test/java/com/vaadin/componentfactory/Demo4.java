package com.vaadin.componentfactory;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;

@Route("DemoFour")
public class Demo4 extends Div {

    public Demo4() {
        VaadinSession.getCurrent().getSession().setMaxInactiveInterval(10);

        IdleNotification idleNotification = new IdleNotification(5);
        idleNotification.setAfterExpiredMessage("Your session has expired");
        idleNotification.setExtendSessionOnOutsideClick(true);

        UI.getCurrent().add(idleNotification);
    }
}
