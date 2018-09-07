package com.Estudiante.view;

import java.util.Iterator;
import java.util.Scanner;

import com.Estudiante.control.Estudiantes;
import com.Estudiante.entity.Estudiante;
import com.Estudiante.entity.EstudianteNoRegistrado;

import GeneralView.InputTypesUniversidad;

public class EstudiantesView {
	private Estudiantes estudiantes;
	private Scanner scanner;
	public EstudiantesView(Estudiantes estudiantes, Scanner scanner) {
		this.estudiantes = estudiantes;
		this.scanner = scanner;
	}
	public  void addEstudiante() 
	{Estudiante estudiante;
	estudiante=RegistroEstudiante.ingresarEstudiante(scanner);
	estudiantes.añadirEstudiante(estudiante);}

	public  void listarEstudiate()
	{	for(Iterator<Estudiante> i= estudiantes.getEstudiante().iterator();i.hasNext();)
		System.out.println(i.next());}

	public void deleteEstudiante() throws EstudianteNoRegistrado
	{int codigoEstudiante=InputTypesUniversidad.readInt("Ingrese el codigo del estudiante que desea borrar", scanner);
	estudiantes.eliminarCategoria(codigoEstudiante);
	}
}
