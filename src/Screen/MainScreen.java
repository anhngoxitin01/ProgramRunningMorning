package Screen;

import javax.swing.*;

public class MainScreen {
    private JFrame f = new JFrame();

    public void updateFrame(String title , int sizeX , int sizeY)
    {
        f.setSize(sizeX , sizeY);
        f.setTitle(title);

        //custom
        f.setLayout(null);
        f.setVisible(true);
    }

    public void addBtn(String title , int x , int y , int width , int height)
    {
        JButton btn = new JButton();
        btn.setBounds(x , y,width , height);
        btn.setText(title);

        f.add(btn);
    }
}
