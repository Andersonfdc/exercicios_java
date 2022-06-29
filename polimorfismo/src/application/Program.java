package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.swing.*;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of employees: "));

		for (int i = 1; i <= n; i++) {
			JOptionPane.showMessageDialog(null, "Employee #" + i + " data:");
			
			String[] opcao = {"Yes", "No"};
			int option = JOptionPane.showOptionDialog(
					null,
					"Employee",
					"Outsurced Employee", 
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,
					opcao,
					opcao[0]);

			String ch = opcao[option];
			String name = JOptionPane.showInputDialog("Name: ");
			int hours = Integer.parseInt(JOptionPane.showInputDialog("Hours: "));
			double valuePerHour = Double.parseDouble(JOptionPane.showInputDialog("Value Per  Hour: "));
			
			
			if (ch == "Yes") {
				double additionalCharge = Double.parseDouble(JOptionPane.showInputDialog("Additional charge: "));	
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}else {			
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		JOptionPane.showMessageDialog(null, "PAYMENTS");
		for(Employee emp : list) {
			JOptionPane.showMessageDialog(null, emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
	}

}
