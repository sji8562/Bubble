package test.ex02;

import javax.swing.*;

public class Player extends JLabel{
     private int x , y;

     private ImageIcon playerR,playerL;
     public Player(){
          initObject();
          initSetting();

     }

     public void initObject(){
          playerR = new ImageIcon("image/playerR.png");
          playerL = new ImageIcon("image/playerL.png");

     }
     private void initSetting(){
          x = 70;
          y = 535;

          setIcon(playerR);
          setSize(50,50);
          setLocation(x,y);
     }
}
