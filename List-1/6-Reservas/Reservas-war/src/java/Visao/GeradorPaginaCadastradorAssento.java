package Visao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olegario
 */
public class GeradorPaginaCadastradorAssento {
    
    private StringBuilder sb;

    public GeradorPaginaCadastradorAssento() {
        this.sb = new StringBuilder("");
    }
    
    public String gerarPagina(boolean erro) {
        String mensagem;
        
        if (erro) {
            mensagem = "Erro! Dado já existe no banco!";
        } else {
            mensagem = "Dado inserido com sucesso no banco!";
        }
        
        sb.append("<!DOCTYPE html>");
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>INE 5646 - Turismo</title>");            
        sb.append("</head>");
        sb.append("<h1>");
        sb.append(mensagem);
        sb.append("</h1>");
        sb.append("</html>");
        
        return sb.toString();
    }
}
