// Java program to implement a GUI 
// application for the student 
// management system 
  
import javax.swing.*; 
import java.awt.*; 
import java.awt.Image; 
import java.awt.event.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.print.*; 
import java.io.*; 
import java.io.IOException; 
  
// Creating the fee class 
public class HotelSystem extends Frame { 
  
    JLabel l1, l2, l3, l4, 
        l5, l6, l7, l8, 
        l9, l10, l12, l13, 
        l14, l11, l15; 
  
    JTextField tf1, tf2, tf3, 
        tf4, tf5, tf6, 
        tf7, tf8, tf9, 
        tf10; 
  
    JTextArea area2, area1; 
  
    JRadioButton rb1, rb2, rb3, 
        rb4, rb5, rb6, 
        rb7; 
  
    JFileChooser f1; 
  
    // Default constructor to 
    // initialize the parameters 
    HotelSystem() 
    { 
  
        l1 = new JLabel("Hotel Management System"); 
        l1.setBounds(520, 100, 250, 20); 
  
        l2 = new JLabel( 
            "Hotel Guest Name:"); 
        l2.setBounds(50, 150, 250, 20); 
  
        tf1 = new JTextField(); 
        tf1.setBounds(250, 150, 250, 20); 
  
        l3 = new JLabel( 
            "Number of Guest: "); 
        l3.setBounds(50, 200, 250, 20); 
  
        tf2 = new JTextField(); 
        tf2.setBounds(250, 200, 250, 20); 
  
        l4 = new JLabel("Date:"); 
        l4.setBounds(50, 250, 250, 20); 
  
        tf3 = new JTextField(); 
        tf3.setBounds(250, 250, 250, 20); 
  
        l5 = new JLabel("Email Address:"); 
        l5.setBounds(50, 300, 250, 20); 
  
        tf4 = new JTextField(); 
        tf4.setBounds(250, 300, 250, 20); 
  
        l6 = new JLabel("Contact Number:"); 
        l6.setBounds(50, 350, 250, 20); 
  
        tf5 = new JTextField(); 
        tf5.setBounds(250, 350, 250, 20); 
  
        l7 = new JLabel("Address:"); 
        l7.setBounds(50, 400, 250, 20); 
  
        area1 = new JTextArea(); 
        area1.setBounds(250, 400, 250, 90); 
  
        l9 = new JLabel("Gender:"); 
        l9.setBounds(50, 500, 250, 20); 
  
        JRadioButton r5 
            = new JRadioButton(" Male"); 
        JRadioButton r6 
            = new JRadioButton(" Female"); 
  
        r5.setBounds(250, 500, 100, 30); 
        r6.setBounds(350, 500, 100, 30); 
  
        ButtonGroup bg = new ButtonGroup(); 
        bg.add(r5); 
        bg.add(r6); 
  
        l10 = new JLabel("Nationality:"); 
        l10.setBounds(50, 550, 250, 20); 
  
        tf6 = new JTextField(); 
        tf6.setBounds(250, 550, 250, 20); 
 
  
        ImageIcon i2 = new ImageIcon("2.png"); 
        JLabel l15 
            = new JLabel("", i2, JLabel.CENTER); 
  
        l15.setBounds(900, 50, 600, 200); 
        
        l8 = new JLabel( 
            "Countries of stay:"); 
        l8.setBounds(600, 150, 250, 20); 

  
        String countries[] 
            = { "Canada", "Singapore", "US", 
                "India", "Indonesia, China" }; 
        final JComboBox cb 
            = new JComboBox(countries); 
        
        cb.setPreferredSize(new Dimension(10,100));
        
        cb.setBounds(600, 200, 120, 20); 
  
        final JLabel label 
            = new JLabel(); 
        label.setBounds(600, 430, 500, 30); 
  
        final DefaultListModel<String> li1 
            = new DefaultListModel<>(); 
  
        li1.addElement("Deluxe ($120)"); 
        li1.addElement("Super Deluxe ($150)"); 
        li1.addElement("Master ($180)"); 
        li1.addElement("President ($200)"); 
        li1.addElement("Grand ($250)"); 
  
        final JList<String> list1 
            = new JList<>(li1); 
  
        list1.setBounds(600, 300, 125, 125); 
  
        DefaultListModel<String> li2 
            = new DefaultListModel<>(); 
  
        li2.addElement( 
            "with breakfast (+$20)"); 
        li2.addElement( 
            "without breakfast"); 
  
        final JList<String> list2 
            = new JList<>(li2); 
        list2.setBounds( 
            800, 300, 200, 125); 
  
        JButton Receipt 
            = new JButton("Generate Receipt"); 
        Receipt.setBounds(600, 490, 150, 30); 
        JButton b2 = new JButton("Reset"); 
        b2.setBounds(750, 490, 150, 30); 
        JButton Print = new JButton("Print"); 
        Print.setBounds(900, 490, 150, 30); 
  
        area2 = new JTextArea(); 
        area2.setBounds(600, 540, 450, 240); 
  
        add(l1); 
        add(l2); 
        add(l3); 
        add(l4); 
        add(l5); 
        add(l6); 
        add(l7); 
        add(l8); 
        add(l9); 
        add(l10); 
        add(tf1); 
        add(tf2); 
        add(tf3); 
        add(tf4); 
        add(tf5); 
        add(tf6); 
        add(area1); 
        add(area2); 
        add(l15); 
        add(r5); 
        add(r6); 
        add(cb); 
        add(list1); 
        add(list2); 
        add(label); 
        add(Receipt); 
        add(b2); 
        add(Print); 
  

  
        // Reset the text fields 
        b2.addActionListener( 
            new ActionListener() { 
                public void actionPerformed( 
                    ActionEvent e) 
                { 
                    area2.setText(""); 
                    area1.setText(" "); 
                    tf1.setText(""); 
                    tf2.setText(""); 
                    tf3.setText(""); 
                    tf4.setText(""); 
                    tf5.setText(""); 
                    tf6.setText(" "); 
                } 
            }); 
  
        // Implementing the Print action 
        Print.addActionListener( 
            new ActionListener() { 
                public void actionPerformed( 
                    ActionEvent e) 
                { 
                    try { 
                        area2.print(); 
                    } 
                    catch (java.awt.print 
                               .PrinterException a) { 
                        System.err.format( 
                            "NoPrinter Found", 
                            a.getMessage()); 
                    } 
                } 
            }); 
  
        // Generating the receipt 
        Receipt.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) 
            { 
  
                area2.setText( 
                    "--------"
                    + "----------- Hotel Receipt ----"
                    + "-------------------\n"); 
  
                area2.setText(area2.getText() 
                              + "Guest Name: "
                              + tf1.getText() 
                              + "\n"); 
                area2.setText(area2.getText() 
                              + "Number of Guest: "
                              + tf2.getText() 
                              + "\n"); 
                area2.setText(area2.getText() 
                              + "Date: "
                              + tf3.getText() 
                              + "\n"); 
                area2.setText(area2.getText() 
                              + "Email Address: "
                              + tf4.getText() 
                              + "\n"); 
                area2.setText(area2.getText() 
                              + "Contact Number: "
                              + tf5.getText() 
                              + "\n"); 
  
                if(list1.getSelectedValue() != null) {
                	area2.setText(area2.getText() 
                              + "Room Type: "
                              + list1.getSelectedValue()  
                               + "\n"); 
                }
                
                if(list2.getSelectedValue() != null) {
                    area2.setText(area2.getText() 
                            + "Breakfast Option: "
                            + list2.getSelectedValue()
                            + "\n"); 
                }
  
                int index1 = list1.getSelectedIndex(); 
                int index2 = list2.getSelectedIndex(); 
                int totalBill = 0;
                
                if(index1 == 0) {
                	totalBill += 120;
                }else if(index1 ==1) {
                	totalBill += 150;
                }else if(index1 == 2) {
                	totalBill += 180;
                }else if (index1 == 3) {
                	totalBill += 200;
                }else if (index1 == 4) {
                	totalBill += 250;
                }
                
                if(index2 == 0 ) {
                	totalBill += 20;
                }
                area2.setText(area2.getText() 
                      + "Total bill "
                      + "is " + totalBill + "   \n"); 
                
                
                if (e.getSource() == Receipt) { 
                    try { 
                        FileWriter fw 
                            = new FileWriter( 
                                "java.txt", true); 
                        fw.write(area2.getText()); 
                        fw.close(); 
                    } 
                    catch (Exception ae) { 
                        System.out.println(ae); 
                    } 
                } 
  
                JOptionPane.showMessageDialog( 
                    area2, "DATA SAVED SUCESSFULLY"); 
            }; 
        }); 
        addWindowListener( 
            new WindowAdapter() { 
                public void windowClosing( 
                    WindowEvent we) 
                { 
                    System.exit(0); 
                } 
            }); 
        setSize(800, 800); 
        setLayout(null); 
        setVisible(true); 
        Color red = Color.decode("#C8C8C8");

        setBackground(red); 
    } 
    public static void main(String[] args) 
    { 
        new HotelSystem(); 
    } 
}