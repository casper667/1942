package gamePlayer;

public class GameModel {
	private boolean pause;
	
	// properties of the panel
    private int width, height;
	public GameModel(){
		width = 0;
        height = 0;
		pause = false;
	}
	
	
	public boolean getPause() { 
		 return pause;
	}
	public void setPause(boolean pause){
		this.pause = pause;
	}
	/**
	 * Sets size of the panel
	 * @param width
	 * @param length
	 */
	public void setSize(int width, int length) {
        this.width = width;
        this.height = length;
    }
	
}//end of class GameModel

