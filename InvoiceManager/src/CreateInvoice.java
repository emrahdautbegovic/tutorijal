import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class CreateInvoice {
	int ids=0;
	public JFrame frame = new JFrame();
	List<String> myList = new ArrayList<String>();
	String name,am,pr;
	int amo, pri;
	InvoiceItem item;
	private JTextField textFieldName;
	private JTextField textFieldPrice;
	private JTextField textFieldAmount;
	private JTable table;
	private JTextField textFieldOverall;
	public static List<Invoice> in;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateInvoice window = new CreateInvoice(in);
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
	public CreateInvoice(List<Invoice> i) {
		initialize(i);
	}

	
	private void initialize(List<Invoice> i) {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 734, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblSelectCustomer = new JLabel("Select Customer:");
		lblSelectCustomer.setBounds(33, 11, 123, 14);
		frame.getContentPane().add(lblSelectCustomer);
		
		 
         try {
        	    File f = new File("C:\\Users\\Dell3\\Desktop\\Customers.txt");
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                while(br.ready()){
                    myList.add(br.readLine());
                }
                br.close();
         } catch(Exception e){
             System.out.println(e+"sad");
      }
         
         JComboBox<Customer> cbCustomer = new JComboBox<Customer>();
 		cbCustomer.setBounds(33, 36, 96, 20);
 		frame.getContentPane().add(cbCustomer);
 		
         for(int j=0; j<myList.size(); j++)
         {
        	 cbCustomer.addItem(new Customer(myList.get(j)));
         }
        
		
		JLabel lblAddItem = new JLabel("Add Item:");
		lblAddItem.setBounds(250, 11, 83, 14);
		frame.getContentPane().add(lblAddItem);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(260, 39, 350, 155);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblArticleName = new JLabel("Item Name: ");
		lblArticleName.setBounds(23, 11, 95, 14);
		panel.add(lblArticleName);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(95, 8, 142, 20);
		panel.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblArticlePrice = new JLabel("Item Price:");
		lblArticlePrice.setBounds(23, 43, 95, 14);
		panel.add(lblArticlePrice);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setBounds(95, 40, 142, 20);
		panel.add(textFieldPrice);
		textFieldPrice.setColumns(10);
		
		JLabel lblAmount = new JLabel("Amount:");
		lblAmount.setBounds(33, 76, 62, 14);
		panel.add(lblAmount);
		
		textFieldAmount = new JTextField();
		textFieldAmount.setBounds(95, 72, 142, 23);
		panel.add(textFieldAmount);
		textFieldAmount.setColumns(10);
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				name = textFieldName.getText();
				am = textFieldAmount.getText();
				pr = textFieldPrice.getText();
				amo = Integer.parseInt(am);
				pri = Integer.parseInt(pr);
				item = new InvoiceItem(ids, name, pri, amo, pri*amo);
				ids++;
			}
		});
		btnConfirm.setBounds(238, 121, 89, 23);
		panel.add(btnConfirm);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnClose.setBounds(619, 352, 89, 23);
		frame.getContentPane().add(btnClose);
		
		JLabel lblItems = new JLabel("Items:");
		lblItems.setBounds(33, 70, 46, 14);
		frame.getContentPane().add(lblItems);
		
		table = new JTable();
		table.setBounds(47, 360, 182, -242);
		frame.getContentPane().add(table);
		
		JLabel lblOverallPrice = new JLabel("Overall Price: ");
		lblOverallPrice.setBounds(334, 314, 96, 14);
		frame.getContentPane().add(lblOverallPrice);
		
		textFieldOverall = new JTextField();
		textFieldOverall.setBounds(440, 311, 170, 20);
		frame.getContentPane().add(textFieldOverall);
		textFieldOverall.setColumns(10);
		
		JButton btnAddInvoice = new JButton("Add Invoice");
		btnAddInvoice.setBounds(619, 310, 89, 23);
		frame.getContentPane().add(btnAddInvoice);
		
		
	}
}
