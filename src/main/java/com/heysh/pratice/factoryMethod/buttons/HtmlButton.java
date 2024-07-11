package com.heysh.pratice.factoryMethod.buttons;

public class HtmlButton implements Button {


    @Override
    public void render() {
        System.out.println("<Button>HtmlButton Test<Button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("<Button>HtmlButton Click - Hello<Button>");
    }
}
