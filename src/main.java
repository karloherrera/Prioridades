
import controlador.Controller;
import modelos.PacientesModel;
import vistas.frmPrincipal;


public class main {

    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        PacientesModel ModeloPacientes = new PacientesModel();
        
        Controller PacienteControlador = new Controller(VistaPrincipal, ModeloPacientes);
        
    }
    
}
