package Screen;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.Flow;

public class MainScreen {
    private JFrame f = new JFrame();
    private Panel panel = new Panel();
    ArrayList<JComponent> arrJComponent = new ArrayList<>();

    public void createScreen(String title , int sizeX , int sizeY)
    {
        //create panel
//        panel.setLayout(null);
//        panel.setBounds(0,0,200,200);

        //create button click
        int count = 0;
        for(JComponent jcom : arrJComponent)
        {
            System.out.println(count++ + " Component");
            f.add(jcom);
        }

        //update frame
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
        arrJComponent.add(btn);
    }

    public void addLabel(String title , int x , int y, int width , int height)
    {
        JLabel label = new JLabel(title);
        label.setBounds(x , y , width , height);
        //add label
        arrJComponent.add(label);
    }

    public void addStatus(int x , int y , int width , int height)
    {
        JLabel label = new JLabel("Status");
        label.setBounds(x , y , width , height);

        JComponent circle = new JComponent() {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.BLACK);
                g.fillOval(x + width /2,y + height/2 - 4,10,10);
                super.paint(g);
            }
        };

        //add label, circle
        arrJComponent.add(label);
        arrJComponent.add(circle);
    }
}
