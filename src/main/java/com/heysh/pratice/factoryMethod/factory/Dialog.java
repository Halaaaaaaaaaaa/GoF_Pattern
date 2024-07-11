package com.heysh.pratice.factoryMethod.factory;

import com.heysh.pratice.factoryMethod.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
