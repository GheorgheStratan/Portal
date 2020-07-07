package game;

/*La classe Coordinate serve tutte quelle volte nel quale si vuole immagazzinare
 * rapidamente le coordinate di una immagine ecc...*/
public class Coordinate {
	private int x,y;

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
