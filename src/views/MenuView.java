package Views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnEJ1;
	private JButton btnEJ2;
	private JButton btnEJ3;

	public MenuView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitleLabel = new JLabel("GRUPO NRO: 15");
		lblTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitleLabel.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		contentPane.add(lblTitleLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{85, 81, 81, 81, 0};
		gbl_panel.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		btnEJ1 = new JButton("Ejercicio 1");
		btnEJ1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		GridBagConstraints gbc_btnEJ1 = new GridBagConstraints();
		gbc_btnEJ1.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnEJ1.insets = new Insets(0, 0, 5, 5);
		gbc_btnEJ1.gridx = 2;
		gbc_btnEJ1.gridy = 1;
		panel.add(btnEJ1, gbc_btnEJ1);
		
		btnEJ2 = new JButton("Ejercicio 2");
		btnEJ2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		GridBagConstraints gbc_btnEJ2 = new GridBagConstraints();
		gbc_btnEJ2.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnEJ2.insets = new Insets(0, 0, 5, 5);
		gbc_btnEJ2.gridx = 2;
		gbc_btnEJ2.gridy = 3;
		panel.add(btnEJ2, gbc_btnEJ2);
		
		btnEJ3 = new JButton("Ejercicio 3");
		btnEJ3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		GridBagConstraints gbc_btnEJ3 = new GridBagConstraints();
		gbc_btnEJ3.insets = new Insets(0, 0, 5, 5);
		gbc_btnEJ3.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnEJ3.gridx = 2;
		gbc_btnEJ3.gridy = 5;
		panel.add(btnEJ3, gbc_btnEJ3);
		
		initializeButtonActions();
	}

	private void initializeButtonActions() {
		btnEJ1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				openEj1View();
			}
		});
	}
	
	private void openEj1View() {
		setVisible(false);
		
		Ej1View ej1View = new Ej1View();
		ej1View.setVisible(true);

		ej1View.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(true);
			}
		});
	}
}
