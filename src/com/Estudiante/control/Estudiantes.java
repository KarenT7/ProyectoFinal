package com.Estudiante.control;

import java.util.ArrayList;
import java.util.Iterator;

import com.Estudiante.entity.Estudiante;
import com.Estudiante.entity.EstudianteNoRegistrado;

public class Estudiantes {
	private ArrayList<Estudiante> estudiantes;
	private int cantidad;


	public void añadirEstudiante(Estudiante estudiante)
	{this.estudiantes.add(estudiante);}
	
	
	public void eliminarCategoria(int codEstudiante) throws EstudianteNoRegistrado {//llamar a produycto view
		int indice = buscarEstudiante(codEstudiante);
		estudiantes.remove(indice);}


	public int buscarEstudiante(int codEstudiante) throws EstudianteNoRegistrado {
		int indice = -1;
		Estudiante estudiante=null;

		for (Iterator<Estudiante> iterator=estudiantes.iterator(); iterator.hasNext();) {
			estudiante=iterator.next();
			if(codEstudiante==estudiante.getCodigoEstudiante())
			{indice=estudiantes.indexOf(estudiante);}
			break;
		}

		if(indice<0)
		{throw new EstudianteNoRegistrado();}
		return indice;}

	
	public ArrayList<Estudiante> getEstudiante()
	{
		return estudiantes;
	}
}
