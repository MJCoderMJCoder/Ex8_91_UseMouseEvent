package com.usemouseevent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UseMouseEvent {

	public static void main(String[] args) {
		JFrame frm = new JFrame("����¼�ʹ��ʾ��");
		frm.setLayout(null);
		
		JLabel label = new JLabel("���ڴ����ڰ�ס���������϶����");
		label.setBounds(45, 5, 250, 25);
		frm.getContentPane().add(label);
		
		//�����ı������
		JTextField text = new JTextField(30);
		text.setBounds(45, 65, 300, 30);
		frm.getContentPane().add(text);
		
		//ע�������������Ϊ�¼������߶���
		MouseListenerImp mouse = new MouseListenerImp(text);
		frm.addMouseListener(mouse);
		frm.addMouseMotionListener(mouse);
		frm.addWindowListener(mouse);
		
		frm.setBounds(500, 250, 400, 200);
		frm.setVisible(true);
	}

}
