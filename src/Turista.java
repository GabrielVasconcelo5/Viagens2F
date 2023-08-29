public class Turista {

    private String nome;
    private String cpf;

    Turista(){}
    Turista(String _nome) {
        this.nome = _nome;

    }
    public String viajar(){
        return "Viajou!!!";
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
}
