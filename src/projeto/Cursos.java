package projeto;

import java.util.ArrayList;
import java.util.List;

public class Cursos {
    private String nome;
    private int cargaHoraria;
    private String modalidade;
    private String nível;
    private String dataDeInico;
    private String dataDeFim;
    private boolean gratuito;
    private List <Aluno> aluno;
    private Professor professor;
    
    public Cursos(String nome, int cargaHoraria, String modalidade, String nível,Professor professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.modalidade = modalidade;
        this.nível = nível;
        this.gratuito = true;
        this.professor = professor;
        this.aluno = new ArrayList<>();
    }
        
        public String getNome() {
            return nome;
        }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getNível() {
        return nível;
    }

    public void setNível(String nível) {
        this.nível = nível;
    }

    public String getDataDeInico() {
        return dataDeInico;
    }

    public void setDataDeInico(String dataDeInico) {
        this.dataDeInico = dataDeInico;
    }

    public String getDataDeFim() {
        return dataDeFim;
    }

    public void setDataDeFim(String dataDeFim) {
        this.dataDeFim = dataDeFim;
    }

    public boolean getGratuito() {
        return gratuito;
    }

    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }
    public int qauntidadeDeAlunos (){
        return aluno.size();

    }
    public void fazerMatriculaDoAluno(Aluno alunos){
        this.aluno.add(alunos);

    }
    public List<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(List<Aluno> aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public void dadosDoCurso(){
        System.out.println("---------------------------------");
        System.out.println("     DADOS DO CURSO      ");
        System.out.println("NOME DO CURSO: "+this.nome);
        System.out.println("PROFESSOR: "+this.getProfessor().getNome());
        System.out.println("CARAG HORARIA: "+this.cargaHoraria);
        System.out.println("MODALIDADE "+this.modalidade);
        System.out.println("NIVEL:"+this.nível);
        System.out.println("TOTAL DE ALUNOS:"+ this.qauntidadeDeAlunos());
        System.out.println("DATA DE INICIO: "+this.dataDeInico);
        System.out.println("DATA DE TERMINO: "+this.dataDeFim);
        System.out.println("É GRATUITO? "+this.gratuito);
        System.out.println("---------------------------------");

     }

    
    }

