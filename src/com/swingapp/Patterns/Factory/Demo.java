package com.swingapp.Patterns.Factory;

import com.swingapp.Patterns.Factory.factory.Dialog;
import com.swingapp.Patterns.Factory.factory.HtmlDialog;
import com.swingapp.Patterns.Factory.factory.MacDialog;
import com.swingapp.Patterns.Factory.factory.WindowsDialog;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        System.out.println(System.getProperty("os.name"));
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else if(System.getProperty("os.name").equals("Mac OS X")){
            dialog = new MacDialog();

        }else{
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
