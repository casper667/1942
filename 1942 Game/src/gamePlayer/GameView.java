package gamePlayer;

import java.awt.*;
import javax.swing.*; 


public class GameView extends JFrame {
	private GameModel model;
    private GamePanel gamePanel;
    private JLabel statusBar;
    private JMenu gameMenu;
    private JPopupMenu popupMenu;
    
    
    public GameView(GameModel model){
    	super("1942");
    	this.model = model;
    	
    	JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        gameMenu = new JMenu("Menu");
        gameMenu.setMnemonic('M');
        menuBar.add(gameMenu);
        
        JMenuItem pauseItem = new JMenuItem("Pause/Continue");
        pauseItem.setMnemonic('P');
        gameMenu.add(pauseItem);
         
        // create the popup menu, need new JMenuItems

        popupMenu = new JPopupMenu();
        popupMenu.add(new JMenuItem("Pause/Continue"));
        popupMenu.add(new JMenuItem("Exit"));
       
        /* CENTER:
         * The panel where 1942 is played
         */
        gamePanel = new GamePanel(model, this);
        add(gamePanel, BorderLayout.CENTER);
        gamePanel.setBackground(Color.GREEN);
        Dimension size = gamePanel.getSize();
        model.setSize(size.width, size.height);
    }
    
}// end class GameView
