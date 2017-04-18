public class Control 
{
	public static void main(String args[]) 
    {
        //Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
            	//allows users to see User Interface
                new MyUserInterface().setVisible(true);
            }
        });
    }
}