import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GGVCS extends JFrame implements ActionListener{
	JRadioButton r1, r2, r3, r4, cr1,cr2,cr3,cr4,cr5;
	JButton buttonS1, buttonS2, c1, c2, a1, a2, finalb;
	JLabel labelS2, labelC1, labeld4;
	JComboBox movielist;
	JDialog d15, cancel, check, finish;
	JTextField tc;
	
	public GGVCS() {
		this.setLayout(new BorderLayout());
		
		//���� �ڹ� icon �ڸ��� ������ GGV ������ �����ϱ�
		ImageIcon icon = new ImageIcon("C:\\Users\\sandy\\OneDrive\\���� ȭ��\\�б�\\2020 3-1\\����\\���α׷���\\�ұԸ� GUI ���α׷� �����\\GGV.png");
		this.setIconImage(icon.getImage());
		
		this.setTitle("����Ȯ�νý���");
		this.setSize(500, 450);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//�ʿ��� ������� RGB ���� ���� �����
		Color cback = new Color(252,252,240); //�ణ ��������	
		Color cb = new Color(230,26,15); //������
		Color cbutton = new Color(62,58,59); //��ο� ȸ��
		
		//panelN ����
		JPanel panelN = new JPanel();
		panelN.setBackground(cback);
		JLabel labelN = new JLabel("��ȭ�� �����ϰ�, ���� �ο��� �������ּ���.");
		labelN.setFont(new Font("����", Font.BOLD, 17));  //�۾�ü�� ����, ũ�� ����
		
		panelN.add(labelN);
		
		//panelC ����
		JPanel panelC = new JPanel();
		panelC.setBackground(cback);
		
		//��ȭ ������ �����ڸ� �����
		ImageIcon image = new ImageIcon("C:\\Users\\sandy\\OneDrive\\���� ȭ��\\�б�\\2020 3-1\\����\\���α׷���\\�ұԸ� GUI ���α׷� �����\\GGV.png");
		labelC1 = new JLabel();
		labelC1.setIcon(image);
		
		//��ȭ ���� ����, combox �̿�
		String[] movies = {"--����--", "1917", "ħ����", "�ŵ�ƽ�-�г��ǵ���", "���"};
		movielist = new JComboBox(movies);
		movielist.setSelectedIndex(0);
		movielist.setBackground(cback);
		movielist.addActionListener(this);
		
		//��ȭ ���� �� ���� ������ ǥ���ϴ� â �����, dialog �̿�
		d15 = new JDialog(this, "�� 15�� �̻� ���� ���� ��ȭ", true);
		d15.setSize(410, 300);
		d15.setLocation(200, 200);
		d15.getContentPane().setBackground(cback);
		
		//�������� ǥ�� ���� �ֱ�
		JLabel labeld = new JLabel("<html>�� ��ȭ�� �� 15�� �̻� ���� ������ ��ȭ�Դϴ�.<br/>�� 15�� �̸� ���� �θ�� �Ǵ� �� 19�� �̻� ��ȣ�� ���� �� ������ �����մϴ�. ���� Ȯ�� �Ұ� �� ������ ���� �� �� �ֽ��ϴ�.</html>");
		labeld.setBackground(cback);
		d15.add(labeld);
		
		//���� �ο� ���� ����, radio button �̿�
		JLabel labelC2 = new JLabel("���� �ο��� �����ϼ���.");
		labelC2.setFont(new Font("����", Font.BOLD, 15));
		labelC2.setForeground(Color.white);
		labelC2.setOpaque(true);
		labelC2.setBackground(cbutton);
		
		r1 = new JRadioButton("1��");
		r1.addActionListener(this);
		r1.setForeground(Color.white);
		r1.setBackground(cbutton);
		
		r2 = new JRadioButton("2��");
		r2.addActionListener(this);
		r2.setForeground(Color.white);
		r2.setBackground(cbutton);
		
		r3 = new JRadioButton("3��");
		r3.addActionListener(this);
		r3.setForeground(Color.white);
		r3.setBackground(cbutton);
		
		r4 = new JRadioButton("4��");
		r4.addActionListener(this);
		r4.setForeground(Color.white);
		r4.setBackground(cbutton);
		
		//radio button �׷� ����
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
				
		panelC.add(labelC1);
		panelC.add(movielist);
		panelC.add(labelC2);
		panelC.add(r1);
		panelC.add(r2);
		panelC.add(r3);
		panelC.add(r4);
		
		//panelS ����
		JPanel panelS = new JPanel();
		panelS.setBackground(cback); 
		
				
		JLabel labelS1 = new JLabel("�հ� �ݾ� : ");
		//labelS1���� ũ��, ���ڻ�, ���� ����
		labelS1.setFont(new Font("����", Font.BOLD, 17));
		labelS1.setForeground(Color.white);
		labelS1.setOpaque(true);
		labelS1.setBackground(cb);
		
		labelS2 = new JLabel("0 ��");
		labelS2.setFont(new Font("����", Font.BOLD, 17)); //�۾�ü�� ����, ũ�� ����
		
		//buttonS1 ������ ��ư�� ����� ��Ʈ ���� �ٲٱ�
		buttonS1 = new JButton("��������");
		buttonS1.addActionListener(this);
		buttonS1.setForeground(Color.white);
		buttonS1.setBackground(cbutton);
		
		//���� ���� â �����, dialog �̿�
		check = new JDialog(this, "���� ����", true);
		check.setSize(345, 300);
		check.setLocation(200, 200);
						
		//��� Ȯ�� ������ �������, ��� ���� ��ư �ֱ�
		JPanel paneld2 = new JPanel();
		paneld2.setBackground(cback);
		
		JLabel labeld3 = new JLabel("���� ������ �����Ͽ� �ּ���.");
		labeld3.setBackground(cback);
				
		a1 = new JButton("�ſ� / üũ ī�� ����");
		a1.addActionListener(this);
		a1.setForeground(Color.white);
		a1.setBackground(cbutton);
		
		//ī�� ���� ����, radiobutton �̿�
		cr1 = new JRadioButton("����");
		cr1.setBackground(cback);
		cr1.hide();
		
		cr2 = new JRadioButton("BC");
		cr2.setBackground(cback);
		cr2.hide();
		
		cr3 = new JRadioButton("�Ｚ");
		cr3.setBackground(cback);
		cr3.hide();
		
		cr4 = new JRadioButton("����");
		cr4.setBackground(cback);
		cr4.hide();
		
		cr5 = new JRadioButton("�츮");
		cr5.setBackground(cback);
		cr5.hide();
		
		ButtonGroup cr = new ButtonGroup();
		cr.add(cr1);
		cr.add(cr2);
		cr.add(cr3);
		cr.add(cr4);
		cr.add(cr5);
	
		a2 = new JButton("����Ƽ�� �� ��ȭ ����");
		a2.addActionListener(this);
		a2.setForeground(Color.white);
		a2.setBackground(cbutton);
		
		//����Ƽ�� �� ��ȭ ���� ��ȣ �Է�â ����, textfield �̿�
		labeld4 = new JLabel("���� ��ȣ�� �Է��ϼ���.(������(-) ����)");
		labeld4.hide();
		tc = new JTextField(" ", 30);
		tc.hide();
		
		//������ ���� ���� ��ư ����, JButton �̿�
		finalb = new JButton("Ȯ��");
		finalb.addActionListener(this);
		finalb.setForeground(Color.white);
		finalb.setBackground(cbutton);
		
		paneld2.add(labeld3);
		paneld2.add(a1);
		paneld2.add(a2);
		paneld2.add(cr1);
		paneld2.add(cr2);
		paneld2.add(cr3);
		paneld2.add(cr4);
		paneld2.add(cr5);
		paneld2.add(labeld4);
		paneld2.add(tc);
		paneld2.add(finalb);
				
		check.add(paneld2);
		
		//���� �Ϸ� â �����, dialog �̿�
		finish = new JDialog(this, "���� �Ϸ�", true);
		finish.setSize(470, 270);
		finish.setLocation(200, 200);
								
		//�Ϸ� ������ GGV ������ �ֱ�
		JPanel paneld3 = new JPanel();
		paneld3.setBackground(cback);
		
		JLabel label5 = new JLabel("<html>������ �Ϸ�Ǿ����ϴ�.<br/>�̿����ּż� �����մϴ�.</html>");
		
		ImageIcon ggv = new ImageIcon("C:\\Users\\sandy\\OneDrive\\���� ȭ��\\�б�\\2020 3-1\\����\\���α׷���\\�ұԸ� GUI ���α׷� �����\\GGV.png");
		label5.setIcon(ggv);
		
		paneld3.add(label5);
		
		finish.add(paneld3);
		
		//buttonS1, buttonS2 ������ ��ư�� ����� ��Ʈ ���� �ٲٱ�
		buttonS2 = new JButton("���� ���");
		buttonS2.addActionListener(this);
		buttonS2.setForeground(Color.white);
		buttonS2.setBackground(cbutton);
		
		//���� ��� ���� �� ��ҿ��� ����� â �����, dialog �̿�
		cancel = new JDialog(this, "��ü ���", true);
		cancel.setSize(300, 150);
		cancel.setLocation(200, 200);
				
		//��� Ȯ�� ������ �������, ��� ���� ��ư �ֱ�
		JPanel paneld1 = new JPanel();
		paneld1.setBackground(cback);
		JLabel labeld2 = new JLabel("<html>���� ��Ҹ� ������ ���� ������ ��ҵ˴ϴ�.<br/>������ ����Ͻðڽ��ϱ�?</html>");
		labeld2.setBackground(cback);
		
		c1 = new JButton("��");
		c1.addActionListener(this);
		c1.setForeground(Color.white);
		c1.setBackground(cbutton);
		
		c2 = new JButton("�ƴϿ�");
		c2.addActionListener(this);
		c2.setForeground(Color.white);
		c2.setBackground(cbutton);
		
		paneld1.add(labeld2);
		paneld1.add(c1);
		paneld1.add(c2);
		
		cancel.add(paneld1);
		
		panelS.add(labelS1);
		panelS.add(labelS2);
		panelS.add(buttonS1);
		panelS.add(buttonS2);
		
		this.add(panelN, BorderLayout.NORTH);
		this.add(panelC, BorderLayout.CENTER);
		this.add(panelS, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GGVCS cs = new GGVCS();
	}
	
	public void actionPerformed(ActionEvent e) {
		int sum = 0;
		String filename;
		
		if(e.getSource().equals(movielist)) {	
			JComboBox cb = (JComboBox) e.getSource();
			filename = (String) cb.getSelectedItem();
			ImageIcon icon = new ImageIcon("C:\\Users\\sandy\\OneDrive\\���� ȭ��\\�б�\\2020 3-1\\����\\���α׷���\\�ұԸ� GUI ���α׷� �����\\" + filename + ".jpg");
			labelC1.setIcon(icon);
			
			d15.setVisible(true);
			d15.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		}else if(e.getSource() == buttonS2) {
			cancel.setVisible(true);
			cancel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);	
		}else if(e.getSource() == c1) {
			System.exit(0);
		}else if(e.getSource() == c2) {
			cancel.setVisible(false);
		}else if(e.getSource() == r1) {
			labelS2.setText("7000 ��");
			sum += 7000;
			System.out.println("���� �ݾ� : " + sum + "��");
		}else if(e.getSource() == r2) {
			labelS2.setText("14000 ��");
			sum += 14000;
			System.out.println("���� �ݾ� : " + sum + "��");
		}else if(e.getSource() == r3) {
			labelS2.setText("21000 ��");
			sum += 21000;
			System.out.println("���� �ݾ� : " + sum + "��");
		}else if(e.getSource() == r4) {
			labelS2.setText("28000 ��");
			sum += 28000;
			System.out.println("���� �ݾ� : " + sum + "��");
		}else if(e.getSource() == buttonS1) {			
			check.setVisible(true);
			check.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		}else if(e.getSource() == a1) {
			cr1.setVisible(true);
			cr2.setVisible(true);
			cr3.setVisible(true);
			cr4.setVisible(true);
			cr5.setVisible(true);
		}else if(e.getSource() == a2) {
			labeld4.setVisible(true);
			tc.setVisible(true);
		}else if(e.getSource() == finalb) {
			finish.setVisible(true);
			System.exit(0);
		}
	}
}