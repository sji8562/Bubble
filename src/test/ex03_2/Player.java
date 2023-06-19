package test.ex03_2;

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
     public void right() throws InterruptedException {
          setIcon(playerR);
          while(x<=880){
               if(x <= 880){
                    x += 10;
                    setLocation(x,y);
               }
               try{
                    Thread.sleep(10);
               }catch (InterruptedException e){
                    e.printStackTrace();
               }
          }

     }
     public void left(){
          if(x >69){
               x -= 10;
               setIcon(playerL);
               setLocation(x,y);
          }
     }
     public void up(){
          y -= 140;   //최대높이
          setLocation(x,y);
          y +=20;        //착지
          setLocation(x,y);
          System.out.println(y);
     }
     public void down(){
          if(y<535){
               y += 120;
               setLocation(x,y);
          }
     }
}
