import projeto.Aluno;
import projeto.Certificado;
import projeto.Cursos;
import projeto.Professor;

public class App {
    
        public static void main(String[] args) throws Exception{
            
            Professor professor = new Professor("jesiel","jesiel@ifpi.edu.br","mestre");
            
            Cursos curso = new Cursos("ADS",3000,"Tecnólogo","Superior",professor);
    
            Aluno aluno = new Aluno("Pedro","2020118TADS0355","pehenpiedro@gmail","04/22/2000");
    
            Certificado certificado = new Certificado();
    
            certificado.setAluno(aluno);
            certificado.setCurso(curso);
    
            curso.fazerMatriculaDoAluno(aluno);
            
    
            curso.dadosDoCurso();
            
            certificado.mostrarCertificado();
    
            
    
            
        }
            
}
