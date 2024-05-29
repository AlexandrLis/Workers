public class Posrednik {

    Worker worker;


    public Worker methodPereopredelenie(String choise){
        if(choise.equals("1")){
            worker = new CleanerImpl();
        }
        else if (choise.equals("2")) {
            worker = new SecurityImpl();
        }
        else {
            worker = new DriverImpl();
        }

        return worker;
    }





//      Второй способ **************************
    CleanerImpl cleaner;

    public CleanerImpl setWorker(CleanerImpl cleaner){
        this.cleaner = cleaner;
        return cleaner;
    }
//      Второй способ **************************

}
