package org.example.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.entities.Empleado;

import java.util.List;

public class EmpleadoJPA {

    //Inserción de empleado de DB
    public void create(Empleado emp) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            em.getTransaction().begin();//Iniciar la transacción
            em.persist(emp);//Insertar al empleado en DB
            em.getTransaction().commit();
            //Comprobar si esta agregado
            if(find(emp.getId()) == null){//Si existe el empleado
                System.out.println("El empleado no se ha insertado bien");
            }else{
                System.out.println("Empleado ingresado");
            }
        }finally{
            em.close();//Cerrar la consulta
        }// fin finally
    }

    //Buscar todos los empleados
    public List<Empleado> findAll() {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            TypedQuery<Empleado> tq = em.createQuery("SELECT e FROM empleado e",Empleado.class);
            return tq.getResultList();
        }finally{
            em.close();
        }// fin finally
    }

    //Mostrar empleados por trabajo
    public List<Empleado> findJob(String job) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            TypedQuery<Empleado> tq = em.createQuery("SELECT p FROM empleado p WHERE p.job=:job",Empleado.class);
            tq.setParameter("job",job);//Establecer el parámetro
            return tq.getResultList();
        }finally{
            em.close();
        }// fin finally
    }

    //Mostrar los trabajos disponibles
    public List<String> findAllJob() {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            TypedQuery<String> tq = em.createQuery("SELECT DISTINCT p.job FROM empleado p",String.class);
            return tq.getResultList();
        }finally{
            em.close();
        }// fin finally
    }

    //Comprobar si existe dicho empleado para eliminarlo de DB
    public void delete(Integer idBuscar) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            em.getTransaction().begin();
            Empleado encontrado = em.find(Empleado.class,idBuscar);
            if(encontrado != null){ //Sí existe ese usuario
                em.remove(encontrado);
                System.out.println("Empleado con el id "+encontrado.getId()+" ha sido eliminado");
            }else{
                System.out.println("No existe ese empleado");
            }
            em.getTransaction().commit();
        }finally{
            em.close();
        }// fin finally
    }

    //Buscar el empleado con ese ID
    public Empleado find(int id) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            return em.find(Empleado.class,id);
        }finally{
            em.close();
        }// fin finally
    }

    //Actualizar el empleado de la DB
    public void update(Empleado encontrado) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            em.getTransaction().begin();
            em.merge(encontrado); //Actualizar empleado de DB
            em.getTransaction().commit();
            System.out.println("Empleado con el id "+encontrado.getId()+" ha sido modificado");
        }finally{
            em.close();
        }// fin finally
    }
}
