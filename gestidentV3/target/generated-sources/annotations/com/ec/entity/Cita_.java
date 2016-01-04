package com.ec.entity;

import com.ec.entity.Doctor;
import com.ec.entity.Paciente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-01-03T01:52:36")
@StaticMetamodel(Cita.class)
public class Cita_ { 

    public static volatile SingularAttribute<Cita, Integer> idCita;
    public static volatile SingularAttribute<Cita, Doctor> doctorIDDOCTOR;
    public static volatile SingularAttribute<Cita, Date> fechaCita;
    public static volatile SingularAttribute<Cita, String> estadoCita;
    public static volatile SingularAttribute<Cita, Paciente> pacienteIDPACIENTE;

}