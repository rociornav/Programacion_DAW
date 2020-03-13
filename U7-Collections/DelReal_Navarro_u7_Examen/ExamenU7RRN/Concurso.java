package ExamenU7RRN;

import java.util.*;
import java.io.*;

/*
Concurso en donde guardaremos todos los perros del concurso, el nombre del concurso y la localidad en la que se va a
celebrar.


Como los concursos de los perros son por razas dentro de la clase Concurso tendremos que crear la estructura
de datos necesaria para acceder mediante el nombre de la raza, que es único, al conjunto de perros de dicha raza.
 */
public class Concurso implements Serializable {
    //atrib
    private Set<Perro> perros=new HashSet<>(); //al ser por razas, sin repetidos.
    private String nombreConcurso;
    private String localidadConcurso;

    //constr


    public Concurso(Set<Perro> perros, String nombreConcurso, String localidadConcurso) {

        this.perros = perros;
        this.nombreConcurso = nombreConcurso;
        this.localidadConcurso = localidadConcurso;
    }

    //getters y setters

    public Set<Perro> getPerros() {
        return perros;
    }

    public void setPerros(Set<Perro> perros) {
        this.perros = perros;
    }

    public String getNombreConcurso() {
        return nombreConcurso;
    }

    public void setNombreConcurso(String nombreConcurso) {
        this.nombreConcurso = nombreConcurso;
    }

    public String getLocalidadConcurso() {
        return localidadConcurso;
    }

    public void setLocalidadConcurso(String localidadConcurso) {
        this.localidadConcurso = localidadConcurso;
    }

    //toString

    @Override
    public String toString() {
        return "Concurso{" +
                "perros=" + perros +
                ", nombreConcurso='" + nombreConcurso + '\'' +
                ", localidadConcurso='" + localidadConcurso + '\'' +
                '}';
    }


    //metodos

    /*
    Un método addDog() que recibe como parámetros la raza y un perro y que añadirá a la estructura de datos ese
     perro en la raza determinada o mostrará un mensaje de error en caso de que estemos intentando introducir en
     la raza un perro que no sea de dicha raza.
     */

    public void addDog(Perro perro, Raza raza ){
        if(perro.getRaza().equals(raza)){
            System.out.println("Las razas coinciden.");
            perros.add(perro);
            System.out.println(perros);
        }else{
            System.out.println("Error, las razas no coinciden.");
        }
    }

    /*
    método disqualifyDog() que recibe como parámetro un perro y los elimina del concurso borrándolo de la estructura
     de datos que contienen los datos de los perros participantes organizados por razas. En caso de ese perro no
      esté escrito deberá mostrar el siguiente mensaje "Perro no inscrito".
     */

    public void disqualifyDog(Perro p){
        //si el perro pasado por parametro esta en el conjunto
        System.out.println("***Metodo disqualify***");
        System.out.println();
        if(perros.contains(p)==true){
            //cuando el perro este en el conjunto se elimina del mismo.
            System.out.println("Si existe, eliminamos del conjunto.");
            perros.remove(p);
            System.out.println();
            System.out.println("Mostramos la coleccion actualizada:");
            System.out.println(perros);
        }else{
            System.out.println("Perro no inscrito");
        }
    }

    /*
    El método ownerDogs() que mostrará por pantalla todos los perros de un dueño determinado
     (sea de la raza que sean). Este método recibe como parámetro el número de socio de la Sociedad Canina
      y mostrará el mensaje "Este socio no tiene perros inscritos" en caso de que el socio no tenga ningún perro
       en este concurso.
     */
    public void ownerDogs(String numSocio){ //pendiente de hacer

            System.out.println("Este socio no tiene ningún perro en este concurso");

    }

    /*
    El método perrosporPeso() que mostrará la lista de perros de una raza, que se recibe como parámetro,
    ordenados por peso de manera decreciente.
     */
    public void perrosporPeso(Set<Perro> perros){
        //Hago la conversion de set a list para que me deje ordenarlo con sort
        List<Perro> perros1 = new ArrayList<>(perros);
        Collections.sort(perros1, new ComparaPeso());
        /*
        perros1.sort(new Comparator<Perro>() {
            @Override
            public int compare(Perro perro, Perro t1) {
                return (int) (t1.getPeso()-perro.getPeso());
            }
        });*/

        System.out.println("Ordenados decrecientemente por peso: "+perros);

    }

    /*
    El método perrosporEdad() que mostrará la lista de perros de una raza, que se recibe como parámetro,
     ordenados por edad de manera decreciente.
     */

    public void perrosporEdad(Set<Perro> perros){
        //Hago la conversion de set a list para que me deje ordenarlo con sort
        List<Perro> perros1 = new ArrayList<>(perros);
        Collections.sort(perros1, new ComparaEdad());

        System.out.println("Ordenados decrecientemente por edad:"+perros);
    }

   /*
   Como cuando hay un concurso las inscripciones de los mismos se realizan en varios días y para no perder
   todos los inscritos debemos también de tener dos métodos en la clase:

cargarPerros() que leerá todos los perros desde el fichero binario "perros.dat" y los colocará en el conjunto
 de perros de su raza.
guardarPerros() que escribirá todos los perros cargados en el fichero "perros.dat".
Estos perros serán guardados de manera individual sin tener que estar, en esa escritura, organizados por raza.
    */

   public void cargarPerros(){
        //


   }

    public void guardarPerros(Set<Perro> conj){
        try{
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("perros.dat"));
            Iterator it= conj.iterator();
            while(it.hasNext()){
                Perro p=(Perro) it.next();
                conj.add(p);
            }
            oos.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }
}
