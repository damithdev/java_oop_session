package com.swingapp.Patterns.Factory.factory;

import com.swingapp.Patterns.Factory.buttons.Button;
import com.swingapp.Patterns.Factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
