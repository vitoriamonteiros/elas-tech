package aula;

public class Pessoa {

    private String nome;
    private String curso;
    private String email;

    public Pessoa(String nome, String curso, String email) {
        this.nome = nome;
        this.curso = curso;
        this.email = email;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
