package mainPkg;
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
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
	
		
	/*	ImageIcon menuImg = new ImageIcon("/mainPkg/championsleague.png");
		JLabel menuImgLabel = new JLabel(menuImg);
		menuImgLabel.setBounds(10, 10, 200, 200);
		panel.add(menuImgLabel);		*/
		
		JLabel newNameLabel = new JLabel("  Author: Aleksandr Khachatryan");
		newNameLabel.setBounds(290, 20, 1000, 400);
		newNameLabel.setFont(new Font("Serif Bold", Font.BOLD, 40));
		panel.add(newNameLabel);
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JFrame teamFrame = new JFrame();
		JPanel teamPanel = new JPanel();
		
		teamFrame.setSize(1300, 800);
		//teamFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		teamFrame.add(teamPanel);
		
		teamPanel.setLayout(null);
		teamPanel.setBackground(Color.blue);
		
		JLabel teamPanelLabel = new JLabel("Choose your team:");
		teamPanelLabel.setBounds(450, -50, 450, 250);
		teamPanelLabel.setFont(new Font("Serif Bold", Font.BOLD, 35));
		teamPanel.add(teamPanelLabel);
		
		ImageIcon barca_img = new ImageIcon(getClass().getResource("/mainPkg/barcaLogo.png"));
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
			
				barcaFrame.add(barcaPanel);
				barcaPanel.setLayout(null);
				barcaPanel.setBackground(barcaPanelColor);
				
				ImageIcon img = new ImageIcon(getClass().getResource("/mainPkg/barcaLogo.png"));
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
				
				ImageIcon xavi = new ImageIcon(getClass().getResource("/mainPkg/xavi.png"));
				JLabel xaviLabel = new JLabel(xavi);
				xaviLabel.setBounds(75, -25, 297, 300);
				barcaPanel.add(xaviLabel);
				
				ImageIcon lewandowski = new ImageIcon(getClass().getResource("/mainPkg/lewandowski.png"));
				JLabel lewiLabel = new JLabel(lewandowski);
				lewiLabel.setBounds(800, -45, 297, 300);
				barcaPanel.add(lewiLabel);
				
				//lewandowski stats
				JButton lewiButton = new JButton("Lewandowski");
				lewiButton.setBounds(910, 167, 80, 20);
				barcaPanel.add(lewiButton);
				lewiButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JFrame lewiFrame = new JFrame();
						JPanel lewiPanel = new JPanel();
						
						lewiFrame.setSize(600, 200);
						lewiFrame.add(lewiPanel);
						lewiPanel.setLayout(null);
						
						JLabel lewiNameLabel = new JLabel("Robert Lewandowski");
						lewiNameLabel.setBounds(20, 10, 300, 35);
						lewiPanel.add(lewiNameLabel);
						
						JLabel lewiGoals = new JLabel("Goals:     29     "
								+ "     Assists:     8     " + "     Appearances:     34     ");
						lewiGoals.setBounds(22, 60, 700, 45);
						lewiPanel.add(lewiGoals);
						
						
						lewiFrame.setVisible(true);
					}
				});
				
				ImageIcon torres = new ImageIcon(getClass().getResource("/mainPkg/torres.png"));
				JLabel torresLabel = new JLabel(torres);
				torresLabel.setBounds(550, -5, 297, 300);
				barcaPanel.add(torresLabel);
				
				JButton torresButton = new JButton("Torres");
				torresButton.setBounds(660, 204, 80, 20);
				barcaPanel.add(torresButton);
				//torres stats
				torresButton.addActionListener(new ActionListener() {
					
					@Override public void actionPerformed(ActionEvent e) {
						JFrame torresFrame = new JFrame();
						JPanel torresPanel = new JPanel();
						
						torresFrame.setSize(600, 200);
						
						torresFrame.add(torresPanel);
						torresPanel.setLayout(null);
						
						JLabel torresNameLabel = new JLabel("Ferran Torres");
						torresNameLabel.setBounds(20, 10, 300, 35);
						torresPanel.add(torresNameLabel);
						
						JLabel torresGoals = new JLabel("Goals:     9     "
								+ "     Assists:     8     " + "     Appearances:     28     ");
						torresGoals.setBounds(22, 60, 700, 45);
						torresPanel.add(torresGoals);
						
						
						torresFrame.setVisible(true);
						
					}
				});
				
				
				ImageIcon raphinha = new ImageIcon(getClass().getResource("/mainPkg/raphinha.png"));
				JLabel raphiLabel = new JLabel(raphinha);
				raphiLabel.setBounds(1053, -5, 297, 300);
				barcaPanel.add(raphiLabel);
				
				
				JButton raphButton = new JButton("Raphinha");
				raphButton.setBounds(1160, 204, 80, 20);
				barcaPanel.add(raphButton);
				raphButton.addActionListener(new ActionListener() {
					
					@Override public void actionPerformed(ActionEvent e) {
						JFrame raphFrame = new JFrame();
						JPanel raphPanel = new JPanel();
						
						raphFrame.setSize(600, 200);
						raphFrame.add(raphPanel);
						raphPanel.setLayout(null);
						
						JLabel raphNameLabel = new JLabel("Raphinha");
						raphNameLabel.setBounds(20, 10, 300, 35);
						raphPanel.add(raphNameLabel);
						
						JLabel raphGoals = new JLabel("Goals:     14     "
								+ "     Assists:     11     " + "     Appearances:     30     ");
						raphGoals.setBounds(22, 60, 700, 45);
						raphPanel.add(raphGoals);
						
						
						raphFrame.setVisible(true);
						
					}
				});
				
				
				ImageIcon gavi = new ImageIcon(getClass().getResource("/mainPkg/gavi.png"));
				JLabel gaviLabel = new JLabel(gavi);
				gaviLabel.setBounds(670, 160, 297, 300);
				barcaPanel.add(gaviLabel);
				

				JButton gaviButton = new JButton("Gavi");
				gaviButton.setBounds(779, 364, 80, 20);
				barcaPanel.add(gaviButton);
				//gavi stats
				gaviButton.addActionListener(new ActionListener() {
					
					@Override public void actionPerformed(ActionEvent e) {
						JFrame gaviFrame = new JFrame();
						JPanel gaviPanel = new JPanel();
						
						gaviFrame.setSize(600, 200);
						
						gaviFrame.add(gaviPanel);
						gaviPanel.setLayout(null);
						
						JLabel gaviNameLabel = new JLabel("Gavi");
						gaviNameLabel.setBounds(20, 10, 300, 35);
						gaviPanel.add(gaviNameLabel);
						
						JLabel gaviGoals = new JLabel("Goals:     8     "
								+ "     Assists:     10     " + "     Appearances:     34     ");
						gaviGoals.setBounds(22, 60, 700, 45);
						gaviPanel.add(gaviGoals);
						
						
						gaviFrame.setVisible(true);
						
					}
				});
				
				
				ImageIcon frankie = new ImageIcon(getClass().getResource("/mainPkg/frankie.png"));
				JLabel frankieLabel = new JLabel(frankie);
				frankieLabel.setBounds(920, 160, 297, 300);
				barcaPanel.add(frankieLabel);
				
				JButton frankieButton = new JButton("Frankie");
				frankieButton.setBounds(1030, 364, 80, 20);
				barcaPanel.add(frankieButton);
				//frankie stats
				frankieButton.addActionListener(new ActionListener() {
					
					@Override public void actionPerformed(ActionEvent e) {
						JFrame frankieFrame = new JFrame();
						JPanel frankiePanel = new JPanel();
						
						frankieFrame.setSize(600, 200);
						
						frankieFrame.add(frankiePanel);
						frankiePanel.setLayout(null);
						
						JLabel frankieNameLabel = new JLabel("Frankie De Jong");
						frankieNameLabel.setBounds(20, 10, 300, 35);
						frankiePanel.add(frankieNameLabel);
						
						JLabel frankieGoals = new JLabel("Goals:     5     "
								+ "     Assists:     8   " + "     Appearances:     27     ");
						frankieGoals.setBounds(22, 60, 700, 45);
						frankiePanel.add(frankieGoals);
						
						
						frankieFrame.setVisible(true);
						
					}
				});
				
				ImageIcon busquets = new ImageIcon(getClass().getResource("/mainPkg/busquets.png"));
				JLabel busqLabel = new JLabel(busquets);
				busqLabel.setBounds(800, 255, 297, 300);
				barcaPanel.add(busqLabel);
				
				JButton busqButton = new JButton("Busquets");
				busqButton.setBounds(910, 460, 80, 20);
				barcaPanel.add(busqButton);
				busqButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JFrame busqFrame = new JFrame();
						JPanel busqPanel = new JPanel();
						
						busqFrame.setSize(600, 200);
						busqFrame.add(busqPanel);
						busqPanel.setLayout(null);
						
						JLabel busqNameLabel = new JLabel("Sergio Busquets");
						busqNameLabel.setBounds(20, 10, 300, 35);
						busqPanel.add(busqNameLabel);
						
						JLabel busqGoals = new JLabel("Goals:     1     "
								+ "     Assists:     12     " + "     Appearances:     36     ");
						busqGoals.setBounds(22, 60, 700, 45);
						busqPanel.add(busqGoals);
						
						
						busqFrame.setVisible(true);
					}
				});
				
				ImageIcon christ = new ImageIcon(getClass().getResource("/mainPkg/christensen.png"));
				JLabel christLabel = new JLabel(christ);
				christLabel.setBounds(670, 380, 297, 300);
				barcaPanel.add(christLabel);
				
				JButton christButton = new JButton("Christensen");
				christButton.setBounds(779, 577, 80, 20);
				barcaPanel.add(christButton);
				//christensen stats
				christButton.addActionListener(new ActionListener() {
					
					@Override public void actionPerformed(ActionEvent e) {
						JFrame christFrame = new JFrame();
						JPanel christPanel = new JPanel();
						
						christFrame.setSize(600, 200);
						
						christFrame.add(christPanel);
						christPanel.setLayout(null);
						
						JLabel christNameLabel = new JLabel("Andreas Christensen");
						christNameLabel.setBounds(20, 10, 300, 35);
						christPanel.add(christNameLabel);
						
						JLabel christGoals = new JLabel("Goals:     2     "
								+ "     Assists:     1   " + "     Appearances:     22     ");
						christGoals.setBounds(22, 60, 700, 45);
						christPanel.add(christGoals);
						
						
						christFrame.setVisible(true);
						
					}
				});
				
				ImageIcon eric = new ImageIcon(getClass().getResource("/mainPkg/ericgarcia.png"));
				JLabel ericLabel = new JLabel(eric);
				ericLabel.setBounds(920, 380, 297, 300);
				barcaPanel.add(ericLabel);
				
				JButton ericButton = new JButton("Eric Garcia");
				ericButton.setBounds(1030, 577, 80, 20);
				barcaPanel.add(ericButton);
				//eric garcia stats
				ericButton.addActionListener(new ActionListener() {
					
					@Override public void actionPerformed(ActionEvent e) {
						JFrame ericFrame = new JFrame();
						JPanel ericPanel = new JPanel();
						
						ericFrame.setSize(600, 200);
						
						ericFrame.add(ericPanel);
						ericPanel.setLayout(null);
						
						JLabel ericNameLabel = new JLabel("Eric Garcia");
						ericNameLabel.setBounds(20, 10, 300, 35);
						ericPanel.add(ericNameLabel);
						
						JLabel ericGoals = new JLabel("Goals:     1     "
								+ "     Assists:     1   " + "     Appearances:     20     ");
						ericGoals.setBounds(22, 60, 700, 45);
						ericPanel.add(ericGoals);
						
						
						ericFrame.setVisible(true);
						
					}
				});
				
				ImageIcon kounde = new ImageIcon(getClass().getResource("/mainPkg/kounde.png"));
				JLabel koundeLabel = new JLabel(kounde);
				koundeLabel.setBounds(1053, 320, 297, 300);
				barcaPanel.add(koundeLabel);
				
				JButton koundeButton = new JButton("Kounde");
				koundeButton.setBounds(1163, 524, 80, 20);
				barcaPanel.add(koundeButton);
				koundeButton.addActionListener(new ActionListener() {
					
					@Override public void actionPerformed(ActionEvent e) {
						JFrame koundeFrame = new JFrame();
						JPanel koundePanel = new JPanel();
						
						koundeFrame.setSize(600, 200);
						
						
						koundeFrame.add(koundePanel);
						koundePanel.setLayout(null);
						
						JLabel koundeNameLabel = new JLabel("Kounde");
						koundeNameLabel.setBounds(20, 10, 300, 35);
						koundePanel.add(koundeNameLabel);
						
						JLabel koundeGoals = new JLabel("Goals:     3     "
								+ "     Assists:     6     " + "     Appearances:     24     ");
						koundeGoals.setBounds(22, 60, 700, 45);
						koundePanel.add(koundeGoals);
		
						koundeFrame.setVisible(true);
						
					}
				});
				
				ImageIcon alba = new ImageIcon(getClass().getResource("/mainPkg/alba.png"));
				JLabel albaLabel = new JLabel(alba);
				albaLabel.setBounds(550, 320, 297, 300);
				barcaPanel.add(albaLabel);
				
				JButton albaButton = new JButton("Alba");
				albaButton.setBounds(660, 524, 80, 20);
				barcaPanel.add(albaButton);
				albaButton.addActionListener(new ActionListener() {
					
					@Override public void actionPerformed(ActionEvent e) {
						JFrame albaFrame = new JFrame();
						JPanel albaPanel = new JPanel();
						
						albaFrame.setSize(600, 200);
						
						albaFrame.add(albaPanel);
						albaPanel.setLayout(null);
						
						JLabel albaNameLabel = new JLabel("Jordi Alba");
						albaNameLabel.setBounds(20, 10, 300, 35);
						albaPanel.add(albaNameLabel);
						
						JLabel albaGoals = new JLabel("Goals:     5     "
								+ "     Assists:     11     " + "     Appearances:     27     ");
						albaGoals.setBounds(22, 60, 700, 45);
						albaPanel.add(albaGoals);
		
						albaFrame.setVisible(true);
						
					}
				});
				
				ImageIcon ter = new ImageIcon(getClass().getResource("/mainPkg/terstegan.png"));
				JLabel terLabel = new JLabel(ter);
				terLabel.setBounds(800, 520, 297, 300);
				barcaPanel.add(terLabel);
				
				JButton terButton = new JButton("Ter Stegan");
				terButton.setBounds(910, 723, 80, 20);
				barcaPanel.add(terButton);
				terButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JFrame terFrame = new JFrame();
						JPanel terPanel = new JPanel();
						
						terFrame.setSize(600, 200);
						terFrame.add(terPanel);
						terPanel.setLayout(null);
						
						JLabel terNameLabel = new JLabel("Andre Ter Stegan");
						terNameLabel.setBounds(20, 10, 300, 35);
						terPanel.add(terNameLabel);
						
						JLabel terGoals = new JLabel("Goals Against:     27     "
								 + "     Appearances:     36     ");
						terGoals.setBounds(22, 60, 700, 45);
						terPanel.add(terGoals);
						
						
						terFrame.setVisible(true);
					}
				});
				
				barcaFrame.setVisible(true);
			//	teamFrame.setVisible(false);
			//	frame.setVisible(false);
				
			}

			
		});
		//barcelona lineup
		
		
		JButton mancityButton = new JButton("Manchester City F.C.");
		mancityButton.setBounds(510, 600, 200, 25);
		teamPanel.add(mancityButton);
		
		ImageIcon mancityIcon = new ImageIcon(getClass().getResource("/mainPkg/mancityLogo.png"));
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
			//	mancityFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				mancityPanel.setLayout(null);
				mancityPanel.setBackground(mancityPanelColor);
				
				JLabel mcs = new JLabel("Coming Soon...");
				mcs.setBounds(500, 150, 500, 500);
				mcs.setFont(new Font("Serif Bold", Font.BOLD, 45));
				mancityPanel.add(mcs);
				
				
				mancityFrame.setVisible(true);

				
				
				
				frame.setVisible(false);
				teamFrame.setVisible(false);
			}
			
		});
		//mancity lineup
		
		JButton rmdButton = new JButton("Real Madrid C.F.");
		rmdButton.setBounds(1050, 600, 200, 25);
		teamPanel.add(rmdButton);
		
		ImageIcon rmdIcon = new ImageIcon(getClass().getResource("/mainPkg/rmdLogo.png"));
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
		//		rmdFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				rmdPanel.setLayout(null);
				rmdPanel.setBackground(rmdPanelColor);
				
				JLabel rcs = new JLabel("Coming Soon...");
				rcs.setBounds(500, 150, 500, 500);
				rcs.setFont(new Font("Serif Bold", Font.BOLD, 45));
				rmdPanel.add(rcs);
				
				rmdFrame.setVisible(true);
			//	frame.setVisible(false);
			//	teamFrame.setVisible(false);
				
			}
		});
		//real madrid lineup
		
		teamFrame.setVisible(true);
	}
	
}
