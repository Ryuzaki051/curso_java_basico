package MC_20_29;

public class GettersAndSettersB27 {
    public static void main(String... arg){
        GettersAndSettersA27 obj=new GettersAndSettersA27();
        
        obj.setNombre("LG");
        obj.setColor("Verde");
        obj.setSerie("MD-401");
        
        String nombre=obj.getNombre();
        String color=obj.getColor();
        String serie=obj.getSerie();
        
        System.out.println("Celular: "+nombre+" Color: "+color+" Serie: "+serie);
        //otra forma de implementar el getter
        System.out.println("Celular: "+obj.getNombre()+" Color: "+obj.getColor()+" Serie: "+obj.getSerie());
        
        obj.mostrar();
    }   
}