package com.swingapp.Patterns.Factory.factory;

import com.swingapp.Patterns.Factory.buttons.Button;
import com.swingapp.Patterns.Factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
