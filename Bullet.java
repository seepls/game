import java.awt.*;
public class Bullet{
//FEILDS
private double x;
private double y;
private int r ;

private double dx;
private double dy;
private double rad;
private double speed;

private Color color1 ; // basic bullet colour 

//CONSTRUCTOR 
public Bullet(double angle , int  x ,int  y){ // giving as parameters angle and starting position
  this.x = x ;
  this.y = y ;
  r = 2 ;
  rad = Math.toRadians(angle );
  dx = Math.cos(rad);
  dy = Math.sin(rad);
  speed = 15;
  color1 = Color.YELLOW ;
  
  }
//FUNCTIONS 


}
