package test.ex03;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BubbleFrame extends JFrame {
    private JLabel backgroundMap;
    private Player player;

    public BubbleFrame(){
        initObject();
        initSetting();
        initListenner();

        setVisible(true);
    }
    private void initObject(){
        backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
        setContentPane(backgroundMap);

        player = new Player();
        add(player);
    }
    private void initSetting(){
        setSize(1000,640);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void initListenner(){
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if(e.getKeyCode()==39){
                    player.right();
                }else if(e.getKeyCode()==37){
                    player.left();
                }else if(e.getKeyCode()==38){
                    player.up();
                } else if (e.getKeyCode()==40) {
                    player.down();
                }

            }
        });
    }
    public static void main(String[] args) {
        new BubbleFrame();
    }
}
