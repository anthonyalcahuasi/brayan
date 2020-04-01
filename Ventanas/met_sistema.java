package Ventanas;
 
import java.util.Vector;

public class met_sistema {
	 
	 public Vector lis_lib =new Vector();
	 	
  public void ingresa(Object x){
  	  	lis_lib.add(x);  	  	 	  	
  	
  }
  public datos buscod(String x){
  	
  	datos na = new datos();
  	na.codigo = "No Encontrado";
  	na.nombre = "No Encontrado";
  	na.descripcion = "No Encontrado";
  	na.precio = "No Encontrado";
  	na.descuento = "No Encontado";
  	na.cantidad = "No Encontado";
  	na.tamaño = "No Encontado";
  	na.peso = "No Encontado";
  	
  	
  	
  	for(int i=0;i<lis_lib.size();i++){
  	
        datos v = (datos)lis_lib.get(i);  	
  	   
 	if(v.codigo.equals(x))  	
 	  return v;  
  	
  	}
  	return na;
}
 public datos buscautor(String x){
  	
  	datos na = new datos();
  	na.codigo = "No Encontrado";
  	na.nombre = "No Encontrado";
  	na.descripcion = "No Encontrado";
  	na.precio = "No Encontrado";
  	na.descuento = "No Encontado";
  	na.cantidad = "No Encontado";
  	na.tamaño = "No Encontado";
  	na.peso = "No Encontado";
  	
  	for(int i=0;i<lis_lib.size();i++){
  	
        datos v = (datos)lis_lib.get(i);  	
  	   
 	if(v.nombre.equals(x))  	
 	  return v;  
  	
  	}
  	return na;
}
 public datos buscedic(String x){
  	
  	datos na = new datos();
  	na.codigo = "No Encontrado";
  	na.nombre = "No Encontrado";
  	na.descripcion = "No Encontrado";
  	na.precio = "No Encontrado";
  	na.descuento = "No Encontado";
  	na.cantidad = "No Encontado";
  	na.tamaño = "No Encontado";
  	na.peso = "No Encontado";
  	
  	for(int i=0;i<lis_lib.size();i++){
  	
        datos v = (datos)lis_lib.get(i);  	
  	   
 	if(v.descripcion.equals(x))  	
 	  return v;  
  	
  	}
  	return na;
}
 public datos buscgene(String x){
  	
  	datos na = new datos();
  	na.codigo = "No Encontrado";
  	na.nombre = "No Encontrado";
  	na.descripcion = "No Encontrado";
  	na.precio = "No Encontrado";
  	na.descuento = "No Encontado";
  	na.cantidad = "No Encontado";
  	na.tamaño = "No Encontado";
  	na.peso = "No Encontado";
  	
  	for(int i=0;i<lis_lib.size();i++){
  	
        datos v = (datos)lis_lib.get(i);  	
  	   
 	if(v.descripcion.equals(x))  	
 	  return v;  
  	
  	}
  	return na;
}

}