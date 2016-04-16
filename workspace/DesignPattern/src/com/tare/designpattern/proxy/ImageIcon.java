package com.tare.designpattern.proxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

public class ImageIcon implements Icon {

	URL imageURL; 
	
	
	
	public ImageIcon(URL imageURL) {
		super();
		this.imageURL = imageURL;
	}


	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		
	}

}
