import Connection.Connection;
import Dao.DataSource;
import Model.Fornecedor;
import Model.FornecedorDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        DataSource ds = new DataSource();
        ds.closeDataSource();
        System.out.println("#################~Bem Vindo~#################");
        System.out.println("# Digite: 1 Para Cadastrar novo Fornecedor   #");
        System.out.println("# Digite: 0 Para Sair                        #");
        System.out.println("#############################################");
        String opção = s.nextLine();
        switch (opção) {
            case "1":
                cadastrofornercedor();
                break;
            case "0":
                System.out.println("Obrigado por utilizar nosso sistema");
                break;
        }

    }

    private static void cadastrofornercedor() {
        Fornecedor fornecedor = new Fornecedor();
        System.out.println("#############################################");
        //System.out.println("Digite o ID fornecedor");
        //fornecedor.setCodigo_fornecedor(s.nextLine());
        System.out.println("Digite o nome fantasia do fornecedor");
        fornecedor.setNomefantasia(s.nextLine());
        System.out.println("Digite o endereço do fornecedor");
        fornecedor.setEndereco(s.nextLine());
        System.out.println("Digite o numero de contato do fornecedor");
        fornecedor.setNumerocontato(s.nextLine());
        System.out.println("Digite o email do fornecedor");
        fornecedor.setEmail(s.nextLine());
        System.out.println("Dgite o CNPJ do fornecedor");
        fornecedor.setCnpj(s.nextLine());
        System.out.println("Cadastro realizado com sucesso");
        System.out.println("#############################################");

        FornecedorDAO dao = new FornecedorDAO();
        fornecedor = dao.save(fornecedor);
        System.out.println(fornecedor.getCodigo_fornecedor());

    }
}

