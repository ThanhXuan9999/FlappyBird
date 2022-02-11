/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Rectangle;
import java.io.File;
import pkg2dgamesframework.Objects;
import pkg2dgamesframework.SoundPlayer;

/**
 *
 * @author Admin
 */
public class Bird extends Objects{
    
    private float vt = 0;
    
    private boolean isFlying = false;
    
    private Rectangle rect;
    
    private boolean isLive = true;
    
    public SoundPlayer plapSound, bupSound, getMoneySound, hahaSound;
            
    public void setvt(float vt){
        this.vt = vt;
    }
    
    public Bird(int x, int y, int w, int h){
        super(x, y, w, h);  
        rect = new Rectangle(x, y, w, h);
        
        plapSound = new SoundPlayer(new File("Assets/flap.wav"));
        bupSound = new SoundPlayer(new File("Assets/bup.wav"));
        getMoneySound = new SoundPlayer(new File("Assets/getMoney.wav"));
        hahaSound = new SoundPlayer(new File("Assets/hahaha.wav"));
    }
    
    public void setLive(boolean b){
        isLive = b;
    }
    
    public boolean getLive(){
        return isLive;
    }
    
    public Rectangle getRect(){
        return rect;
    }
    
    public  void update(long datetime){
        vt += FlappyBird.g;
        
        this.setPosY(this.getPosY() + vt);
        this.rect.setLocation((int)this.getPosX(), (int)this.getPosY());
        
        if(vt < 0)
            isFlying = true;
        else
            isFlying = false;
    }
    
    public void fly(){
        vt = -3;
        plapSound.play();
    }
    
    public boolean getIsFlying(){
        return isFlying;
    }
}
