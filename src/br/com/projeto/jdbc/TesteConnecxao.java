/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.jdbc;

import br.com.projeto.jdbc.SingleConnection;
import javax.swing.JOptionPane;



public class TesteConnecxao {
    
    
    public static void main(String[] args) {
        try {
            new SingleConnection().getConnection();
            JOptionPane.showMessageDialog(null, "Conecxao realizada com sucesso");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro na conecxao" +erro.getMessage());
        }
    }
}
