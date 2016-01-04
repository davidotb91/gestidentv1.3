package com.ec.entity;

import com.ec.entity.Cita;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-01-03T01:52:36")
@StaticMetamodel(Doctor.class)
public class Doctor_ { 

    public static volatile CollectionAttribute<Doctor, Cita> citaCollection;
    public static volatile SingularAttribute<Doctor, String> ciDoctor;
    public static volatile SingularAttribute<Doctor, Integer> numConsultorioDoctor;
    public static volatile SingularAttribute<Doctor, Integer> idDoctor;
    public static volatile SingularAttribute<Doctor, String> emailDoctor;
    public static volatile SingularAttribute<Doctor, Integer> celularDoctor;
    public static volatile SingularAttribute<Doctor, Integer> telefonoFijoDoctor;
    public static volatile SingularAttribute<Doctor, String> passwordDoctor;
    public static volatile SingularAttribute<Doctor, String> nombresDoctor;
    public static volatile SingularAttribute<Doctor, String> especialidadDoctor;
    public static volatile SingularAttribute<Doctor, String> apellidosDoctor;
    public static volatile SingularAttribute<Doctor, Date> fechaNacimientoDoctor;

}