package Diagnostico2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JTextArea;

public class Vista extends JFrame
{

	JPanel contentPane;
	JTextField jtextFieldN;
	JTable table;
	JButton btnGenerarMatrizAumentada,btnLimpiar,btnResolverElSistema;
	JTextArea textArea;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Vista() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumeroDeIncognitas = new JLabel("Numero de incognitas ");
		lblNumeroDeIncognitas.setBounds(26, 32, 106, 14);
		contentPane.add(lblNumeroDeIncognitas);
		
		jtextFieldN = new JTextField();
		jtextFieldN.setBounds(142, 29, 86, 20);
		contentPane.add(jtextFieldN);
		jtextFieldN.setColumns(10);
		
		btnGenerarMatrizAumentada = new JButton("Generar matriz aumentada ");
		btnGenerarMatrizAumentada.setBounds(239, 28, 168, 23);
		contentPane.add(btnGenerarMatrizAumentada);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"x"
			}
		));
		table.setBackground(Color.LIGHT_GRAY);
		table.setBounds(26, 84, 383, 62);
		contentPane.add(table);
		
		textArea = new JTextArea();
		textArea.setBounds(419, 84, 247, 225);
		contentPane.add(textArea);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(510, 330, 89, 23);
		contentPane.add(btnLimpiar);
		
		btnResolverElSistema = new JButton("Resolver el sistema lineal");
		btnResolverElSistema.setBounds(26, 170, 173, 23);
		contentPane.add(btnResolverElSistema);
	}
}
