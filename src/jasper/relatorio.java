/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasper;

import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author nilce
 */
public class relatorio {
    
    private int codigo;
    private String nome;
    private String genero;
    private String platafoma;
    private Double tamanho;
    private String fabricante;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlatafoma() {
        return platafoma;
    }

    public void setPlatafoma(String platafoma) {
        this.platafoma = platafoma;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public void getRelatorio(List<relatorio> lista) {
            JasperPrint print = null;
            JRDataSource dataSource = new JRBeanCollectionDataSource(lista);
                try {
                    print = JasperFillManager.fillReport("C:\\Users\\nilce\\JaspersoftWorkspace\\MyReports\\Games4.jasper", null, dataSource);
                    JasperPrintManager.printReport(print, true);
                } catch (Exception erro) {
                    erro.printStackTrace();
                }

            }
    
}
