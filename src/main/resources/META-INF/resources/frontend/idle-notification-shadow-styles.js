import { registerStyles, css } from '@vaadin/vaadin-themable-mixin/register-styles';

registerStyles(
  'vaadin-dialog-overlay',
  css`
    :host([theme='notification-dialog-theme'])::before {
      flex-grow: 0;
    }

    :host([theme='notification-dialog-theme']) [part='overlay'] {
      padding: 0;
    }

    :host([theme='notification-dialog-theme']) [part='content'] {
      padding: 0;
    }

    :host([theme='notification-dialog-theme']) .resizer-container {
      box-shadow: 0 0 0 0 var(--lumo-shade-40pct), var(--lumo-box-shadow-xl);
    }
  `
);
