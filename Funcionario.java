public class Funcionario implements IFuncionarioProdutos {

    private String nome;
    private String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void falarIngles() {
        System.out.println("Sei falar ingles intermediario");
    }

    @Override
    public void serSimpatico() {
        System.out.println("Eu sou muito simpático ... ");
    }

    
}
