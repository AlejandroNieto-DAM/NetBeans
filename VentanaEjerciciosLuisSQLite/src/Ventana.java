
import java.awt.Color;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandronieto
 */
public class Ventana extends javax.swing.JFrame {
    
    private ArrayList<Persona> personas;
    private ArrayList<Ciudad> ciudades;
    private ArrayList<Grupo> grupos;
    private ArrayList<Lugar> lugares;
    
  
    
    
    private Boolean aniadirPersonaB;
    private Boolean modificarPersona;
    
    private Boolean aniadirCiudadB;
    private Boolean modificarCiudad;
    
    private Boolean aniadirLugarB;
    private Boolean modificarLugar;
    
    private Boolean aniadirGrupoB;
    private Boolean modificarGrupo;
    
    private Color colorReset;
    
    private int idPersonas;
    private int idGrupos;
    private int idLugares;
    private int idCiudades;
    
    
   
    

    /**
     * Creates new form Ventana
     */
    public Ventana() throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        
        personas = new ArrayList();
        ciudades = new ArrayList();
        lugares = new ArrayList();
        grupos = new ArrayList();
        
        aniadirPersonaB = false;
        modificarPersona = false;
        
        aniadirCiudadB = false;
        modificarCiudad = false;
        
        aniadirGrupoB = false;
        modificarGrupo = false;
        
        aniadirLugarB = false;
        modificarLugar = false;
        
