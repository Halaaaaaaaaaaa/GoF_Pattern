package com.practice.design_pattern.factoryMethod.factory;

import com.practice.design_pattern.factoryMethod.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
