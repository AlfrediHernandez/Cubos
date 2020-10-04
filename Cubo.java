import javax.swing.*;
import java.awt.*;
public class Cubo{
	public static void main(String [] ar){
		Marco mimarco = new Marco();
		mimarco.setDefaultCloseOperation(3);
		mimarco.setResizable(false);
		mimarco.setSize(300,250);
		mimarco.setLocationRelativeTo(null);
		mimarco.setVisible(true);
		mimarco.setBackground(Color.black);
		mimarco.setTitle("Alfredi 4-oct-2020");
	}
}
class Marco extends JFrame{
	public Marco(){
		Lamina milamina = new Lamina();
		add(milamina);
	}
}
class Lamina extends JPanel{
	public void paint(Graphics g){
		g.setColor(Color.orange);
		g.drawRect(10,10,100,100);
		g.setColor(Color.red);
		g.drawRect(50,50,100,100);
		g.drawLine(10,10,50,50);
		g.drawLine(10,110,50,150);
		g.drawLine(150,50,110,10);
		g.drawLine(150,150,110,110);
	}
}