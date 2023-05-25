package mainpkg;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
		
		JLabel teamPanelLabel = new JLabel("Choose your team:");
		teamPanelLabel.setBounds(450, -50, 450, 250);
		teamPanelLabel.setFont(new Font("Serif Bold", Font.BOLD, 35));
		teamPanel.add(teamPanelLabel);
		
		ImageIcon barca_img = new ImageIcon(getClass().getResource("/mainpkg/barcaLogo.png"));
		JLabel barcaImgLabel = new JLabel(barca_img);
		barcaImgLabel.setBounds(7, 250, 297, 300);
		teamPanel.add(barcaImgLabel);
		
		JButton barcaButton = new JButton("F.C. Barcelona");
		barcaButton.setBounds(43, 600, 200, 25);
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
				
				ImageIcon img = new ImageIcon(getClass().getResource("/mainpkg/barcaLogo.png"));
				JLabel imgLabel = new JLabel(img);
				imgLabel.setBounds(100, 250, 297, 300);
				barcaPanel.add(imgLabel);
				
				JLabel barcaLogoText = new JLabel("F.C. Barcelona");
				barcaLogoText.setBounds(183, 440, 300, 300);
				barcaLogoText.setFont(new Font("Serif Bold", Font.BOLD, 20));
				barcaPanel.add(barcaLogoText);
				
				JLabel barcaManager = new JLabel("Manager: Xavi Hernandez");
				barcaManager.setBounds(109, -55, 400, 200);
				barcaManager.setFont(new Font("Serif Bold", Font.BOLD, 20));
				barcaPanel.add(barcaManager);
				
				ImageIcon xavi = new ImageIcon(getClass().getResource("/mainpkg/xavi.png"));
				JLabel xaviLabel = new JLabel(xavi);
				xaviLabel.setBounds(75, -25, 297, 300);
				barcaPanel.add(xaviLabel);
				
				ImageIcon lewandowski = new ImageIcon(getClass().getResource("/mainpkg/lewandowski.png"));
				JLabel lewiLabel = new JLabel(lewandowski);
				lewiLabel.setBounds(800, -45, 297, 300);
				barcaPanel.add(lewiLabel);
				
				ImageIcon torres = new ImageIcon(getClass().getResource("/mainpkg/torres.png"));
				JLabel torresLabel = new JLabel(torres);
				torresLabel.setBounds(550, -5, 297, 300);
				barcaPanel.add(torresLabel);
				
				ImageIcon raphinha = new ImageIcon(getClass().getResource("/mainpkg/raphinha.png"));
				JLabel raphiLabel = new JLabel(raphinha);
				raphiLabel.setBounds(1053, -5, 297, 300);
				barcaPanel.add(raphiLabel);
				
				ImageIcon gavi = new ImageIcon(getClass().getResource("/mainpkg/gavi.png"));
				JLabel gaviLabel = new JLabel(gavi);
				gaviLabel.setBounds(670, 160, 297, 300);
				barcaPanel.add(gaviLabel);
				
				ImageIcon frankie = new ImageIcon(getClass().getResource("/mainpkg/frankie.png"));
				JLabel frankieLabel = new JLabel(frankie);
				frankieLabel.setBounds(920, 160, 297, 300);
				barcaPanel.add(frankieLabel);
				
				ImageIcon busquets = new ImageIcon(getClass().getResource("/mainpkg/busquets.png"));
				JLabel busqLabel = new JLabel(busquets);
				busqLabel.setBounds(800, 255, 297, 300);
				barcaPanel.add(busqLabel);
				
				ImageIcon christ = new ImageIcon(getClass().getResource("/mainpkg/christensen.png"));
				JLabel christLabel = new JLabel(christ);
				christLabel.setBounds(670, 380, 297, 300);
				barcaPanel.add(christLabel);
				
				ImageIcon eric = new ImageIcon(getClass().getResource("/mainpkg/ericgarcia.png"));
				JLabel ericLabel = new JLabel(eric);
				ericLabel.setBounds(920, 380, 297, 300);
				barcaPanel.add(ericLabel);
				
				ImageIcon kounde = new ImageIcon(getClass().getResource("/mainpkg/kounde.png"));
				JLabel koundeLabel = new JLabel(kounde);
				koundeLabel.setBounds(1053, 320, 297, 300);
				barcaPanel.add(koundeLabel);
				
				ImageIcon alba = new ImageIcon(getClass().getResource("/mainpkg/alba.png"));
				JLabel albaLabel = new JLabel(alba);
				albaLabel.setBounds(550, 320, 297, 300);
				barcaPanel.add(albaLabel);
				
				ImageIcon ter = new ImageIcon(getClass().getResource("/mainpkg/terstegan.png"));
				JLabel terLabel = new JLabel(ter);
				terLabel.setBounds(800, 520, 297, 300);
				barcaPanel.add(terLabel);
				
				barcaFrame.setVisible(true);
				teamFrame.setVisible(false);
				frame.setVisible(false);
				
			}

			
		});
		//barcelona lineup
		
		
		JButton mancityButton = new JButton("Manchester City F.C.");
		mancityButton.setBounds(510, 600, 200, 25);
		teamPanel.add(mancityButton);
		
		ImageIcon mancityIcon = new ImageIcon(getClass().getResource("/mainpkg/mancityLogo.png"));
		JLabel mancityIconLabel = new JLabel(mancityIcon);
		mancityIconLabel.setBounds(473, 250, 297, 300);
		teamPanel.add(mancityIconLabel);
		
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
		rmdButton.setBounds(1050, 600, 200, 25);
		teamPanel.add(rmdButton);
		
		ImageIcon rmdIcon = new ImageIcon(getClass().getResource("/mainpkg/rmdLogo.png"));
		JLabel rmdIconLabel = new JLabel(rmdIcon);
		rmdIconLabel.setBounds(1000, 250, 297, 300);
		teamPanel.add(rmdIconLabel);
		
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
