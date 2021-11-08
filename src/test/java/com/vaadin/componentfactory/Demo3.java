package com.vaadin.componentfactory;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;

@Route("DemoThree")
public class Demo3 extends Div {

    public Demo3() {
        VaadinSession.getCurrent().getSession().setMaxInactiveInterval(10);

        IdleNotification idleNotification = new IdleNotification(5);
        idleNotification.setRedirectAtTimeoutUrl("logout");

        UI.getCurrent().add(idleNotification);
    }
}
