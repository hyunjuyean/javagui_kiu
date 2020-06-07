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
		
		//원래 자바 icon 자리에 제작한 GGV 아이콘 삽입하기
		ImageIcon icon = new ImageIcon("C:\\Users\\sandy\\OneDrive\\바탕 화면\\학교\\2020 3-1\\과제\\프로그래밍\\소규모 GUI 프로그램 만들기\\GGV.png");
		this.setIconImage(icon.getImage());
		
		this.setTitle("예매확인시스템");
		this.setSize(500, 450);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//필요한 색상들을 RGB 값을 통해 만들기
		Color cback = new Color(252,252,240); //약간 베이지색	
		Color cb = new Color(230,26,15); //빨간색
		Color cbutton = new Color(62,58,59); //어두운 회색
		
		//panelN 생성
		JPanel panelN = new JPanel();
		panelN.setBackground(cback);
		JLabel labelN = new JLabel("영화를 선택하고, 관람 인원을 선택해주세요.");
		labelN.setFont(new Font("돋움", Font.BOLD, 17));  //글씨체랑 굵기, 크기 설정
		
		panelN.add(labelN);
		
		//panelC 생성
		JPanel panelC = new JPanel();
		panelC.setBackground(cback);
		
		//영화 포스터 삽입자리 만들기
		ImageIcon image = new ImageIcon("C:\\Users\\sandy\\OneDrive\\바탕 화면\\학교\\2020 3-1\\과제\\프로그래밍\\소규모 GUI 프로그램 만들기\\GGV.png");
		labelC1 = new JLabel();
		labelC1.setIcon(image);
		
		//영화 선택 삽입, combox 이용
		String[] movies = {"--없음--", "1917", "침입자", "매드맥스-분노의도로", "결백"};
		movielist = new JComboBox(movies);
		movielist.setSelectedIndex(0);
		movielist.setBackground(cback);
		movielist.addActionListener(this);
		
		//영화 선택 시 나이 제한을 표시하는 창 만들기, dialog 이용
		d15 = new JDialog(this, "만 15세 이상 관람 가능 영화", true);
		d15.setSize(410, 300);
		d15.setLocation(200, 200);
		d15.getContentPane().setBackground(cback);
		
		//나이제한 표시 문구 넣기
		JLabel labeld = new JLabel("<html>본 영화는 만 15세 이상 관람 가능한 영화입니다.<br/>만 15세 미만 고객은 부모님 또는 만 19세 이상 보호자 동반 시 관람이 가능합니다. 연령 확인 불가 시 입장이 제한 될 수 있습니다.</html>");
		labeld.setBackground(cback);
		d15.add(labeld);
		
		//관람 인원 선택 삽입, radio button 이용
		JLabel labelC2 = new JLabel("관람 인원을 선택하세요.");
		labelC2.setFont(new Font("돋움", Font.BOLD, 15));
		labelC2.setForeground(Color.white);
		labelC2.setOpaque(true);
		labelC2.setBackground(cbutton);
		
		r1 = new JRadioButton("1명");
		r1.addActionListener(this);
		r1.setForeground(Color.white);
		r1.setBackground(cbutton);
		
		r2 = new JRadioButton("2명");
		r2.addActionListener(this);
		r2.setForeground(Color.white);
		r2.setBackground(cbutton);
		
		r3 = new JRadioButton("3명");
		r3.addActionListener(this);
		r3.setForeground(Color.white);
		r3.setBackground(cbutton);
		
		r4 = new JRadioButton("4명");
		r4.addActionListener(this);
		r4.setForeground(Color.white);
		r4.setBackground(cbutton);
		
		//radio button 그룹 생성
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
		
		//panelS 생성
		JPanel panelS = new JPanel();
		panelS.setBackground(cback); 
		
				
		JLabel labelS1 = new JLabel("합계 금액 : ");
		//labelS1글자 크기, 글자색, 배경색 설정
		labelS1.setFont(new Font("돋움", Font.BOLD, 17));
		labelS1.setForeground(Color.white);
		labelS1.setOpaque(true);
		labelS1.setBackground(cb);
		
		labelS2 = new JLabel("0 원");
		labelS2.setFont(new Font("돋움", Font.BOLD, 17)); //글씨체랑 굵기, 크기 설정
		
		//buttonS1 생성후 버튼의 색깔과 폰트 색깔 바꾸기
		buttonS1 = new JButton("결제진행");
		buttonS1.addActionListener(this);
		buttonS1.setForeground(Color.white);
		buttonS1.setBackground(cbutton);
		
		//결제 진행 창 만들기, dialog 이용
		check = new JDialog(this, "결제 진행", true);
		check.setSize(345, 300);
		check.setLocation(200, 200);
						
		//취소 확인 문구와 취소진행, 취소 중지 버튼 넣기
		JPanel paneld2 = new JPanel();
		paneld2.setBackground(cback);
		
		JLabel labeld3 = new JLabel("결제 수단을 선택하여 주세요.");
		labeld3.setBackground(cback);
				
		a1 = new JButton("신용 / 체크 카드 결제");
		a1.addActionListener(this);
		a1.setForeground(Color.white);
		a1.setBackground(cbutton);
		
		//카드 선택 삽입, radiobutton 이용
		cr1 = new JRadioButton("농협");
		cr1.setBackground(cback);
		cr1.hide();
		
		cr2 = new JRadioButton("BC");
		cr2.setBackground(cback);
		cr2.hide();
		
		cr3 = new JRadioButton("삼성");
		cr3.setBackground(cback);
		cr3.hide();
		
		cr4 = new JRadioButton("현대");
		cr4.setBackground(cback);
		cr4.hide();
		
		cr5 = new JRadioButton("우리");
		cr5.setBackground(cback);
		cr5.hide();
		
		ButtonGroup cr = new ButtonGroup();
		cr.add(cr1);
		cr.add(cr2);
		cr.add(cr3);
		cr.add(cr4);
		cr.add(cr5);
	
		a2 = new JButton("기프티콘 및 영화 쿠폰");
		a2.addActionListener(this);
		a2.setForeground(Color.white);
		a2.setBackground(cbutton);
		
		//기프티콘 및 영화 쿠폰 번호 입력창 삽입, textfield 이용
		labeld4 = new JLabel("쿠폰 번호를 입력하세요.(하이픈(-) 제외)");
		labeld4.hide();
		tc = new JTextField(" ", 30);
		tc.hide();
		
		//마지막 결제 진행 버튼 삽입, JButton 이용
		finalb = new JButton("확인");
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
		
		//결제 완료 창 만들기, dialog 이용
		finish = new JDialog(this, "결제 완료", true);
		finish.setSize(470, 270);
		finish.setLocation(200, 200);
								
		//완료 문구와 GGV 아이콘 넣기
		JPanel paneld3 = new JPanel();
		paneld3.setBackground(cback);
		
		JLabel label5 = new JLabel("<html>결제가 완료되었습니다.<br/>이용해주셔서 감사합니다.</html>");
		
		ImageIcon ggv = new ImageIcon("C:\\Users\\sandy\\OneDrive\\바탕 화면\\학교\\2020 3-1\\과제\\프로그래밍\\소규모 GUI 프로그램 만들기\\GGV.png");
		label5.setIcon(ggv);
		
		paneld3.add(label5);
		
		finish.add(paneld3);
		
		//buttonS1, buttonS2 생성후 버튼의 색깔과 폰트 색깔 바꾸기
		buttonS2 = new JButton("결제 취소");
		buttonS2.addActionListener(this);
		buttonS2.setForeground(Color.white);
		buttonS2.setBackground(cbutton);
		
		//결제 취소 선택 시 취소여부 물어보는 창 만들기, dialog 이용
		cancel = new JDialog(this, "결체 취소", true);
		cancel.setSize(300, 150);
		cancel.setLocation(200, 200);
				
		//취소 확인 문구와 취소진행, 취소 중지 버튼 넣기
		JPanel paneld1 = new JPanel();
		paneld1.setBackground(cback);
		JLabel labeld2 = new JLabel("<html>결제 취소를 누르면 결제 진행이 취소됩니다.<br/>결제를 취소하시겠습니까?</html>");
		labeld2.setBackground(cback);
		
		c1 = new JButton("예");
		c1.addActionListener(this);
		c1.setForeground(Color.white);
		c1.setBackground(cbutton);
		
		c2 = new JButton("아니오");
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
			ImageIcon icon = new ImageIcon("C:\\Users\\sandy\\OneDrive\\바탕 화면\\학교\\2020 3-1\\과제\\프로그래밍\\소규모 GUI 프로그램 만들기\\" + filename + ".jpg");
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
			labelS2.setText("7000 원");
			sum += 7000;
			System.out.println("결제 금액 : " + sum + "원");
		}else if(e.getSource() == r2) {
			labelS2.setText("14000 원");
			sum += 14000;
			System.out.println("결제 금액 : " + sum + "원");
		}else if(e.getSource() == r3) {
			labelS2.setText("21000 원");
			sum += 21000;
			System.out.println("결제 금액 : " + sum + "원");
		}else if(e.getSource() == r4) {
			labelS2.setText("28000 원");
			sum += 28000;
			System.out.println("결제 금액 : " + sum + "원");
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