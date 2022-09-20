package projeto;

public class Aluno {
    private String nome;
    private String matricula;
    private String email;
    private String dataDeNascimento;
    
    
    public Aluno(String nome, String matricula, String email, String dataDeNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
