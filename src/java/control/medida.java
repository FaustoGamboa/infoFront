/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Fausto
 */

@Named("medida")
@SessionScoped
public class medida implements Serializable{

    private static double getmedicion() {
        service.MuestraDatos_Service service = new service.MuestraDatos_Service();
        service.MuestraDatos port = service.getMuestraDatosPort();
        return port.getmedicion();
    }
    
    double medidaLeida = getmedicion();

    public double getMedidaLeida() {
        medidaLeida = getmedicion();
        return medidaLeida;
    }

    public void setMedidaLeida(double medidaLeida) {
        this.medidaLeida = medidaLeida;
    }
    
    
    
}
