package hr;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable() {
			//-->anonymous inner class
			@Override
			public void run() {
				// TODO Auto-generated method stub
				HumanRes hr = new HumanRes("Human Resources");
			}
			//-->
		});
	}
}
