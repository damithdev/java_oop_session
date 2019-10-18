package com.swingapp.Patterns.Observer;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();

        LogOpenListener logOpenListener = new LogOpenListener("file.txt");
        EmailNotificationListener emailNotificationListener = new EmailNotificationListener("admin@example.com");

        editor.events.subscribe("open", logOpenListener);
        editor.events.subscribe("save", emailNotificationListener);

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            editor.events.unsubscribe("open",logOpenListener);
            editor.events.unsubscribe("save",emailNotificationListener);
        }

        try{
            editor.openFile("test2.txt");
            editor.saveFile();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
