package Screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.Flow;

public class MainScreen {
    private JFrame f = new JFrame();
    private Panel panel = new Panel();
    ArrayList<JComponent> arrJComponent = new ArrayList<>();
    private Circle circleStatus;

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

    public void addBtn(String title , int x , int y , int width , int height , ActionListener al)
    {
        JButton btn = new JButton();
        btn.setBounds(x , y,width , height);
        btn.setText(title);
        btn.addActionListener(al);

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

    public void addStatus(int x , int y , int width , int height, boolean statusWifi)
    {
        JLabel label = new JLabel("Status");
        label.setBounds(x , y , width , height);

        circleStatus = new Circle(x + width /2,y + height/2 - 4,10,10);
        circleStatus.updateColorByStatusWifi(statusWifi);

        //add label, circle
        arrJComponent.add(label);
        arrJComponent.add(circleStatus);
    }

    public void repaint()
    {
        this.f.repaint();
    }

    public class Circle extends JComponent{
        private int x , y , width , height;
        public Color color = Color.BLACK;
        Circle(int x , int y, int width , int height)
        {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        public void updateColorByStatusWifi(boolean statusWifi) {
            if(statusWifi) this.color = Color.GREEN;
            else this.color = Color.BLACK;
            System.out.println(statusWifi);
        }

        @Override
        public void paint(Graphics g) {
            g.setColor(color);
            g.fillOval(x + width /2,y + height/2 - 4,10,10);
            super.paint(g);
        }


    }
}
