
public class Player extends GameObject{
	
	public Player(ID id, int x, int y,int SpeedX,int SpeedY) {
		super(id, x, y);
		/*Setto la velocita' del personaggio*/
		this.SpeedX=setSpeedX(SpeedX);
		this.SpeedY=setSpeedY(SpeedY);
	}
	
	
}
