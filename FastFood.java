package final_project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;


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
	    private JCheckBox vodka;
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
	    private JButton reciept;
	    private JTextField coffee_user;
	    private JTextField vodka_user;
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
    private JTextField vsubtotal;

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
	        vodka = new JCheckBox ("Vodka");
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
	        reciept = new JButton ("Create Reciept");
	        coffee_user = new JTextField (5);
	        vodka_user = new JTextField (5);
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
        vsubtotal = new JTextField(5);

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
        vsubtotal.setEnabled(false);

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
	        add (vodka);
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
	        add (reciept);
	        add (coffee_user);
	        add (vodka_user);
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
        add(vsubtotal);
        calculate_Total.addActionListener(new CalcButtonListener());
        print_Receipt.addActionListener(new PrintReceiptListener());

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
	        vodka.setBounds (350, 200, 100, 25);
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
	        reciept.setBounds (550, 375, 120, 25);
	        coffee_user.setBounds (455, 140, 100, 25);
	        vodka_user.setBounds (455, 200, 100, 25);
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
        vsubtotal.setBounds(560, 200, 100, 25);
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
				int subsubtotal=0;
				int subtotal=0;
				int[] food= new int[10];
				
				
				
				if(pancake.isSelected()) {
                if (pancake_user.getText() != null && pancake_user.getText().matches("[0-9.]+")) {
					inputP=Integer.parseInt(pancake_user.getText());
					food[0]=inputP;
			                    if (!psubtotal.getText().isEmpty()) {
                        mult *= Integer.parseInt(pancake_user.getText());                    
                    }
                    psubtotal.setText(String.valueOf(mult));
				}
				}

				if(hash_Browns.isSelected()) {
					if(hashBrown_user.getText()!=null&& hashBrown_user.getText().matches("[0-9.]+")) {
					
					inputHB=Integer.parseInt(hashBrown_user.getText());
					food[1]=inputHB;
				}
				}
				if (hamburger.isSelected()) {
					if(hamburger_user.getText()!=null&& hamburger_user.getText().matches("[0-9.]+")) {
						
						
						food[2]=Integer.parseInt(hamburger_user.getText());}
				}
				if (hotdog.isSelected()) {
                        if(hotdog_user.getText()!=null&& hotdog_user.getText().matches("[0-9.]+")) {
						
						
						food[3]=Integer.parseInt(hotdog_user.getText());}
				}
				if (icecream.isSelected()) {
                    if(icecream_user.getText()!=null&& icecream_user.getText().matches("[0-9.]+")) {
						food[4]=Integer.parseInt(icecream_user.getText());
                    }
					
				}
				if (water.isSelected()) {
					if(water_user.getText()!=null&& water_user.getText().matches("[0-9.]+")) {
						food[5]=Integer.parseInt(water_user.getText());
                    }
					
				}
				if (soda.isSelected()) {
					if(soda_user.getText()!=null&& soda_user.getText().matches("[0-9.]+")) {
						food[6]=Integer.parseInt(soda_user.getText());
                    }
					
				}
				if (coffee.isSelected()) {
					if(coffee_user.getText()!=null&& coffee_user.getText().matches("[0-9.]+")) {
						food[7]=Integer.parseInt(coffee_user.getText());
                    }
					
				}
				if (orangeJuice.isSelected()) {
					if(orangeJuice_user.getText()!=null&& orangeJuice_user.getText().matches("[0-9.]+")) {
						food[8]=Integer.parseInt(orangeJuice_user.getText());
                    }
					
				}
				if (vodka.isSelected()) {
					if(vodka_user.getText()!=null&& vodka_user.getText().matches("[0-9.]+")) {
						food[9]=Integer.parseInt(vodka_user.getText());
                    }
					
				}
				for (int i=0; i<food.length;i++) {
					subsubtotal+=food[i];
				}
				//total=inputP+inputHB;
				
				//JOptionPane.showMessageDialog(null, total);
				subtotal_user.setText(Integer.toString(subtotal));
				double taxes=subtotal*.0884;
				tax_user.setText(String.format("%.2f",taxes));
				total_user.setText(String.format("%.2f",taxes+subtotal));
				
			}
	    }
	
	    private class PrintReceiptListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String subtotal = subtotal_user.getText();
            String tax = tax_user.getText();
            String total = total_user.getText();

            String output = "Subtotal: " + subtotal + "Tax: " + tax + "Total: " + total;

            try {
                String outputFile = "receipt.txt";;
                try ( BufferedWriter write = new BufferedWriter(new FileWriter(outputFile, true))) {
                    write.append(output);
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



