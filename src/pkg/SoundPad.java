package pkg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.*;

public class SoundPad extends JPanel{
	private static final long serialVersionUID = 1L;	
	private int padNumber;
	private static int count;
	private boolean soundLoaded = false;
	private final JFileChooser fc = new JFileChooser();
	
	public SoundPad() {
		this.padNumber = count;
		count++;
		
		PlayButton play = new PlayButton();
		
		super.setBorder(BorderFactory.createLineBorder(Color.black));
		super.setBackground(Color.DARK_GRAY);
		super.setPreferredSize(new Dimension(150,100));
		super.add(LCD());
		super.add(play);
		
	}
	
	public JPanel LCD() {
		JPanel l = new JPanel();
		l.setBorder(BorderFactory.createLineBorder(Color.black));
		l.setBackground(Color.green);
		l.setPreferredSize(new Dimension(150,65));
		
		if(soundLoaded) {
			
		} else {
			AddSoundButton addSound = new AddSoundButton();
			l.add(addSound);
		}
		
		l.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(soundLoaded) {
					
				} else {
					int retVal = fc.showOpenDialog(SoundPad.this);
					
					if(retVal == JFileChooser.APPROVE_OPTION) {
						File sound = fc.getSelectedFile();
						System.out.println(sound);
					} else {
						System.out.println("Cancelled file dialogue");
					}
					
				}
			}
		});
		
		return l;
	}
	
	public int getpadNumber() {
		return this.padNumber;
	}
}