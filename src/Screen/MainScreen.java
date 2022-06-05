package Screen;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.Flow;

public class MainScreen {
    private JFrame f = new JFrame();
    private Panel panel = new Panel();
    ArrayList<JButton> arrJBtn = new ArrayList<>();

    public void createScreen(String title , int sizeX , int sizeY)
    {
        //create panel
        panel.setLayout(new FlowLayout());

        //create button click
        for(JButton btn : arrJBtn)
        {
            System.out.println("1 btn");
            panel.add(btn);
        }

        //add to frame
        f.add(panel);
        f.setSize(sizeX , sizeY);
        f.setTitle(title);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }

    public void addBtn(String title , int x , int y , int width , int height)
    {
        JButton btn = new JButton();
        btn.setBounds(x , y,width , height);
        btn.setText(title);

        //add button
        arrJBtn.add(btn);
    }
}
