/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.sql.SQLException;

/**
 *
 * @author ead
 */
public class EditarUsuarioDialog extends JDialog{
    
    private JTextField txtNome, txtEmail, txtTelefone, txtTipo;
    private JButton btnSalvar, btnDeletar;
    private Usuario usuario;
    private UsuarioDAO usuarioDAO;
    
    public EditarUsuarioDialog(Frame parent, Usuario usuario, UsuarioDAO usuarioDAO){
        super(parent, "Editar Usuario", true);
        this.usuario = usuario;
        this.usuarioDAO = usuarioDAO;
        
        setLayout(new GridLayout(6,2,10,10));
        
        setSize (400,300);
        
        setLocationRelativeTo(parent);
        
        add(new JLabel("Nome:"));
        txtNome = new JTextField(usuario.getNome());
        add(txtNome);
        
        add(new JLabel("Email"));
        txtEmail = new JTextField(usuario.getEmail());
        add(txtEmail);
        
        add(new JLabel("Telefone:"));
        txtTelefone = new JTextField(usuario.getTelefone());
        add(txtTelefone);
        
        add(new JLabel("Tipo:"));
        txtTipo = new JTextField(usuario.getTipo_usuario());
        add(txtTipo);
        
        btnSalvar = new JButton("Salvar Alterações");
        btnSalvar.addActionListener(e -> salvarAteracoes());
        
        btnDeletar = new JButton("Deletar Usuário");
        btnDeletar.setForeground(Color.red);
        btnDeletar.addActionListener(e -> deletarUsuario());
        
        add(btnSalvar);
        add(btnDeletar);
        
    }
    
    private void salvarAteracoes(){
        usuario.setNome(txtNome.getText().trim());
        usuario.setEmail(txtEmail.getText().trim());
        usuario.setTelefone(txtTelefone.getText().trim());
        usuario.setTipo_usuario(txtTipo.getText().trim());
        
        try {
            usuarioDAO.atualizarUsuario(usuario);
            JOptionPane.showMessageDialog(this, "Usuario atualizado com sucesso ");
            dispose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar usuario\n"
                    + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public void deletarUsuario(){
        int confirmacao = JOptionPane.showConfirmDialog(this,
                "Tem certeza que excluir este usuário?","Confirmação",
                JOptionPane.YES_NO_OPTION);
        
        if(confirmacao == JOptionPane.YES_OPTION){
            try {
                usuarioDAO.deleteUsuario(usuario.getId());
                JOptionPane.showMessageDialog(this,"Usuário deletado com sucesso!");
                dispose();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this,"Erro ao deletar usuários\n"
                        +e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
