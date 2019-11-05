
import java.awt.Color;
import java.util.ArrayList;

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
    
    private ArrayList<IdObjects> ciudadesLugares;
    private ArrayList<IdObjects> lugaresGrupos;
    private ArrayList<IdObjects> gruposPersonas;
    
    
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
    public Ventana() {
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
        
        idPersonas = 0;
        idGrupos = 0;
        idLugares = 0;
        idCiudades = 0;
        
        ciudadesLugares = new ArrayList();
        lugaresGrupos = new ArrayList();
        gruposPersonas = new ArrayList();
        
        colorReset = salirCiudad.getBackground();
    
    }
    
    private String buscarLugarPorId(int id){
        
        String name = "";
        
        for(int i = 0; i < lugares.size(); i++){
            if(id == lugares.get(i).getId()){
                name = lugares.get(i).getNombre();
            }
        }
        return name;
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
                
        int idCiudad = ciudades.get(jComboBox2.getSelectedIndex()).getId();
        
        int contador = 0;
        String[] names = new String[lugares.size()];
        
        System.out.println("IdCiudad --> " + idCiudad);
        for(int i = 0; i < ciudadesLugares.size(); i++){
            if(idCiudad == ciudadesLugares.get(i).getId1()){
                names[contador] = buscarLugarPorId(ciudadesLugares.get(i).getId2());
                contador++;
            }
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
        
        System.out.println("yeyye");
    
        jListLugares.setCellRenderer(new ListCellRenderer());
    
    }
    
    private void jListRendererGrupo(){
        
        
        
        
        String[] names = new String[lugares.size()];
        
        for(int i = 0; i < lugares.size(); i++){
            names[i] = lugares.get(i).getNombre();
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
        jComboBox4 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edificioCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paisCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(provinciaCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(salirCiudad)
                            .addComponent(modifyCiudad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aniadirCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borrarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(aniadirCiudad)
                        .addGap(36, 36, 36)
                        .addComponent(borrarCiudad)
                        .addGap(37, 37, 37)
                        .addComponent(modifyCiudad))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paisCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(guardarCiudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(provinciaCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edificioCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16))
                    .addComponent(salirCiudad))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ciudad", jPanel5);

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

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(horarioLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccionLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(salirLugar)
                            .addComponent(modifyLugar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardarLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aniadirLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borrarLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(guardarLugar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(horarioLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20))
                    .addComponent(salirLugar))
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("Lugar", jPanel6);

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

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(Director)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(horarioGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(directorGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edadMinimaGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(salirGrupo)
                            .addComponent(modifyGrupo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aniadirGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borrarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(directorGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Director)
                    .addComponent(guardarGrupo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edadMinimaGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(horarioGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24))
                    .addComponent(salirGrupo))
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("Grupo", jPanel7);

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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aniadirPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(salirPersona)
                        .addComponent(modifyPersona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(guardarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(borrarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(aniadirPersona)
                        .addGap(18, 18, 18)
                        .addComponent(borrarPersona)
                        .addGap(18, 18, 18)
                        .addComponent(modifyPersona))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alturaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(guardarPersona))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edadPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28))
                    .addComponent(salirPersona))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Persona", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifyPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyPersonaActionPerformed
        if(personas.size() > 0){
            nombrePersona.setEditable(true);
            alturaPersona.setEditable(true);
            pesoPersona.setEditable(true);
            edadPersona.setEditable(true);

            modifyPersona.setBackground(Color.GREEN);

            borrarPersona.setEnabled(false);
            aniadirPersona.setEnabled(false);

            modificarPersona = true;

            
        }
    }//GEN-LAST:event_modifyPersonaActionPerformed

    private void borrarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarPersonaActionPerformed
        personas.remove(jListPersonas.getSelectedIndex());

        
        nombrePersona.setText("");
        alturaPersona.setText("");
        pesoPersona.setText("");
        edadPersona.setText("");
        
        this.jListRendererPersonas();
    }//GEN-LAST:event_borrarPersonaActionPerformed

    private void aniadirPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirPersonaActionPerformed
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
    }//GEN-LAST:event_aniadirPersonaActionPerformed

    private void jListPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPersonasMouseClicked
        nombrePersona.setText(personas.get(jListPersonas.getSelectedIndex()).getNombre());
        alturaPersona.setText(String.valueOf(personas.get(jListPersonas.getSelectedIndex()).getAltura()));
        pesoPersona.setText(String.valueOf(personas.get(jListPersonas.getSelectedIndex()).getPeso()));
        edadPersona.setText(String.valueOf(personas.get(jListPersonas.getSelectedIndex()).getEdad()));
    }//GEN-LAST:event_jListPersonasMouseClicked

    private void salirPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirPersonaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirPersonaActionPerformed

    private void guardarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarPersonaActionPerformed
        if(aniadirPersonaB == true){

            idPersonas++;
            personas.add(new Persona(nombrePersona.getText(), Double.parseDouble(alturaPersona.getText()), Float.parseFloat(pesoPersona.getText()), Integer.parseInt(edadPersona.getText()), idPersonas));

            nombrePersona.setEditable(false);
            alturaPersona.setEditable(false);
            pesoPersona.setEditable(false);
            edadPersona.setEditable(false);

        } else if(modificarPersona == true){

            personas.get(jListPersonas.getSelectedIndex()).setNombre(nombrePersona.getText());
            personas.get(jListPersonas.getSelectedIndex()).setAltura(Double.parseDouble(alturaPersona.getText()));
            personas.get(jListPersonas.getSelectedIndex()).setPeso(Float.parseFloat(pesoPersona.getText()));
            personas.get(jListPersonas.getSelectedIndex()).setEdad(Integer.parseInt(edadPersona.getText()));

        }

        this.jListRendererPersonas();
        aniadirPersonaB = false;
        modificarPersona = false;
        aniadirPersona.setEnabled(true);
        borrarPersona.setEnabled(true);
        modifyPersona.setEnabled(true);
        modifyPersona.setBackground(colorReset);
        aniadirPersona.setBackground(colorReset);
    }//GEN-LAST:event_guardarPersonaActionPerformed

    private void modifyGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyGrupoActionPerformed
        if(grupos.size() > 0){
            nombreGrupo.setEditable(true);
            directorGrupo.setEditable(true);
            edadMinimaGrupo.setEditable(true);
            horarioGrupo.setEditable(true);

            modifyGrupo.setBackground(Color.GREEN);

            borrarGrupo.setEnabled(false);
            aniadirGrupo.setEnabled(false);

            modificarGrupo= true;

            
        }
    }//GEN-LAST:event_modifyGrupoActionPerformed

    private void borrarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarGrupoActionPerformed
        
        
        
        nombreGrupo.setText("");
        directorGrupo.setText("");
        edadMinimaGrupo.setText("");
        horarioGrupo.setText("");
        
        this.jListRendererGrupo();
    }//GEN-LAST:event_borrarGrupoActionPerformed

    private void aniadirGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirGrupoActionPerformed
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
        

        aniadirGrupoB = true;
    }//GEN-LAST:event_aniadirGrupoActionPerformed

    private void jListGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListGruposMouseClicked
        
        /*
        nombreGrupo.setText(lugares.get(jComboBox3.getSelectedIndex()).getGrupoEnLugar(jListGrupos.getSelectedIndex()).getNombre());
        directorGrupo.setText(lugares.get(jComboBox3.getSelectedIndex()).getGrupoEnLugar(jListGrupos.getSelectedIndex()).getNombreDirector());
        edadMinimaGrupo.setText(String.valueOf(lugares.get(jComboBox3.getSelectedIndex()).getGrupoEnLugar(jListGrupos.getSelectedIndex()).getEdadMinima()));
        horarioGrupo.setText(lugares.get(jComboBox3.getSelectedIndex()).getGrupoEnLugar(jListGrupos.getSelectedIndex()).getHorario());*/
    }//GEN-LAST:event_jListGruposMouseClicked

    private void salirGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirGrupoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirGrupoActionPerformed

    private void guardarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarGrupoActionPerformed
       /* if(aniadirGrupoB == true){

            idGrupos++;

            Grupo auxiliar = new Grupo(idGrupos, nombreGrupo.getText(), directorGrupo.getText(), Integer.parseInt(edadMinimaGrupo.getText()), horarioGrupo.getText());
            
        
            
            
            
            
            jComboBox4.addItem(auxiliar.getNombre() + " - "  + lugares.get(jComboBox3.getSelectedIndex()).getNombre() + " - " + ciudades.get(jComboBox2.getSelectedIndex()).getNombre());
            
            nombreGrupo.setEditable(false);
            directorGrupo.setEditable(false);
            edadMinimaGrupo.setEditable(false);
            horarioGrupo.setEditable(false);
            

        } else if(modificarGrupo == true){

            
                
            lugares.get(jComboBox3.getSelectedIndex()).getGrupoEnLugar(jListGrupos.getSelectedIndex()).setNombre(nombreGrupo.getText());
            lugares.get(jComboBox3.getSelectedIndex()).getGrupoEnLugar(jListGrupos.getSelectedIndex()).setNombreDirector(directorGrupo.getText());
            lugares.get(jComboBox3.getSelectedIndex()).getGrupoEnLugar(jListGrupos.getSelectedIndex()).setEdadMinima(Integer.parseInt(edadMinimaGrupo.getText()));
            lugares.get(jComboBox3.getSelectedIndex()).getGrupoEnLugar(jListGrupos.getSelectedIndex()).setHorario(horarioGrupo.getText());
            
            

        }

        this.jListRendererGrupo();
        aniadirGrupoB = false;
        modificarGrupo = false;
        aniadirGrupo.setEnabled(true);
        borrarGrupo.setEnabled(true);
        modifyGrupo.setEnabled(true);
        modifyGrupo.setBackground(colorReset);
        aniadirGrupo.setBackground(colorReset);*/
    }//GEN-LAST:event_guardarGrupoActionPerformed

    private void modifyLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyLugarActionPerformed
        
        

            nombreLugar.setEditable(true);
            direccionLugar.setEditable(true);
            numeroLugar.setEditable(true);
            horarioLugar.setEditable(true);

            modifyLugar.setBackground(Color.GREEN);

            borrarLugar.setEnabled(false);
            aniadirLugar.setEnabled(false);

            modificarLugar= true;            
       
        
    }//GEN-LAST:event_modifyLugarActionPerformed

    private void borrarLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarLugarActionPerformed
        
        
        for(int i = 0; i < ciudadesLugares.size(); i++){
            if(lugares.get(jListLugares.getSelectedIndex()).getId() == ciudadesLugares.get(i).getId2()){
                ciudadesLugares.remove(i);
            }
        }
        
        lugares.remove(jListLugares.getSelectedIndex());
        
        jComboBox3.removeItemAt(jListLugares.getSelectedIndex());
        
        nombreLugar.setText("");
        direccionLugar.setText("");
        numeroLugar.setText("");
        horarioLugar.setText("");
        
        this.jListRendererLugares();
    }//GEN-LAST:event_borrarLugarActionPerformed

    private void aniadirLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirLugarActionPerformed
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

        aniadirLugarB = true;
    }//GEN-LAST:event_aniadirLugarActionPerformed

    private void jListLugaresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListLugaresMouseClicked
        nombreLugar.setText(lugares.get(jListLugares.getSelectedIndex()).getNombre());
        direccionLugar.setText(lugares.get(jListLugares.getSelectedIndex()).getDireccion());
        numeroLugar.setText(String.valueOf(lugares.get(jListLugares.getSelectedIndex()).getNumeroEdif()));
        horarioLugar.setText(lugares.get(jListLugares.getSelectedIndex()).getHorario());
    }//GEN-LAST:event_jListLugaresMouseClicked

    private void salirLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirLugarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirLugarActionPerformed

    private void guardarLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarLugarActionPerformed
        if(aniadirLugarB == true){
            
            idLugares++;
            lugares.add(new Lugar(idLugares, nombreLugar.getText(), direccionLugar.getText(), Integer.parseInt(numeroLugar.getText()), horarioLugar.getText()));
            
            ciudadesLugares.add(new IdObjects(ciudades.get(jComboBox2.getSelectedIndex()).getId(), idLugares));
            
            jComboBox3.addItem(lugares.get(lugares.size() - 1).getNombre() + " - " + ciudades.get(jComboBox2.getSelectedIndex()).getNombre());
            
            nombreLugar.setEditable(false);
            direccionLugar.setEditable(false);
            numeroLugar.setEditable(false);
            horarioLugar.setEditable(false);
            

        } else if(modificarLugar == true){

            lugares.get(jListLugares.getSelectedIndex()).setNombre(nombreLugar.getText());
            lugares.get(jListLugares.getSelectedIndex()).setDireccion(direccionLugar.getText());
            lugares.get(jListLugares.getSelectedIndex()).setNumeroEdif(Integer.parseInt(numeroLugar.getText()));
            lugares.get(jListLugares.getSelectedIndex()).setHorario(horarioLugar.getText());

        }
        
        this.jListRendererLugares();
        aniadirLugarB = false;
        modificarLugar = false;
        aniadirLugar.setEnabled(true);
        borrarLugar.setEnabled(true);
        modifyLugar.setEnabled(true);
        modifyLugar.setBackground(colorReset);
        aniadirLugar.setBackground(colorReset);
    }//GEN-LAST:event_guardarLugarActionPerformed

    private void modifyCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyCiudadActionPerformed
        if(ciudades.size() > 0){
            nombreCiudad.setEditable(true);
            provinciaCiudad.setEditable(true);
            paisCiudad.setEditable(true);
            edificioCiudad.setEditable(true);

            modifyCiudad.setBackground(Color.GREEN);

            borrarCiudad.setEnabled(false);
            aniadirCiudad.setEnabled(false);

            modificarCiudad = true;

            
        }
    }//GEN-LAST:event_modifyCiudadActionPerformed

    private void borrarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarCiudadActionPerformed
        jComboBox2.removeItemAt(jListCiudad.getSelectedIndex());
        ciudades.remove(jListCiudad.getSelectedIndex());
        
        nombreCiudad.setText("");
        provinciaCiudad.setText("");
        paisCiudad.setText("");
        edificioCiudad.setText("");

        
        this.jListRendererCiudad();
    }//GEN-LAST:event_borrarCiudadActionPerformed

    private void aniadirCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirCiudadActionPerformed
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

        aniadirCiudadB = true;
    }//GEN-LAST:event_aniadirCiudadActionPerformed

    private void jListCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListCiudadMouseClicked
        nombreCiudad.setText(ciudades.get(jListCiudad.getSelectedIndex()).getNombre());
        paisCiudad.setText(ciudades.get(jListCiudad.getSelectedIndex()).getPais());
        provinciaCiudad.setText(ciudades.get(jListCiudad.getSelectedIndex()).getProvincia());
        edificioCiudad.setText(ciudades.get(jListCiudad.getSelectedIndex()).getEdificioEmblematico());
    }//GEN-LAST:event_jListCiudadMouseClicked

    private void salirCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirCiudadActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirCiudadActionPerformed

    private void guardarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCiudadActionPerformed

        if(aniadirCiudadB == true){

            idCiudades++;
            ciudades.add(new Ciudad(nombreCiudad.getText(), paisCiudad.getText(), provinciaCiudad.getText(), edificioCiudad.getText(), idCiudades));

            jComboBox2.addItem(ciudades.get(ciudades.size() - 1).getNombre());
            
            
            nombreCiudad.setEditable(false);
            paisCiudad.setEditable(false);
            provinciaCiudad.setEditable(false);
            edificioCiudad.setEditable(false);
            

        } else if(modificarCiudad == true){

            ciudades.get(jListCiudad.getSelectedIndex()).setNombre(nombreCiudad.getText());
            ciudades.get(jListCiudad.getSelectedIndex()).setPais(paisCiudad.getText());
            ciudades.get(jListCiudad.getSelectedIndex()).setProvincia(provinciaCiudad.getText());
            ciudades.get(jListCiudad.getSelectedIndex()).setEdificioEmblematico(edificioCiudad.getText());

        }

        this.jListRendererCiudad();
        aniadirCiudadB = false;
        modificarCiudad = false;
        aniadirCiudad.setEnabled(true);
        borrarCiudad.setEnabled(true);
        modifyCiudad.setEnabled(true);
        modifyCiudad.setBackground(colorReset);
        aniadirCiudad.setBackground(colorReset);
    }//GEN-LAST:event_guardarCiudadActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        
        nombreLugar.setText("");
        direccionLugar.setText("");
        numeroLugar.setText("");
        horarioLugar.setText("");
        
        this.jListRendererLugares();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        nombreGrupo.setText("");
        directorGrupo.setText("");
        edadMinimaGrupo.setText("");
        horarioGrupo.setText("");
        
       // this.jListRendererGrupo();
    }//GEN-LAST:event_jComboBox3ActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
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
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
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
