package Export;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JComboBox;

public class haha extends JFrame{
	private JTextField txtTenLoai;
	public haha() {
		setSize(400,400);
		getContentPane().setLayout(null);
		
		JPanel pnEditLoai = new JPanel();
		pnEditLoai.setBounds(31, 52, 320, 45);
		getContentPane().add(pnEditLoai);
		pnEditLoai.setLayout(null);
		
		JLabel lblTenLoai = new JLabel("Tên Loại Sản Phẩm:");
		lblTenLoai.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTenLoai.setBounds(10, 10, 110, 25);
		pnEditLoai.add(lblTenLoai);
		
		txtTenLoai = new JTextField();
		txtTenLoai.setBounds(125, 10, 185, 25);
		pnEditLoai.add(txtTenLoai);
		txtTenLoai.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(47, 172, 200, 30);
		getContentPane().add(comboBox);
	}
	public static void main(String[] args) {
	   new haha().setVisible(true);
   
    }
}
