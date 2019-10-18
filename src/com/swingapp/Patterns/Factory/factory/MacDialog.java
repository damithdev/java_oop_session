package com.swingapp.Patterns.Factory.factory;

import com.swingapp.Patterns.Factory.buttons.Button;
import com.swingapp.Patterns.Factory.buttons.MacButton;

public class MacDialog extends Dialog {

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
