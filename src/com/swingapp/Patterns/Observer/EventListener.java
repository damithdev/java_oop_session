package com.swingapp.Patterns.Observer;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
