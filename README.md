# idle-notification
An add-on that displays a notification and actions to the user before session-timeout

idle-notification is an add-on that notifies the user before their session is about to expire. It enables the following features:
- specify a message to be displayed to the user (which may include a count-down timer) before their session expires
- set the number of seconds before session termination, at which point the notification is displayed.
- add a button to the notification that enables the user to poke the server, thereby extending the session. 
- add a button to the notification that allow the user to immediately redirect to a different URL (e.g. a logout URL)
- add a close button, allowing the user to close the notification without taking any action
- specify a different message to be displayed to the user once their session has been terminated
- determine whether an outside click when the notification is opened would extend the session
- specify a URL to which the page would be automatically redirected upon session termination

## Install

To use the component in an application using maven, add the following dependency to your pom.xml:

```
<dependency>
    <groupId>com.vaadin.componentfactory</groupId>
    <artifactId>idle-notification</artifactId>
    <version>${component.version}</version>
</dependency>
```

## Usage

The notification is implemented as a standard Vaadin component that can be added to any UI or parent layout. 
For example, the following creates a notification with a message, a session-extending button, a redirect button. This notification has outside clicks not extending sessions. And the notification is added to the current UI.

```
IdleNotification idleNotification = new IdleNotification();
idleNotification
        .setMessage("Your session will expire in " + IdleNotification.MessageFormatting.SECS_TO_TIMEOUT
                + " seconds.");
idleNotification.addExtendSessionButton("Extend session");
idleNotification.addRedirectButton("Logout now", "logout");
idleNotification.addCloseButton();
idleNotification.setExtendSessionOnOutsideClick(false);

UI.getCurrent().add(idleNotification);
```

The following example specifies that the (default) message would be displayed to the user 90 seconds before their session timeout.
Upon session timeout, the page will be automatically redirected to the "logout" URL

```
IdleNotification idleNotification = new IdleNotification(90);
idleNotification.setRedirectAtTimeoutUrl("logout");

UI.getCurrent().add(idleNotification);
```


## Licnese

Apache License 2

