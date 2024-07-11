package com.practice.design_pattern.factoryMethod.factory;

import com.practice.design_pattern.factoryMethod.buttons.HtmlButton;
import com.practice.design_pattern.factoryMethod.buttons.Button;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
