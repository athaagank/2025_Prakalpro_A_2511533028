package pekan8_2511533028;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatika_2511533028 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel txthasil;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"Peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void pesanEror(String pesan) {
		JOptionPane.showConfirmDialog(this, pesan,"Eror", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatika_2511533028 frame = new OperatorAritmatika_2511533028();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OperatorAritmatika_2511533028() {
		setResizable(false);
		setTitle("Operator Aritmatika");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 298);
		txthasil = new JPanel();
		txthasil.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(txthasil);
		txthasil.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		lblNewLabel.setBounds(65, 10, 209, 23);
		txthasil.add(lblNewLabel);
		
		JLabel lblBilangan = new JLabel("Bilangan 2");
		lblBilangan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBilangan.setBounds(10, 74, 75, 23);
		txthasil.add(lblBilangan);
		
		JLabel lblNewLabel_2 = new JLabel("Operator");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 149, 65, 23);
		txthasil.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 51, 75, 23);
		txthasil.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Hasil");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(10, 191, 45, 13);
		txthasil.add(lblNewLabel_3);
		
		txtBil1 = new JTextField();
		txtBil1.setBounds(95, 55, 64, 19);
		txthasil.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setBounds(95, 78, 64, 19);
		txthasil.add(txtBil2);
		txtBil2.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(100, 152, 51, 21);
		txthasil.add(cbOperator);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 1 harus diisi");
				} else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 2 harus diisi");
				} else {
					try {
				int a = Integer.parseInt(txtBil1.getText());
				int b = Integer.parseInt(txtBil2.getText());
				int c = cbOperator.getSelectedIndex();
				int hasil = 0;
				if(c==0) {hasil=a+b;}
				if(c==1) {hasil=a-b;}
				if(c==2) {hasil=a*b;}
				if(c==3) {hasil=a/b;}
				if(c==4) {hasil=a%b;} 
					} catch (NumberFormatException ex) {
					pesanEror("Bilangan 1 dan Bilangan 2 harus angka");
				}
			}
			txtHasil.setText(String.valueOf(txtHasil));
			}
		});
		btnNewButton.setBounds(161, 152, 85, 21);
		txthasil.add(btnNewButton);
		
		txtHasil = new JTextField();
		txtHasil.setBounds(95, 190, 64, 19);
		txthasil.add(txtHasil);
		txtHasil.setColumns(10);

	}
}
