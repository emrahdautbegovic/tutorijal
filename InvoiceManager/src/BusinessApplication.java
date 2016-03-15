import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BusinessApplication {

	public JFrame frame = new JFrame();
	private JTable table;
	public int invoiceID=1;
	public static List<Invoice> invoices = new ArrayList<Invoice>();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BusinessApplication window = new BusinessApplication(invoices);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BusinessApplication(List<Invoice> i) {
		initialize(i);
	}
	
	public void showApp(List<Invoice> i) {
		initialize(i);
	}

	public void initialize()
    {	
	}
	private void initialize(List<Invoice> i) {
		invoices = i;
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 434, 236);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblInvoices = new JLabel("Invoices");
		lblInvoices.setBounds(21, 11, 89, 14);
		panel.add(lblInvoices);
		
		table = new JTable();
		table.setBounds(41, 216, 118, -182);
		panel.add(table);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBackground(Color.PINK);
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		btnClose.setBounds(319, 202, 89, 23);
		panel.add(btnClose);
		
		JButton btnEdit = new JButton("Edit ");
		btnEdit.setBounds(319, 156, 89, 23);
		panel.add(btnEdit);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateInvoice c = new CreateInvoice(invoices);
				c.frame.setVisible(true);
			}
		});
		btnCreate.setBounds(319, 111, 89, 23);
		panel.add(btnCreate);
		
	}
}
