package com.heysh.pratice.factoryMethod;

import com.heysh.pratice.factoryMethod.factory.Dialog;
import com.heysh.pratice.factoryMethod.factory.HtmlDialog;
import com.heysh.pratice.factoryMethod.factory.WindowDialog;

public class MainApplication {

    private static Dialog dialog;

    public static void main(String[] args) {
        System.out.println("======================== Application Start ========================");

        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}