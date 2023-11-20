package utn.estudiantes.servicio;

import utn.estudiantes.modelo.Estudiantes22;

import java.util.List;

public interface IEstudianteServicio {
    public List<Estudiantes22> listarEstudiantes();
    public Estudiantes22 buscarEstudiantePorId(Integer idEstudiante22);
    public void guardarEstudiante(Estudiantes22 estudiante);
    public void eliminarEstudiante(Estudiantes22 estudiante);
}
