package com.tare.designpattern.proxy;

import java.awt.Component;
import java.awt.Graphics;

public interface Icon {
	public int getIconWidth(); 
	public int getIconHeight(); 
	public void paintIcon(final Component c, Graphics g, int x, int y);
}
