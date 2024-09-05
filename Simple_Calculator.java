//Simple calculator using swing
/*write a java program that works as a simple calculator use a grid layout
 * to arrange buttons for the digits & for the +,-,*,%,/ operations.
 * add a TextField to display the result.  
 */
package student;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Simple_Calculator extends JFrame implements ActionListener
{
	JPanel p1,p2;
	JTextField t1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bdiv,bmul,beq,bc;
	int op=0;
	double a=0,b=0,result=0;
	Simple_Calculator()
	{
		super();
		p1=new JPanel();
		p2=new JPanel();
		t1=new JTextField(40);
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		bdot=new JButton(".");
		badd=new JButton("+");
		bsub=new JButton("-");
		bdiv=new JButton("/");
		bmul=new JButton("*");
		beq=new JButton("=");
		bc=new JButton("Clear");
		add(p1);
		add(p2);
		setLayout(new FlowLayout());
		p1.add(t1);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(b0);
		p2.add(bdot);
		p2.add(badd);
		p2.add(bsub);
		p2.add(bmul);
		p2.add(beq);
		p2.add(bdiv);
		p2.add(bc);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		bdot.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		beq.addActionListener(this);
		bc.addActionListener(this);
		p1.setLayout(new FlowLayout());
		p2.setLayout(new GridLayout(4,4,10,10));
		setTitle("Simple Calculator");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			t1.setText(t1.getText()+"1");
		}
		if(e.getSource()==b2)
		{
			t1.setText(t1.getText()+"2");
		}
		if(e.getSource()==b3)
		{
			t1.setText(t1.getText()+"3");
		}
		if(e.getSource()==b4)
		{
			t1.setText(t1.getText()+"4");
		}
		if(e.getSource()==b5)
		{
			t1.setText(t1.getText()+"5");
		}
		if(e.getSource()==b6)
		{
			t1.setText(t1.getText()+"6");
		}
		if(e.getSource()==b7)
		{
			t1.setText(t1.getText()+"7");
		}
		if(e.getSource()==b8)
		{
			t1.setText(t1.getText()+"8");
		}
		if(e.getSource()==b9)
		{
			t1.setText(t1.getText()+"9");
		}
		if(e.getSource()==b0)
		{
			t1.setText(t1.getText()+"0");
		}
		if(e.getSource()==bdot)
		{
			t1.setText(t1.getText()+".");
		}
		if(e.getSource()==badd)
		{
		   op=1;
		   a=Double.parseDouble(t1.getText());
				   t1.setText(" ");
		}
		if(e.getSource()==bsub)
		{
		   op=2;
		   a=Double.parseDouble(t1.getText());
				   t1.setText(" ");
		}
		if(e.getSource()==bmul)
		{
		   op=3;
		   a=Double.parseDouble(t1.getText());
				   t1.setText(" ");
		}
		if(e.getSource()==bdiv)
		{
		   op=4;
		   a=Double.parseDouble(t1.getText());
				   t1.setText(" ");
		}
		if(e.getSource()==beq)
		{
		   b=Double.parseDouble(t1.getText());
	
		switch(op)
		{
		  case 1:result=a+b;break;
		  case 2:result=a-b;break;
		  case 3:result=a*b;break;
		  case 4:result=a/b;break;
		  default:t1.setText(" ");
		}
		t1.setText(" "+result);
		}
		if(e.getSource()==bc)
		{
			t1.setText(" ");
		}
		}
	public static void main(String[] args) 
	{
		Simple_Calculator ob=new Simple_Calculator();
	}
	}
