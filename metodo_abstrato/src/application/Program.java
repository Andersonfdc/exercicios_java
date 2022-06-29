package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.swing.JOptionPane;

import entities.Shape;
import entities.Circle;
import entities.Rectangle;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		List<Shape> list = new ArrayList<>();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of shapes: "));
		
		for (int i = 1; i <= n; i++) {
			JOptionPane.showMessageDialog(null, "Shape #" + i + " data:","DATA", i);
			
			String[] shapes = {"Rectangle", "Circle"};			
			String shape = shapes[JOptionPane.showOptionDialog(
					null, 
					"Rectangle or Circle ?",
					"SHAPE",
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE, 
					null, 
					shapes, 
					shapes[0])];
			
			String[] colorOptions = {"Black","Blue","Red"};			
			String colors = colorOptions[JOptionPane.showOptionDialog(
					null, 
					"Choose a color",
					"COLORS", 
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE, 
					null, 
					colorOptions, 
					colorOptions[0])];
			Color color = Color.valueOf(colors);
			
			if(shape == "Rectangle") {
				double width = Double.parseDouble(JOptionPane.showInputDialog("Width: "));
				double heigth = Double.parseDouble(JOptionPane.showInputDialog("Heigth: "));
				list.add(new Rectangle(color, width, heigth));
			} else {
				double radius = Double.parseDouble(JOptionPane.showInputDialog("Radius: "));
				list.add(new Circle(color, radius));
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "SHAPES AREAS");
		for(Shape shape : list) {
			JOptionPane.showMessageDialog(null, 
					String.format("%.2f", shape.area()) );
		}
		
		
	}

}
