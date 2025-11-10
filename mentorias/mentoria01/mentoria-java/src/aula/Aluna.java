package aula;

public class Aluna extends Pessoa {

    private String matricula;

    public  Aluna(String nome, String curso, String email, String matricula) {
        super(nome,curso,email);
        this.matricula = matricula;
    }
}
