package heranca;

/**
 *
 * @author andrea
 */
public class Heranca {

    public static void main(String[] args) {
        Estudante e = new Estudante();
       // Pessoa p = new Pessoa();
        Professor pr = new Professor();
        ProfessorTemporario t = new  ProfessorTemporario();
        pr.setNome("Joao");
        pr.comecaFerias();
        
        t.setNome("Juliano");
        t.terminaFerias();
        
        e.setNome("Jose");
        e.setCurso("Direito");
        e.mostra();
        pr.mostra();
        t.mostra();
        
    }
}
