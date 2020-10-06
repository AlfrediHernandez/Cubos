import javax.swing.*;
import java.awt.*;
public class Cubo1{
	public static void main(String [] ar){
		Marco1 mimarco = new Marco1();
		mimarco.setDefaultCloseOperation(3);
		mimarco.setResizable(false);
		mimarco.setSize(400,400);
		mimarco.setLocationRelativeTo(null);
		mimarco.setVisible(true);
		mimarco.setTitle("Alfredi 6-oct-2020");
		mimarco.setBackground(Color.black);
	}
}
class Marco1 extends JFrame{
	public Marco1(){
		Lamina1 milamina = new Lamina1();
		add(milamina);
	}
}
class Lamina1 extends JPanel{
	public void paint(Graphics g){
		g.setColor(Color.red);
		g.drawRect(20,20,200,200);
		g.setColor(Color.blue);
		g.drawRect(100,100,200,200);
		g.setColor(Color.pink);
		g.drawLine(20,20,100,100);
		g.drawLine(220,20,300,100);
		g.drawLine(20,220,100,300);
		g.drawLine(220,220,300,300);
	}
}