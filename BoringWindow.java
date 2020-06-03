import javax.swing.*;
public class BoringWindow extends JFrame
{
	public static void main ( String[] args )
	{
		JFrame window = new BoringWindow();
		window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );	
		window.setSize(300,200);
		window.setVisible(true);
	}
}