/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainarbol;

/**
 *
 * @author 
 */
class ArbolBinario {
    protected Nodo raiz;

  //Constructor 1
  public ArbolBinario(){
    raiz = null;
  }

  //Constructor 2
  public ArbolBinario(Nodo raiz){
    this.raiz = raiz;
  }

  
  public Nodo getRaiz(){
    return raiz;
  }
  
  // Comprueba el estatus del árbol
  boolean esVacio(){
    return raiz == null;
  }

  public static Nodo nuevoArbol(Nodo ramaIzqda, Object dato, Nodo ramaDrcha){
      
    return new Nodo(ramaIzqda, dato, ramaDrcha);
  }

  // Recorrido de un árbol binario en preorden
  public static void preOrden(Nodo r){
    if (r != null){
      r.visitarNodo();
      preOrden (r.getIzquierdo());
      preOrden (r.getDerecho());
    }
  }
  
  // Recorrido de un árbol binario en inorden
  public static void inOrden(Nodo r){
    if (r != null){
      inOrden (r.getIzquierdo());
      r.visitarNodo();
      inOrden (r.getDerecho());
    }
  }
  
  // Recorrido de un árbol binario en postorden
  public static void postOrden(Nodo r){
    if (r != null){
      postOrden (r.getIzquierdo());
      postOrden (r.getDerecho());
      r.visitarNodo();
    }
  }
    
}
