/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.ec.ejb.PacienteFacadeLocal;
import com.ec.entity.Paciente;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author david
 */
@Named
@ViewScoped
public class pacienteController {
    @EJB
    private PacienteFacadeLocal pacienteEJB;
    private Paciente paciente;
    
    @PostConstruct
    public void init(){
        paciente = new Paciente();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public void Registar(){
        try {
            pacienteEJB.create(paciente);
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Aviso","Su contraseña sera enviada a su correo verificala para que pueda logearse"));
        } catch (Exception e) {
            //errorl
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"Fallamos","ya se pudrio"));
        }
    }
}
