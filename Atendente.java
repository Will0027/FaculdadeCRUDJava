public class Atendente implements IFuncionarioProdutos {

    private String nome;
    private String cpf;

    public Atendente(String nome, String cpf) {
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'falarIngles'");
    }

    @Override
    public void gostarDeAnimais() throws Exception {
        // TODO Auto-generated method stub
            System.out.println("Deu bom  aqui ...");
    }


    
}
