/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author franc
 */
public class Punto {
    protected float x,y;
    public Punto(float x,float y){
        setX(x);
        setY(y);
    }
public Punto(){
    this(0,0);
}
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    public String toString()
  { return toString( "." );
  }
  
  public String toString(String separador)
  { return x+ separador + y ;
  }
}

