package com.vaadin.componentfactory;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;

@Route("DemoTwo")
public class DemoTwo extends Div {

    public DemoTwo() {
        VaadinSession.getCurrent().getSession().setMaxInactiveInterval(65);

        UI.getCurrent().add(new IdleNotification());
    }
}
