package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Anna");
		lista.add(2, "Marco");
		
		System.out.println(lista.size());
		
		for (String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		//lista.remove("Anna");
		//lista.remove(2);
		lista.removeIf(x -> x.charAt(0) == 'M');

		for (String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		System.out.println("Index of bob: " + lista.indexOf("Bob"));
		
		System.out.println("---------------------");
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
	
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		String name = lista.stream().filter(x -> x.charAt(0) == 'A' ).findFirst().orElse(null);
		System.out.println(name);
	}

}
