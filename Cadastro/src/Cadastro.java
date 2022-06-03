import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) throws Exception {

        int escolhe_cadastro,x;

        Scanner i =new Scanner(System.in);

        System.out.println("--------ABA DE CADASTROS--------\n\nO que você deseja cadastrar?\n1-Para Pessoa.\n2-Para Cliente.\n3-Para Fornecedor.\nAguardando escolha... ");

        escolhe_cadastro=i.nextInt();

        switch (escolhe_cadastro) {
            case 1: Pessoa pessoa1 = new Pessoa();
            System.out.println("entre com o Nome da pessoa: ");
            i.nextLine();
            pessoa1.setNome(i.nextLine());

            System.out.println("Entre com a data de nascimento da pessoa: ");
            pessoa1.setDatanas(i.nextLine());

            System.out.println("\nPessoa cadastrada com sucesso! Deseja ver os dados da pessoa ?\n1-Para SIM.\n2-Para NAO.");
            x=i.nextInt();

            if (x==1) {

                System.out.printf("\n--------DADOS DA PESSOA--------\nNome: %s\nData de nascimento: %s",pessoa1.getNome(), pessoa1.getDatanas()); 
                
            }
                
                break;

            case 2: Cliente cliente1 = new Cliente();
            System.out.print("\nEntre com o Nome da Cliente: ");
            i.nextLine();
            cliente1.setNome(i.nextLine());

            System.out.print("Entre com o CPF: ");
            cliente1.setCpf(i.next());

            System.out.print("Entre com a Rua: ");
            i.nextLine();
            cliente1.setEndereco(i.nextLine());

            System.out.print("Entre com a Cidade: ");
            cliente1.setCidade(i.nextLine());

            System.out.print("Entre com o Bairro: ");
            cliente1.setBairro(i.nextLine());

            System.out.print("Entre com o email: ");
            cliente1.setEmail(i.nextLine());

            System.out.print("Entre com a sigla do Estado: ");
            cliente1.setEstado(i.nextLine());

            System.out.print("Entre com o CEP: ");
            cliente1.setCep(i.nextLine());

            System.out.print("Entre com o Telefone: ");
            cliente1.setTelefone(i.nextLine());

            System.out.println("\nCliente cadastrado com sucesso! Deseja ver os dados do cliente ?\n1-Para SIM.\n2-Para NAO.");
            x=i.nextInt();

            if (x==1) {

                System.out.printf("\n--------DADOS DO CLIENTE--------\nNome: %s\nCPF/CNPJ: %s\nTelefone: %s\nEmail: %s\n\n* ENDERECO *\nRua: %s\nCidade: %s - %s\nBairro: %s\nCEP: %s",cliente1.getNome(),cliente1.getCpf(),cliente1.getTelefone(),cliente1.getEmail(),cliente1.getEndereco(),cliente1.getCidade(),cliente1.getEstado(),cliente1.getBairro(),cliente1.getCep());
                
            }

                break;

            case 3: Fornecedor fornecedor1 = new Fornecedor();

            System.out.print("Entre com o Nome da Fornecedor: ");
            i.nextLine();
            fornecedor1.setNome(i.nextLine());

            System.out.print("Entre com o Nome Fantasia: ");
            fornecedor1.setNomeFantasia(i.nextLine());

            System.out.print("Entre com o CPF: ");
            fornecedor1.setCpf(i.next());

            System.out.print("Entre com a Rua: ");
            i.nextLine();
            fornecedor1.setEndereco(i.nextLine());

            System.out.print("Entre com a Cidade: ");
            fornecedor1.setCidade(i.nextLine());

            System.out.print("Entre com o Bairro: ");
            fornecedor1.setBairro(i.nextLine());

            System.out.print("Entre com o email: ");
            fornecedor1.setEmail(i.nextLine());

            System.out.print("Entre com a sigla do Estado: ");
            fornecedor1.setEstado(i.nextLine());

            System.out.print("Entre com o CEP: ");
            fornecedor1.setCep(i.nextLine());

            System.out.print("Entre com o Telefone: ");
            fornecedor1.setTelefone(i.nextLine());
            
            System.out.println("\nFornecedor cadastrado com sucesso! Deseja ver os dados do fornecedor ?\n1-Para SIM.\n2-Para NAO.");
            x=i.nextInt();  
            
            if (x==1){

                System.out.printf("\n--------DADOS DO FORNECEDOR--------\nNome: %s\nFantasia: %s\nCPF/CNPJ: %s\nTelefone: %s\nEmail: %s\n\n* ENDERECO *\nRua: %s\nCidade: %s - %s\nBairro: %s\nCEP: %s",fornecedor1.getNome(),fornecedor1.getNomeFantasia(),fornecedor1.getCpf(),fornecedor1.getTelefone(),fornecedor1.getEmail(),fornecedor1.getEndereco(),fornecedor1.getCidade(),fornecedor1.getEstado(),fornecedor1.getBairro(),fornecedor1.getCep());            
            }
        
            default:
                break;
        }
    }
}
