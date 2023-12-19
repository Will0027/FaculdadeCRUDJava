public abstract class Endereço {
    
    protected String nome;
    protected int validade;
    protected double peso;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValidade() {
        return idade;
    }

    public void setValidade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    

    public abstract void darSinal();
    }
