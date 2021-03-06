/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;
import  Entidades.*;
/**
 *
 * @author Usuario
 */
public class MetodosJugadores {
   static int _fisico    = 15000;
   static int _defensa   = 30000;
   static int _dribbling = 40000;
   static int _disparo   = 100000;
    
    public Jugadores  inicio;

    
    public int calcularValor(int fisico,int defensa ,int dribbling ,int disparo)
    {
       int suma=(fisico*_fisico)+(defensa*_defensa)+(dribbling*_dribbling )+(disparo*_disparo);
       return suma;
    }
    
    public int calcularValorPortero(int fisico,int defensa ,int dribbling )
    {
       int suma=(fisico*_fisico)+(defensa*_defensa)+(dribbling*_dribbling );
       return suma;
    }
    
    
    
    public String InsertarInicio(String nombre,long cedula,int fisico,int defensa ,int dribbling ,int disparo,String posicion)
    {
        
        boolean verificaCedula = verificaCedula(cedula);
        boolean verificaNombre = verificaNombre(nombre);
        int   valor;
        
        if (verificaCedula == false )
        {
            if (verificaNombre == false )
            {
                if(posicion.equals("Portero"))
                {
                    valor=calcularValorPortero(fisico, defensa ,dribbling);

                }
                else
                {
                    valor=calcularValor(fisico, defensa ,dribbling , disparo);
                }


                Jugadores nuevo=new Jugadores(nombre,cedula,valor,posicion); 
                if (inicio==null)
                {   
                    inicio= nuevo;    
                    return "Agregado";
                }
                nuevo.sig=inicio;
                inicio=nuevo;
                return "Agregado";
            }
            return "El nombre no se encuentra disponible";
        }        
        return "La cedula seleccionada no se encuentra disponible";

    }
    
    
    public String InsertarFinal(String nombre,long cedula,int fisico,int defensa ,int dribbling ,int disparo,String posicion)
    {
        boolean verifica = verificaCedula(cedula);
        
        if (verifica == false)
        {
            int valor=calcularValor(fisico, defensa ,dribbling , disparo);
            Jugadores nuevo=new Jugadores(nombre,cedula,valor,posicion); 
            
            Jugadores aux=inicio;
            Jugadores post=inicio;

            if (inicio==null)
            {   
                inicio= nuevo;    
                return "Agregado";
            }
            while(post != null )             
            {
                aux=post;                  
                post=post.sig;         
            }
            aux.sig=nuevo;                  //si es igual a null (osea el ultimo),iguale y agregue
            return "Agregado";
        }        
        return "La cedula seleccionada no se encuentra disponible";

    }
    
    public String eliminarJugador(String nombre)
    {
        if (inicio==null)
        {
            return "Lista Vacia";
        }  
        if (inicio.getNombre().equals(nombre)) // este elimina el primero ,en casdo de que fuese el inicio
        {
            if(inicio.getEstado().equals("Disponibe"))
            {
                inicio=inicio.sig;
                return "Eliminado";
            }
            else
            {
                return"El jugador no se puede eliminar porque se encuentra en un equipo";
            }
        }
        Jugadores aux=inicio;
        Jugadores ant=inicio;
        while(aux != null )             // n caso de que el nodo estuviera al la miad
        {
            if(aux.getNombre().equals(nombre)) // aqui compara 
            {
                if(aux.getEstado().equals("Disponibe"))
                {
                    ant.sig=aux.sig; // sirve para el medio o para el final y en caso de que fuese final lo envia a null
                    return "Eliminado";
                }
                else
                {
                    return"El jugador no se puede eliminar porque se encuentra en un equipo";
                }
            }
            ant=aux;
            aux=aux.sig;
        }
        return "No Existe";
            
    }
    
    
    public boolean verificaCedula(long cedula)
    {
        if (inicio==null) // pregunta si esta vacio
        {
            return false;
        }
        Jugadores aux=inicio; // INICIO ES DE TIPO CLIENTE POR ESO 
        
        while(aux !=null)
        {
            if (aux.getCedula()==cedula)// equals es solo para comparar string
            {
                return true;           
            }
            aux =aux.sig;
        }
        return false;        
    }
    
    
    public boolean verificaNombre(String nombre)
    {
        if (inicio==null) // pregunta si esta vacio
        {
            return false;
        }
        Jugadores aux=inicio; // INICIO ES DE TIPO CLIENTE POR ESO 
        
        while(aux !=null)
        {
            if (aux.getNombre().equals(nombre))// equals es solo para comparar string
            {
                return true;           
            }
            aux =aux.sig;
        }
        return false;        
    }
    
     public Jugadores buscarSimple(String nombre)
    {
        if (inicio==null) // pregunta si esta vacio
        {
            return null;
        }
        Jugadores aux=inicio; // INICIO ES DE TIPO CLIENTE POR ESO 
        
        while(aux !=null)
        {
            if (aux.getNombre().equals(nombre))// equals es solo para comparar string
            {
                return aux;           
            }
            aux =aux.sig;
        }
        return null;        
    }
    
} 
     
    

