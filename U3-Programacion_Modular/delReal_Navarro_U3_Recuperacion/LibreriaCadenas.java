package Recuperacion_Ev1;

public class LibreriaCadenas {
    public static String invertir(String cadena){
        String invertida="";
        cadena=cadena.toUpperCase(); //las pasamos a mayusculas
        //la invierto

        for (int i = cadena.length()-1; i >=0; i--) {
            invertida=invertida+cadena.charAt(i);
        }

        return invertida;
    }

    public static String desplazarVocales(String cadena){
        //devuelve la misma cadena con las vocales desplazadas una pos Ej: a=e, etc

        String desplazada=cadena;
        for (int i = 0; i < desplazada.length() ; i++) {
            if(desplazada.charAt(i)=='a'){
                desplazada=desplazada.replace('a','e');
            }else if(desplazada.charAt(i)=='e'){
                desplazada=desplazada.replace('e','i');
            }else if(desplazada.charAt(i)=='i'){
                desplazada=desplazada.replace('i','o');
            }else if(desplazada.charAt(i)=='o'){
                desplazada=desplazada.replace('o','u');
            }else if(desplazada.charAt(i)=='u'){
                desplazada=desplazada.replace('u','a');
            }
        }
        /* Nota: asi sin 'if' se machacan las vocales .
        desplazada=desplazada.replaceAll("a","e");
        desplazada=desplazada.replaceAll("e","i");
        desplazada=desplazada.replaceAll("i","o");
        desplazada=desplazada.replaceAll("o","u");
        desplazada=desplazada.replaceAll("u","a");*/
        /*
        //problema de replace = te machaca las demas vocales...XD
        desplazada=desplazada.replace('e','i');
        desplazada=desplazada.replace('i','o');
        desplazada=desplazada.replace('o','u');
        desplazada=desplazada.replace('u','a');*/
        return desplazada;
    }
}
