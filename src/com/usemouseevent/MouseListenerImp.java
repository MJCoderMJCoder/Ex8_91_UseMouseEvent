package com.usemouseevent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JTextField;

class MouseListenerImp implements MouseListener, MouseMotionListener,
		WindowListener {
	JTextField text;

	public MouseListenerImp(JTextField text) {
		this.text = text;
	}

	@Override
	public void windowOpened(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
		//为了使窗口能正常关闭，程序正常退出
		System.exit(1);
	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

	@Override
	public void mouseDragged(MouseEvent e) { //dragged：拖拽、牵引的、拖拉。
		String s = "拖拽鼠标，坐标：X=" + e.getX() + "，Y=" + e.getY();
		text.setText(s);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		String s = "鼠标进入了窗体";
		text.setText(s);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		String s = "鼠标离开了窗体";
		text.setText(s);
	}

}
