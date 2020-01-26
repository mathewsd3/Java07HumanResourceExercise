package hr;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HumanRes extends JFrame{

	int amt=0;

	public HumanRes(String title)
	{
		super(title);
		//Container contentPane = getContentPane();
		//BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(100,100,100,100));
		JPanel contentPane = (JPanel)getContentPane();
		contentPane.setLayout(new GridLayout(20,1,10,0));

		contentPane.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		//contentPane.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));

		setContentPane(contentPane);

		JLabel num = new JLabel("Number:");
		
		//-->
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		
		JLabel firstName = new JLabel("First name: ");
		JTextField textFirst = new JTextField("                         ");

		//c.add(firstName);
		//c.add(textFirst);
		//-->
		
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		
		JLabel lastName = new JLabel("Last name: ");
		JTextField textLast = new JTextField("                          ");
		
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout());
		
		JLabel Age = new JLabel("Age: ");
		JTextField textAge = new JTextField("      ");
		
		JRadioButton perm = new JRadioButton("Permanent");
		JRadioButton contr = new JRadioButton("Contractual");

		JPanel p4 = new JPanel();
		p4.setLayout(new FlowLayout());
		
		JLabel Sal = new JLabel("Salary / wage: ");
		JTextField textSal = new JTextField("               ");

		JPanel p5 = new JPanel();
		p5.setLayout(new FlowLayout());
		JLabel Daypy = new JLabel("Days per year: ");
		JTextField dpy = new JTextField("");		
		
		JPanel p6 = new JPanel();
		p6.setLayout(new FlowLayout());
		
		JButton Add = new JButton("Add");
		JButton Remove = new JButton("Remove");
		JButton Display = new JButton("Display");
		JButton Exit = new JButton("Exit");

		JLabel capacity = new JLabel("Capacity:");
		JLabel size = new JLabel("Size:");

		contentPane.add(num);
		//contentPane.add(firstName);
		//contentPane.add(textFirst);
		
		p1.add(firstName);
		p1.add(textFirst);
		
		p2.add(lastName);
		p2.add(textLast);
		
		p3.add(Age);
		p3.add(textAge);
		
		p4.add(Sal);
		p4.add(textSal);
		
		p5.add(Add);
		p5.add(Remove);
		p5.add(Display);
		p5.add(Exit);
		
		contentPane.add(p1);
		contentPane.add(p2);
		contentPane.add(p3);
		contentPane.add(p4);
		contentPane.add(p5);
	
		//contentPane.add(Age);		
		//contentPane.add(textAge);
		
		contentPane.add(perm);		
		contentPane.add(contr);	
		
		contentPane.add(p4);
		
		//contentPane.add(Sal);		
		//contentPane.add(textSal);	

		contentPane.add(p5);
		
		//contentPane.add(Daypy);		
		//contentPane.add(dpy);		
		
		//contentPane.add(Add);		
		//contentPane.add(Remove);
		
		//contentPane.add(Display);		
		//contentPane.add(Exit);		
		contentPane.add(capacity);		
		contentPane.add(size);	
		
		
		ActionListener listener = new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent event)
			{

				Object source = event.getSource();
				if (source == Add)
				{
					//amount = amount + Integer.parseInt(textField.getText());
					//amt = amt + Integer.parseInt(textField.getText());
					capacity.setText("Amount Deposited is : " + amt +" $ ");
					
				}
				else if (source == Remove)
				{
					//int textval = Integer.parseInt(textField.getText());
					//amt = amt - textval;
					//status.setText("Amount Withdrawn is : " + amt + " $ ");
					//status.setText(String.valueOf(amt));

				}
				else if (source == Exit)
				{
					capacity.setText("Exiting Program");
					System.exit(1);
				}
				
				
	
			}
		};

		Add.addActionListener(listener);
		Remove.addActionListener(listener);
		Display.addActionListener(listener);		
		Exit.addActionListener(listener);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setSize(500,700);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
