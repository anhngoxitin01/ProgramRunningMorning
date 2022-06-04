import Screen.MainScreen;

public class Main {
    public static void main(String[] args) {
        MainScreen ms = new MainScreen();
        ms.updateFrame("Example JFrame" , 400 , 200);
        ms.addBtn("Click here", 130 ,50 ,100 ,40);
    }
}
