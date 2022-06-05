package data;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.*;

public class MSystem {
    public void openNewDay()
    {
        Desktop desk = Desktop.getDesktop();
        try {
            desk.browse(new URI("https://www.messenger.com/t/100013486260128/"));
            desk.browse(new URI("https://chat.zalo.me/"));
            desk.browse(new URI("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox"));
            desk.browse(new URI("https://www.youtube.com/"));
            desk.browse(new URI("https://webstatic-sea.mihoyo.com/ys/event/signin-sea-v3/index.html?act_id=e202102251931481&mhy_auth_required=true&mhy_presentation_style=fullscreen&utm_source=tools&lang=en-us&bbs_theme=dark&bbs_theme_device=1"));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }

        //open genshin impact in local computer
        try {
            File file = new File("D:/game/Genshin_Impact/Genshin Impact/launcher.exe");
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean checkStatusWifi()
    {
        try {
            URL url = new URL("http://www.google.com");
            URLConnection con = url.openConnection();
            con.connect();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
