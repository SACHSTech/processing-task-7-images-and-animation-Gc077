import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  // Declare image variables 
  PImage imgBackground;
  PImage imgRocket; 

  // Declare size variables 
  // Rocket
  float fltRocketX = 500;
  float fltRocketY = 600;
  float fltRocketSpeedX = 1;

  // Comet 
  float fltCometX = 20;
  float fltCometY = 600;
  float fltCometSpeedY = 1;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1000, 700);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    
    // Load background  
    imgBackground = loadImage("space-background-illustration-for-explore-in-outer-space-vector.jpg");
    
    // Load Rocket
    imgRocket = loadImage("red-rocket-png-5.png");
    imgRocket.resize(imgRocket.width / 2, imgRocket.height / 2); // Resize rocket
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    // Apply background image and adjust position 
    background(0);
    image(imgBackground, -200, -200);

    // Draw rocket and animate 
    image(imgRocket, fltRocketX, fltRocketY);
    fltRocketX += fltRocketSpeedX;
    fltRocketY = (float) Math.pow(fltRocketX,2) / 1000;
    fltRocketY += fltRocketSpeedX;

    // Rocket collision detection
    if(fltRocketX < 0 - 54 || fltRocketX > 745){
      fltRocketSpeedX *= -1;
    }

    // Draw circle to represent comet and animate
    fill(200, 243, 233);
    circle(fltCometX, fltCometY, 40);
    fltCometY += fltCometSpeedY;
    fltCometX = (float) Math.pow(fltCometY, 2) / 1000;

    // Comet collision detection
    if(fltCometY < 0 + 10 || fltCometY > 600){
      fltCometSpeedY *= -1;
    }

    if(fltCometX < 0 + 19 || fltCometX > width){
      fltCometSpeedY *= -1;
    }
  }
}