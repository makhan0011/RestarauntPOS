package final_project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.io.*;
import java.net.*;


public class FastFood extends JPanel{
	 private JCheckBox hash_Browns;
	    private JCheckBox pancake;
	    private JButton calculate_Total;
	    private JCheckBox hamburger;
	    private JCheckBox hotdog;
	    private JCheckBox icecream;
	    private JCheckBox water;
	    private JCheckBox soda;
	    private JCheckBox coffee;
	    private JCheckBox orangeJuice;
	    private JCheckBox horchata;
	    private JTextField subtotal_user;
	    private JTextField pancake_user;
	    private JTextField hashBrown_user;
	    private JTextField hamburger_user;
	    private JTextField hotdog_user;
	    private JTextField icecream_user;
	    private JTextField water_user;
	    private JLabel subtotal;
	    private JTextField tax_user;
	    private JLabel tax;
	    private JTextField total_user;
	    private JLabel total;
	    private JButton print_Reciept;
	    private JTextField coffee_user;
	    private JTextField horchata_user;
	    private JTextField orangeJuice_user;
	    private JTextField soda_user;
	    private JLabel jcomp29;
	    private JLabel jcomp30;
	    private JTextField psubtotal;
    private JTextField hbsubtotal;
    private JTextField hamsubtotal;
    private JTextField hdsubtotal;
    private JTextField icsubtotal;
    private JTextField wsubtotal;
    private JTextField ssubtotal;
    private JTextField csubtotal;
    private JTextField osubtotal;
    private JTextField hsubtotal;
   
    