        jComboBox3.setEnabled(false);
        jComboBox1.setEnabled(false);
        jComboBox2.setEnabled(false);
        
        
        idPersonas = 0;
        idGrupos = 0;
        idLugares = 0;
        idCiudades = 0;
        
       
        colorReset = salirCiudad.getBackground();
        
        
            
    }
    
    
    private void jListRendererCiudad(){
        
        
        String[] names = new String[ciudades.size()];

        for(int i = 0; i < ciudades.size(); i++){
            names[i] = ciudades.get(i).getNombre();   
        }

         
       this.jListCiudad.setModel(new javax.swing.AbstractListModel(){
            String[] vect = names;
            

            @Override
            public int getSize() {
                return vect.length;
            }
            
            

            @Override
            public String getElementAt(int i) {
                
                return vect[i];
            }

        });
    
        jListCiudad.setCellRenderer(new ListCellRenderer());
    
    }
    
    private void jListRendererPersonas(){
        
        
        String[] names = new String[personas.size()];

        for(int i = 0; i < personas.size(); i++){
            names[i] = personas.get(i).getNombre();   
        }

         
       this.jListPersonas.setModel(new javax.swing.AbstractListModel(){
            String[] vect = names;
            

            @Override
            public int getSize() {
                return vect.length;
            }
            
            

            @Override
            public String getElementAt(int i) {
                
                return vect[i];
            }

        });
    
        jListPersonas.setCellRenderer(new ListCellRenderer());
    
    }
    
    private void jListRendererLugares(){
                
        
        String[] names = new String[lugares.size()];
        
        
        for(int i = 0; i < lugares.size(); i++){
            
            names[i] = lugares.get(i).getNombre();
                
        }
        

       this.jListLugares.setModel(new javax.swing.AbstractListModel(){
            String[] vect = names;
            

            @Override
            public int getSize() {
                return vect.length;
            }
            
            

            @Override
            public String getElementAt(int i) {
                
                return vect[i];
            }

        });
        
        
    
        jListLugares.setCellRenderer(new ListCellRenderer());
    
    }
    
    private void jListRendererGrupo(){
        
        
        String[] names = new String[grupos.size()];
        
        
        for(int i = 0; i < grupos.size(); i++){
            names[i] = grupos.get(i).getNombre();        
        }  
         
       this.jListGrupos.setModel(new javax.swing.AbstractListModel(){
            String[] vect = names;
            

            @Override
            public int getSize() {
                return vect.length;
            }
            
            

            @Override
            public String getElementAt(int i) {
                
                return vect[i];
            }

        });
    
        jListGrupos.setCellRenderer(new ListCellRenderer());
    
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        guardarPersona = new javax.swing.JButton();
        salirPersona = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jListPersonas = new javax.swing.JList<>();
        aniadirPersona = new javax.swing.JButton();
        borrarPersona = new javax.swing.JButton();
        modifyPersona = new javax.swing.JButton();
        nombrePersona = new javax.swing.JTextField();
        alturaPersona = new javax.swing.JTextField();
        pesoPersona = new javax.swing.JTextField();
        edadPersona = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        guardarGrupo = new javax.swing.JButton();
        salirGrupo = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListGrupos = new javax.swing.JList<>();
        aniadirGrupo = new javax.swing.JButton();
        borrarGrupo = new javax.swing.JButton();
        modifyGrupo = new javax.swing.JButton();
        nombreGrupo = new javax.swing.JTextField();
        directorGrupo = new javax.swing.JTextField();
        edadMinimaGrupo = new javax.swing.JTextField();
        horarioGrupo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Director = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        guardarLugar = new javax.swing.JButton();
        salirLugar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListLugares = new javax.swing.JList<>();
        aniadirLugar = new javax.swing.JButton();
        borrarLugar = new javax.swing.JButton();
        modifyLugar = new javax.swing.JButton();
        nombreLugar = new javax.swing.JTextField();
        direccionLugar = new javax.swing.JTextField();
        numeroLugar = new javax.swing.JTextField();
        horarioLugar = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        guardarCiudad = new javax.swing.JButton();
        salirCiudad = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListCiudad = new javax.swing.JList<>();
        aniadirCiudad = new javax.swing.JButton();
        borrarCiudad = new javax.swing.JButton();
        modifyCiudad = new javax.swing.JButton();
        nombreCiudad = new javax.swing.JTextField();
        paisCiudad = new javax.swing.JTextField();
        provinciaCiudad = new javax.swing.JTextField();
        edificioCiudad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        guardarPersona.setText("Guardar");
        guardarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarPersonaActionPerformed(evt);
            }
        });

        salirPersona.setText("Salir");
        salirPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirPersonaActionPerformed(evt);
            }
        });

        jListPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListPersonasMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jListPersonas);

        aniadirPersona.setText("Añadir");
        aniadirPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirPersonaActionPerformed(evt);
            }
        });

        borrarPersona.setText("Borrar");
        borrarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarPersonaActionPerformed(evt);
            }
        });

        modifyPersona.setText("Modificar");
        modifyPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyPersonaActionPerformed(evt);
            }
        });

        nombrePersona.setEditable(false);

        alturaPersona.setEditable(false);

        pesoPersona.setEditable(false);

        edadPersona.setEditable(false);

        jLabel25.setText("Nombre: ");

        jLabel26.setText("Altura:");

        jLabel27.setText("Peso:");

        jLabel28.setText("Edad");

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edadPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alturaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aniadirPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(salirPersona)
                        .addComponent(modifyPersona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(guardarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(borrarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(aniadirPersona)
                        .addGap(18, 18, 18)
                        .addComponent(borrarPersona)
                        .addGap(18, 18, 18)
                        .addComponent(modifyPersona))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alturaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pesoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(guardarPersona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(17, 17, 17)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edadPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28))
                    .addComponent(salirPersona))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Persona", jPanel8);

        guardarGrupo.setText("Guardar");
        guardarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarGrupoActionPerformed(evt);
            }
        });

        salirGrupo.setText("Salir");
        salirGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirGrupoActionPerformed(evt);
            }
        });

        jListGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListGruposMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jListGrupos);

        aniadirGrupo.setText("Añadir");
        aniadirGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirGrupoActionPerformed(evt);
            }
        });

        borrarGrupo.setText("Borrar");
        borrarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarGrupoActionPerformed(evt);
            }
        });

        modifyGrupo.setText("Modificar");
        modifyGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyGrupoActionPerformed(evt);
            }
        });

        nombreGrupo.setEditable(false);

        directorGrupo.setEditable(false);

        edadMinimaGrupo.setEditable(false);

        horarioGrupo.setEditable(false);

        jLabel21.setText("Nombre: ");

        Director.setText("Director:");

        jLabel23.setText("Edad minima:");

        jLabel24.setText("Horario:");

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel29.setText("Persona:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(Director)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel29))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(horarioGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(directorGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(nombreGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(edadMinimaGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salirGrupo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(modifyGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(guardarGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(aniadirGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(borrarGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(aniadirGrupo)
                        .addGap(18, 18, 18)
                        .addComponent(borrarGrupo)
                        .addGap(18, 18, 18)
                        .addComponent(modifyGrupo))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(guardarGrupo))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(directorGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Director))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edadMinimaGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horarioGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirGrupo)
                    .addComponent(jLabel29))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Grupo", jPanel7);

        guardarLugar.setText("Guardar");
        guardarLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarLugarActionPerformed(evt);
            }
        });

        salirLugar.setText("Salir");
        salirLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirLugarActionPerformed(evt);
            }
        });

        jListLugares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListLugaresMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jListLugares);

        aniadirLugar.setText("Añadir");
        aniadirLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirLugarActionPerformed(evt);
            }
        });

        borrarLugar.setText("Borrar");
        borrarLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarLugarActionPerformed(evt);
            }
        });

        modifyLugar.setText("Modificar");
        modifyLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyLugarActionPerformed(evt);
            }
        });

        nombreLugar.setEditable(false);

        direccionLugar.setEditable(false);

        numeroLugar.setEditable(false);

        horarioLugar.setEditable(false);

        jLabel17.setText("Nombre: ");

        jLabel18.setText("Dirección:");

        jLabel19.setText("Número:");

        jLabel20.setText("Horario:");

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel22.setText("Grupo:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(horarioLugar, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(direccionLugar, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(nombreLugar, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(numeroLugar, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aniadirLugar, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(borrarLugar, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(salirLugar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(modifyLugar, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(guardarLugar, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(aniadirLugar)
                                .addGap(18, 18, 18)
                                .addComponent(borrarLugar)
                                .addGap(18, 18, 18)
                                .addComponent(modifyLugar))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(guardarLugar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direccionLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numeroLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(horarioLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirLugar)
                    .addComponent(jLabel22))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lugar", jPanel6);

        guardarCiudad.setText("Guardar");
        guardarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCiudadActionPerformed(evt);
            }
        });

        salirCiudad.setText("Salir");
        salirCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirCiudadActionPerformed(evt);
            }
        });

        jListCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListCiudadMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jListCiudad);

        aniadirCiudad.setText("Añadir");
        aniadirCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirCiudadActionPerformed(evt);
            }
        });

        borrarCiudad.setText("Borrar");
        borrarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarCiudadActionPerformed(evt);
            }
        });

        modifyCiudad.setText("Modificar");
        modifyCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyCiudadActionPerformed(evt);
            }
        });

        nombreCiudad.setEditable(false);

        paisCiudad.setEditable(false);

        provinciaCiudad.setEditable(false);

        edificioCiudad.setEditable(false);

        jLabel13.setText("Nombre: ");

        jLabel14.setText("País:");

        jLabel15.setText("Provincia:");

        jLabel16.setText("Edificio famoso:");

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel30.setText("Lugar:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(49, 49, 49))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(edificioCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(paisCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(nombreCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(provinciaCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modifyCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aniadirCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(guardarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirCiudad, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(aniadirCiudad)
                        .addGap(18, 18, 18)
                        .addComponent(borrarCiudad)
                        .addGap(18, 18, 18)
                        .addComponent(modifyCiudad))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(guardarCiudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paisCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(provinciaCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edificioCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salirCiudad)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ciudad", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifyPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyPersonaActionPerformed
        this.modifyPersona();
    }//GEN-LAST:event_modifyPersonaActionPerformed

    private void borrarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarPersonaActionPerformed
        this.borrarPersona(); 
    }//GEN-LAST:event_borrarPersonaActionPerformed

    private void aniadirPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirPersonaActionPerformed
        this.aniadirPersona();
    }//GEN-LAST:event_aniadirPersonaActionPerformed

    private void jListPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPersonasMouseClicked
        this.mostrarPersona();
    }//GEN-LAST:event_jListPersonasMouseClicked

    private void salirPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirPersonaActionPerformed
        try {
            this.accionSalir();
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salirPersonaActionPerformed

    private void guardarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarPersonaActionPerformed
        try {
            this.guardarPersona();
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_guardarPersonaActionPerformed

    private void modifyGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyGrupoActionPerformed
        this.modifyGrupo();
    }//GEN-LAST:event_modifyGrupoActionPerformed

    private void borrarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarGrupoActionPerformed
    
        this.borrarGrupo();
   
    }//GEN-LAST:event_borrarGrupoActionPerformed

    private void aniadirGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirGrupoActionPerformed
        this.aniadirGrupo();
    }//GEN-LAST:event_aniadirGrupoActionPerformed

    private void jListGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListGruposMouseClicked
        this.mostrarGrupo();
    }//GEN-LAST:event_jListGruposMouseClicked

    private void salirGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirGrupoActionPerformed
        try {
            this.accionSalir();
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salirGrupoActionPerformed

    private void guardarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarGrupoActionPerformed
        this.guardarGrupo();
    }//GEN-LAST:event_guardarGrupoActionPerformed

    private void modifyLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyLugarActionPerformed
          this.modifyLugar();
    }//GEN-LAST:event_modifyLugarActionPerformed

    private void borrarLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarLugarActionPerformed
        this.borrarLugar();
    }//GEN-LAST:event_borrarLugarActionPerformed

    private void aniadirLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirLugarActionPerformed
        this.aniadirLugar();
    }//GEN-LAST:event_aniadirLugarActionPerformed

    private void jListLugaresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListLugaresMouseClicked
        this.mostrarLugar();
    }//GEN-LAST:event_jListLugaresMouseClicked

    private void salirLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirLugarActionPerformed
        try {
            this.accionSalir();
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salirLugarActionPerformed

    private void guardarLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarLugarActionPerformed
        this.guardarLugar();
    }//GEN-LAST:event_guardarLugarActionPerformed

    private void modifyCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyCiudadActionPerformed
        this.modifyCiudad();
    }//GEN-LAST:event_modifyCiudadActionPerformed

    private void borrarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarCiudadActionPerformed
        this.borrarCiudad();
    }//GEN-LAST:event_borrarCiudadActionPerformed

    private void aniadirCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirCiudadActionPerformed
       this.aniadirCiudad();
    }//GEN-LAST:event_aniadirCiudadActionPerformed

    private void jListCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListCiudadMouseClicked
        this.mostrarCiudad();
    }//GEN-LAST:event_jListCiudadMouseClicked

    private void salirCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirCiudadActionPerformed
        try {
            this.accionSalir();
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salirCiudadActionPerformed

    private void guardarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCiudadActionPerformed
        this.guardarCiudad();
    }//GEN-LAST:event_guardarCiudadActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        nombrePersona.setText("");
        alturaPersona.setText("");
        pesoPersona.setText("");
        edadPersona.setText("");
        
        aniadirPersonaB = false;
        modificarPersona = false;
        aniadirPersona.setEnabled(true);
        borrarPersona.setEnabled(true);
        modifyPersona.setEnabled(true);
        modifyPersona.setBackground(colorReset);
        aniadirPersona.setBackground(colorReset);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        aniadirLugarB = false;
        modificarLugar = false;
        aniadirLugar.setEnabled(true);
        borrarLugar.setEnabled(true);
        modifyLugar.setEnabled(true);
        modifyLugar.setBackground(colorReset);
        aniadirLugar.setBackground(colorReset);
        nombreLugar.setText("");
        direccionLugar.setText("");
        numeroLugar.setText("");
        horarioLugar.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        aniadirLugarB = false;
        modificarLugar = false;
        aniadirLugar.setEnabled(true);
        borrarLugar.setEnabled(true);
        modifyLugar.setEnabled(true);
        modifyLugar.setBackground(colorReset);
        aniadirLugar.setBackground(colorReset);
        nombreLugar.setText("");
        direccionLugar.setText("");
        numeroLugar.setText("");
        horarioLugar.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        nombreGrupo.setText("");
        directorGrupo.setText("");
        edadMinimaGrupo.setText("");
        horarioGrupo.setText("");
        aniadirGrupoB = false;
        modificarGrupo = false;
        aniadirGrupo.setEnabled(true);
        borrarGrupo.setEnabled(true);
        modifyGrupo.setEnabled(true);
        modifyGrupo.setBackground(colorReset);
        aniadirGrupo.setBackground(colorReset);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void guardarPersonas() throws IOException{  
        
    }

    public void leerPersonas() throws SQLException{
        String query =  "select * " + "from Personas"; 
        
        ConnectToBD conexion = new ConnectToBD();
        
        try (Statement stmt = conexion.getConnector().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                Double altura = rs.getDouble("altura");
                Float peso = rs.getFloat("peso");
                int edad = rs.getInt("edad");
                
                Persona aux = new Persona();
                
                aux.setId(id);
                aux.setNombre(nombre);
                aux.setAltura(altura);
                aux.setPeso(peso);
                aux.setEdad(edad);
                
                personas.add(aux);
                

            }
        } catch (SQLException e ) {
            
        }
        
        conexion.getConnector().close();
        
        for(int i = 0; i < personas.size(); i++){
            jComboBox3.addItem(personas.get(i).getNombre());
        }
        
        this.jListRendererPersonas();
    }
    
    public void guardarGrupos() throws FileNotFoundException, IOException{
       
        
        
    }
    
    public void leerGrupos() throws FileNotFoundException, IOException, ClassNotFoundException, SAXException, SQLException{
       String query =  "select * " + "from Grupos"; 
        
        ConnectToBD conexion = new ConnectToBD();
        
        try (Statement stmt = conexion.getConnector().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String director = rs.getString("nombreDirector");
                int edadM = rs.getInt("edadMinima");
                String horario = rs.getString("horario");
                String persona = rs.getString("nombrePersona");
                
                Grupo aux = new Grupo();
                
                aux.setId(id);
                aux.setNombre(nombre);
                aux.setNombreDirector(director);
                aux.setEdadMinima(edadM);
                aux.setHorario(horario);
                aux.setNombrePersona(persona);
                
                
                grupos.add(aux);
                

            }
        } catch (SQLException e ) {
            System.out.println("Excepsion de mielda " + e);
        }
        
        conexion.getConnector().close();
        
        for(int i = 0; i < grupos.size(); i++){
            jComboBox2.addItem(grupos.get(i).getNombre());
        }
        
        this.jListRendererGrupo();
    }
    
    public void guardarLugares() throws IOException{
        
        
    }
    
    public void leerLugares() throws FileNotFoundException, IOException, ClassNotFoundException, SAXException, SQLException{
        
        String query =  "select * " + "from Lugares"; 
        
        ConnectToBD conexion = new ConnectToBD();
        
        try (Statement stmt = conexion.getConnector().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String direccion = rs.getString("direccion");
                int numeroEdif = rs.getInt("numeroEdif");
                String horario = rs.getString("horario");
                String grupo = rs.getString("grupo");
                
                Lugar aux = new Lugar();
                
                aux.setId(id);
                aux.setNombre(nombre);
                aux.setDireccion(direccion);
                aux.setNumeroEdif(numeroEdif);
                aux.setHorario(horario);
                aux.setGrupo(grupo);
                
                
                lugares.add(aux);
                

            }
        } catch (SQLException e ) {
            
        }
        
        conexion.getConnector().close();
        
        for(int i = 0; i < lugares.size(); i++){
            jComboBox1.addItem(lugares.get(i).getNombre());
        }
        
        this.jListRendererLugares();
    }
    
    public void guardarCiudades(){
        
        

     
    }
    
    public void leerCiudades() throws FileNotFoundException, IOException, ClassNotFoundException, SAXException, SQLException{
        String query =  "select * " + "from Ciudades"; 
        
        ConnectToBD conexion = new ConnectToBD();
        
        try (Statement stmt = conexion.getConnector().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String pais = rs.getString("pais");
                String provincia = rs.getString("provincia");
                String edificioEmblematico = rs.getString("edificioEmblematico");
                String lugar = rs.getString("lugar");
                
                Ciudad aux = new Ciudad();
                
                aux.setId(id);
                aux.setNombre(nombre);
                aux.setPais(pais);
                aux.setProvincia(provincia);
                aux.setEdificioEmblematico(edificioEmblematico);
                aux.setLugar(lugar);
                
                
                ciudades.add(aux);
                

            }
        } catch (SQLException e ) {
            System.out.println("Excepsion de mielda " + e);
        }
        
        conexion.getConnector().close();
          
        this.jListRendererCiudad();
    }
    
    public void accionSalir() throws IOException{
        this.guardarPersonas();
        this.guardarGrupos();
        this.guardarLugares();
        this.guardarCiudades();
        
        System.exit(0);
    }
    
    public void aniadirPersona(){
        nombrePersona.setEditable(true);
        alturaPersona.setEditable(true);
        pesoPersona.setEditable(true);
        edadPersona.setEditable(true);
        
        nombrePersona.setText("");
        alturaPersona.setText("");
        pesoPersona.setText("");
        edadPersona.setText("");

        modifyPersona.setEnabled(false);
        borrarPersona.setEnabled(false);

        aniadirPersona.setBackground(Color.GREEN);
        aniadirPersonaB = true;
    }
    
    public void modifyPersona(){
        if(personas.size() > 0){
            nombrePersona.setEditable(true);
            alturaPersona.setEditable(true);
            pesoPersona.setEditable(true);
            edadPersona.setEditable(true);

            modifyPersona.setBackground(Color.GREEN);
            borrarPersona.setBackground(colorReset);

            borrarPersona.setEnabled(false);
            aniadirPersona.setEnabled(false);

            modificarPersona = true;

            
        }
    }
    
    public void borrarPersona(){
        Boolean encontrado = false; 
        for(int i = 0; i < grupos.size(); i++){
            if(grupos.get(i).getNombrePersona().equals(personas.get(jListPersonas.getSelectedIndex()).getNombre())){
                encontrado = true;
            }
        }

        if(encontrado == false){
            ConnectToBD conexion = new ConnectToBD();
            
            try{

               String query = " DELETE FROM Personas WHERE id = " + personas.get(jListPersonas.getSelectedIndex()).getId();

               PreparedStatement preparedStmt = conexion.getConnector().prepareStatement(query);
 
               preparedStmt.execute();

               conexion.getConnector().close();   
               personas.remove(jListPersonas.getSelectedIndex());
               jComboBox3.removeItemAt(jListPersonas.getSelectedIndex());

           }
           catch (Exception e){
               System.out.println("Excepcion de feooooos en el borrar!" + e);
           
            
           }
            
            
            
        }  else {
            JOptionPane.showMessageDialog(null, "Esta persona tiene grupos asociados, primero elimina esos grupos!");
        }
            
            

        nombrePersona.setText("");
        alturaPersona.setText("");
        pesoPersona.setText("");
        edadPersona.setText("");
        
        this.jListRendererPersonas();
    }
    
    public void mostrarPersona(){
        nombrePersona.setText(personas.get(jListPersonas.getSelectedIndex()).getNombre());
        alturaPersona.setText(String.valueOf(personas.get(jListPersonas.getSelectedIndex()).getAltura()));
        pesoPersona.setText(String.valueOf(personas.get(jListPersonas.getSelectedIndex()).getPeso()));
        edadPersona.setText(String.valueOf(personas.get(jListPersonas.getSelectedIndex()).getEdad()));
    }
    
    public void guardarPersona() throws SQLException{
        if(aniadirPersonaB == true){

            this.crearNuevaPersona(nombrePersona.getText(), Double.parseDouble(alturaPersona.getText()), Float.parseFloat(pesoPersona.getText()), Integer.parseInt(edadPersona.getText()));
            jComboBox3.addItem(personas.get(personas.size() - 1).getNombre());
            
            nombrePersona.setEditable(false);
            alturaPersona.setEditable(false);
            pesoPersona.setEditable(false);
            edadPersona.setEditable(false);

        } else if(modificarPersona == true){

            personas.get(jListPersonas.getSelectedIndex()).setNombre(nombrePersona.getText());
            personas.get(jListPersonas.getSelectedIndex()).setAltura(Double.parseDouble(alturaPersona.getText()));
            personas.get(jListPersonas.getSelectedIndex()).setPeso(Float.parseFloat(pesoPersona.getText()));
            personas.get(jListPersonas.getSelectedIndex()).setEdad(Integer.parseInt(edadPersona.getText()));
            
            
            jComboBox3.insertItemAt(personas.get(jListPersonas.getSelectedIndex()).getNombre(), jListPersonas.getSelectedIndex());
            jComboBox3.removeItemAt(jListPersonas.getSelectedIndex() + 1);
            
            ConnectToBD conexion = new ConnectToBD();
            
            try{

               String query = " UPDATE Personas SET nombre = '" + String.valueOf(personas.get(jListPersonas.getSelectedIndex()).getNombre()) + "', altura = " + personas.get(jListPersonas.getSelectedIndex()).getAltura() + ", peso = " + personas.get(jListPersonas.getSelectedIndex()).getAltura() + ", edad = " + personas.get(jListPersonas.getSelectedIndex()).getEdad() + " WHERE id = " + personas.get(jListPersonas.getSelectedIndex()).getId() ;

               PreparedStatement preparedStmt = conexion.getConnector().prepareStatement(query);

               
               preparedStmt.execute();

             conexion.getConnector().close();        

           }
           catch (Exception e){
               System.out.println("Excepcion de feooooos en el modify!" + e);
           }
            
        }

        this.jListRendererPersonas();
        aniadirPersonaB = false;
        modificarPersona = false;
        aniadirPersona.setEnabled(true);
        borrarPersona.setEnabled(true);
        modifyPersona.setEnabled(true);
        modifyPersona.setBackground(colorReset);
        aniadirPersona.setBackground(colorReset);
    }
    
    public void aniadirGrupo(){
        nombreGrupo.setEditable(true);
        directorGrupo.setEditable(true);
        edadMinimaGrupo.setEditable(true);
        horarioGrupo.setEditable(true);
        
        nombreGrupo.setText("");
        directorGrupo.setText("");
        edadMinimaGrupo.setText("");
        horarioGrupo.setText("");
       

        modifyGrupo.setEnabled(false);
        borrarGrupo.setEnabled(false);

        aniadirGrupo.setBackground(Color.GREEN);
        
        jComboBox3.setEnabled(true);
        aniadirGrupoB = true;
    }
    
    public void modifyGrupo(){
        if(grupos.size() > 0){
            nombreGrupo.setEditable(true);
            directorGrupo.setEditable(true);
            edadMinimaGrupo.setEditable(true);
            horarioGrupo.setEditable(true);

            modifyGrupo.setBackground(Color.GREEN);

            borrarGrupo.setEnabled(false);
            aniadirGrupo.setEnabled(false);
            
            jComboBox3.setEnabled(true);
            modificarGrupo= true;

            
        }
    }
    
    public void borrarGrupo(){
        Boolean encontrado = false;
        for(int i  = 0; i < lugares.size();i++){
            if(lugares.get(i).getGrupo().equals(grupos.get(jListGrupos.getSelectedIndex()).getNombre())){
                encontrado = true;
            }
        }
        
        if(encontrado == false){ 
            ConnectToBD conexion = new ConnectToBD();
            
            try{

               String query = " DELETE FROM Grupos WHERE id = " + grupos.get(jListGrupos.getSelectedIndex()).getId();

               PreparedStatement preparedStmt = conexion.getConnector().prepareStatement(query);
 
               preparedStmt.execute();

               conexion.getConnector().close();        

           }
           catch (Exception e){
               System.out.println("Excepcion de feooooos en el borrar!" + e);
           
            
           }
            grupos.remove(jListGrupos.getSelectedIndex());
            jComboBox2.removeItemAt(jListGrupos.getSelectedIndex());
        } else {
            JOptionPane.showMessageDialog(null, "Este lugar tiene ciudades asociadas, primero elimina esas ciudades!");

        }
        
        
        nombreGrupo.setText("");
        directorGrupo.setText("");
        edadMinimaGrupo.setText("");
        horarioGrupo.setText("");
        
        this.jListRendererGrupo();
    }
    
    public void mostrarGrupo(){
        nombreGrupo.setText(grupos.get(jListGrupos.getSelectedIndex()).getNombre());
        directorGrupo.setText(grupos.get(jListGrupos.getSelectedIndex()).getNombreDirector());
        edadMinimaGrupo.setText(String.valueOf(grupos.get(jListGrupos.getSelectedIndex()).getEdadMinima()));
        horarioGrupo.setText(grupos.get(jListGrupos.getSelectedIndex()).getHorario());
        
        for(int j = 0; j < personas.size(); j++){
            if(grupos.get(jListGrupos.getSelectedIndex()).getNombrePersona().equalsIgnoreCase(jComboBox3.getItemAt(j).toString())){  
                jComboBox3.setSelectedIndex(j);        
            }
        }
    }
    
    public void guardarGrupo(){
        if(aniadirGrupoB == true){

            this.crearNuevoGrupo( nombreGrupo.getText(), directorGrupo.getText(), Integer.parseInt(edadMinimaGrupo.getText()), horarioGrupo.getText(), jComboBox3.getItemAt(jComboBox3.getSelectedIndex()));
                                
            jComboBox2.addItem(grupos.get(grupos.size() - 1).getNombre());
                    
            nombreGrupo.setEditable(false);
            directorGrupo.setEditable(false);
            edadMinimaGrupo.setEditable(false);
            horarioGrupo.setEditable(false);
            

        } else if(modificarGrupo == true){
          
            
            grupos.get(jListGrupos.getSelectedIndex()).setNombre(nombreGrupo.getText());
            grupos.get(jListGrupos.getSelectedIndex()).setNombreDirector(directorGrupo.getText());
            grupos.get(jListGrupos.getSelectedIndex()).setEdadMinima(Integer.parseInt(edadMinimaGrupo.getText()));
            grupos.get(jListGrupos.getSelectedIndex()).setHorario(horarioGrupo.getText());
            
            grupos.get(jListGrupos.getSelectedIndex()).setNombrePersona(jComboBox3.getItemAt(jComboBox3.getSelectedIndex()));
            
            jComboBox2.insertItemAt(grupos.get(jListGrupos.getSelectedIndex()).getNombre(), jListGrupos.getSelectedIndex());
            jComboBox2.removeItemAt(jListGrupos.getSelectedIndex() + 1);
            
            ConnectToBD conexion = new ConnectToBD();
            
            try{

               String query = " UPDATE Grupos SET nombre = '" + String.valueOf(grupos.get(jListGrupos.getSelectedIndex()).getNombre()) 
                       + "', nombreDirector = '" + grupos.get(jListGrupos.getSelectedIndex()).getNombreDirector()
                       + "', edadMinima = " + grupos.get(jListGrupos.getSelectedIndex()).getEdadMinima() 
                       + ", horario = '" + grupos.get(jListGrupos.getSelectedIndex()).getHorario()
                       + "', nombrePersona = '" + grupos.get(jListGrupos.getSelectedIndex()).getNombrePersona()
                       + "' WHERE id = " + grupos.get(jListGrupos.getSelectedIndex()).getId() ;

               PreparedStatement preparedStmt = conexion.getConnector().prepareStatement(query);

               
               preparedStmt.execute();

             conexion.getConnector().close();        

           }
           catch (Exception e){
               System.out.println("Excepcion de feooooos en el modify!" + e);
           }
            
            
            
            
            
        }

        this.jListRendererGrupo();
        aniadirGrupoB = false;
        modificarGrupo = false;
        aniadirGrupo.setEnabled(true);
        borrarGrupo.setEnabled(true);
        modifyGrupo.setEnabled(true);
        jComboBox3.setEnabled(false);
        modifyGrupo.setBackground(colorReset);
        aniadirGrupo.setBackground(colorReset);
    }
    
    public void aniadirLugar(){
        nombreLugar.setEditable(true);
        direccionLugar.setEditable(true);
        numeroLugar.setEditable(true);
        horarioLugar.setEditable(true);

        nombreLugar.setText("");
        direccionLugar.setText("");
        numeroLugar.setText("");
        horarioLugar.setText("");
        
        modifyLugar.setEnabled(false);
        borrarLugar.setEnabled(false);

        aniadirLugar.setBackground(Color.GREEN);
        jComboBox2.setEnabled(true);
        aniadirLugarB = true;
    }
    
    public void modifyLugar(){
            nombreLugar.setEditable(true);
            direccionLugar.setEditable(true);
            numeroLugar.setEditable(true);
            horarioLugar.setEditable(true);

            modifyLugar.setBackground(Color.GREEN);

            borrarLugar.setEnabled(false);
            aniadirLugar.setEnabled(false);

            jComboBox2.setEnabled(true);
            modificarLugar= true;  
    }
    
    public void borrarLugar(){
        Boolean encontrado = false;
        for(int i  = 0; i < ciudades.size();i++){
            if(ciudades.get(i).getLugar().equals(lugares.get(jListLugares.getSelectedIndex()).getNombre())){
                encontrado = true;
            }
        }
        
        if(encontrado == false){ 
            ConnectToBD conexion = new ConnectToBD();
            
            try{

               String query = " DELETE FROM Lugares WHERE id = " + lugares.get(jListLugares.getSelectedIndex()).getId();

               PreparedStatement preparedStmt = conexion.getConnector().prepareStatement(query);
 
               preparedStmt.execute();

               conexion.getConnector().close();        

           }
           catch (Exception e){
               System.out.println("Excepcion de feooooos en el borrar!" + e);
           
            
           }
            lugares.remove(jListLugares.getSelectedIndex());
            jComboBox1.removeItemAt(jListLugares.getSelectedIndex());
        } else {
            JOptionPane.showMessageDialog(null, "Este lugar tiene ciudades asociadas, primero elimina esas ciudades!");
        }
        

        nombreLugar.setText("");
        direccionLugar.setText("");
        numeroLugar.setText("");
        horarioLugar.setText("");
        
        this.jListRendererLugares();
    }
    
    public void mostrarLugar(){
        nombreLugar.setText(lugares.get(jListLugares.getSelectedIndex()).getNombre());
        direccionLugar.setText(lugares.get(jListLugares.getSelectedIndex()).getDireccion());
        numeroLugar.setText(String.valueOf(lugares.get(jListLugares.getSelectedIndex()).getNumeroEdif()));
        horarioLugar.setText(lugares.get(jListLugares.getSelectedIndex()).getHorario());
        
        for(int j = 0; j < grupos.size(); j++){
            if(lugares.get(jListLugares.getSelectedIndex()).getGrupo().equalsIgnoreCase(jComboBox2.getItemAt(j).toString())){  
                jComboBox2.setSelectedIndex(j);        
            }
        }
    }
    
    public void guardarLugar(){
        if(aniadirLugarB == true){
            
            
            this.crearNuevoLugar(nombreLugar.getText(), direccionLugar.getText(), Integer.parseInt(numeroLugar.getText()), horarioLugar.getText(), jComboBox2.getItemAt(jComboBox2.getSelectedIndex()));
               
            jComboBox1.addItem(lugares.get(lugares.size() - 1).getNombre());
            
            
            
            nombreLugar.setEditable(false);
            direccionLugar.setEditable(false);
            numeroLugar.setEditable(false);
            horarioLugar.setEditable(false);
            

        } else if(modificarLugar == true){

            lugares.get(jListLugares.getSelectedIndex()).setNombre(nombreLugar.getText());
            lugares.get(jListLugares.getSelectedIndex()).setDireccion(direccionLugar.getText());
            lugares.get(jListLugares.getSelectedIndex()).setNumeroEdif(Integer.parseInt(numeroLugar.getText()));
            lugares.get(jListLugares.getSelectedIndex()).setHorario(horarioLugar.getText());
            
            lugares.get(jListLugares.getSelectedIndex()).setGrupo(jComboBox2.getItemAt(jComboBox2.getSelectedIndex()));

            jComboBox1.insertItemAt(lugares.get(jListLugares.getSelectedIndex()).getNombre(), jListLugares.getSelectedIndex());
            jComboBox1.removeItemAt(jListLugares.getSelectedIndex() + 1);
            
            ConnectToBD conexion = new ConnectToBD();
            
            try{

               String query = " UPDATE Lugares SET nombre = '" + String.valueOf(lugares.get(jListLugares.getSelectedIndex()).getNombre()) 
                       + "', direccion = '" + lugares.get(jListLugares.getSelectedIndex()).getDireccion()
                       + "', numeroEdif = " + String.valueOf(lugares.get(jListLugares.getSelectedIndex()).getNumeroEdif())
                       + ", horario = '" + lugares.get(jListLugares.getSelectedIndex()).getHorario()
                       + "', grupo = '" + lugares.get(jListLugares.getSelectedIndex()).getGrupo()
                       + "' WHERE id = " + lugares.get(jListLugares.getSelectedIndex()).getId() ;

               PreparedStatement preparedStmt = conexion.getConnector().prepareStatement(query);

               
               preparedStmt.execute();

             conexion.getConnector().close();        

           }
           catch (Exception e){
               System.out.println("Excepcion de feooooos en el modify!" + e);
           }
            
            

        }
        
        this.jListRendererLugares();
        aniadirLugarB = false;
        modificarLugar = false;
        aniadirLugar.setEnabled(true);
        borrarLugar.setEnabled(true);
        modifyLugar.setEnabled(true);
        jComboBox2.setEnabled(false);
        modifyLugar.setBackground(colorReset);
        aniadirLugar.setBackground(colorReset);
    }
    
    public void aniadirCiudad(){
        nombreCiudad.setEditable(true);
        provinciaCiudad.setEditable(true);
        paisCiudad.setEditable(true);
        edificioCiudad.setEditable(true);

        nombreCiudad.setText("");
        provinciaCiudad.setText("");
        paisCiudad.setText("");
        edificioCiudad.setText("");

        modifyCiudad.setEnabled(false);
        borrarCiudad.setEnabled(false);

        aniadirCiudad.setBackground(Color.GREEN);
        jComboBox1.setEnabled(true);
        aniadirCiudadB = true;
    }
    
    public void modifyCiudad(){
        if(ciudades.size() > 0){
            nombreCiudad.setEditable(true);
            provinciaCiudad.setEditable(true);
            paisCiudad.setEditable(true);
            edificioCiudad.setEditable(true);

            modifyCiudad.setBackground(Color.GREEN);

            borrarCiudad.setEnabled(false);
            aniadirCiudad.setEnabled(false);
            jComboBox1.setEnabled(true);
            modificarCiudad = true;
        }
        
    }
    
    public void borrarCiudad(){
        
        ConnectToBD conexion = new ConnectToBD();
            
        try{

           String query = " DELETE FROM Ciudades WHERE id = " + ciudades.get(jListCiudad.getSelectedIndex()).getId();

           PreparedStatement preparedStmt = conexion.getConnector().prepareStatement(query);

           preparedStmt.execute();

           conexion.getConnector().close();        

       }
       catch (Exception e){
           System.out.println("Excepcion de feooooos en el borrar!" + e);


       }
        ciudades.remove(jListCiudad.getSelectedIndex());

        nombreCiudad.setText("");
        provinciaCiudad.setText("");
        paisCiudad.setText("");
        edificioCiudad.setText("");

        this.jListRendererCiudad();
    }
    
    public void mostrarCiudad(){
        nombreCiudad.setText(ciudades.get(jListCiudad.getSelectedIndex()).getNombre());
        paisCiudad.setText(ciudades.get(jListCiudad.getSelectedIndex()).getPais());
        provinciaCiudad.setText(ciudades.get(jListCiudad.getSelectedIndex()).getProvincia());
        edificioCiudad.setText(ciudades.get(jListCiudad.getSelectedIndex()).getEdificioEmblematico());
        
        for(int j = 0; j < lugares.size(); j++){
            if(ciudades.get(jListCiudad.getSelectedIndex()).getLugar().equalsIgnoreCase(jComboBox1.getItemAt(j).toString())){  
                jComboBox1.setSelectedIndex(j);        
            }
        }
    }
    
    public void guardarCiudad(){
         if(aniadirCiudadB == true){

            this.crearNuevaCiudad(nombreCiudad.getText(), paisCiudad.getText(), provinciaCiudad.getText(), edificioCiudad.getText(), jComboBox1.getItemAt(jComboBox1.getSelectedIndex()));
 
            nombreCiudad.setEditable(false);
            paisCiudad.setEditable(false);
            provinciaCiudad.setEditable(false);
            edificioCiudad.setEditable(false);

        } else if(modificarCiudad == true){

            ciudades.get(jListCiudad.getSelectedIndex()).setNombre(nombreCiudad.getText());
            ciudades.get(jListCiudad.getSelectedIndex()).setPais(paisCiudad.getText());
            ciudades.get(jListCiudad.getSelectedIndex()).setProvincia(provinciaCiudad.getText());
            ciudades.get(jListCiudad.getSelectedIndex()).setEdificioEmblematico(edificioCiudad.getText());
            ciudades.get(jListCiudad.getSelectedIndex()).setLugar(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()));

            
            ConnectToBD conexion = new ConnectToBD();
            
            try{

               String query = " UPDATE Ciudades SET nombre = '" + String.valueOf(ciudades.get(jListCiudad.getSelectedIndex()).getNombre()) 
                       + "', pais = '" + ciudades.get(jListCiudad.getSelectedIndex()).getPais()
                       + "', provincia = " + String.valueOf(ciudades.get(jListCiudad.getSelectedIndex()).getProvincia())
                       + ", edificioEmblematico = '" + ciudades.get(jListCiudad.getSelectedIndex()).getEdificioEmblematico()
                       + "', lugar = '" + ciudades.get(jListCiudad.getSelectedIndex()).getLugar()
                       + "' WHERE id = " + ciudades.get(jListCiudad.getSelectedIndex()).getId() ;

               PreparedStatement preparedStmt = conexion.getConnector().prepareStatement(query);

               
               preparedStmt.execute();

             conexion.getConnector().close();        

           } catch (Exception e){
               System.out.println("Excepcion de feooooos en el modify!" + e);
           }

        }

        this.jListRendererCiudad();
        aniadirCiudadB = false;
        modificarCiudad = false;
        aniadirCiudad.setEnabled(true);
        borrarCiudad.setEnabled(true);
        modifyCiudad.setEnabled(true);
        jComboBox1.setEnabled(false);
        modifyCiudad.setBackground(colorReset);
        aniadirCiudad.setBackground(colorReset);
    }
    
    public void crearNuevaCiudad(String nombre, String pais, String provincia, String edificioEmblematico, String lugar){
        idCiudades++;
        ciudades.add(new Ciudad(nombre, pais, provincia, edificioEmblematico, idCiudades, lugar));
        
        ConnectToBD conexion = new ConnectToBD();

                     
        try{

               String query = " insert into Ciudades (id, nombre, pais, provincia, edificioEmblematico, lugar)"
               + " values (?, ?, ?, ?, ?, ?)";

               PreparedStatement preparedStmt = conexion.getConnector().prepareStatement(query);

               preparedStmt.setInt (1, idCiudades);
               preparedStmt.setString (2, nombre);
               preparedStmt.setString (3, pais);
               preparedStmt.setString (4, provincia);
               preparedStmt.setString (5, edificioEmblematico);
               preparedStmt.setString (6, lugar);
               
               preparedStmt.execute();

             conexion.getConnector().close();        

           }
           catch (Exception e){
               System.out.println("Excepcion de feooooos!" + e);
           }
                
    }
    
    public int getCiudadesDim(){
        return ciudades.size();   
    }
    
    public Ciudad getCiudad(int index){
        return ciudades.get(index);
    }
    
    public void crearNuevaPersona(String nombre, Double altura, Float peso, int edad) throws SQLException{
        idPersonas++;
        personas.add(new Persona(nombre, altura, peso, edad, idPersonas));
        
        ConnectToBD conexion = new ConnectToBD();
        
            try{

               String query = " insert into Personas (id, nombre, altura, peso, edad)"
               + " values (?, ?, ?, ?, ?)";

               PreparedStatement preparedStmt = conexion.getConnector().prepareStatement(query);

               preparedStmt.setInt (1, idPersonas);
               preparedStmt.setString (2, nombre);
               preparedStmt.setDouble(3, altura);
               preparedStmt.setFloat (4, peso);
               preparedStmt.setInt (5, edad);
               

               preparedStmt.execute();

                

           }
           catch (Exception e){
               System.out.println("Excepcion de feooooos!" + e);
           }
            
        conexion.getConnector().close(); 
              
    }
    
    public Persona getPersona(int index){
        return personas.get(index);
    }
    
    public int getPersonasDim(){
        return personas.size();   
    }
    
    public void crearNuevoGrupo(String nombreGrupo, String directorGrupo, int edadMinima, String horarioGrupo, String persona){
        idGrupos++;
        grupos.add(new Grupo(idGrupos, nombreGrupo, directorGrupo, edadMinima, horarioGrupo, persona));
        
        ConnectToBD conexion = new ConnectToBD();
        
            try{

               String query = " insert into Grupos (id, nombre, nombreDirector, edadMinima, horario, nombrePersona)"
               + " values (?, ?, ?, ?, ?, ?)";

               PreparedStatement preparedStmt = conexion.getConnector().prepareStatement(query);

               preparedStmt.setInt (1, idGrupos);
               preparedStmt.setString (2, nombreGrupo);
               preparedStmt.setString (3, directorGrupo);
               preparedStmt.setInt (4, edadMinima);
               preparedStmt.setString (5, horarioGrupo);
               preparedStmt.setString (6, persona);

               preparedStmt.execute();

             conexion.getConnector().close();        

           }
           catch (Exception e){
               System.out.println("No ha sido posible insertar en la base de datos!" + e);
           }

    }
    
    public Grupo getGrupo(int index){
        return grupos.get(index);
    }
    
    public int getGruposDim(){
        return grupos.size();
    }
    
    public void crearNuevoLugar(String nombre, String direccion, int numeroLugar, String horario, String grupo){
        idLugares++;
        lugares.add(new Lugar(idLugares, nombre, direccion, numeroLugar, horario, grupo));
        
        ConnectToBD conexion = new ConnectToBD();
        
            try{

               String query = " insert into Lugares (id, nombre, direccion, numeroEdif, horario, grupo)"
               + " values (?, ?, ?, ?, ?, ?)";

               PreparedStatement preparedStmt = conexion.getConnector().prepareStatement(query);

               preparedStmt.setInt (1, idLugares);
               preparedStmt.setString (2, nombre);
               preparedStmt.setString (3, direccion);
               preparedStmt.setInt (4, numeroLugar);
               preparedStmt.setString (5, horario);
               preparedStmt.setString (6, grupo);

               preparedStmt.execute();

             conexion.getConnector().close();        

           }
           catch (Exception e){
               System.out.println("No ha sido posible insertar en la base de datos!" + e);
           }
    }
    
    public Lugar getLugar(int index){
        return lugares.get(index);
    }
    
    public int getLugaresDim(){
        return lugares.size();
    }
    
    
    
    static void  CrearElemento(String datoEmple, String valor,
                               Element raiz, Document document){
       Element elem = document.createElement(datoEmple); 
       Text text = document.createTextNode(valor); //damos valor
       raiz.appendChild(elem); //pegamos el elemento hijo a la raiz
       elem.appendChild(text); //pegamos el valor		 	
    }
    
    private void inicializarIDs(){
        idCiudades = ciudades.size();
        idLugares = lugares.size();
        idGrupos = grupos.size();
        idPersonas = personas.size();
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException, IOException, FileNotFoundException, ClassNotFoundException, SAXException {
        Ventana nuevaVentana = new Ventana();
        
        nuevaVentana.leerPersonas();
        nuevaVentana.leerGrupos();
        nuevaVentana.leerCiudades();
        
        nuevaVentana.leerLugares();
        
        nuevaVentana.inicializarIDs();
        
        nuevaVentana.setVisible(true);
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Director;
    private javax.swing.JTextField alturaPersona;
    private javax.swing.JButton aniadirCiudad;
    private javax.swing.JButton aniadirGrupo;
    private javax.swing.JButton aniadirLugar;
    private javax.swing.JButton aniadirPersona;
    private javax.swing.JButton borrarCiudad;
    private javax.swing.JButton borrarGrupo;
    private javax.swing.JButton borrarLugar;
    private javax.swing.JButton borrarPersona;
    private javax.swing.JTextField direccionLugar;
    private javax.swing.JTextField directorGrupo;
    private javax.swing.JTextField edadMinimaGrupo;
    private javax.swing.JTextField edadPersona;
    private javax.swing.JTextField edificioCiudad;
    private javax.swing.JButton guardarCiudad;
    private javax.swing.JButton guardarGrupo;
    private javax.swing.JButton guardarLugar;
    private javax.swing.JButton guardarPersona;
    private javax.swing.JTextField horarioGrupo;
    private javax.swing.JTextField horarioLugar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JList<String> jListCiudad;
    private javax.swing.JList<String> jListGrupos;
    private javax.swing.JList<String> jListLugares;
    private javax.swing.JList<String> jListPersonas;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton modifyCiudad;
    private javax.swing.JButton modifyGrupo;
    private javax.swing.JButton modifyLugar;
    private javax.swing.JButton modifyPersona;
    private javax.swing.JTextField nombreCiudad;
    private javax.swing.JTextField nombreGrupo;
    private javax.swing.JTextField nombreLugar;
    private javax.swing.JTextField nombrePersona;
    private javax.swing.JTextField numeroLugar;
    private javax.swing.JTextField paisCiudad;
    private javax.swing.JTextField pesoPersona;
    private javax.swing.JTextField provinciaCiudad;
    private javax.swing.JButton salirCiudad;
    private javax.swing.JButton salirGrupo;
    private javax.swing.JButton salirLugar;
    private javax.swing.JButton salirPersona;
    // End of variables declaration//GEN-END:variables
}
