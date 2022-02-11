 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import jdk.nashorn.api.tree.WhileLoopTree;
import pkg2dgamesframework.AFrameOnImage;
import pkg2dgamesframework.Animation;
import pkg2dgamesframework.GameScreen;

/**
 *
 * @author Admin
 */
public class FlappyBird extends GameScreen{
 
    ImageIcon icon;
    
    private BufferedImage birds;
    private Animation bird_anim;
    
    public  static float g = 0.15f;
    
    private Bird bird;
    private Ground ground;
    
    private ChimneyGround chimneyGround;
    
    public int Point = 0;
    
    private int BEGIN_SCREEN = 0;
    private int GAMEPLAY_SCREEN = 1;
    private int GAMEOVER_SCREEN = 2;
    
    private int CurrentScreen = BEGIN_SCREEN;
    
    public FlappyBird(){
        
        super(800, 600);
        setLocationRelativeTo(null);
        icon = new ImageIcon("Assets/icon.jfif");
        setIconImage(icon.getImage());
        setTitle("Plappy Bird");
 
        try {
            birds = ImageIO.read(new File("Assets/bird_sprite.png"));
            
        } catch (IOException ex) {}
        
        bird_anim = new Animation(50);
        AFrameOnImage f;
        f = new AFrameOnImage(0, 0, 60, 60);
        bird_anim.AddFrame(f);
        f = new AFrameOnImage(60, 0, 60, 60);
        bird_anim.AddFrame(f);
        f = new AFrameOnImage(120, 0, 60, 60);
        bird_anim.AddFrame(f);
        f = new AFrameOnImage(60, 0, 60, 60);
        bird_anim.AddFrame(f);
        
        bird = new Bird(350, 250, 50, 50);
        ground = new Ground();
        
        chimneyGround  = new ChimneyGround();
        
        BeginGame();
    }
    
    public static void main(String[] args) {
       
    }
    
    public  void resetGame(){
        bird.setPos(350, 250);
        bird.setvt(0);
        bird.setLive(true);
        Point = 0;
        chimneyGround.resertChimneys();
        
    }

    @Override
    public void GAME_UPDATE(long deltaTime) {
        
        if(CurrentScreen == BEGIN_SCREEN){
            resetGame();
        }else if(CurrentScreen == GAMEPLAY_SCREEN){
            
            if(bird.getLive())  bird_anim.Update_Me(deltaTime);
            bird.update(deltaTime);
            ground.Update();
            
            chimneyGround.update();
            
            for(int i=0; i < chimneyGround.SIZE; i++){
                if(bird.getRect().intersects(chimneyGround.getChimney(i).getRect())){
                    if(bird.getLive()){
                        bird.bupSound.play();
                        bird.hahaSound.play();
                    }
                    bird.setLive(false);  
                }  
            }
            
            for(int i=0; i < chimneyGround.SIZE; i++){
                if(bird.getPosX() > chimneyGround.getChimney(i).getPosX() && !chimneyGround.getChimney(i).getisBehindBird()&& i%2==0){
                    Point ++ ;
                    bird.getMoneySound.play();
                    chimneyGround.getChimney(i).setisBehindBird(true);
                }       
            }
            
            
            if(bird.getPosY() + bird.getH() > ground.getYGround()){
                CurrentScreen = GAMEOVER_SCREEN;
                //JOptionPane.showMessageDialog(null, "Số điểm lần chơi này là: "+ Point);
                ghiKQ();
                
            }
        }
        
    }
    

public void ghiKQ(){
    String errConnect = Connect.getConnection();
    if (!errConnect.equals("")) {
                JOptionPane.showMessageDialog(this , errConnect, "Lỗi", JOptionPane.ERROR_MESSAGE); 
                return;
    }
    String sql = "{Call ThemResult(?, ?, ?)}";
    CallableStatement cstm;
    String kq;
        try {
            cstm = Connect.conn.prepareCall(sql);
            cstm.setInt(1, Point);
            cstm.setString(2, Connect.userID);
            cstm.registerOutParameter(3, java.sql.Types.NVARCHAR);
            cstm.execute();
            kq = cstm.getString(3);
            //JOptionPane.showMessageDialog(this, kq, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            cstm.close();
            Connect.conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi: "+ ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    
}



    @Override
    public void GAME_PAINT(Graphics2D g2) {
        
        g2.setColor(Color.decode("#b8daef"));
        g2.fillRect(0, 0, MASTER_WIDTH, MASTER_HEIGHT);
        
        chimneyGround.paint(g2);
        
        ground.Paint(g2);
        
        if(bird.getIsFlying())
            bird_anim.PaintAnims((int) bird.getPosX(), (int) bird.getPosY(), birds, g2, 0, -1);
        else
            bird_anim.PaintAnims((int) bird.getPosX(), (int) bird.getPosY(), birds, g2, 0, 0);
        
        if(CurrentScreen == BEGIN_SCREEN){
            g2.setColor(Color.red);
            g2.drawString("Press space to play game", 200, 300);
        }
        if(CurrentScreen == GAMEOVER_SCREEN){
            g2.setColor(Color.red);
            g2.drawString("Press space to turn back begin screen", 200, 300);
        }
        
        g2.setColor(Color.red);
        g2.drawString("Point: "+ Point, 20, 50);
        
    }

    @Override
    public void KEY_ACTION(KeyEvent e, int Event) {
        if(Event == KEY_PRESSED){
            
            if(CurrentScreen == BEGIN_SCREEN){
                CurrentScreen = GAMEPLAY_SCREEN;
            }else if(CurrentScreen == GAMEPLAY_SCREEN){
                if(bird.getLive()) 
                    bird.fly();
            }else if(CurrentScreen == GAMEOVER_SCREEN){
                CurrentScreen = BEGIN_SCREEN;
            }
        }
    }
    
}
