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
class Nodo {
  protected Object dato;
  protected Nodo izquierdo;
  protected Nodo derecho;

  public Nodo(Object dato) {
    this.dato = dato;
    this.izquierdo = null;
    this.derecho = null;
  }

  public Nodo(Nodo izdo, Object dato, Nodo dcho) {
      this.dato=dato;
      
      izdo=null;
      dcho=null;
  }

  public Object getDato() {
    return dato;
  }

  public Nodo getIzquierdo() {
    return izquierdo;
  }

  public Nodo getDerecho() {
    return derecho;
  }

  public void setDato(Object dato) {
    this.dato = dato;
  }

  public void setIzquierdo(Nodo dato) {
    this.izquierdo = dato;
  }

  public void setDerecho(Nodo dato) {
    this.derecho = dato;
  }

  //Este método necesita un nombre mejor
  public void  visitarNodo() {
    System.out.print(dato + " ");
  }
    }

    
    

