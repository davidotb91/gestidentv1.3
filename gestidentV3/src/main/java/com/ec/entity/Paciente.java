/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author david
 */
@Entity
@Table(name = "paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p"),
    @NamedQuery(name = "Paciente.findByIdPaciente", query = "SELECT p FROM Paciente p WHERE p.idPaciente = :idPaciente"),
    @NamedQuery(name = "Paciente.findByNombresPaciente", query = "SELECT p FROM Paciente p WHERE p.nombresPaciente = :nombresPaciente"),
    @NamedQuery(name = "Paciente.findByApellidosPaciente", query = "SELECT p FROM Paciente p WHERE p.apellidosPaciente = :apellidosPaciente"),
    @NamedQuery(name = "Paciente.findByCiPaciente", query = "SELECT p FROM Paciente p WHERE p.ciPaciente = :ciPaciente"),
    @NamedQuery(name = "Paciente.findByEmailPaciente", query = "SELECT p FROM Paciente p WHERE p.emailPaciente = :emailPaciente"),
    @NamedQuery(name = "Paciente.findByTelefonoFijoPaciente", query = "SELECT p FROM Paciente p WHERE p.telefonoFijoPaciente = :telefonoFijoPaciente"),
    @NamedQuery(name = "Paciente.findByCelularPaciente", query = "SELECT p FROM Paciente p WHERE p.celularPaciente = :celularPaciente"),
    @NamedQuery(name = "Paciente.findByPasswordPaciente", query = "SELECT p FROM Paciente p WHERE p.passwordPaciente = :passwordPaciente"),
    @NamedQuery(name = "Paciente.findByFechaNacimiento", query = "SELECT p FROM Paciente p WHERE p.fechaNacimiento = :fechaNacimiento")})
public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PACIENTE")
    private Integer idPaciente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NOMBRES_PACIENTE")
    private String nombresPaciente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "APELLIDOS_PACIENTE")
    private String apellidosPaciente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CI_PACIENTE")
    private String ciPaciente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "EMAIL_PACIENTE")
    private String emailPaciente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TELEFONO_FIJO_PACIENTE")
    private int telefonoFijoPaciente;
    @Column(name = "CELULAR_PACIENTE")
    private Integer celularPaciente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PASSWORD_PACIENTE")
    private String passwordPaciente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacienteIDPACIENTE")
    private Collection<Cita> citaCollection;

    public Paciente() {
    }

    public Paciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Paciente(Integer idPaciente, String nombresPaciente, String apellidosPaciente, String ciPaciente, String emailPaciente, int telefonoFijoPaciente, String passwordPaciente, Date fechaNacimiento) {
        this.idPaciente = idPaciente;
        this.nombresPaciente = nombresPaciente;
        this.apellidosPaciente = apellidosPaciente;
        this.ciPaciente = ciPaciente;
        this.emailPaciente = emailPaciente;
        this.telefonoFijoPaciente = telefonoFijoPaciente;
        this.passwordPaciente = passwordPaciente;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombresPaciente() {
        return nombresPaciente;
    }

    public void setNombresPaciente(String nombresPaciente) {
        this.nombresPaciente = nombresPaciente;
    }

    public String getApellidosPaciente() {
        return apellidosPaciente;
    }

    public void setApellidosPaciente(String apellidosPaciente) {
        this.apellidosPaciente = apellidosPaciente;
    }

    public String getCiPaciente() {
        return ciPaciente;
    }

    public void setCiPaciente(String ciPaciente) {
        this.ciPaciente = ciPaciente;
    }

    public String getEmailPaciente() {
        return emailPaciente;
    }

    public void setEmailPaciente(String emailPaciente) {
        this.emailPaciente = emailPaciente;
    }

    public int getTelefonoFijoPaciente() {
        return telefonoFijoPaciente;
    }

    public void setTelefonoFijoPaciente(int telefonoFijoPaciente) {
        this.telefonoFijoPaciente = telefonoFijoPaciente;
    }

    public Integer getCelularPaciente() {
        return celularPaciente;
    }

    public void setCelularPaciente(Integer celularPaciente) {
        this.celularPaciente = celularPaciente;
    }

    public String getPasswordPaciente() {
        return passwordPaciente;
    }

    public void setPasswordPaciente(String passwordPaciente) {
        this.passwordPaciente = passwordPaciente;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @XmlTransient
    public Collection<Cita> getCitaCollection() {
        return citaCollection;
    }

    public void setCitaCollection(Collection<Cita> citaCollection) {
        this.citaCollection = citaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaciente != null ? idPaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.idPaciente == null && other.idPaciente != null) || (this.idPaciente != null && !this.idPaciente.equals(other.idPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entity.Paciente[ idPaciente=" + idPaciente + " ]";
    }
    
}
