package pkg;

import java.awt.GridLayout;

import javax.swing.*;

public class board {
	
	public board() {

		int padCount = 9;
		
		JFrame window = new JFrame("SoundBoard");
		JPanel allPads = new JPanel(new GridLayout(3,3));
		
		for(int i=0; i<padCount; i++){
			allPads.add(new SoundPad());
		}
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		allPads.validate();
		allPads.repaint();
		window.add(allPads);
		window.pack();
		window.setVisible(true);

	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				new board();
				
			}
			
		});
		
	}
	
}
