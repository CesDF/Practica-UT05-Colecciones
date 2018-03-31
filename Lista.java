
package Práctica;

import java.util.*;

public class Lista {

	private ArrayList<Persona> al=new ArrayList<Persona>();
	
	public Lista() {
		al=new ArrayList<Persona>();
	}
	
	public void cargar() {
		Persona p1=new Persona("Adrián", "García Santos", "11111111A", 23, "C/ Los Olivos", 3, 38493, "Santa Cruz de Tenerife");
		Persona p2=new Persona("Ana", "Méndez Núñez", "22222222B", 22, "C/ Los Pinos", 25, 38403, "Santa Cruz de Tenerife");
		Persona p3=new Persona("María", "Sánchez Camacho", "33333333C", 45, "C/ Los Franceses", 23, 38505, "Las Palmas");
		Persona p4=new Persona("Julio", "Brito González", "44444444D", 30, "C/ Los Pinos", 25, 38403, "Las Palmas");
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
	}
	
	public void listar() {
		for(Persona p: al) {
			System.out.println(p+"\n");
		}
	}
	
	
	
	public void ordenar() {
		Collections.sort(al);
		for(Persona p: al) {
			System.out.println(p+"\n");
		}
	}
	
	public void insertar() {//añade el registro al final de la lista
		Persona p5=new Persona("Julia", "Fuentes González", "55555555E", 36, "C/ La Pinocha", 27, 38453, "Las Palmas");
		al.add(p5);
		
	}
	
	public int contar() {
		return al.size();
	}

	public void remove(int i) {
			
	}
	
	public void buscar(String dni) {
		for(Persona p: al) {
			if(dni.equals(p.getDni())) {
				System.out.println(al.toString());
			}else {
				System.out.println("El dni no existe");
			}
		}
	}

	
}