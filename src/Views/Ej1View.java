package Views;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class Ej1View extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textLastname;
	private JTextField textPhone;
	private JTextField textDateBirth;
	private JLabel lblData;
	private JLabel lblDataTitle;
	private JButton btnShow;

	public Ej1View() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 367, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		FormLayout fl_contentPane = new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,});
		contentPane.setLayout(fl_contentPane);
		
		JLabel lblName = new JLabel("Nombre");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		contentPane.add(lblName, "4, 4");
		
		textName = new JTextField();
		textName.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		contentPane.add(textName, "6, 4, center, fill");
		textName.setColumns(10);
		
		JLabel lblLastname = new JLabel("Apellido");
		lblLastname.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastname.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		contentPane.add(lblLastname, "4, 8");
		
		textLastname = new JTextField();
		textLastname.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		textLastname.setColumns(10);
		contentPane.add(textLastname, "6, 8, center, fill");
		
		JLabel lblPhone = new JLabel("Teléfono");
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		contentPane.add(lblPhone, "4, 12");
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		textPhone.setColumns(10);
		contentPane.add(textPhone, "6, 12, center, fill");
		
		JLabel lblDateBirth = new JLabel("Fecha de nacimiento");
		lblDateBirth.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDateBirth.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		contentPane.add(lblDateBirth, "4, 16");
		
		textDateBirth = new JTextField();
		textDateBirth.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		textDateBirth.setColumns(10);
		contentPane.add(textDateBirth, "6, 16, center, fill");
		
		btnShow = new JButton("Mostrar");
		btnShow.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		contentPane.add(btnShow, "4, 20, 3, 1");
		
		JSeparator separator = new JSeparator();
		contentPane.add(separator, "1, 22, 9, 1");
		
		lblDataTitle = new JLabel("Los datos ingresados fueron:");
		lblDataTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDataTitle.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		contentPane.add(lblDataTitle, "4, 24, 3, 1, center, default");
		
		lblData = new JLabel("Hello");
		lblData.setHorizontalAlignment(SwingConstants.RIGHT);
		lblData.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		contentPane.add(lblData, "4, 26, 3, 1, center, default");
		
	    btnShow.addActionListener(e -> {
	        if (validateFields()) {
	            String name = textName.getText();
	            String lastname = textLastname.getText();
	            String phone = textPhone.getText();
	            String dateBirth = textDateBirth.getText();
	            
	            String data = "Nombre: " + name + ", Apellido: " + lastname + 
	                          ", Teléfono: " + phone + ", Fecha de nacimiento: " + dateBirth;
	            
	            lblData.setText(data);
	            
	            clearFields();
	        } else {
	            lblData.setText("Por favor, complete todos los campos.");
	        }
	    });
		
	}
	
	private boolean validateFields() {
	    boolean allFieldsFilled = true;

	    textName.setBackground(Color.WHITE);
	    textLastname.setBackground(Color.WHITE);
	    textPhone.setBackground(Color.WHITE);
	    textDateBirth.setBackground(Color.WHITE);

	    if (textName.getText().isEmpty()) {
	        textName.setBackground(Color.RED);
	        allFieldsFilled = false;
	    }

	    if (textLastname.getText().isEmpty()) {
	        textLastname.setBackground(Color.RED);
	        allFieldsFilled = false;
	    }

	    if (textPhone.getText().isEmpty()) {
	        textPhone.setBackground(Color.RED);
	        allFieldsFilled = false;
	    }

	    if (textDateBirth.getText().isEmpty()) {
	        textDateBirth.setBackground(Color.RED);
	        allFieldsFilled = false;
	    }

	    return allFieldsFilled;
	}
	
	private void clearFields() {
	    textName.setText("");
	    textLastname.setText("");
	    textPhone.setText("");
	    textDateBirth.setText("");
	    
	    textName.setBackground(Color.WHITE);
	    textLastname.setBackground(Color.WHITE);
	    textPhone.setBackground(Color.WHITE);
	    textDateBirth.setBackground(Color.WHITE);
	}

}
