import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JSlider;
import javax.swing.JTree;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 362);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(151, 122, 135, 43);
		lblUsuario.setFont(new Font("Verdana", Font.BOLD, 26));
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setBounds(145, 183, 186, 56);
		lblContrasea.setFont(new Font("Verdana", Font.BOLD, 26));
		contentPane.add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(333, 132, 175, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(333, 200, 175, 35);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JLabel label = new JLabel("");
		label.setBounds(11, 112, 122, 129);
		label.setIcon(new ImageIcon("login.png"));
		contentPane.add(label);
		
		JLabel lblIngreseASu = new JLabel("Ingrese a su cuenta:");
		lblIngreseASu.setBackground(new Color(0, 0, 0));
		lblIngreseASu.setForeground(new Color(0, 0, 0));
		lblIngreseASu.setBounds(42, 29, 509, 56);
		lblIngreseASu.setFont(new Font("Verdana", Font.BOLD, 40));
		contentPane.add(lblIngreseASu);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(188, 262, 186, 61);
		btnIngresar.setFont(new Font("Verdana", Font.ITALIC, 22));
		contentPane.add(btnIngresar);
	}
}
