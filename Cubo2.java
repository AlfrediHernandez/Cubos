import javax.swing.*;
import java.awt.*;
public class Cubo2{
	public static void main(String [] ar){
		Marco2 mimarco =new Marco2();
		mimarco.setDefaultCloseOperation(3);
		mimarco.setResizable(false);
		mimarco.setSize(400,400);
		mimarco.setLocationRelativeTo(null);
		mimarco.setVisible(true);
		mimarco.setTitle("Alfredihdz 27-Octubre-2020");
		mimarco.setBackground(Color.black);
	}
}
class Marco2 extends JFrame{
	public Marco2(){
		Lamina2 milamina =new Lamina2();
		add(milamina);
	}
}
class Lamina2 extends JPanel{
	public void paint(Graphics g){
		g.setColor(Color.green);
		g.drawRect(20,20,200,200);
		g.drawRect(100,100,200,200);
		g.setColor(Color.white);
		g.drawLine(20,20,100,100);
		g.drawLine(220,20,300,100);
		g.drawLine(20,220,100,300);
		g.drawLine(220,220,300,300);
	}
}