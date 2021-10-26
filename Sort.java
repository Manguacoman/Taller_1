# Taller_1
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class Sort {
    public static void main(String[] args) throws Exception {
        
    CSVreader reader = new CSVreader();

    Info[] data = new Info[18249];

    data = reader.entregarArreglo();
    int maxSize = data.length;
      
    //---------------- Insert Sort ----------------------
    ArrayIns arr = new ArrayIns(maxSize);  
    
    for(int i=0;i<maxSize;i++){
        arr.insert(data[i]);   
    }

    Instant start = Instant.now();           
    arr.insertionSort();     
    Instant end = Instant.now();
   
    Duration TimeInsertSort = Duration.between(start, end); 

    //---------------- Quick Sort ----------------------
    ArrayInsQuick arr2;                 
    arr2 = new ArrayInsQuick(maxSize);  

    for(int j=0; j<maxSize; j++)  
         {                          
          arr2.insert(data[j]);
         }
      Instant start2 = Instant.now();           
      arr2.quickSort();      
      Instant end2 = Instant.now();
    
      Duration TimeQuickSort = Duration.between(start2, end2);         

     // Resultados
     double time1 = TimeInsertSort.getNano()/Math.pow(10,9);
     double time2 = TimeQuickSort.getNano()/Math.pow(10,9);

     System.out.println("Insert Sort time: "+time1+ "s");
     System.out.println("Quick Sort time: "+ time2 + "s");
      

        }

}
