package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Pessoa;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrimeiroNome;
	private JTextField txtSobrenome;
	private JButton btnNewButton;
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {

		JLabel label = new JLabel("New label");
		getContentPane().add(label, BorderLayout.NORTH);
		setTitle("TelaCadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 231, 225);
		contentPane = new JPanel();
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPrimeiroNome = new JLabel("Primeiro Nome");
		lblPrimeiroNome.setBounds(10, 39, 73, 15);
		lblPrimeiroNome.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblPrimeiroNome);

		txtPrimeiroNome = new JTextField();
		txtPrimeiroNome.setBounds(88, 37, 86, 20);
		contentPane.add(txtPrimeiroNome);
		txtPrimeiroNome.setColumns(10);

		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setBounds(10, 67, 53, 15);
		lblSobrenome.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblSobrenome);

		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(88, 68, 86, 20);
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);

		JButton btnNewButton = new JButton("Salvar Cadastro");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// Pega o texto digitado pelo usuario
				String nome = lblPrimeiroNome.getText();
				String sobrenome = lblSobrenome.getText();

				if (nome.isEmpty() || sobrenome.isEmpty()) {

					JOptionPane.showMessageDialog(null, "Preencha todos os campos");

				} else {
					//cria objeto pessoa
					Pessoa p = new Pessoa();
					//seta valores para obj pessoa
					p.setPrimeiroNome(nome);
					p.setSobrenome(sobrenome);
					
					String msg = "Cadastro com sucesso! \n"+ 
					"Você cadastrou: " + " " + p.getPrimeiroNome() +" " + p.getSobrenome();
					JOptionPane.showMessageDialog(null, msg);
					

				}
			}
		});
		btnNewButton.setBounds(45, 122, 129, 23);
		contentPane.add(btnNewButton);
		
		btnLimpar = new JButton("Limpar campos");
		btnLimpar.addActionListener(new ActionListener()){
			
			
		}
		
		
		
		btnLimpar.setBounds(55, 152, 108, 23);
		contentPane.add(btnLimpar);
	}
}
