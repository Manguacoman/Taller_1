# Taller_1


public class InsertDelete {
    public static void main(String[] args) throws Exception {
        
    CSVreader reader = new CSVreader();


    Info[] data = new Info[18249];

    data = reader.entregarArreglo();
    int maxSize = data.length;
    Queue theQueue = new Queue(maxSize);  

      for(int i=0;i<maxSize;i++){
        theQueue.insert(data[i].getVolume());
      }   

      double[] temp = new double[4]; 
      temp[0] = data[0].getVolume();
      temp[1] = data[1].getVolume();
      temp[2] = data[2].getVolume();
      temp[3] = data[3].getVolume();

      System.out.println("1er elemento: "+temp[0]);
      System.out.println("2do elemento: "+temp[1]);
      System.out.println("3er elemento: "+temp[2]);
      System.out.println("4to elemento: "+temp[3]);

      System.out.println("Se aplica remove");
      theQueue.remove();
      System.out.println("1er elemento: "+ theQueue.peekFront());       
      System.out.println("Se aplica remove");
      theQueue.remove();
      System.out.println("1er elemento: "+ theQueue.peekFront());          
      System.out.println("Se aplica remove");
      theQueue.remove();
      System.out.println("1er elemento: "+ theQueue.peekFront());
     
      }  // end main()


    }


