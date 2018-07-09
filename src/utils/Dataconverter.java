/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cacai
 */
public class Dataconverter {
    
        public static String data2String(String data) throws ParseException {
        //RECEBEMOS A DATA QUE VEM DO BANCO. NOS TEMOS QUE DAR UM toString() NELA
        SimpleDateFormat input = new SimpleDateFormat("yyyy-MM-dd");
        //CRIAMOS O OBJETO TIPO DATE PRA RECEBER A DATA COM FORMATACAO DO BANCO...
        java.util.Date dataConvertida = input.parse(data);
        //CRIAMOS OUTRA MASCARA
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //CRIAMOS UMA STRING QUE IRA RECEBER A DATA FORMATADA DE ACORDO COM O PADRÃO BRASILEIRO
	String dataFormatada = sdf.format(dataConvertida);
        return dataFormatada;
    }
    
    public static java.sql.Date data2SQL(String data) throws ParseException{
        //PADRAO DE DATA BRASILEIRO
	SimpleDateFormat input = new SimpleDateFormat("dd/MM/yyyy");
        //APLICAMOS NA DATA, PARA GARANTIR A FORMATACAO.
        java.util.Date dataConvertida = input.parse(data);
        //MASCARA ADEQUADA PARA DATA DO MYSQL
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //FORMATAMOS A DATA DO USUARIO PARA DATA DO SQL
	String dataFormatada = sdf.format(dataConvertida);        
	java.util.Date dataFinal = sdf.parse(dataFormatada);
        //CONVERTEMOS PARA O TIPO DE DATA DO MYSQL (REPARE NNO 'TYPECAST' PARA NAO CONFUNDIR COM O OBJETO DATE DO JAVA)
	java.sql.Date dataSQL = new java.sql.Date(dataFinal.getTime());
        return dataSQL;
    }
    
}
