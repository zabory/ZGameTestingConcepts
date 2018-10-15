import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;


public class ScenePanel extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	SceneHead game;
	//array of scenes
	Scene[] scenes;
	//keeps track of the current scene
	int currentScene;
	//integer to switch the scenes for showing purposes 
	int sceneSwitch;
	
	public ScenePanel(SceneHead game) {
		this.game = game;
		Timer timer = new Timer(5, this);
		timer.start();
		sceneSwitch = 0;
		
		
		/**
		 * creates scenes, while it could be easier to make scenes based of the Scene class,
		 * its easier to customize each individual scene with having specific classes for each
		 * scene.
		 */
		scenes = new Scene[3];
		scenes[0] = new Scene1();
		scenes[1] = new Scene2();
		scenes[2] = new Scene3();
	}

	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		update();
		repaint();	
	}

	/**
	 * paints specific scene
	 */
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		scenes[currentScene].paint(g);
	}



	/**
	 * updates specific scene
	 */
	private void update() {
		scenes[currentScene].update();
		sceneSwitch++;
		if(sceneSwitch > 1000) {
			currentScene++;
			if(currentScene > 2) {
				currentScene = 0;
			}
			sceneSwitch = 0;
		}
	}
	
	
	
	
	
}
