package ExamenT5RRN;

public class RPG extends Personaje implements Comparable, Atacar{
    //atrib
    private Personaje[] personajes;//=new Personaje[10]; no debe exceder la capacidad de 10

    //constructor


    public RPG(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean encantados) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa, encantados);
        this.personajes = new Personaje[10];
    }

    //Metodos enunciado
    public void borrarMuerto(int muerto){
        if(this.energia <=0){
            this.numMuertos++;
            for (int i = 0; i < personajes.length; i++) {
                numMuertos=0;
            }
        }
    }

    public void addPersonaje(Personaje personaje){
        if(numPersonajes<=personajes.length){
            this.personajes[numPersonajes]=personaje;
        }else{
            Personaje[] aux=new Personaje[numPersonajes++];
            for (int i = 0; i < personajes.length; i++) {
                aux[i]=personajes[i];
            }
        }
    }

    /*
    public void mostrarxAtaque(){
        //lo hice con comparator en una clase aparte
    }
    public void mostrarxDefensa(){
        //lo hice con comparator en una clase aparte
    }*/

    //ordenados naturalmente por energia
    @Override
    public int compareTo(Object o) {
        Personaje p=(Personaje)o;
        return getEnergia()-p.getEnergia(); //al ser int
    }
    //implemento el metodo de la interfaz Atacar
    @Override
    public void atacarPersonaje(RPG ataca, RPG victima) {
        int energiaAtacado=0;
        //energía_del_atacado = energía_anterior - (Capacidad de Ataque del atacante -  Capacidad de defensa del atacado)
        System.out.println("Grito Guerra: "+ataca.getNombre().toUpperCase()+" - ATACANDO ");

        if(ataca.getClass()==victima.getClass()){
            energiaAtacado+=this.energia;
        }else{
            if(victima.encantados==true){
                energiaAtacado+=this.energia-(ataca.getCapacidadAtaque()-victima.getCapacidadDefensa())*2;
            }else{
                energiaAtacado+=this.energia-(ataca.getCapacidadAtaque()-victima.getCapacidadDefensa());
            }
        }

        System.out.println("Energía tras ataque: "+energiaAtacado);

    }


}
