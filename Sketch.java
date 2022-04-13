import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  // Declare image variables 
  PImage imgBackground;
  PImage imgRocket; 

  // Declare size variables 
  // Rocket
  float fltRocketX = width / 2
  float fltRocketY = 600;

  // Shooting Star
  float fltStarX;
  float fltStarY;
	
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
    


	
 
  }
}