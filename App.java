public class App {

    public static void main(String[] args){
        System.out.println("Bem vindo a loja de Produtos!");
        System.out.println();
        System.out.println();

        Produto1 produto1 = new Produto1();
        produto1.setNome("Sabonete");
        produto1.setValidade(5);
        produto1.setPeso(2);

        
         Produto2 produto2 = new Produto2();
        produto2.setNome("Sabonete");
        produto2.setValidade(5);
        produto2.setPeso(8);

        Funcionario funcionario1 = new Funcionario("Fulano", "12345678901");

        funcionario1.falarIngles();
        funcionario1.serSimpatico();

        Atendente atendente = new Atendente("Ciclano", "12345678963");
       





        try{
            atendente.gostarDeAnimais();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        

        System.out.println("Aqui continua o código... ");
    }

    static void contratarFuncionario(IFuncionarioProdutos funcionario){
        System.out.println("Contratado o funcionario - " + funcionario);
    }


}