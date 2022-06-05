import Screen.MainScreen;
import data.MSystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        MSystem mSystem = new MSystem();
        MainScreen ms = new MainScreen();


        ms.addBtn("open new day", 100, 30, 100, 40, actionListener -> {
            mSystem.openNewDay();
        });
        ms.addStatus(50 , 80 , 100 , 40 , mSystem.checkStatusWifi());
        ms.createScreen("Example JFrame" , 400 , 200);
    }
}
