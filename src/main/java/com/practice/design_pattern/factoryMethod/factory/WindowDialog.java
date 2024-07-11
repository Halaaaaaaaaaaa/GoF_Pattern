package com.practice.design_pattern.factoryMethod.factory;

import com.practice.design_pattern.factoryMethod.buttons.WindowButton;
import com.practice.design_pattern.factoryMethod.buttons.Button;

public class WindowDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
