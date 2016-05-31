/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author MULTIWEB
 */

public class ProfessorTemporario extends Pessoa {

    private boolean emFerias;

    public ProfessorTemporario() {
        emFerias = false;
    }

    public ProfessorTemporario(String nome) {
         super(nome);
        
    }

    public void comecaFerias() {
        emFerias = true;
    }

    public void terminaFerias() {
        emFerias = false;
    }
    
    public void mostra() {
        super.mostra();
        System.out.println("Em ferias: " + emFerias);
    }
}
