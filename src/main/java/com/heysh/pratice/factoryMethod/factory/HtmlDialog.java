package com.heysh.pratice.factoryMethod.factory;

import com.heysh.pratice.factoryMethod.buttons.HtmlButton;
import com.heysh.pratice.factoryMethod.buttons.Button;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
