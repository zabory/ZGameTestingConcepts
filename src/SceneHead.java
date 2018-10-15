import java.awt.Color;

import javax.swing.JFrame;

public class SceneHead extends JFrame{
	private static final long serialVersionUID = 1L;
	private ScenePanel game;
	
	public SceneHead(){
		setSize(750, 500);
		setTitle("Scene Tester");
		setBackground(Color.BLACK);
		//setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		game = new ScenePanel(this);
		add(game);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new SceneHead();
	}

}