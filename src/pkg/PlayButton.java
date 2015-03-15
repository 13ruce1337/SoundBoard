package pkg;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class PlayButton extends JComponent implements MouseListener {
	private static final long serialVersionUID = 1L;
	private Image playImg;
	private static int count;
	private int pbNumber;
	
	public PlayButton() {
		enableInputMethods(true);
		addMouseListener(this);
		this.pbNumber = count;
		count++;
		try {
			File img = new File("src/imgs/27223.png");
			playImg = ImageIO.read(img);
			playImg.getScaledInstance(5, 5, Image.SCALE_DEFAULT);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public int getpbNumber() {
		return pbNumber;
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(17,17);
	}
	
	public Dimension getMinimumSize() {
		return new Dimension(17,17);
	}
	
	public Dimension getMaximumSize() {
		return new Dimension(17,17);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int w = playImg.getWidth(this);
		int h = playImg.getHeight(this);
		int s = 16;
		int nw = w / s;
		int nh = h / s;
		
		g.drawImage(playImg, 0, 0, nw, nh, this);
	}
	
	public void mouseClicked(MouseEvent e) {
		System.out.println(this.pbNumber);
	}
	
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
}