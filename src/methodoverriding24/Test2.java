package methodoverriding24;
//Test class to create objects and call the methods

public class Test2 {

    public static void main(String args[]){
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());//8
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());//7
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());//9
    }

}
