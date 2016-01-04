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
@Table(name = "doctor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Doctor.findAll", query = "SELECT d FROM Doctor d"),
    @NamedQuery(name = "Doctor.findByIdDoctor", query = "SELECT d FROM Doctor d WHERE d.idDoctor = :idDoctor"),
    @NamedQuery(name = "Doctor.findByNombresDoctor", query = "SELECT d FROM Doctor d WHERE d.nombresDoctor = :nombresDoctor"),
    @NamedQuery(name = "Doctor.findByApellidosDoctor", query = "SELECT d FROM Doctor d WHERE d.apellidosDoctor = :apellidosDoctor"),
    @NamedQuery(name = "Doctor.findByCiDoctor", query = "SELECT d FROM Doctor d WHERE d.ciDoctor = :ciDoctor"),
    @NamedQuery(name = "Doctor.findByEspecialidadDoctor", query = "SELECT d FROM Doctor d WHERE d.especialidadDoctor = :especialidadDoctor"),
    @NamedQuery(name = "Doctor.findByNumConsultorioDoctor", query = "SELECT d FROM Doctor d WHERE d.numConsultorioDoctor = :numConsultorioDoctor"),
    @NamedQuery(name = "Doctor.findByEmailDoctor", query = "SELECT d FROM Doctor d WHERE d.emailDoctor = :emailDoctor"),
    @NamedQuery(name = "Doctor.findByTelefonoFijoDoctor", query = "SELECT d FROM Doctor d WHERE d.telefonoFijoDoctor = :telefonoFijoDoctor"),
    @NamedQuery(name = "Doctor.findByCelularDoctor", query = "SELECT d FROM Doctor d WHERE d.celularDoctor = :celularDoctor"),
    @NamedQuery(name = "Doctor.findByFechaNacimientoDoctor", query = "SELECT d FROM Doctor d WHERE d.fechaNacimientoDoctor = :fechaNacimientoDoctor"),
    @NamedQuery(name = "Doctor.findByPasswordDoctor", query = "SELECT d FROM Doctor d WHERE d.passwordDoctor = :passwordDoctor")})
public class Doctor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_DOCTOR")
    private Integer idDoctor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NOMBRES_DOCTOR")
    private String nombresDoctor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "APELLIDOS_DOCTOR")
    private String apellidosDoctor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CI_DOCTOR")
    private String ciDoctor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ESPECIALIDAD_DOCTOR")
    private String especialidadDoctor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_CONSULTORIO_DOCTOR")
    private int numConsultorioDoctor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "EMAIL_DOCTOR")
    private String emailDoctor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TELEFONO_FIJO_DOCTOR")
    private int telefonoFijoDoctor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CELULAR_DOCTOR")
    private int celularDoctor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_NACIMIENTO_DOCTOR")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimientoDoctor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PASSWORD_DOCTOR")
    private String passwordDoctor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doctorIDDOCTOR")
    private Collection<Cita> citaCollection;

    public Doctor() {
    }

    public Doctor(Integer idDoctor) {
        this.idDoctor = idDoctor;
    }

    public Doctor(Integer idDoctor, String nombresDoctor, String apellidosDoctor, String ciDoctor, String especialidadDoctor, int numConsultorioDoctor, String emailDoctor, int telefonoFijoDoctor, int celularDoctor, Date fechaNacimientoDoctor, String passwordDoctor) {
        this.idDoctor = idDoctor;
        this.nombresDoctor = nombresDoctor;
        this.apellidosDoctor = apellidosDoctor;
        this.ciDoctor = ciDoctor;
        this.especialidadDoctor = especialidadDoctor;
        this.numConsultorioDoctor = numConsultorioDoctor;
        this.emailDoctor = emailDoctor;
        this.telefonoFijoDoctor = telefonoFijoDoctor;
        this.celularDoctor = celularDoctor;
        this.fechaNacimientoDoctor = fechaNacimientoDoctor;
        this.passwordDoctor = passwordDoctor;
    }

    public Integer getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Integer idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getNombresDoctor() {
        return nombresDoctor;
    }

    public void setNombresDoctor(String nombresDoctor) {
        this.nombresDoctor = nombresDoctor;
    }

    public String getApellidosDoctor() {
        return apellidosDoctor;
    }

    public void setApellidosDoctor(String apellidosDoctor) {
        this.apellidosDoctor = apellidosDoctor;
    }

    public String getCiDoctor() {
        return ciDoctor;
    }

    public void setCiDoctor(String ciDoctor) {
        this.ciDoctor = ciDoctor;
    }

    public String getEspecialidadDoctor() {
        return especialidadDoctor;
    }

    public void setEspecialidadDoctor(String especialidadDoctor) {
        this.especialidadDoctor = especialidadDoctor;
    }

    public int getNumConsultorioDoctor() {
        return numConsultorioDoctor;
    }

    public void setNumConsultorioDoctor(int numConsultorioDoctor) {
        this.numConsultorioDoctor = numConsultorioDoctor;
    }

    public String getEmailDoctor() {
        return emailDoctor;
    }

    public void setEmailDoctor(String emailDoctor) {
        this.emailDoctor = emailDoctor;
    }

    public int getTelefonoFijoDoctor() {
        return telefonoFijoDoctor;
    }

    public void setTelefonoFijoDoctor(int telefonoFijoDoctor) {
        this.telefonoFijoDoctor = telefonoFijoDoctor;
    }

    public int getCelularDoctor() {
        return celularDoctor;
    }

    public void setCelularDoctor(int celularDoctor) {
        this.celularDoctor = celularDoctor;
    }

    public Date getFechaNacimientoDoctor() {
        return fechaNacimientoDoctor;
    }

    public void setFechaNacimientoDoctor(Date fechaNacimientoDoctor) {
        this.fechaNacimientoDoctor = fechaNacimientoDoctor;
    }

    public String getPasswordDoctor() {
        return passwordDoctor;
    }

    public void setPasswordDoctor(String passwordDoctor) {
        this.passwordDoctor = passwordDoctor;
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
        hash += (idDoctor != null ? idDoctor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doctor)) {
            return false;
        }
        Doctor other = (Doctor) object;
        if ((this.idDoctor == null && other.idDoctor != null) || (this.idDoctor != null && !this.idDoctor.equals(other.idDoctor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entity.Doctor[ idDoctor=" + idDoctor + " ]";
    }
    
}
