package university.management.system;

import java.awt.*;
import javax.swing.*;
  
public class Splash extends JFrame implements Runnable{
  Thread t;
  Splash(){
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/first.png"));
    Image i2=i1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel img=new JLabel(i3);
    add(img);
  
    t=new Thread(this);
    t.start();
  
    setVisible(true);
    setLocation(0,0);
    setSize(1500,850);
    try {
      Thread.sleep(10);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void run(){
    try{
      Thread.sleep(3000);
      setVisible(false);
      new Login();
    }catch(Exception e){
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    new Splash();
  }
}
  
