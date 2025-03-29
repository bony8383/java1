package oop.zhamal;

public class Smartphone extends Phone {        // extends >> bul murastoo.
     private boolean hasCamera;
     private boolean hasInternet;

     public Smartphone( String brand, String model , double price , boolean hasCamera, boolean hasInternet ) {
         super(brand, model, price);        //  bular phondon >> smarthphongo otkon murastar ( super - bul daiyar Variable)
         this.hasCamera = hasCamera;
         this.hasInternet = hasInternet;
     }
         public boolean hasCamera(){
             return hasCamera;
         }
         public boolean HasInternet (){
         return hasInternet ;
         }

         public void printSmartphoneInfo(){
         super.printInfo() ;
          System.out.println( " Has a Kamera ?" + (hasCamera ? " Yes" : " NO" ));
             System.out.println( " Has a Internet ?" + ( hasInternet ? " Yes" : " NO" ));

         }

}
