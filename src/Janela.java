import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {

    private static Janela janela = null;

    private Janela(){
        setPreferredSize(new Dimension(800, 400));
    }

    public static Janela getInstance(){
        if(janela == null){
            janela = new Janela();
        }
        return janela;
    }
}
