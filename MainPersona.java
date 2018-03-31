/* Crear una aplicaci�n que sea capaz de insertar los siguientes datos en un ArrayList:
 *  _____________________________________________________________________________________________________________________
 * |        |                 |            |        |                    |          |         |                          |
 * | Nombre | Apellidos       |  DNI       |  Edad  |  Calle             |  N�mero  |  CP     |  Provincia               |
 * |--------|-----------------|------------|--------|--------------------|----------|---------|--------------------------|
 * | Adri�n | Garc�a Santos   |  11111111A |  23    |  C/ Los Olivos     |  3       |  38493  |  Santa Cruz de Tenerife  |
 * |--------|-----------------|------------|--------|--------------------|----------|---------|--------------------------|
 * | Ana    | M�ndez N��ez    |  22222222B |  22    |  C/ Los Pinos      |  25      |  38403  |  Santa Cruz de Tenerife  |
 * |--------|-----------------|------------|--------|--------------------|----------|---------|--------------------------|
 * | Mar�a  | S�nchez Camacho |  33333333C |  45    |  C/ Los Franceces  |  23      |  38505  |  Las Palmas              |
 * |--------|-----------------|------------|--------|--------------------|----------|---------|--------------------------|
 * | Julio  | Brito Gonz�lez  |  44444444D |  30    |  C/ Los Pinos      |  25      |  38403  |  Las Palmas              |
 * |________|_________________|____________|________|____________________|__________|_________|__________________________|
 * 
 * Para ello habr� que crear las siguientes clases:
 * 
 *  � Direcci�n: contiene los campos de la tabla relacionados con la direcci�n de la persona. Debe contener los
 *    atributos:
 *     � calle (String): calle donde vive la persona.
 *     � cp (int): c�digo postal de la calle.
 *     � provincia: provincia donde se encuentra la calle.
 *  � Persona: contiene los campos de la tabla relacionados con los datos personales de la persona. Debe contener
 *    los siguientes atributos:
 *     � nombre (String): nombre de la persona.
 *     � apellidos (String): apellidos de la persona.
 *     � dni (int): Documento nacional de identidad de la persona.
 *     � edad (int): edad de la persona.
 *     � direcci�n (Direcci�n: atributo a partir de la clase Direcci�n:
 *  � Lista: contiene la lista de Personas y los m�todos para operar con ella. Debe contener los siguientes atributos:
 *     � lista (ArrayList): atributo a partir de la clase Direcci�n.
 *     
 * Crear los m�todos getter(), setter() y los constructores que sean necesarios para las clases Direcci�n, Persona
 * y Lista.
 * 
 * Crear un men� interactivo que permita realizar las siguientes operaciones:
 * 
 *  � cargar(): cargar los datos de la tabla anterior en la lista. Estos datos deben leerse de un fichero con formato
 *    CSV.
 *  � listar(): lista todas las personas de la lista.
 *  � insertar(); insertar una persona de final de la lista.
 *  � eliminar(): eliminar una persona de la lista.
 *  � contar(): muestra el n�mero de personas de la lista.
 *    
 * Nota: Cada opci�n del men� debe llamar a un m�todo de la clase Lista que implemente dicha funcionalidad.
 * 
 * Opcional: A�adir las siguientes opciones al men�:
 * 
 *  � buscar(): busca una Persona por el DNI, si la encuentra, muestra los datos de la persona, en caso contrario mostrar
 *    un mensaje que diga que esa persona no se encuentra en la lista.
 *  � ordenar(): ordenar los elementos de la lista por array.
 *   
 */

package Pr�ctica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int opcion=0;
		Lista li=new Lista();
		do {
			
			System.out.println("\nMen�: \n1: Cargar \n2: Listar \n3: Insertar \n4: Eliminar \n5: Contar \n6: Buscar por DNI \n7: Ordenar");
			opcion=sc.nextInt();
			switch (opcion) {
			
			case 1: li.cargar();
				break;
				
			case 2: li.listar();
				break;
				
			case 3: li.insertar();
				break;
				
			case 4: li.remove(4);
				break;
				
			case 5: System.out.println("Las personas registradas son " + li.contar());
				break;
				
			case 6: li.buscar("22222222B");
				break;
			
			case 7: li.ordenar();
				break;
			default: System.out.println("Opci�n incorrecta");
				
			}
		} 
		
		while (opcion!=0);
		sc.close();
	}

}