	    public FastFood() {
	        //construct components
	        hash_Browns = new JCheckBox ("Hash Browns");
	        pancake = new JCheckBox ("Pancake");
	        calculate_Total = new JButton ("Calculate Total");
	        hamburger = new JCheckBox ("Hamburger");
	        hotdog = new JCheckBox ("Hotdog");
	        icecream = new JCheckBox ("Ice Cream");
	        water = new JCheckBox ("Water");
	        soda = new JCheckBox ("Soda");
	        coffee = new JCheckBox ("Coffee");
	        orangeJuice = new JCheckBox ("Orange Juice");
	        horchata = new JCheckBox ("horchata");
	        subtotal_user = new JTextField (5);
	        pancake_user = new JTextField (5);
	        hashBrown_user = new JTextField (5);
	        hamburger_user = new JTextField (5);
	        hotdog_user = new JTextField (5);
	        icecream_user = new JTextField (5);
	        water_user = new JTextField (5);
	        subtotal = new JLabel ("Subtotal");
	        tax_user = new JTextField (5);
	        tax = new JLabel ("Tax");
	        total_user = new JTextField (5);
	        total = new JLabel ("Total");
	        print_Reciept = new JButton ("Create Reciept");
	        coffee_user = new JTextField (5);
	        horchata_user = new JTextField (5);
	        orangeJuice_user = new JTextField (5);
	        soda_user = new JTextField (5);
	        jcomp29 = new JLabel ("Food");
	        jcomp30 = new JLabel ("Beverages");
		            psubtotal = new JTextField(5);
        hbsubtotal = new JTextField(5);
        hamsubtotal = new JTextField(5);
        hdsubtotal = new JTextField(5);
        icsubtotal = new JTextField(5);
        wsubtotal = new JTextField(5);
        ssubtotal = new JTextField(5);
        csubtotal = new JTextField(5);
        osubtotal = new JTextField(5);
        hsubtotal = new JTextField(5);

	        //set components properties
	        subtotal_user.setEnabled (false);
	        tax_user.setEnabled (false);
	        total_user.setEnabled (false);
		            psubtotal.setEnabled(false);
        hbsubtotal.setEnabled(false);
        hamsubtotal.setEnabled(false);
        hdsubtotal.setEnabled(false);
        icsubtotal.setEnabled(false);
        wsubtotal.setEnabled(false);
        ssubtotal.setEnabled(false);
        csubtotal.setEnabled(false);
        osubtotal.setEnabled(false);
        hsubtotal.setEnabled(false);

	        //adjust size and set layout
	        setPreferredSize (new Dimension (752, 430));
	        setLayout (null);

	        //add components
	        add (hash_Browns);
	        add (pancake);
	        add (calculate_Total);
	        add (hamburger);
	        add (hotdog);
	        add (icecream);
	        add (water);
	        add (soda);
	        add (coffee);
	        add (orangeJuice);
	        add (horchata);
	        add (subtotal_user);
	        add (pancake_user);
	        add (hashBrown_user);
	        add (hamburger_user);
	        add (hotdog_user);
	        add (icecream_user);
	        add (water_user);
	        add (subtotal);
	        add (tax_user);
	        add (tax);
	        add (total_user);
	        add (total);
	        add (print_Reciept);
	        add (coffee_user);
	        add (horchata_user);
	        add (orangeJuice_user);
	        add (soda_user);
	        add (jcomp29);
	        add (jcomp30);
        add(psubtotal);
        add(hbsubtotal);
        add(hamsubtotal);
        add(hdsubtotal);
        add(icsubtotal);
        add(wsubtotal);
        add(ssubtotal);
        add(csubtotal);
        add(osubtotal);
        add(hsubtotal);
        calculate_Total.addActionListener(new CalcButtonListener());
        print_Reciept.addActionListener(new PrintReceiptListener());

	        //set component bounds (only needed by Absolute Positioning)
	        hash_Browns.setBounds (30, 110, 100, 25);
	        pancake.setBounds (30, 80, 100, 25);
	        calculate_Total.setBounds (30, 375, 125, 25);
	        hamburger.setBounds (30, 140, 100, 25);
	        hotdog.setBounds (30, 170, 100, 25);
	        icecream.setBounds (30, 200, 100, 25);
	        water.setBounds (350, 80, 100, 25);
	        soda.setBounds (350, 110, 100, 25);
	        coffee.setBounds (350, 140, 100, 25);
	        orangeJuice.setBounds (350, 170, 105, 25);
	        horchata.setBounds (350, 200, 100, 25);
	        subtotal_user.setBounds (190, 375, 100, 25);
	        pancake_user.setBounds (135, 80, 100, 25);
	        hashBrown_user.setBounds (135, 110, 100, 25);
	        hamburger_user.setBounds (135, 145, 100, 25);
	        hotdog_user.setBounds (135, 175, 100, 25);
	        icecream_user.setBounds (135, 205, 100, 25);
	        water_user.setBounds (455, 80, 100, 25);
	        subtotal.setBounds (190, 345, 100, 25);
	        tax_user.setBounds (300, 375, 100, 25);
	        tax.setBounds (300, 345, 100, 25);
	        total_user.setBounds (410, 375, 100, 25);
	        total.setBounds (410, 345, 100, 25);
	        print_Reciept.setBounds (550, 375, 120, 25);
	        coffee_user.setBounds (455, 140, 100, 25);
	        horchata_user.setBounds (455, 200, 100, 25);
	        orangeJuice_user.setBounds (455, 170, 100, 25);
	        soda_user.setBounds (455, 110, 100, 25);
	        jcomp29.setBounds (35, 45, 205, 30);
	        jcomp30.setBounds (355, 50, 100, 25);
		            psubtotal.setBounds(240, 80, 100, 25);
        hbsubtotal.setBounds(240, 110, 100, 25);
        hamsubtotal.setBounds(240, 145, 100, 25);
        hdsubtotal.setBounds(240, 175, 100, 25);
        icsubtotal.setBounds(240, 205, 100, 25);
        wsubtotal.setBounds(560, 80, 100, 25);
        ssubtotal.setBounds(560, 110, 100, 25);
        csubtotal.setBounds(560, 140, 100, 25);
        osubtotal.setBounds(560, 170, 100, 25);
        hsubtotal.setBounds(560, 200, 100, 25);
	    }

	    
	    private class CalcButtonListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				int inputP=0;
				int inputHB = 0;
				            int inputH = 0;
            int inputHD = 0;
            int inputIC = 0;
            int inputW = 0;
            int inputS = 0;
            int inputC = 0;
            int inputOJ = 0;
            int inputV = 0;
            int total = 0;
            final double  TAX=0.0884;
            double mult=0;
				int subsubtotal=0;
				double subtotal=0;
				int[] food= new int[10];
				
				
				
				if(pancake.isSelected()) {
                if (pancake_user.getText() != null && pancake_user.getText().matches("[0-9.]+")) {
					inputP=Integer.parseInt(pancake_user.getText());
					food[0]=inputP;
					double subP= inputP*6.99;
			                    /*if (!psubtotal.getText().isEmpty()) {
                       mult =TAX* Integer.parseInt(pancake_user.getText());                    
                    
			                    }*/
                    psubtotal.setText(String.format("%.2f",subP));
                    subtotal+=subP;
				}
				}

