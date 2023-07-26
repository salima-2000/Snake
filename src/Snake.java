import java.awt.Color;
import java.awt.Graphics;

public class Snake {
    private int x[];
	private int y[];
    private char direction='R';//la direction initialisée vers la droit
    public int t=5; //taille serpent
    private int size; //taille des unités du serpent
    
    public Snake(int[] X,int[] Y,int size) {
		this.x=X;
		this.y=Y;
		this.size=size;
	}
    //seteur et geteur de la direction
    public char getDirection() {
        return direction;
    }

    public void setDirection(char d) {
        this.direction = d;
    }
    public void move() {
        for(int i=t;i>0;i--) {
            x[i]=x[i-1];
            y[i]=y[i-1];
        }
        switch(direction) {
        case 'D':
            y[0]=y[0]+1;
            break;
        case'U':
            y[0]=y[0]-1;
            break;
        case 'L':
            x[0]=x[0]-1;
            break;
        case 'R':
            x[0]=x[0]+1;
            break;}}
    
    public void draws(Graphics g) {
		g.setColor(new Color(30,240,10));
        for (int i = 0; i<t; i++) {	//dessiner le serpent element par element
			g.fillRect(x[i]*size, y[i]*size, size, size);
		}
    }
	public void initialiserSerpent() {//POUR AVOIR LA POSSIBILITE DU REPLAY
		direction='R';
	    t=5;
	    for (int i = 0; i < x.length; i++) {
			x[i]=0;
			y[i]=0;
		}
	    
	}
	

}