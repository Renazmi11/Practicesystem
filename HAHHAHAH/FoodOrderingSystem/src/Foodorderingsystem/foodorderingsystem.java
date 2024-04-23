package Foodorderingsystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class foodorderingsystem extends JFrame implements ActionListener {

	//BG-ICONS ETC.
	ImageIcon bgImage = new ImageIcon(getClass().getResource("/BANNER0.PNG"));
	JLabel bannerLabel;
	
	
	ImageIcon bgImagev2 = new ImageIcon(getClass().getResource("/v2.png"));
	JLabel v2Label = new JLabel(bgImagev2);
	
	
	ImageIcon imgIcon = new ImageIcon(getClass().getResource("/br15.png"));
	JLabel imgLabel = new JLabel(imgIcon);
	  
	ImageIcon imgIconCat = new ImageIcon(getClass().getResource("/CAT.png"));
	JLabel imgLabel2 = new JLabel(imgIconCat);
	
	ImageIcon imgIconCat1 = new ImageIcon(getClass().getResource("/CAT1.png"));
	JLabel imgLabel3 = new JLabel(imgIconCat1);
	
	
	
	
	//RADIO BUTTON SETTINGS 
	
	JRadioButton rbDineIn = new JRadioButton("");
	JRadioButton rbTakeOut = new JRadioButton("");
	ButtonGroup bgButton = new ButtonGroup();		
	

	JRadioButton rbStudent = new JRadioButton("");
	JRadioButton rbSenior = new JRadioButton("");
	JRadioButton rbPwd = new JRadioButton("");
	ButtonGroup bgAdditional = new ButtonGroup();
	
	
	//CHECK BOX / PRICES / MENU LIST SETTINGS
	
	JCheckBox[] cbItem = new JCheckBox[16];
	String[] menuItem = {"Colorful omellete","San Isidro Salad ","Beef Kabob","Banana mousse","Salad of Sardines","Paella with seafood","Stuffed eggs with breadcrumbs","Pork stuffed with Bacon","Empanada with sardines","Almond Bread Soup","Pisto Manchego","Roast Lamb","Steak Extramadura","Iberian Ham","Full-Flavored churros fingers","Puff pastry with lamb"};
	double[] menuPrice = {220,385,495,165,275,110,330,440,440,275,220,330,385,495,110,165};
	JLabel[] lblPrice = new JLabel[16];
	
	
	
	
	
	DefaultListModel<String> dlmPrice = new DefaultListModel<String>();
	DefaultListModel<String> dlmItem = new DefaultListModel<String>();
	JList<String> Item = new JList<String>(dlmItem);
	JScrollPane spScroll = new JScrollPane(Item);
	
	
	
	//TEXT FIELD
	JTextField Amount = new JTextField();                                                                                        
	JTextField Payment = new JTextField();
	JTextField Change = new JTextField();
	
	
	
	//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ LABELS FOR RECEIPT  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	
	
	//LABELS
	JLabel labelAmount = new JLabel();
	JLabel labelPayment = new JLabel();
	JLabel labelSummary = new JLabel();
	JLabel labelChange = new JLabel();
	JLabel Discount = new JLabel();	
	JLabel receiptRestoName = new JLabel();
	JLabel receiptAddress = new JLabel();
	JLabel receiptContact = new JLabel();
	JLabel Line1 = new JLabel();
	JLabel Line2 = new JLabel();
	JLabel receiptCashier = new JLabel();
	JLabel receiptManager = new JLabel();
	JLabel Line3 = new JLabel();
	JLabel Line4 = new JLabel();
	JLabel receiptNameandPrice= new JLabel();
	JLabel receiptThankYou= new JLabel();
	JLabel Line5= new JLabel();
	JLabel Line6= new JLabel();
	JLabel Line7= new JLabel();
	JLabel Line8= new JLabel();
	JLabel Line9= new JLabel();
	
	
	
	
	
	JButton jButton = new JButton();
	
	
		
	JPanel pOrder = new JPanel();

	double price = 0;
	foodorderingsystem(){	
		
		
		this.setSize(1230, 820);	
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
	
		//border size
		this.getRootPane().setBorder(BorderFactory.createLineBorder(Color.black, 13));	
		
		
		//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ BG PICTURE SETTINGS  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		

		
		// BANNER BG SETTINGS
		bannerLabel = new JLabel(bgImage);
		int bannerWidth = 1200;
		int bannerHeight = 200; 
		bannerLabel.setBounds(0, 0, bannerWidth, bannerHeight);
		this.add(bannerLabel);
		
		//V2 BG SETTINGS
		int v2Width = 576; 
		int v2Height = 559; 
		int v2PosX = 0; 
		int v2PosY = 200; 
		v2Label.setBounds(v2PosX, v2PosY, v2Width, v2Height);
		this.add(v2Label);
		
	
		

		//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ VERTICAL LINES AND HORIZONTAL SETTINGS  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		
		//VERTICAL LINES AND HORIZONTAL SETTINGS
		JPanel verticalLinePanel = new JPanel();
	    verticalLinePanel.setBackground(Color.BLACK);
	    verticalLinePanel.setBounds(900, 0, 5, 820); 
	    this.add(verticalLinePanel);

	    JPanel verticalLinePanel2 = new JPanel();
	    verticalLinePanel2.setBackground(Color.BLACK); 
	    verticalLinePanel2.setBounds(577, 200, 5, 559); 
	    this.add(verticalLinePanel2);
	    
	 
		JPanel line = new JPanel();
		line.setBackground(Color.BLACK); 
		line.setBounds(0, bannerHeight, this.getWidth(), 5); 
		this.add(line);
		
		
		//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ ITEM AND PRICES SETTINGS ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		
		int posX = 590; //MOVE LEFT OR RIGHT
		int posY = 250; //MOVE UP OR DOWN
		for(int i = 0; i < cbItem.length; i++) {
		    cbItem[i] = new JCheckBox();
		    cbItem[i].setBounds(posX, posY, 210, 30); 
		    cbItem[i].setText(menuItem[i]);
		    cbItem[i].setFocusable(false);
		    cbItem[i].addActionListener(this);	    
		    cbItem[i].setForeground(Color.white);    
		    cbItem[i].setOpaque(false);
		
		    
		    lblPrice[i] = new JLabel();
		    lblPrice[i].setBounds(posX + 230, posY, 120, 30); 
		    lblPrice[i].setText("₱" + menuPrice[i]); 
	        lblPrice[i].setForeground(Color.white);
		    
	        
		  
			this.add(lblPrice[i]);
		    this.add(cbItem[i]);
		    posY += 30;
		}
		
		 
		    
		//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ BUTTON FOR CHECKOUT SETTINGS  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		
		
		jButton.setBounds(950, 700, 200, 30);
		jButton.setText("PURCHASE");
		jButton.setBackground(Color.GREEN);
		jButton.setFocusable(false);
		jButton.addActionListener(new ActionListener() {

			
			//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ CALCULATION SECTION AND DIALOG  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
			
			
			@Override
		    public void actionPerformed(ActionEvent e) {
		        if (dlmItem.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Please Select an Order");
		        } else if (Payment.getText().isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Payment unsuccessful");
		        } else {
		            double amount = Double.parseDouble(Amount.getText());
		            double paymentAmount = Double.parseDouble(Payment.getText());
		            if (paymentAmount < amount) {
		                JOptionPane.showMessageDialog(null, "Enter a valid amount");
		            } else {
		                double change = paymentAmount - amount;
		                Change.setText(String.valueOf(change));

		                JDialog dialog = new JDialog(null, Dialog.DEFAULT_MODALITY_TYPE);
		                JPanel pOrderItem = new JPanel();
		                JLabel[] lblItemOrder = new JLabel[dlmItem.getSize()];
		                JLabel[] lblItemPrice = new JLabel[dlmItem.getSize()];

		       
		       //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ RECEIPT / DIALOG SIZE ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		        		
		          
		          
		                
		               
		            
		    			
		    			//DIALOG / RECEIPT SIZE 
		    			
		                int dialogWidth = 450;
		                int dialogHeight = (dlmItem.getSize() * 20) + 770; 
		                dialog.setSize(dialogWidth, dialogHeight);
		                dialog.getRootPane().setBorder(BorderFactory.createLineBorder(Color.black));
		                dialog.setLocationRelativeTo(null);

		                int y = 230;
		                for (int i = 0; i < dlmItem.getSize(); i++) {
		                    lblItemOrder[i] = new JLabel();
		                    lblItemOrder[i].setBounds(20, y, 300, 30);
		                    lblItemOrder[i].setText(dlmItem.elementAt(i));
		                    pOrderItem.add(lblItemOrder[i]);
		                 
		                    
		                    lblItemPrice[i] = new JLabel();
		                    lblItemPrice[i].setBounds(395, y, 100, 30);
		                    lblItemPrice[i].setText(dlmPrice.elementAt(i)); 
		                    pOrderItem.add(lblItemPrice[i]); 
		                    
		            
		                    
		                    y += 20;
		                }

		                pOrderItem.setBackground(Color.white);
		                pOrderItem.setLayout(null);		             
		                dialog.add(pOrderItem);
		            
		              
		            	//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ RECEIPT / DIALOG DESIGN SETTINGS  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓₱

		                JLabel labelTotal = new JLabel("Total :");
		                JLabel labelAmountValue = new JLabel("₱" + amount);
		                labelAmountValue.setBounds(350, 580, 200, 30);
		                labelAmountValue.setFont(new Font("Arial", Font.BOLD, 22));

		                
		                
		                
		                JLabel labelPayment = new JLabel("Payment :");
		                JLabel labelPaymentValue = new JLabel("₱" + Payment.getText()); 
		                labelPaymentValue.setBounds(385, 630, 200, 30);
		                
		                JLabel labelChange = new JLabel("Change :");
		                JLabel labelChangeValue = new JLabel("₱" + change);
		                labelChangeValue.setBounds(386, 650, 200, 30);
		        

		               
		                //""
		                JLabel receiptRestoName = new JLabel("Enri's Cuisine");
		                JLabel receiptAddress = new JLabel("Address : MacArthur Hwy, Capas, Tarlac");
		            	JLabel receiptContact = new JLabel("Contact :+639513164277");
		            	JLabel Line1 = new JLabel("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		            	JLabel Line2 = new JLabel("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		            	JLabel receiptCashier = new JLabel("Cashier :                                                                                                          #3");
		            	JLabel receiptManager = new JLabel("Manager :                                                                           			    Lance Diamzon");
		            	JLabel Line3 = new JLabel("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		            	JLabel Line4 = new JLabel("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
	   		          	JLabel receiptNameandPrice= new JLabel("Ordered Food                                                                                          Price");
	   		          	JLabel receiptThankYou= new JLabel("Thank You!");
	   		          	JLabel Line5= new JLabel("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
	   		          	JLabel Line6 = new JLabel("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
	   		          	JLabel Line7 = new JLabel("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
	   		          	JLabel Line8 = new JLabel("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
	   		          	JLabel Line9 = new JLabel("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
	   		   
	   		          	
	   		          	
	   	             
	   		         //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ BOUNDS FOR RECEIPT / DIALOG ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		                
	            
		                labelTotal.setBounds(20, 570 + 10, 300, 30);		               
		                Font font13 = labelTotal.getFont();
		                labelTotal.setFont(new Font(font13.getName(), Font.BOLD, 25));
		            
		                labelPayment.setBounds(20, 590 + 40, 300, 30);
		                Font font14 = labelPayment.getFont();
		                labelPayment.setFont(new Font(font14.getName(), Font.BOLD, 15));
	                
		                labelChange.setBounds(20, 580 + 70, 300, 30);
		                Font font15 = labelChange.getFont();
		                labelChange.setFont(new Font(font15.getName(), Font.BOLD, 15));
		                
		                receiptRestoName.setBounds(120, 10, 500, 50);
		                Font font = receiptRestoName.getFont();
		                receiptRestoName.setFont(new Font(font.getName(), Font.BOLD, 30));
		                         
		                receiptAddress.setBounds(120, 40, 500, 50);
		                Font font1 = receiptAddress.getFont();
		                receiptAddress.setFont(new Font(font.getName(), Font.BOLD, 10));
		                
		                receiptContact.setBounds(165, 60, 500, 50);
		                Font font2 = receiptContact.getFont();
		                receiptContact.setFont(new Font(font.getName(), Font.BOLD, 10));
	            
		                Line1.setBounds(20, 100, 500, 50);
		                Font font3 = Line1.getFont();
		                Line1.setFont(new Font(font.getName(), Font.BOLD, 10));
		               
		                Line2.setBounds(20, 105, 500, 50);
		                Font font4 = Line2.getFont();
		                Line2.setFont(new Font(font.getName(), Font.BOLD, 10));
		               
		                receiptCashier.setBounds(20, 120, 500, 50);
		                Font font5 = receiptCashier.getFont();
		                receiptCashier.setFont(new Font(font.getName(), Font.BOLD, 13));
		             
		                receiptManager.setBounds(20, 140, 500, 50);
		                Font font6 = receiptManager.getFont();
		                receiptManager.setFont(new Font(font.getName(), Font.BOLD, 13));
	                
		                Line3.setBounds(20, 160, 500, 50);
		                Font font7 = Line3.getFont();
		                Line3.setFont(new Font(font.getName(), Font.BOLD, 10));
		               
		                Line4.setBounds(20, 165, 500, 50);	
		                font = Line4.getFont();
		                Line4.setFont(new Font(font.getName(), Font.BOLD, 10));
		               
		                receiptNameandPrice.setBounds(20, 190, 500, 50);	
		                font = receiptNameandPrice.getFont();
		                receiptNameandPrice.setFont(new Font(font.getName(), Font.BOLD, 13));
		                
		                receiptThankYou.setBounds(145, 750, 500, 50);	
		                font = receiptThankYou.getFont();
		                receiptThankYou.setFont(new Font(font.getName(), Font.BOLD, 30));
		                
		                Line5.setBounds(130, 735, 500, 50);	
		                font = Line5.getFont();
		                Line5.setFont(new Font(font.getName(), Font.BOLD, 10));
		               
		                Line6.setBounds(20, 545, 500, 50);
		                Font font8 = Line6.getFont();
		                Line6.setFont(new Font(font.getName(), Font.BOLD, 10));
		                
		                Line7.setBounds(20, 550, 500, 50);
		                Font font9 = Line7.getFont();
		                Line7.setFont(new Font(font.getName(), Font.BOLD, 10));
		                
		                Line8.setBounds(20, 595, 500, 50);
		                Font font10 = Line8.getFont();
		                Line8.setFont(new Font(font.getName(), Font.BOLD, 10));
		                
		                Line9.setBounds(20, 600, 500, 50);
		                Font font11 = Line9.getFont();
		                Line9.setFont(new Font(font.getName(), Font.BOLD, 10));
		                
		                		                
		             
		            
		    			
		                

			               //DIALOG BARCODE BOUNDS 
			                imgLabel.setBounds(100, 650, 250, 130);
			                
			                imgLabel2.setBounds(320, 680, 120, 120);			                
			              
			                imgLabel3.setBounds(10, 680, 120, 120);
			         
			            	
		                
		              // ADD COMPONENT FOR RECEIPT / DIALOG
		                
		                
		                pOrderItem.add(labelTotal);
		                pOrderItem.add(labelPayment);
		                pOrderItem.add(labelChange);
		                pOrderItem.add(receiptRestoName);
		                pOrderItem.add(receiptAddress);
		                pOrderItem.add(receiptContact);
		                pOrderItem.add(Line1);
		                pOrderItem.add(Line2);
		                pOrderItem.add(receiptCashier);
		                pOrderItem.add(receiptManager);
		                pOrderItem.add(Line3);
		                pOrderItem.add(Line4);
		                pOrderItem.add(receiptNameandPrice);
		                pOrderItem.add(receiptThankYou);
		                pOrderItem.add(Line5);
		                pOrderItem.add(Line6);
		                pOrderItem.add(Line7);
		                pOrderItem.add(Line8);
		                pOrderItem.add(Line9);
		                pOrderItem.add(labelTotal);
		                pOrderItem.add(labelAmountValue);
		                pOrderItem.add(labelPayment);
		                pOrderItem.add(labelPaymentValue);
		                pOrderItem.add(labelChange);
		                pOrderItem.add(labelChangeValue);
		                pOrderItem.add(imgLabel);
		                pOrderItem.add(imgLabel2);
		                pOrderItem.add(imgLabel3);
		                
		              
		                dialog.setUndecorated(true);
		                dialog.setVisible(true);
		            }
		        }
		    }
		});
		
	
		//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ TEXTBOX FOR DIALOG PURCHASING  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		
	
		//TEXTBOX FOR PURCHASING
		Change.setBounds(1020, 620, 150, 30);
		Change.setEditable(false);
		Change.setBackground(Color.white);
		Change.setOpaque(true);
		
		labelChange.setBounds(920, 620, 100, 30);
		labelChange.setText("Change :");
		labelChange.setFont(new Font(Change.getFont().getName(), Font.BOLD, 18));
		labelChange.setForeground(Color.white);    
		labelChange.setOpaque(false);
		
		
	
		Amount.setBounds(1020, 580, 150, 30);
		Amount.setEditable(false);
		Amount.setBackground(Color.white);
		Amount.setOpaque(true);
	
	
		labelAmount.setBounds(920, 580, 100, 30);
		labelAmount.setText("Total :");
		labelAmount.setFont(new Font(Amount.getFont().getName(), Font.BOLD, 18));
		labelAmount.setForeground(Color.white);    
		labelAmount.setOpaque(false);
		
		
		
		Payment.setBounds(1020, 660, 150, 30);
		
		labelPayment.setBounds(920, 658, 100, 30);	
		labelPayment.setText("Payment :");
		labelPayment.setFont(new Font(Payment.getFont().getName(), Font.BOLD, 18));
		labelPayment.setForeground(Color.white);    
		labelPayment.setOpaque(false);
		
		
		JLabel orderLabel = new JLabel("Selection Area");
		orderLabel.setBounds(670, 190, 250, 70);  
		Font labelFont = orderLabel.getFont();
		orderLabel.setFont(new Font(labelFont.getName(), Font.BOLD, 20)); 
		this.add(orderLabel);
		
	
		
		labelSummary.setBounds(975, 185, 250, 70);
		labelSummary.setText("Order Summary");
		Font summaryFont = new Font(labelSummary.getFont().getName(), Font.BOLD, 20); 
		labelSummary.setFont(summaryFont);
		labelSummary.setForeground(Color.white);    
		labelSummary.setOpaque(false);
		
		
		orderLabel.setForeground(Color.WHITE);
		
		
		
		Discount.setBounds(920, 410, 250, 70);
		Discount.setText("Discount :");
		Font discountFont = new Font(Discount.getFont().getName(), Font.BOLD, 20);
		Discount.setFont(discountFont);
		Discount.setForeground(Color.white);    
		Discount.setOpaque(false);
		
		
		
		
		//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓  BACKGROUND 1 SETTINGS ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		
		
		
		Color bgColor = Color.decode("#d92121"); 
		JPanel bgColorPanel = new JPanel();
		bgColorPanel.setBackground(bgColor); 
		bgColorPanel.setBounds(582, 0, 318, 820); 
	   	this.add(bgColorPanel);
		
		
	   	
	   	
		
		//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ BUTTON SECTION  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	
		
		//CHECKBOX BOUNDS
		rbDineIn.setBounds(1080, 470, 120, 30);
		rbDineIn.setText("Dine In");
		rbDineIn.setFocusable(false);
		rbDineIn.setForeground(Color.white);    
		rbDineIn.setOpaque(false);
		
		rbTakeOut.setBounds(1080, 500, 120, 30);
		rbTakeOut.setText("Take Out");
		rbTakeOut.setFocusable(false);
		rbTakeOut.setForeground(Color.white);    
		rbTakeOut.setOpaque(false);
		
		//BUTTON GROUP 1 FOR DINE IN AND TAKE OUT
		bgButton.add(rbDineIn);
		bgButton.add(rbTakeOut);
	
		//BUTTON GRROUP 2 FOR DISCORD
		rbStudent.setBounds(930, 470, 120, 30);
		rbStudent.setText("Student (5%)");
		rbStudent.setFocusable(false);
		rbStudent.setForeground(Color.white);    
		rbStudent.setOpaque(false);
		
		rbSenior.setBounds(930, 500, 120, 30);
		rbSenior.setText("Senior (10%)");
		rbSenior.setFocusable(false);
		rbSenior.setForeground(Color.white);    
		rbSenior.setOpaque(false);
	
		rbPwd.setBounds(930, 530, 120, 30);
		rbPwd.setText("PWD (15%) ");
		rbPwd.setFocusable(false);
		rbPwd.setForeground(Color.white);    
		rbPwd.setOpaque(false);
		
		bgAdditional.add(rbStudent);
		bgAdditional.add(rbSenior);
		bgAdditional.add(rbPwd);
		
	
		
		
		
		//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ RECEIPT SECTION  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	
		//RECEIPT
		pOrder.setBounds(950, 255, 200, 170);
		pOrder.setBorder(BorderFactory.createLineBorder(Color.black));
		pOrder.setLayout(new BorderLayout());
		pOrder.add(spScroll);
		
		
		//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓  BACKGROUND 2 SETTINGS ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		
		Color bgColor1 = Color.decode("#d92121"); 
	   	JPanel bgColorPanel2 = new JPanel();
	   	bgColorPanel2.setBackground(bgColor1); 
	   	bgColorPanel2.setBounds(verticalLinePanel.getX(), 0, this.getWidth() - verticalLinePanel.getX(), this.getHeight()); 
	   
		
		
		//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓  ADD COMPONENT SECTION  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		
	   	
	   	
	   	//NOT FIXED
	   	this.add(imgLabel);
		this.add(imgLabel2);	  
		this.add(imgLabel3);	  
		this.add(Discount);
		this.add(jButton);
		this.add(Amount);
		this.add(Payment);
		this.add(labelAmount);	
		this.add(labelPayment);	
		this.add(labelSummary);
		this.add(labelChange);
		this.add(receiptRestoName);
		this.add(receiptAddress);
		this.add(receiptContact);
		this.add(Line1);
		this.add(Line2);
		this.add(receiptCashier);
		this.add(receiptManager);
		this.add(Line3);
		this.add(Line4);
		this.add(receiptNameandPrice);
		this.add(receiptThankYou);
		this.add(Line5);
		this.add(Line6);
		this.add(Line7);
		this.add(Line8);
		this.add(Line9);
		this.add(Change);
		this.add(pOrder);
		this.add(rbTakeOut);
		this.add(rbDineIn);
		this.add(rbStudent);
		this.add(rbSenior);
		this.add(rbPwd);	
		this.add(bgColorPanel2);
	
		
		
		
		
		
		
		this.setLayout(null);
		this.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	    for (int i = 0; i < cbItem.length; i++) {
	        if (e.getSource().equals(cbItem[i])) {
	            if (cbItem[i].isSelected()) {
	                dlmItem.addElement(cbItem[i].getText());
	                dlmPrice.addElement(String.valueOf(menuPrice[i]));
	                price += menuPrice[i];
	            } else {
	                dlmItem.removeElement(cbItem[i].getText());
	                dlmPrice.removeElement(String.valueOf(menuPrice[i]));
	                price -= menuPrice[i];
	            }
	            Amount.setText(String.valueOf(price));
	        }
	    }
	
	    
	    
	    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ DISCOUNTING SYSTEM SETTINGS  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		
	    // Calculate discount based on selected radio button
	    double discountPercentage = 0.0;
	    if (rbStudent.isSelected()) {
	        discountPercentage = 0.05;
	    } else if (rbSenior.isSelected()) {
	        discountPercentage = 0.10;
	    } else if (rbPwd.isSelected()) {
	        discountPercentage = 0.15;
	    }

	    // Apply discount if applicable
	    double discountedPrice = price * (1 - discountPercentage);
	    Amount.setText(String.valueOf(discountedPrice));
	}
}