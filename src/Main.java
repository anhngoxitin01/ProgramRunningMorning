import Screen.MainScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        MainScreen ms = new MainScreen();
        ms.addBtn("Click here", 100, 30, 100, 40, actionListener -> {
            ms.changeColorStatus();
            ms.repaint();
        });
        ms.addStatus(50 , 80 , 100 , 40);
        ms.createScreen("Example JFrame" , 400 , 200);
    }
}
