/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author david
 */
@Entity
@Table(name = "cita")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cita.findAll", query = "SELECT c FROM Cita c"),
    @NamedQuery(name = "Cita.findByIdCita", query = "SELECT c FROM Cita c WHERE c.idCita = :idCita"),
    @NamedQuery(name = "Cita.findByFechaCita", query = "SELECT c FROM Cita c WHERE c.fechaCita = :fechaCita"),
    @NamedQuery(name = "Cita.findByEstadoCita", query = "SELECT c FROM Cita c WHERE c.estadoCita = :estadoCita")})
public class Cita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CITA")
    private Integer idCita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_CITA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCita;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "ESTADO_CITA")
    private String estadoCita;
    @JoinColumn(name = "doctor_ID_DOCTOR", referencedColumnName = "ID_DOCTOR")
    @ManyToOne(optional = false)
    private Doctor doctorIDDOCTOR;
    @JoinColumn(name = "paciente_ID_PACIENTE", referencedColumnName = "ID_PACIENTE")
    @ManyToOne(optional = false)
    private Paciente pacienteIDPACIENTE;

    public Cita() {
    }

    public Cita(Integer idCita) {
        this.idCita = idCita;
    }

    public Cita(Integer idCita, Date fechaCita, String estadoCita) {
        this.idCita = idCita;
        this.fechaCita = fechaCita;
        this.estadoCita = estadoCita;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }

    public Doctor getDoctorIDDOCTOR() {
        return doctorIDDOCTOR;
    }

    public void setDoctorIDDOCTOR(Doctor doctorIDDOCTOR) {
        this.doctorIDDOCTOR = doctorIDDOCTOR;
    }

    public Paciente getPacienteIDPACIENTE() {
        return pacienteIDPACIENTE;
    }

    public void setPacienteIDPACIENTE(Paciente pacienteIDPACIENTE) {
        this.pacienteIDPACIENTE = pacienteIDPACIENTE;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCita != null ? idCita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cita)) {
            return false;
        }
        Cita other = (Cita) object;
        if ((this.idCita == null && other.idCita != null) || (this.idCita != null && !this.idCita.equals(other.idCita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entity.Cita[ idCita=" + idCita + " ]";
    }
    
}
