import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public  static void main(String[] args) {
//        System.out.println("Olá mundo!");

//        int X = 5;
//        long y = 9999999999L;
//        float a = 3.14f;
//        double z = 3.14;
//        char c = 'a';
//        String nomeProfessora = "Gabriela Andrade";
//        boolean presenca = true;

//        if (nomeProfessora.isEmpty()) {
//            System.out.println("String vazia");
//        } else if (nomeProfessora.equals("Gabriela")){
//            System.out.println(nomeProfessora);
//        } else {
//            System.out.println("Falso");
//        }

//        int[] numerosLista = {1,2,3,4,5};
//
//        List<String> nomesAlunas = new ArrayList<>();
//        nomesAlunas.add("Larissa");
//        nomesAlunas.add("Geysa");
//
//        for (String aluna : nomesAlunas) {
//            System.out.println(aluna);
//        }
//
//        int count = 0;
//        while (count <= 5) {
//            System.out.println(count);
//            count ++;
//        }


//        System.out.println(nomeProfessora);
//        System.out.println(presenca);
//        System.out.println(X);

//        Scanner sc = new Scanner(System.in);
//
//        String nome = sc.nextLine();
//        System.out.println(nome);
//        sc.close();
        boolean executando = true;

        System.out.println("Todo list");

        while (executando) {

            System.out.println("======Menu=======");
            System.out.println("1- Cadastrar tarefa");
            System.out.println("2- Listar tarefas pendentes");
            System.out.println("3- Buscar tarefas por título");
            System.out.println("4- Marcar tarefas como concluídas");
            System.out.println("5- Remover uma tarefa");
            System.out.println("0- Sair");
            System.out.println();

            System.out.println("Digite uma opção");
            Scanner sc = new Scanner(System.in);
            int opcao = sc.nextInt();

            System.out.println("A opção escolhida foi " + opcao);

            //switch case

//        switch (opcao) {
//
//            case 1:
//                System.out.println("Tarefa cadastrada com sucesso!");
//                break;
//            case 2:
//                System.out.println("Tarefa listada com sucesso!");
//            break;
//
//            case 3:
//                System.out.println("Tarefa buscada com sucesso!");
//                break;
//            default:
//                System.out.println("OPção inválida");
//        }

        executando = switch (opcao) {
            case 1 -> {
                System.out.println("Digite o título");
                String titulo = sc.nextLine();
                System.out.println("DIgite a descrição");
                String descricao = sc.nextLine();
                System.out.println("Digite a data (2025-)");

                System.out.println("Cadastrar tarefa");
                yield true;
            }
            case 2 -> {
                System.out.println("Listar tarefa");
                yield true;
            }
            case 3 -> {
                System.out.println("Buscar tarefa");
                yield true;
            }
            case 4 -> {
                System.out.println("Marcar tarefa");
                yield true;
            }
            case 5 -> {
                System.out.println("Remover tarefa");
                yield true;
            }
            case 0 -> false;
            default -> {
                System.out.println("Opção inválida");
                yield true;
            }
        };

        }
    }

}


