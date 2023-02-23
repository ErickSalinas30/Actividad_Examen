/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Auto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class AutoServiceImpl implements AutoService {
    
    private List<Auto> autoList= new ArrayList<>();

    @Override
    public void crear(Auto auto) {
        this.autoList.add(auto);
    }

    @Override
    public List<Auto> listar() {
        return this.autoList;
    }
    
    
}
