package Ventanas;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;
import Matrices3x3.Matrices3x3;

public class EXAMENFrame extends JFrame {
  
     met_sistema captura = new  met_sistema();
     JButton bt_buscar = new JButton ("Buscar * Codigo");
     JButton bt_buscar1 = new JButton ("Buscar * Nombre");
     JButton bt_buscar2 = new JButton ("Buscar * descripcion");
     JButton bt_buscar3 = new JButton ("Buscar * precio");
     JButton bt_buscar4 = new JButton ("Buscar * descuento");
     JButton bt_buscar5 = new JButton ("Buscar * cantidad");
     JButton bt_buscar6 = new JButton ("Buscar * tamaño");
     JButton bt_buscar7 = new JButton ("Buscar * peso");
     
     
     JLabel lb_codigo=new JLabel("Codigo");
     JLabel lb_nombre=new JLabel("Nombre");
     JLabel lb_descripcion=new JLabel("descripcion ");
     JLabel lb_precio=new JLabel("precio");
     JLabel lb_descuento=new JLabel("descuento");
     JLabel lb_cantidad=new JLabel("cantidad");
     JLabel lb_tamaño=new JLabel("tamaño");
     JLabel lb_peso=new JLabel("peso");
     
     
     JTextField txt_codigo=new JTextField();
     JTextField txt_nombre=new JTextField();
     JTextField txt_descripcion=new JTextField();
     JTextField txt_precio=new JTextField();
     JTextField txt_descuento=new JTextField();
     JTextField txt_cantidad=new JTextField();
     JTextField txt_tamaño=new JTextField();
     JTextField txt_peso=new JTextField();
     
     
     JTextField jt_busca = new JTextField ();
     JTextField jt_buscs = new JTextField ();
     JTextField jt_buscd = new JTextField ();
     JTextField jt_buscf = new JTextField ();
     
     JMenuItem menumantbuscar = new JMenuItem() ; 
     
     JPanel pn1=new JPanel(new GridLayout(1,2) );
     
     
          
     
     public EXAMENFrame() {
                
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu();
        JMenu menumant = new JMenu();
        JMenu menureporte = new JMenu() ;
        JMenu menudatos= new JMenu();
        
        JMenuItem menureportevisualizar = new JMenuItem();
        JMenuItem menuFileExit = new JMenuItem();
        JMenuItem menumantingresar = new JMenuItem("") ; 
        JMenuItem menumanteliminar = new JMenuItem() ; 
        JMenuItem menureporteautor = new JMenuItem() ; 
        JMenuItem menureportegenero = new JMenuItem() ; 
        JMenuItem menureporteedicion = new JMenuItem() ; 
        JMenuItem menureportegeneral = new JMenuItem() ; 
        JMenuItem menudatosmatriz= new JMenuItem("");
        JMenuItem menudatosgraficador= new JMenuItem("");
        JMenuItem menudatosmulti= new JMenuItem("");
        
        
        
        menuFile.setText("ARCHIVO");        
        menuFileExit.setText("salir");
        menureporte.setText("BUSCAR");
        menureportegeneral.setText(" General");
        menureporteautor.setText(" Por Nombre");
        menureportegenero.setText(" Por Descripcion");
        menureporteedicion.setText(" Por Precio");        
        
        menumant.setText("DATOS");
        menumantingresar.setText("Ingresar Producto");
        menumantbuscar.setText("Buscar Producto");       
        menumanteliminar.setText("Eliminar Producto");
       
            
        menuFileExit.addActionListener
        (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                EXAMENFrame.this.windowClosed();
                }
            }
        ); 
        
        
                
        
        menureportegeneral.addActionListener
	 (
            new ActionListener() { 
                public void actionPerformed(ActionEvent e) {
                	
                String columnas[] = {"Codigo","nombre","Descripcion ","Precio","Descuento","Cantidad","Tamaño","Peso"};
                	
 				Object filas[][] = new Object[captura.lis_lib.size()][8];
 				               
                	Vector nuevoVector = captura.lis_lib;
                	
                	for(int i= 0 ; i<nuevoVector.size() ; i++){
                       
                       datos v = (datos)captura.lis_lib.get(i);
                	
                	
                		filas[i][0] = v.codigo;
                		filas[i][1] = v.nombre;
                		filas[i][2] = v.descripcion;
                		filas[i][3] = v.precio;
                		filas[i][4] = v.descuento;
                		filas[i][5] = v.cantidad;
                		filas[i][6] = v.tamaño;
                		filas[i][7] = v.peso;
                	
                		
                	}
                	
                JTable tabla = new JTable(filas,columnas);
                JScrollPane tabla1 = new JScrollPane(tabla);
                
                JPanel reporte = new JPanel();
                reporte.add(tabla1);
                
                
                Object msg[] = {reporte};
                	
                JOptionPane.showMessageDialog(null,msg,"Reporte de los productos",JOptionPane.QUESTION_MESSAGE);
                          
                    
                }
            }
        ); 

	menureporteautor.addActionListener
	 (
            new ActionListener() {     
                public void actionPerformed(ActionEvent e) {
                	
                	
                String columnas[] = {" ****** Producto ***** "," nombre del producto"};
                	
 				Object filas[][] = new Object[captura.lis_lib.size()][2];
 				               
                	Vector nuevoVector = captura.lis_lib;
                	
                	for(int i= 0 ; i<nuevoVector.size() ; i++){
                       datos v = (datos)captura.lis_lib.get(i);              	          	
                	
                		filas[i][0] = v.nombre; 
                		filas[i][1] = v.descripcion; 
                	               	
                		
                	}
                	
                JTable tabla = new JTable(filas,columnas);
                JScrollPane tabla1 = new JScrollPane(tabla);
                
                JPanel reporte = new JPanel();
                reporte.add(tabla1);
                
                
                Object msg[] = {reporte};
                	
                JOptionPane.showMessageDialog(null,msg,"Reporte de los productos",JOptionPane.PLAIN_MESSAGE);
                
                    
                }
            }
        ); 

