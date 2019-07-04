package com.usemouseevent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UseMouseEvent {

	public static void main(String[] args) {
		JFrame frm = new JFrame("鼠标事件使用示例");
		frm.setLayout(null);
		
		JLabel label = new JLabel("请在窗体内按住鼠标左键，拖动鼠标");
		label.setBounds(45, 5, 250, 25);
		frm.getContentPane().add(label);
		
		//创建文本框对象
		JTextField text = new JTextField(30);
		text.setBounds(45, 65, 300, 30);
		frm.getContentPane().add(text);
		
		//注册监听器，参数为事件处理者对象
		MouseListenerImp mouse = new MouseListenerImp(text);
		frm.addMouseListener(mouse);
		frm.addMouseMotionListener(mouse);
		frm.addWindowListener(mouse);
		
		frm.setBounds(500, 250, 400, 200);
		frm.setVisible(true);
	}

}
