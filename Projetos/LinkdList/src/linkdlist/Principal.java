/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkdlist;

import javax.swing.JOptionPane;

/**
 *
 * @author SESI_SENAI
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Criando o objeto Materia
        Materia a = new Materia();
        

        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantas materias vc quer adicionar?"));
        //Adicionando na LinkedList
        for (int i = 0; i < qtd; i++) {
            String nome_mat = JOptionPane.showInputDialog("Qual é a " + (i+1) + "ª materia que você quer adicionar? ");
            a.addMateria(nome_mat);
        }

        //Visuzalizando a LinkedList
        a.listaMaterias();
        
        // Busca de materias
        String busca = JOptionPane.showInputDialog("Qual materia você quer saber se está na lista?");
        a.buscaMateria(busca);
        
        // Deletando da lista
        String deleta = JOptionPane.showInputDialog("Qual materia vc quer deletar da lista?");
        a.delMateria(deleta);
        
        a.listaMaterias();
       
    }

}
