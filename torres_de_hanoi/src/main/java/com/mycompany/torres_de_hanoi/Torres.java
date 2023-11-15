/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.torres_de_hanoi;

/**
 *
 * @author Usuario
 */
public class Torres {
    long num_mov = 0;
    
    void movimentos(int discos, String origem, String aux, String destino){
        if(discos > 0){
            movimentos(discos-1, origem, destino, aux);
            num_mov += 1;
            movimentos(discos-1, aux, origem, destino);
        }
    }
    
}
