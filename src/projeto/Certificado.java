package projeto;

public class Certificado {
    private Aluno aluno;
    private Cursos curso;

   public void mostrarCertificado(){
        System.out.println("        CERTIFICADO         ");
        System.out.println("NOME: "+ this.aluno.getNome());
        System.out.println("CARGA HORARIA: "+ this.curso.getCargaHoraria());
        System.out.println("MODALIDADE: "+ this.curso.getModalidade());
        System.out.println("NIVEL: "+ this.curso.getNível());
        System.out.println("DATA DE INICIO: "+ this.curso.getDataDeInico());
        System.out.println("FIM DO CURSO: "+ this.curso.getDataDeFim());
      
}
   
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }
}

