package game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Main extends StateBasedGame{
	
	public Main(String name) {
		super(name);
	}

	/*Qui sotto aggiungiamo gli stati di quando incominciamo*/
	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		this.addState(new Intro_1());
		this.addState(new SelectWindow());
		this.addState(new Tutorial());
	}
	
	public static void main(String[] args) throws SlickException {
		AppGameContainer game = new AppGameContainer(new Main("Portal2D"));
		
		game.setDisplayMode(1024,800,false);
		game.setAlwaysRender(true);
		//game.setShowFPS(false);
		game.setTargetFrameRate(60);
		game.setMaximumLogicUpdateInterval(60);
		game.start();
	}
}
