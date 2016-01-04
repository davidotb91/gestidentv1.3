package com.ec.entity;

import com.ec.entity.Cita;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-01-03T01:52:36")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, Integer> idPaciente;
    public static volatile SingularAttribute<Paciente, String> emailPaciente;
    public static volatile CollectionAttribute<Paciente, Cita> citaCollection;
    public static volatile SingularAttribute<Paciente, Date> fechaNacimiento;
    public static volatile SingularAttribute<Paciente, String> nombresPaciente;
    public static volatile SingularAttribute<Paciente, String> apellidosPaciente;
    public static volatile SingularAttribute<Paciente, String> passwordPaciente;
    public static volatile SingularAttribute<Paciente, String> ciPaciente;
    public static volatile SingularAttribute<Paciente, Integer> telefonoFijoPaciente;
    public static volatile SingularAttribute<Paciente, Integer> celularPaciente;

}