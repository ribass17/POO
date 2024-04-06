import java.util.Scanner;

public class UsaEmail {
    public static void main(String[] args) {
        Email[] data = new Email[10];
        login(data);
    }

    public static void login(Email[] data) {
        boolean exit = true;
        var read = new Scanner(System.in);
        do {
            System.out.println("..::EMAIL::..");
            System.out.println("1. Fazer login\n2. Sair");
            String choice = read.next();
            switch (choice) {
                case "1":
                    System.out.println("==========LOGIN===========");
                    System.out.printf("Usuario: ");
                    String User = read.next();
                    System.out.println("==========================");
                    Menu(User, data);
                    break;
                case "2":
                    exit = false;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        } while (exit);
    }

    public static void Menu(String user, Email[] data) {
        boolean exit = true;
        var read = new Scanner(System.in);
        do {
            System.out.println(String.format("Olá %s!\nEscolha uma opção", user));
            System.out.println("1. Escrever um e-mail\n2. Listar os e-emails");
            System.out.println("3. Ler um e-mail\n4. Excluir um e-mail\n5. Fazer logout");
            String choice = read.next();
            switch (choice) {
                case "1":
                    compose(user, data);
                    break;
                case "2":
                    listEmails(user, data);
                    break;
                case "3":
                    System.out.printf("Id email do email: ");
                    int id = read.nextInt();
                    readEmail(id, data, user);
                    break;
                case "4":
                    System.out.printf("Id email do email: ");
                    int i = read.nextInt();
                    deleteEmail(i, data, user);
                    break;
                case "5":
                    exit = false;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        } while (exit);
    }

    public static void compose(String user, Email[] data) {
        int i = 0;
        while (i < 10 && data[i] != null) {
            i++;
        }
        if (i >= 10) {
            System.out.println("\nCapacidade maxima de emails atingida\n");
        } else {
            var read = new Scanner(System.in);
            System.out.printf("Para: ");
            String to = read.next();
            System.out.printf("Assunto: ");
            String subject = read.next();
            System.out.println("Texto: ");
            String texto = read.next();
            data[i] = new Email(user, to, subject, texto);
        }
    }

    public static void listEmails(String user, Email[] data) {
        int i = 0, count = 0;
        System.out.println("========RECEBIDOS=========");
        System.out.println("    id  |   remetente   |   assunto     ");
        while (i < 10) {
            if (data[i] != null && user.equals(data[i].getTo())) {
                System.out.println(
                        String.format("  %d  |   %s  |   %s  ", (i + 1), data[i].getFrom(), data[i].getSubject()));
                count++;
            }
            i++;
        }
        if (count == 0) {
            System.out.println("\nNenhum email recebido.\n");
        }
        System.out.println("==========================");
    }

    public static void readEmail(int id, Email[] data, String user) {
        if (id < 1 || id > 10)
            System.out.println("\nEsse id é invalido\n");
        else if (data[id - 1] != null && data[id - 1].getTo().equals(user)) {
            System.out.println("==========================");
            System.out.println(data[id - 1].toString());
        } else
            System.out.println("Esse email possui outro destinatario");
    }

    public static void deleteEmail(int id, Email[] data, String user) {
        if (id < 1 || id > 10)
            System.out.println("\nEsse id é invalido\n");
        else if (data[id - 1] != null && data[id - 1].getTo().equals(user)) {
            data[id - 1] = null;
            System.out.println("\nEmail excluido com sucesso!\n");
        } else
            System.out.println("\nEsse email possui outro destinatario\n");
    }
}

// Limitar a capacidade maxima de emails
//