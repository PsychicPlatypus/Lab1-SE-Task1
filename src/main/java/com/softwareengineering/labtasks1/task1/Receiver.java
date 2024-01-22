package com.softwareengineering.labtasks1.task1;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Receiver extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = read().getComponent();
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Receiver");
        stage.setScene(scene);
        stage.show();
    }

    private static Component read() throws IOException {
        FileInputStream fis = new FileInputStream("object.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Component component = null;
        try {
            component = (Component) ois.readObject();
        } catch (ClassNotFoundException e) {
            System.out.println("Read file does not contain a Component");
            System.exit(-1);
        }
        return component;
    }

    public static void main(String[] args) {
        launch();
    }
}