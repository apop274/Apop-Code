package guiLoginPackage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GUILogin implements ActionListener{
		
		private static JLabel userLabel;
		private static JTextField userText;
		private static JLabel passwordLabel;
		private static JPasswordField passwordText;
		private static JButton button;
		private static JLabel success;
		private static JPanel panel;
		private static JFrame frame;
		
		
	public static void main(String[] args) {
		
        panel = new JPanel();		//creates the panel that goes inside the frame
		
		frame = new JFrame();		//creates the JFrame
		
		frame.setSize(400,200);									//JFrame setup
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("User: ");
		userLabel.setBounds(10, 20, 80, 25);			//adds user label in the panel
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Enter");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUILogin());			//action listener takes in a parameter of an object
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		
		
		frame.setVisible(true);
	
	}

	
	@Override
	public void actionPerformed(ActionEvent e) { 
		// TODO Auto-generated method stub
		String user = userText.getText();
		String password = passwordText.getText();
		
		
		if(user.equals("apop") && password.equals("yoshyosh")) {
			success.setText("Login successful");
			panel.setBackground(Color.green);
			
			JFrame newFrame = new JFrame();
			JPanel newPanel = new JPanel();
			
			newFrame.setSize(800, 800);									//new JFrame if login info is correct	
			newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
			newFrame.add(newPanel);
			
			newPanel.setLayout(null);   //newPanel.setLayout(new BoxLayout.Y_AXIS));
			newPanel.setBackground(Color.blue);
			
			JLabel blueBoxLabel = new JLabel("Press the button for a new JFrame");
			blueBoxLabel.setBounds(10, 20, 200, 25);
			newPanel.add(blueBoxLabel);
			
			JButton newButton = new JButton("Deez Nuts");
			newButton.setBounds(100, 60, 70, 50);
			
			newButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed( ActionEvent e ) {				//new actionListener inside of the second JFrame
                	
                	
                	JFrame threeFrame = new JFrame();
                	JPanel threePanel = new JPanel();
                	
                	threeFrame.setSize(800, 800);
                	threeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
        			threeFrame.add(threePanel);
        			
        			threePanel.setLayout(null);
        			Color threePanelColor = new Color(184, 145, 201);
        			threePanel.setBackground(threePanelColor);
        			
        			JTextField threeText = new JTextField(30);
        			threeText.setBounds(370, 100, 200, 25);
        			threePanel.add(threeText);
        			
        			JLabel threeLabel = new JLabel("Do you want to know random UK stock prices? TYPE 'yes' if so.");
        			threeLabel.setBounds(0, 100, 400, 25);
        			threePanel.add(threeLabel);
        			
        			JButton threeButton = new JButton("Enter");
        			threeButton.setBounds(370, 140, 100, 35);
        			threeButton.addActionListener(new ActionListener(){
                         @Override
                         public void actionPerformed( ActionEvent e ) {
                        	 
                        	 String threeFrameTextInfo = threeText.getText();
                        	 
                             JFrame fourFrame = new JFrame();
                             JPanel fourPanel = new JPanel();
                             
                             fourFrame.setSize(800, 800);
                             fourFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
                 			 fourFrame.add(fourPanel);
                 			 
                 			 Color fourPanelColor = new Color(123, 181, 181);
                 			 fourPanel.setBackground(fourPanelColor);
                 			 
                 			 if(threeFrameTextInfo.equalsIgnoreCase("yes")) {
                 				final String url = "https://web.archive.org/web/20190104110157/http://shares.telegraph.co.uk/indices/?index=MCX";
                 				
                 				try {
                 					
                 					final Document document = Jsoup.connect(url).get();
                 					
                 					for(Element row : document.select(
                 							"table.tablesorter.full tr")) {
                 						
                 						if(row.select("td:nth-of-type(1)").text().equals("")) {
                 							continue;
                 						}
                 						else {
                 							final String ticker = row.select("td:nth-of-type(1)").text(); 
                 							
                 							final String name = row.select("td:nth-of-type(2)").text();
                 							
                 							final String tempPrice = row.select("td.right:nth-of-type(3)").text();
                 							
                 							final String tempPrice1 = tempPrice.replace("$" , "").replace("," , "");
                 							
                 							
                 							
                 							final double price = Double.parseDouble(tempPrice1);
                 							
                 							JLabel stockInfo = new JLabel(ticker + " " + name + " " + tempPrice1);
                 							stockInfo.setBounds(0, 0, 1000, 10000);
                 							fourPanel.add(stockInfo);
                 							
                 							
                 							
                 						}
                 						
                 					}
                 					
                 					
                 					
                 				}
                 				
                 				catch (Exception ex) {
                 					ex.printStackTrace();
                 				}
                 				
                 				JButton	funcButton = new JButton("Click for next function");
                 				funcButton.setBounds(60, 700, 200, 30);
                 				funcButton.addActionListener(new ActionListener(){
                                    @Override
                                    public void actionPerformed( ActionEvent e ) {
                                        
                                    	JFrame fiveFrame = new JFrame();
                                        JPanel fivePanel = new JPanel();
                                        
                                        fiveFrame.setSize(800, 800);
                                        fiveFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
                            			fiveFrame.add(fivePanel);
                                    	
                            			fivePanel.setLayout(null);
                            			
                            			fiveFrame.setVisible(true);
                            			fourFrame.setVisible(false);
                                    	
                                    }
                                });
                 				
                 				
                 				fourPanel.add(funcButton);
                 				
                 				
                 			 }
                 			 
                 			 
                 			 
                 			 
                 			 fourFrame.setVisible(true);
                 			 threeFrame.setVisible(false);
                         }
                     });
        			
        			threePanel.add(threeButton);
        			
        			
        			
        			threeFrame.setVisible(true);
        			
        			newFrame.setVisible(false);
        			
        			
        			
        			
                }
            });
			
			newPanel.add(newButton);
			
			
			
			newFrame.setVisible(true);
			frame.setVisible(false);
			
			
		}
		
		
		
		userText.setText("");
		passwordText.setText("");
		
		
	}

}
