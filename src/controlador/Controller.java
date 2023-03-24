/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.PacientesModel;
import vistas.frmPrincipal;

/**
 *
 * @author Angela
 */
public class Controller implements ActionListener{

    frmPrincipal VistaPrincipal;
    PacientesModel ModeloPacientes;
    

    public Controller(frmPrincipal VistaPrincipal, PacientesModel ModeloPacientes) {
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloPacientes = ModeloPacientes;
        
        this.VistaPrincipal.btnAtender.addActionListener(this);
        this.VistaPrincipal.btnIngresar.addActionListener(this);
        
        this.VistaPrincipal.setLocationRelativeTo(null);
        this.VistaPrincipal.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.VistaPrincipal.btnIngresar){
            
            this.ModeloPacientes.IngresarPaciente(this.VistaPrincipal.txtApellidos.getText(),
                    this.VistaPrincipal.txtNombre.getText(), 
                    this.VistaPrincipal.txtTelefono.getText(),
                    Integer.parseInt(this.VistaPrincipal.txtPrioridad.getText()));
            
            this.VistaPrincipal.jtTablaPacientes.setModel(this.ModeloPacientes.ListarPacientes());
            
        }
    }
    
}
