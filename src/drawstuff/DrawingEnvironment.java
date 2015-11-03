/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Liam
 */
class DrawingEnvironment extends Environment {

    public DrawingEnvironment() {
        logo = ResourceTools.loadImageFromResource("drawstuff/Apple_Logo_Silver.png");
        this.setBackground(Color.white);
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
//        graphics.setColor(Color.cyan);
//        graphics.drawOval(200, 100, 200, 160);
//        graphics.setColor(Color.red);
//        graphics.drawOval(350, 100, 200, 160);
//        graphics.setColor(Color.orange);
//        graphics.drawOval(500, 100, 200, 160);
//        graphics.setColor(Color.blue);
//        graphics.drawOval(650, 100, 200, 160);
        
//        graphics.setColor(new Color(150, 40, 215, 100));
//        graphics.fillOval(30, 30, 100, 100);
//        graphics.setColor(new Color(40, 30, 150, 100));
//        graphics.fillOval(20, 15, 100, 100);
//        graphics.setColor(new Color(250, 140, 40, 100));
//        graphics.fillOval(40, 15, 100, 100);
//        
//        graphics.drawRect(50, 400, 50, 70);
//        
//        graphics.fillRect(50, 350, 50, 70);
//        
//        graphics.drawLine(400, 300, 50, 500);
        
        graphics.setFont(new Font("Calibri", Font.BOLD, 55));
        graphics.drawString("The New Everything.", 230, 350);
        
        if (logo !=null) {
            graphics.drawImage(logo, 385, 90, 140, 160, this);
            
        graphics.setColor(new Color(250, 200, 10, 50));
        graphics.fillOval(10, 50, 200, 200);
        graphics.setColor(new Color(250, 200, 10, 50));
        graphics.fillOval(50, 10, 200, 200);
        graphics.setColor(new Color(250, 200, 10, 50));
        graphics.fillOval(50, 50, 200, 200);
        graphics.setColor(new Color(10, 200, 10, 50));
        graphics.fillOval(690, 10, 200, 200);
        graphics.setColor(new Color(10, 200, 10, 50));
        graphics.fillOval(640, 10, 200, 200);
        graphics.setColor(new Color(10, 200, 10, 50));
        graphics.fillOval(690, 60, 200, 200);
        graphics.setColor(new Color(10, 10, 200, 50));
        graphics.fillOval(10, 370, 200, 200);
        graphics.setColor(new Color(10, 10, 200, 50));
        graphics.fillOval(10, 320, 200, 200);        
        graphics.setColor(new Color(10, 10, 200, 50));
        graphics.fillOval(60, 370, 200, 200);
        graphics.setColor(new Color(250, 10, 10, 50));
        graphics.fillOval(690, 370, 200, 200);
        graphics.setColor(new Color(250, 10, 10, 50));
        graphics.fillOval(690, 320, 200, 200);
        graphics.setColor(new Color(250, 10, 10, 50));
        graphics.fillOval(640, 370, 200, 200);
        
        }

    }
    
    Image logo = null;
}
