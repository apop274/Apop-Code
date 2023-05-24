package mainpkg;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class barcelona implements ActionListener{
	
	private static JPanel panel;
	private static JFrame frame;
	private static Color menuCol;
	private static JButton startButton;
	private static JLabel menuLabel;
	private static JLabel nameLabel;

	public static void main(String[] args) {
		
		menuCol = new Color(176, 83, 92);

		panel = new JPanel();
		frame = new JFrame();
		
		frame.setSize(1300, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		panel.setBackground(menuCol);
		
		startButton = new JButton("Start");
		startButton.setBounds(562, 500, 80, 25);
		startButton.addActionListener(new barcelona());
		panel.add(startButton);
		
		
		menuLabel = new JLabel("Football Statistics");
		menuLabel.setBounds(483, 20, 300, 70);
		menuLabel.setFont(new Font("Serif", Font.PLAIN, 40));
		panel.add(menuLabel);
		
		nameLabel = new JLabel("Aleksandr Khachatryan");
		nameLabel.setBounds(1133, 730, 140, 20);
		panel.add(nameLabel);
		
		frame.setVisible(true);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JFrame teamFrame = new JFrame();
		JPanel teamPanel = new JPanel();
		
		teamFrame.setSize(1300, 800);
		teamFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		teamFrame.add(teamPanel);
		
		teamPanel.setLayout(null);
		teamPanel.setBackground(Color.blue);
		
		JButton barcaButton = new JButton("F.C. Barcelona");
		barcaButton.setBounds(12, 500, 200, 25);
		teamPanel.add(barcaButton);
		
		//barcelona lineup
		barcaButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame barcaFrame = new JFrame();
				JPanel barcaPanel = new JPanel();
				Color barcaPanelColor = new Color(228, 15, 15);
				
				barcaFrame.setSize(1300, 800);
				barcaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				barcaFrame.add(barcaPanel);
				barcaPanel.setLayout(null);
				barcaPanel.setBackground(barcaPanelColor);
				
				barcaFrame.setVisible(true);
				teamFrame.setVisible(false);
				frame.setVisible(false);
				
				
				
			}
		});
		//barcelona lineup
		
		
		JButton mancityButton = new JButton("Manchester City F.C.");
		mancityButton.setBounds(510, 500, 200, 25);
		teamPanel.add(mancityButton);
		
		//mancity lineup
		mancityButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame mancityFrame = new JFrame();
				JPanel mancityPanel = new JPanel();
				Color mancityPanelColor = new Color(19, 190, 232);
				mancityFrame.setSize(1300, 800);
				mancityFrame.add(mancityPanel);
				mancityFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				mancityPanel.setLayout(null);
				mancityPanel.setBackground(mancityPanelColor);
				
				
				mancityFrame.setVisible(true);
				frame.setVisible(false);
				teamFrame.setVisible(false);
			}
			
		});
		//mancity lineup
		
		JButton rmdButton = new JButton("Real Madrid C.F.");
		rmdButton.setBounds(1050, 500, 200, 25);
		teamPanel.add(rmdButton);
		
		//real madrid lineup
		rmdButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame rmdFrame = new JFrame();
				JPanel rmdPanel = new JPanel();
				Color rmdPanelColor = new Color(231, 241, 180);
				rmdFrame.setSize(1300, 800);
				rmdFrame.add(rmdPanel);
				rmdFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				rmdPanel.setLayout(null);
				rmdPanel.setBackground(rmdPanelColor);
				
				
				rmdFrame.setVisible(true);
				frame.setVisible(false);
				teamFrame.setVisible(false);
				
			}
		});
		//real madrid lineup
		
		teamFrame.setVisible(true);
	}
	
}
