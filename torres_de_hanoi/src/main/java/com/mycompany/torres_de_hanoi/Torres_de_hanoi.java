/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.torres_de_hanoi;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Torres_de_hanoi {

    public static void main(String[] args) {
        long inicio, fim, hr, min, seg, mils, total;
        Torres t = new Torres();
        String s_qtd;
        int qtd;
        
        s_qtd = JOptionPane.showInputDialog("Digite o Número de Discos");
        qtd = Integer.parseInt(s_qtd);
        
        inicio = System.currentTimeMillis();
        
        t.movimentos(qtd, "T1", "T2", "T3");
        
        fim = System.currentTimeMillis();
        total = fim - inicio;
        
        mils = total % 1000;
        total /= 1000;
        hr = total / 3600;
        total %= 3600;
        min = total / 60;
        seg = total % 60;
        
        
        System.out.println("Número de Discos = "+qtd);
        System.out.println("Número de Movimentos = "+t.num_mov);
        System.out.println("Tempo de execução: " + hr + ":" + min + ":" + seg + ":"+mils);

    }
}
