/*
WAP to show object cloning in java using cloneable and copy constructor both
*/
public class Main implements Cloneable{
  
String name;  
  
Main(String name){    
this.name=name;  
}  

//copy constructor
Main(Main q){
    name = q.name;
}
void changeName(String str){
    this.name =str;
}
  
public Object clone()throws CloneNotSupportedException{  
return super.clone();  
}  
   public static void main(String[] args) {
    System.out.println("\nCompile by Shubham Singh Rawat ");
    try{  
        
        Main s1=new Main("amit");  
        
        Main s2=(Main)s1.clone();  
        
        System.out.println("\n Using Clone() \n Before change"); 

        System.out.println(s1.name);  
        System.out.println(s2.name);  

        s2.changeName("Akash");
        
        System.out.println("\n After change");  
         

        
        System.out.println(s1.name);  
        System.out.println(s2.name);    
        System.out.println("\n Using Copy Constructor \n Before change"); 
        
        Main s3 = new Main(s1);
        System.out.println(s1.name);  
        System.out.println(s3.name);  

        s3.changeName("Jack");
        
        System.out.println("\n After change");  
         

        
        System.out.println(s1.name);  
        System.out.println(s3.name);


        }catch(CloneNotSupportedException c){}  
          
        }  
   } 
