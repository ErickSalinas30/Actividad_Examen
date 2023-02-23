/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Auto;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface AutoService {
    public void crear (Auto auto);
    public List<Auto> listar();
}
