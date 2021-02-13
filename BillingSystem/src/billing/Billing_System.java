package billing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.SwingConstants;

public class Billing_System {

	private JFrame frame;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	
	
	
	
	double Labour=40;
	double Travel=3;
	double Plastic=3;
	double Copper=7.5;
	double Chrome=8.5;
	double iTax=0.75;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing_System window = new Billing_System();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Billing_System() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				
				
				 textField_1.setEnabled(false);
				 textField_2.setEnabled(false);
				 textField_3.setEnabled(false);
				 textField_4.setEnabled(false);
				 textField_5.setEnabled(false);
			}
		});
		frame.setBounds(0, 0, 1370, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox chlabour = new JCheckBox("Labour");
		chlabour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chlabour.isSelected())
				{
					textField_1.setEnabled(true);
					textField_1.setText("0");
					textField_1.requestFocus();
				}
				else {
					textField_1.setEnabled(false);
					textField_1.setText("0");
				}
				
			}
		});
		chlabour.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chlabour.setBounds(46, 128, 85, 39);
		frame.getContentPane().add(chlabour);
		
		JCheckBox chtravel = new JCheckBox("Travel");
		chtravel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chtravel.isSelected())
				{
					textField_2.setEnabled(true);
					textField_2.setText("0");
					textField_2.requestFocus();
				}
				else {
					textField_2.setEnabled(false);
					textField_2.setText("0");
				}
			}
		});
		chtravel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chtravel.setBounds(46, 175, 85, 39);
		frame.getContentPane().add(chtravel);
		
		JCheckBox chplastic = new JCheckBox("Plastic");
		chplastic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chplastic.isSelected())
				{
					textField_3.setEnabled(true);
					textField_3.setText("0");
					textField_3.requestFocus();
				}
				else {
					textField_3.setEnabled(false);
					textField_3.setText("0");
				}
			}
		});
		chplastic.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chplastic.setBounds(46, 216, 85, 39);
		frame.getContentPane().add(chplastic);
		
		JCheckBox chcopper = new JCheckBox("Copper");
		chcopper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chcopper.isSelected())
				{
					textField_4.setEnabled(true);
					textField_4.setText("0");
					textField_4.requestFocus();
				}
				else {
					textField_4.setEnabled(false);
					textField_4.setText("0");
				}
			}
		});
		chcopper.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chcopper.setBounds(46, 273, 85, 39);
		frame.getContentPane().add(chcopper);
		
		JCheckBox chchrome = new JCheckBox("Chrome");
		chchrome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chchrome.isSelected())
				{
					textField_5.setEnabled(true);
					textField_5.setText("0");
					textField_5.requestFocus();
				}
				else {
					textField_5.setEnabled(false);
					textField_5.setText("0");
				}
			}
		});
		chchrome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chchrome.setBounds(46, 311, 85, 39);
		frame.getContentPane().add(chchrome);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("0");
		textField_2.setBounds(186, 175, 135, 31);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("0");
		textField_1.setBounds(186, 128, 135, 31);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setText("0");
		textField_4.setColumns(10);
		textField_4.setBounds(186, 279, 135, 31);
		frame.getContentPane().add(textField_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("0");
		textField_3.setColumns(10);
		textField_3.setBounds(186, 222, 135, 31);
		frame.getContentPane().add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setText("0");
		textField_5.setColumns(10);
		textField_5.setBounds(186, 323, 135, 31);
		frame.getContentPane().add(textField_5);
		
		JLabel txtsubtotal = new JLabel("Sub Total");
		txtsubtotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtsubtotal.setBounds(56, 441, 166, 53);
		frame.getContentPane().add(txtsubtotal);
		
		JLabel txttax = new JLabel("Tax");
		txttax.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txttax.setBounds(56, 515, 166, 53);
		frame.getContentPane().add(txttax);
		
		JLabel txttotal = new JLabel("Total");
		txttotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txttotal.setBounds(46, 578, 166, 53);
		frame.getContentPane().add(txttotal);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(186, 449, 135, 31);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setColumns(10);
		textField_7.setBounds(186, 525, 135, 31);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setColumns(10);
		textField_8.setBounds(186, 601, 135, 31);
		frame.getContentPane().add(textField_8);
		
		JLabel txtcostoflabour = new JLabel("Cost of Labour");
		txtcostoflabour.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtcostoflabour.setBounds(512, 132, 140, 31);
		frame.getContentPane().add(txtcostoflabour);
		
		JLabel txtcostoftravelling = new JLabel("Cost of travelling");
		txtcostoftravelling.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtcostoftravelling.setBounds(512, 175, 140, 31);
		frame.getContentPane().add(txtcostoftravelling);
		
		JLabel txtCostOfPlastic = new JLabel("Cost of Plastic");
		txtCostOfPlastic.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCostOfPlastic.setBounds(512, 222, 140, 31);
		frame.getContentPane().add(txtCostOfPlastic);
		
		JLabel txtCostOfCopper = new JLabel("Cost of Copper");
		txtCostOfCopper.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCostOfCopper.setBounds(512, 273, 140, 31);
		frame.getContentPane().add(txtCostOfCopper);
		
		JLabel txtCostOfChrome = new JLabel("Cost of Chrome");
		txtCostOfChrome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCostOfChrome.setBounds(512, 326, 140, 31);
		frame.getContentPane().add(txtCostOfChrome);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setColumns(10);
		textField_9.setBounds(714, 128, 135, 31);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setColumns(10);
		textField_10.setBounds(714, 175, 135, 31);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setColumns(10);
		textField_11.setBounds(714, 222, 135, 31);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setColumns(10);
		textField_12.setBounds(714, 273, 135, 31);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setColumns(10);
		textField_13.setBounds(714, 323, 135, 31);
		frame.getContentPane().add(textField_13);
		
		JButton btnTotalcost = new JButton("Total Cost");
		btnTotalcost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double l=Labour *Double.parseDouble(textField_1.getText());
				double t=Travel *Double.parseDouble(textField_2.getText());
				double p=Plastic *Double.parseDouble(textField_3.getText());
				double c=Copper *Double.parseDouble(textField_4.getText());
				double Ch=Chrome *Double.parseDouble(textField_5.getText());
				
				double SumUp=l+t+p+c+Ch;
				String S=String.format("Ruppes %.2f ",SumUp);
				
				double cTax=(iTax*SumUp)/100;
				
				textField_6.setText(S);
				
				String tTax=String.format("Ruppes %.2f ",cTax);
				
				textField_7.setText(tTax);
				
				double SumTotal=SumUp+cTax;
				
                String tTotal=String.format("Ruppes %.2f ",SumTotal);
				
				textField_8.setText(tTotal);
				
				String cost_of_l=String.format("Ruppes %.2f", l);
				textField_9.setText( cost_of_l);
				
				String cost_of_t=String.format("Ruppes %.2f", l);
				textField_10.setText( cost_of_t);
				
				String cost_of_p=String.format("Ruppes %.2f", l);
				textField_11.setText( cost_of_p);
				
				String cost_of_c=String.format("Ruppes %.2f", l);
				textField_12.setText( cost_of_c);
				
				String cost_of_chrome=String.format("Ruppes %.2f", l);
				textField_13.setText( cost_of_chrome);
				
				
				
			}
		});
		btnTotalcost.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnTotalcost.setBounds(141, 684, 180, 39);
		frame.getContentPane().add(btnTotalcost);
		
		JTextArea area2 = new JTextArea();
		area2.setBounds(987, 121, 338, 510);
		frame.getContentPane().add(area2);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
				area2.setText(null);
				
				chlabour.setSelected(false);
				chplastic.setSelected(false);
				chcopper.setSelected(false);
				chchrome.setSelected(false);
				chtravel.setSelected(false);
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnReset.setBounds(440, 684, 180, 39);
		frame.getContentPane().add(btnReset);
		
		
		
		JButton btnReciept = new JButton("Reciept");
		btnReciept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String clabour=String.format(textField_1.getText());
				String ctravel=String.format(textField_2.getText());
				String cplastic=String.format(textField_3.getText());
				String ccopper=String.format(textField_4.getText());
				String cchrome=String.format(textField_5.getText());
				
				String ccostlabour=String.format(textField_9.getText());
				String ccosttravel=String.format(textField_10.getText());
				String ccostplastic=String.format(textField_11.getText());
				String ccostcopper=String.format(textField_12.getText());
				String ccostchrome=String.format(textField_13.getText());
				
				String costtax=String.format(textField_7.getText());
				String csubtotal=String.format(textField_6.getText());
				String ctotal=String.format(textField_8.getText());
				
				
				int refs= 1325+(int)(Math.random()*4238);
				
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat tDate=new SimpleDateFormat("dd-MMM-yyy");
				tDate.format(timer.getTime());
				
				area2.append("\tbilling System\n" + "Refrences:\t\t\t" +refs +
						"\n=========================================\t"+
						 "\nLabour:\t"+ clabour + " " +" Cost Of Labour"+ ccostlabour+
						 "\nTravel:\t"+ ctravel + " " +" Cost Of Travel"+ ccosttravel+
						 "\nPlastic:\t"+ cplastic + " " +" Cost Of Plastic"+ ccostplastic+
						 "\nCopper:\t"+ ccopper + " " +" Cost Of Copper"+ ccostcopper+
						 "\nChrome:\t"+ cchrome + " " +" Cost Of Chrome"+ ccostchrome+
						 "\n=========================================\t"+
						 "\nTax:\t................"+ costtax + " " +
						 "\nSub Total :\t................"+ csubtotal + " " +
						 "\nTotal:\t................"+ ctotal + " " +
						 "\n=========================================\t"+
						 "\nDate: " +tDate.format(timer.getTime())+
						 "\nTime: " +tTime.format(timer.getTime())
						 + "\n\n\t\tThank you\n");
			}
		});
		btnReciept.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnReciept.setBounds(707, 684, 180, 39);
		frame.getContentPane().add(btnReciept);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame=new JFrame("EXIT");
				if(JOptionPane.showConfirmDialog(frame,"confirm if you want to exit","Billing System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
			System.exit(0);
		}
					}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnExit.setBounds(987, 684, 180, 39);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("Billing System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblNewLabel.setBounds(141, 10, 1000, 46);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
}
