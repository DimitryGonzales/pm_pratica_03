import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menuOpcao;
        do {
            System.out.println("1 - Adicionar contato\n" +
                    "2 - Remover contato\n" +
                    "3 - Buscar contato por nome\n" +
                    "4 - Buscar contato por email\n" +
                    "5 - Buscar contato por telefone\n" +
                    "6 - Consultar tamanho da agenda\n" +
                    "7 - Finalizar");
            System.out.print("> ");
            menuOpcao = sc.nextInt();

            switch (menuOpcao) {
                case 1:
                    System.out.println("\nAdicionar contato:\n");

                    System.out.print("Nome: ");
                    String nome = sc.next();

                    System.out.print("Email: ");
                    String email = sc.next();

                    System.out.print("Telefone: ");
                    String telefone = sc.next();

                    int menuOpcao1;
                    do {
                        System.out.println("\nTipo de contato:\n" +
                                "\t1 - Emergência\n" +
                                "\t2 - Pessoal\n" +
                                "\t3 - Profissional");
                        System.out.print("\t> ");
                        menuOpcao1 = sc.nextInt();

                        switch (menuOpcao1) {
                            case 1:
                                System.out.print("\n\tGrau de prioridade: ");
                                int grauPrioridade = sc.nextInt();

                                ContatoEmergencia contatoEmergencia = new ContatoEmergencia(
                                        nome,
                                        email,
                                        telefone,
                                        grauPrioridade
                                );

                                break;

                            case 2:
                                System.out.print("\n\tData de aniversário(ISO-8601): ");
                                LocalDate dataAniversario = LocalDate.parse(sc.next());

                                System.out.print("\tParentesco: ");
                                String parentesco = sc.next();

                                ContatoPessoal contatoPessoal = new ContatoPessoal(
                                        nome,
                                        email,
                                        telefone,
                                        dataAniversario,
                                        parentesco
                                );

                                break;

                            case 3:
                                System.out.print("\n\tEmpresa: ");
                                String empresa = sc.next();

                                System.out.print("\tCargo: ");
                                String cargo = sc.next();

                                ContatoProfissional contatoProfissional = new ContatoProfissional(
                                        nome,
                                        email,
                                        telefone,
                                        empresa,
                                        cargo
                                );

                                break;

                            default:
                                break;
                        }

                        if (menuOpcao1 < 1 || menuOpcao1 > 3) System.out.println("\nOpção inválida");
                    } while (menuOpcao1 < 1 || menuOpcao1 > 3);

                    break;

                default:
                    break;
            }

            if (menuOpcao < 1 || menuOpcao > 7) System.out.println("\nOpção inválida\n");
        } while (menuOpcao < 1 || menuOpcao > 7);
    }
}
