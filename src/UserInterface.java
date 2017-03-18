import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UserInterface extends JFrame implements ActionListener
{
	public void Frame()
	{
		JButton ok =new JButton ("OK");
		JPanel panel=new JPanel();
		
		ok.addActionListener(this);
		
		
		panel.add(ok);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