menureportegenero.addActionListener
	 (
            new ActionListener() {     
                public void actionPerformed(ActionEvent e) {
                	
                	
                String columnas[] = {" ****** Producto ***** ","Nombre"};
                	
 				Object filas[][] = new Object[captura.lis_lib.size()][2];
 				               
                	Vector nuevoVector = captura.lis_lib;
                	
                	for(int i= 0 ; i<nuevoVector.size() ; i++){
                                      		
                		datos v = (datos)captura.lis_lib.get(i);               	
                	;
                		filas[i][0] = v.descripcion;
                		filas[i][1] = v.nombre;
                	}                	
                JTable tabla = new JTable(filas,columnas);
                JScrollPane tabla1 = new JScrollPane(tabla);
                
                JPanel reporte = new JPanel();
                reporte.add(tabla1);
                
                
                Object msg[] = {reporte};
                	
                JOptionPane.showMessageDialog(null,msg,"Reporte de los productos",JOptionPane.PLAIN_MESSAGE);
                
                    
                }
            }
        ); 
        
        menureporteedicion.addActionListener
	 (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                	
                	
                String columnas[] = {" ****** Producto ***** ","nombre de los productos"};
                	
 				Object filas[][] = new Object[captura.lis_lib.size()][2];
 				               
                	Vector nuevoVector = captura.lis_lib;
                	
                	for(int i= 0 ; i<nuevoVector.size() ; i++){
                                      		
                		datos v = (datos)captura.lis_lib.get(i);
                		
                	
                		filas[i][0] = v.descripcion;
                		filas[i][1] = v.precio;
                	
                		
                	}
                	
                JTable tabla = new JTable(filas,columnas);
                JScrollPane tabla1 = new JScrollPane(tabla);
                
                JPanel reporte = new JPanel();
                reporte.add(tabla1);
                
                
                Object msg[] = {reporte};
                	
                JOptionPane.showMessageDialog(null,msg,"Reporte de los productos",JOptionPane.PLAIN_MESSAGE);
                
                    
                }
            }
        ); 

        
        menumantingresar.addActionListener
        (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                              
                JPanel pn1=new JPanel(new GridLayout(1,2) );
                pn1.add(lb_codigo);
                pn1.add(txt_codigo);
                                 
                JPanel pn2=new JPanel(new GridLayout(1,2));
                pn2.add(lb_nombre);
                pn2.add(txt_nombre);
                
                JPanel pn3=new JPanel(new GridLayout(1,2));
                pn3.add(lb_descripcion);
                pn3.add(txt_descripcion);
                
                JPanel pn4=new JPanel(new GridLayout(1,2));
                pn4.add(lb_precio);
                pn4.add(txt_precio);
                
                JPanel pn5=new JPanel(new GridLayout(1,2));
                pn5.add(lb_descuento);
                pn5.add(txt_descuento);
                
                JPanel pn6=new JPanel(new GridLayout(1,2));
                pn6.add(lb_cantidad);
                pn6.add(txt_cantidad);
                
                JPanel pn7=new JPanel(new GridLayout(1,2));
                pn7.add(lb_tamaño);
                pn7.add(txt_tamaño);
                
                JPanel pn8=new JPanel(new GridLayout(1,2));
                pn8.add(lb_peso);
                pn8.add(txt_peso);
                
              
                                          
            Object msg []={pn1,pn2,pn3,pn4,pn5,pn6,pn7,pn8};
                
                
      if(JOptionPane.showOptionDialog(null,msg,"ingresar Producto",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,null)==JOptionPane.OK_OPTION){
      
      	
	      	datos v =new datos();      	
	      	v.codigo=txt_codigo.getText();
	      	v.nombre=txt_nombre.getText();
	      	v.descripcion=txt_descripcion.getText();
	      	v.precio=txt_precio.getText();
     	  	v.descuento = txt_descuento.getText();
     	  	v.cantidad = txt_cantidad.getText();
     	  	v.tamaño = txt_tamaño.getText();
     	  	v.peso = txt_peso.getText();
                
     	  	captura.ingresa(v); 	
    	    	
		
		JOptionPane.showMessageDialog(null,"Se el PRODUCTO Con Exito !!","Ingreso de Personas",JOptionPane.INFORMATION_MESSAGE);
		
		          }      	
                   
                }
            }
        ); 
        
        menumantbuscar.addActionListener
        (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                
                                 
                	JLabel lb_busca1 =new JLabel("Busca por Codigo");
                	JLabel lb_busca2=new JLabel("Busca por Nombre");
                	
                	
                	JPanel pn1 = new JPanel (new GridLayout(1,3));
                	pn1.add(lb_busca1);
                	pn1.add(jt_busca);
                	pn1.add(bt_buscar);
                	
                	
                	JPanel pn2 = new JPanel (new GridLayout(1,3));
                	pn2.add(lb_busca2);
                	pn2.add(jt_buscs);
                	pn2.add(bt_buscar1);
                	
                	
                	
                
                    JPanel pn5 = new JPanel();
                    
                    JPanel pn_busqueda = new JPanel(new GridLayout(5,2));
                    pn_busqueda.add(new JLabel("Codigo"));
                    pn_busqueda.add(txt_codigo);
                    
                    pn_busqueda.add(new JLabel("Nombre"));
                    pn_busqueda.add(txt_nombre);
                    
                    pn_busqueda.add(new JLabel("Descripcion"));
                    pn_busqueda.add(txt_descripcion);
                    
                    pn_busqueda.add(new JLabel("Precio"));
                    pn_busqueda.add(txt_precio);
                    
                    
                    Object msg []={pn1,pn2,pn5,pn_busqueda};
                    
                    JOptionPane.showMessageDialog(null,msg,"BUSQUEDA",JOptionPane.PLAIN_MESSAGE);
                    
                    
                }
            }
        ); 
        
        bt_buscar.addActionListener
        (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                datos z= captura.buscod(jt_busca.getText());     
                System.out.print(z.codigo+" "+z.descripcion) ;
                
                txt_codigo.setText(z.codigo);
                txt_nombre.setText(z.nombre);
                txt_descripcion.setText(z.descripcion);
                txt_precio.setText(z.precio);
                txt_descuento.setText(z.descuento);
                txt_cantidad.setText(z.cantidad);
                txt_tamaño.setText(z.tamaño);
                txt_peso.setText(z.peso);
                
                                
                }
            }
        ); 
        bt_buscar1.addActionListener
        (
           new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    
                
                datos z= captura.buscautor(jt_buscs.getText());     
                System.out.print(z.nombre+" "+z.descripcion) ;
                
                 txt_codigo.setText(z.codigo);
                txt_nombre.setText(z.nombre);
                txt_descripcion.setText(z.descripcion);
                txt_precio.setText(z.precio);
                txt_descuento.setText(z.descuento);
                txt_cantidad.setText(z.cantidad);
                txt_tamaño.setText(z.tamaño);
                txt_peso.setText(z.peso);
                                
                                
                }
            }
        );        
        
        menudatosmatriz.addActionListener
         (       
        new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Matrices3x3 formulario=new Matrices3x3();
                formulario.setBounds(0,0,720,600);
                formulario.setVisible(true);
            }
        }
         );
        
        menudatosmulti.addActionListener
         (       
        new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            }
         );   
        
        menuFile.add(menuFileExit);
        
        
        menumant.add(menumantingresar);
        menumant.add(menumantbuscar);        
        menumant.add(menumanteliminar);
        
        menudatos.add(menudatosmatriz);
        menudatos.add(menudatosgraficador);
        menudatos.add(menudatosmulti);
        
        menureporte.add(menureportegeneral);
        menureporte.add(menureporteautor);
        menureporte.add(menureportegenero);
        menureporte.add(menureporteedicion);
        menureporte.add(menureporte);       
      
        menuBar.add(menuFile);
        menuBar.add(menumant); 
        menuBar.add(menureporte);
        menuBar.add(menudatos);
           
        
           
        setTitle("PROYECTO FINAL");
        setJMenuBar(menuBar);
        setSize(new Dimension(600, 500));
           
        this.addWindowListener
        (
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    EXAMENFrame.this.windowClosed();
                }
            }
        );  
    }
     
    
    protected void windowClosed() {
        
        System.exit(0);
    }

    void intro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
