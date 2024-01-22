package com.softwareengineering.labtasks1.task1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sender {
    public static void main(String[] args) throws IOException {
        String fileName = "object.ser";

        Component component = new Component();
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(fos);

        out.writeObject(component);
        out.close();
    }
}
