package example;

/**
 * HTML Dialog will produce HTML buttons
 */
public class HTMLDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
