package com.vaadin.componentfactory;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;

@Route("DemoTwo")
public class Demo2 extends Div {

    public Demo2() {
        VaadinSession.getCurrent().getSession().setMaxInactiveInterval(65);

        UI.getCurrent().add(new IdleNotification());
    }
}
