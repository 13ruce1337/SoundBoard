package pkg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;

public class AddSoundButton extends JPanel {
	private static final long serialVersionUID = 1L;
	int x = 140, y = 35;
	private Dimension addSoundSize = new Dimension(140, 50); 
	private String newSoundString = "Click to add sound";
	
	public AddSoundButton() {
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(addSoundSize);
	}
	
	public Dimension getMinimumSize() {
		return new Dimension(addSoundSize);
	}
	
	public Dimension getMaximumSize() {
		return new Dimension(addSoundSize);
	}
	
	public void paint(Graphics g){
		super.paintComponent(g);
		Font font = new Font("Helvetica", Font.PLAIN, 25);
		FontMetrics metrics = g.getFontMetrics(font);
		g.setFont(font);
		g.setColor(Color.BLACK);
		setBackground(Color.green);
		setFont(font);
		g.drawString(newSoundString, x, y);
		
		try{
			Thread.sleep(10);
		} catch(Exception e) {
			System.err.println(e);
		}
		
		x-=5;
		if(x <= 0 - metrics.stringWidth(newSoundString)){
			x=140;
		}
		repaint();
	}
	
}
