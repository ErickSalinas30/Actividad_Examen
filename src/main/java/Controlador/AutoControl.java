/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Auto;
import Servicio.AutoServiceImpl;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class AutoControl {
    private AutoServiceImpl autoServiceImpl = new AutoServiceImpl();
    
    public Auto crear (String []data){
        var codigo=Integer.valueOf(data[0]);
        var marca=data[1];
        var modelo=data[2];
        var costo=Double.valueOf(data[3]);
        var year=Integer.valueOf(data[4]);
        var mes=Integer.valueOf(data[5]);
        var dia=Integer.valueOf(data[6]);
        var auto = new Auto(codigo,marca,modelo,costo,LocalDate.of(year, mes, dia));
        this.autoServiceImpl.crear(auto);
        return auto;
    }
    public List <Auto> Listar(){
        return this.autoServiceImpl.listar();
    }
}
