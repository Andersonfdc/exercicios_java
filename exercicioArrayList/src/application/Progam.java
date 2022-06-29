package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		;
		Scanner sc = new Scanner(System.in);

		List<Funcionario> funcionarios = new ArrayList<>();

		System.out.println("Quantos funcionarios deseja cadastrar: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o id:");
			int id = sc.nextInt();

			System.out.println("Digite o nome do funcionario: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.println("Digite o salario do funcionario: ");
			double salario = sc.nextDouble();

			Funcionario fun = new Funcionario(id, nome, salario);

			funcionarios.add(fun);
		}

		for (Funcionario func : funcionarios) {
			System.out.println(" ");
			System.out.print("Id:" + func.getId());
			System.out.println(" ");
			System.out.print("Nome:" + func.getNome());
			System.out.println(" ");
			System.out.print("Salario:" + func.getSalario());
			System.out.println(" ");
			System.out.println(" ");
		}

		System.out.println("Digite o Id do funcionario que recebera a bonificacao: ");
		int cod = sc.nextInt();

		Funcionario fun = funcionarios.stream().filter(x -> x.getId() == cod).findFirst().orElse(null);

		if (fun == null) {
			System.out.println("Funcionario invalido");
		} else {
			System.out.print("Digite a porcentagem: ");
			double percent = sc.nextDouble();
			fun.bonusSalarial(percent);
		}

		System.out.println(" ");

		for (Funcionario f : funcionarios) System.out.println(f);


		sc.close();

	}

}
