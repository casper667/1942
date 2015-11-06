package gamePlayer;

import javax.swing.JFrame;

public class Game {
	/**
	 * Create the objects for the model, view and controller,
	 * and launch the application.
	 */
	public static void main(String[] args) {
		//create new model, view and controller 
		GameModel model = new GameModel();
		GameView view = new GameView(model);
		GameMenueController menuController = new GameMenueController(model, view);
		
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setSize(640, 960);
		view.setVisible(true);
		

	}

}
