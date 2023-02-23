/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Modelo;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Auto {
    private int codigo;
    private String marca;
    private String modelo;
    private double costo;
    private LocalDate fechaFabricación;

    public Auto(int codigo, String marca, String modelo, double costo, LocalDate fechaFabricación) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.costo = costo;
        this.fechaFabricación=fechaFabricación;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    public LocalDate getFechaFabricación() {
        return fechaFabricación;
    }

    public void setFechaFabricación(LocalDate fechaFabricación) {
        this.fechaFabricación = fechaFabricación;
    }
    
    
    

}
