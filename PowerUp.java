import java.awt.*;

public class PowerUp{
// making square shaped poer ups . moving downward only 
  //FIELDS
  private double x ;
  private double y ;
  private int r ; 
  
  private int type ;
  private Color color ;
  
  
  //1 = +1 to life 
  //2  = +1 power
  //3 = +2 power
  
  //CONSTRUCTOR
  
  public PowerUp(int type , double x , double y ){
  this.type = type ;
  this.x = x ;
  this.y = y ;
  
  if( type == 1){
  color1 = Color.PINK ;
  }
  if(type == 2 || type == 3 ){
  color1 = Color.YELLOW ;
  
  }
  
  }
  
  
  //FUNCTIONS
  public double getx(){ return x ;} 
  public double gety(){ return y ;}
  public int getr(){ return r ;}
  
  public int getType(){ return type ;}
  
  public boolean update(){y+=2 ;
  if(y > GamePanel.HEIGHT +r ){
  return true ;
  }
  return false ;
  
  }
  public void draw(Graphics2D G){
  g.setColor(color1);}
  g.fillRect(

  

}
