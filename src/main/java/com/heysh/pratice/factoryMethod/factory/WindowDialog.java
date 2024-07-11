package com.heysh.pratice.factoryMethod.factory;

import com.heysh.pratice.factoryMethod.buttons.WindowButton;
import com.heysh.pratice.factoryMethod.buttons.Button;

public class WindowDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