				if(hash_Browns.isSelected()) {
					if(hashBrown_user.getText()!=null&& hashBrown_user.getText().matches("[0-9.]+")) {
					
					inputHB=Integer.parseInt(hashBrown_user.getText());
					food[1]=inputHB;
					double subHB=inputHB*3.99;
					hbsubtotal.setText(String.format("%.2f",subHB));
					subtotal+=subHB;
				}
				}
				if (hamburger.isSelected()) {
					if(hamburger_user.getText()!=null&& hamburger_user.getText().matches("[0-9.]+")) {
						
						food[2]=Integer.parseInt(hamburger_user.getText());}
				        double subHam=Integer.parseInt(hamburger_user.getText())*12.99;
				        hamsubtotal.setText(String.format("%.2f",subHam));
				        subtotal+=subHam;
				}
				if (hotdog.isSelected()) {
                        if(hotdog_user.getText()!=null&& hotdog_user.getText().matches("[0-9.]+")) {
						double subHD=Integer.parseInt(hotdog_user.getText())*8.99;
						hdsubtotal.setText(String.format("%.2f",subHD));
						subtotal+=subHD;
						food[3]=Integer.parseInt(hotdog_user.getText());}
				}
				if (icecream.isSelected()) {
                    if(icecream_user.getText()!=null&& icecream_user.getText().matches("[0-9.]+")) {
						food[4]=Integer.parseInt(icecream_user.getText());
						double subIC=Integer.parseInt(icecream_user.getText())*7.99;
						icsubtotal.setText(String.format("%.2f",subIC));
						subtotal+=subIC;
                    }
					
				}
				if (water.isSelected()) {
					if(water_user.getText()!=null&& water_user.getText().matches("[0-9.]+")) {
						food[5]=Integer.parseInt(water_user.getText());
						double subW=Integer.parseInt(water_user.getText())*1.49;
						wsubtotal.setText(String.format("%.2f",subW));
						subtotal+=subW;
                    }
					
				}
				if (soda.isSelected()) {
					if(soda_user.getText()!=null&& soda_user.getText().matches("[0-9.]+")) {
						food[6]=Integer.parseInt(soda_user.getText());
						double subS=Integer.parseInt(soda_user.getText())*2.29;
						ssubtotal.setText(String.format("%.2f",subS));
						subtotal+=subS;
                    }
					
				}
				if (coffee.isSelected()) {
					if(coffee_user.getText()!=null&& coffee_user.getText().matches("[0-9.]+")) {
						food[7]=Integer.parseInt(coffee_user.getText());
						double subC=Integer.parseInt(coffee_user.getText())*2.79;
						csubtotal.setText(String.format("%.2f",subC));
						subtotal+=subC;
                    }
					
				}
				if (orangeJuice.isSelected()) {
					if(orangeJuice_user.getText()!=null&& orangeJuice_user.getText().matches("[0-9.]+")) {
						food[8]=Integer.parseInt(orangeJuice_user.getText());
						double subO=Integer.parseInt(orangeJuice_user.getText())*2.39;
						osubtotal.setText(String.format("%.2f",subO));
						subtotal+=subO;
                    }
					
				}
				if (horchata.isSelected()) {
					if(horchata_user.getText()!=null&& horchata_user.getText().matches("[0-9.]+")) {
						food[9]=Integer.parseInt(horchata_user.getText());
						double subH=Integer.parseInt(horchata_user.getText())*4.29;
						hsubtotal.setText(String.format("%.2f",subH));
						subtotal+=subH;
                    }
					
				}
				String taxes_u="";
				String total_u="";
				/*for (int i=0; i<food.length;i++) {
					subsubtotal+=food[i];
				}*/
				//total=inputP+inputHB;
				try {
					final int SBAP_PORT = 8888;
				     Socket s = new Socket("localhost", SBAP_PORT);
				     InputStream instream = s.getInputStream();
				     OutputStream outstream = s.getOutputStream();
				     Scanner in = new Scanner(instream);
				     PrintWriter out = new PrintWriter(outstream);
				     PrintWriter writer =new PrintWriter(s.getOutputStream(), true);
				     //double command;
				     
				     
				    // command=subtotal;
				     writer.println(String.valueOf(subtotal));
				     String response=in.nextLine();
				     taxes_u=response;
				     response=in.nextLine();
				     total_u=response;
				     
				     
				     
					
				s.close();} catch (IOException ex) {
					System.err.println("Error connection to server");
				}
				//JOptionPane.showMessageDialog(null, total);
				subtotal_user.setText(String.valueOf(subtotal));
				double taxes=subtotal*.0884;
				//tax_user.setText(String.format("%.2f",taxes));
				tax_user.setText(taxes_u);
				//total_user.setText(String.format("%.2f",taxes+subtotal));
				total_user.setText(total_u);
			}
	    }
	
    private class PrintReceiptListener implements ActionListener {

        public void actionPerformed(ActionEvent ae) {

            String subtotal = subtotal_user.getText();
            String tax = tax_user.getText();
            String total = total_user.getText();

            String output = "Subtotal: " + subtotal + " Tax: " + tax + " Total: " + total;

            try {
                String outputFile = "receipt.txt";
                try ( BufferedWriter write = new BufferedWriter(new FileWriter(outputFile, true))) {
                    write.append(output);
                    System.out.println(System.getProperty("user.dir"));
                }
            } catch (IOException e) {
                System.err.println("Error outputting to file.");
            }  
        }
    }
	    
	    
	    public static void main (String[] args) {
	        JFrame frame = new JFrame ("test2");
	        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add (new FastFood());
	        frame.pack();
	        frame.setVisible (true);
	    }
	}


