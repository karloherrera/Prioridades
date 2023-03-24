
package modelos;
    
import java.util.PriorityQueue;
import javax.swing.table.DefaultTableModel;

    

public class PacientesModel {
   
    PriorityQueue<Pacientes> ListaPacientes = new PriorityQueue<Pacientes>();
    DefaultTableModel ModeloTabla = new DefaultTableModel();
    
    
    public void IngresarPaciente(String ape, String nom, String tel, int gra){
        Pacientes nuevoPaciente = new Pacientes(ape, nom, tel, gra);
        ListaPacientes.add(nuevoPaciente);
    }
    
    public DefaultTableModel ListarPacientes(){
        
        
        for(Pacientes MiListaDePacientes: ListaPacientes){
            
        this.ModeloTabla.addColumn("APELLIDO");
        this.ModeloTabla.addColumn("NOMBRE");
        this.ModeloTabla.addColumn("TELEFONO");
        this.ModeloTabla.addColumn("GRAVEDAD");
            
        this.ModeloTabla.addRow(new Object[]{MiListaDePacientes.getApellidos(),MiListaDePacientes.getNombre(),
        MiListaDePacientes.getTelefono(),
        MiListaDePacientes.getGravedad()});
          String ModeloTabla = ""; 
        }
        return ModeloTabla;
    }
}
