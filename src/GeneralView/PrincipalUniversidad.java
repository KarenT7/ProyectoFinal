package GeneralView;

import java.util.Scanner;

import com.Estudiante.control.Estudiantes;
import com.Estudiante.entity.Estudiante;
import com.Estudiante.view.EstudiantesView;
import com.Estudiante.view.MenuEstudiante;


public class PrincipalUniversidad {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	   
	    Estudiantes estudiantes= new Estudiantes();
		EstudiantesView estudiantesView= new EstudiantesView(estudiantes, scanner);
		 MenuEstudiante.menuEstudiante(scanner,estudiantesView);	
		scanner.close();
	}

}
