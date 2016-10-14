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
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField pass;

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
		setBounds(100, 100, 607, 391);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(161, 122, 135, 43);
		lblUsuario.setFont(new Font("Verdana", Font.BOLD, 26));
		contentPane.add(lblUsuario);
		
<<<<<<< HEAD
		JLabel lblContrasea = new JLabel("Contrase�a:");
=======
		JLabel lblContrasea = new JLabel("Contrasena:");
>>>>>>> refs/remotes/origin/master
		lblContrasea.setBounds(161, 181, 201, 56);
		lblContrasea.setFont(new Font("Verdana", Font.BOLD, 26));
		contentPane.add(lblContrasea);
		
		user = new JTextField();
		user.setBounds(376, 131, 175, 35);
		contentPane.add(user);
		user.setColumns(10);
		
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
		btnIngresar.addActionListener(new ActionListener() {
<<<<<<< HEAD
			
			public void actionPerformed(ActionEvent e) {
			if(Metodos.esVacio(user.getText())||Metodos.tieneEspacio(user.getText())){
				
			}
			
			}
=======
			public void actionPerformed(ActionEvent e) {
				if(Metodos.esVacio(user.getText())){
					System.out.println("no puede quedar vacio");
				}
				
			}
>>>>>>> refs/remotes/origin/master
		});
		btnIngresar.setBounds(188, 262, 186, 61);
		btnIngresar.setFont(new Font("Verdana", Font.ITALIC, 22));
		contentPane.add(btnIngresar);
		
		pass = new JPasswordField();
		pass.setBounds(374, 189, 175, 35);
		contentPane.add(pass);
	}
}
