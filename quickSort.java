# Taller_1
/*Rodriguez-Alexander_Bañares-Matias

 */
// quickSort3.java
// demonstrates quick sort; uses insertion sort for cleanup
// to run this program: C>java QuickSort3App
////////////////////////////////////////////////////////////////
class ArrayInsQuick
   {
   private Info[] data;           // ref to array theArray
   private int nElems;               // number of data items
//--------------------------------------------------------------
   public ArrayInsQuick(int max)          // constructor
      {
      data = new Info[max];      // create the array
      nElems = 0;                    // no items yet
      }
//--------------------------------------------------------------
   public void insert(Info value)    // put element into array
      {
      data[nElems] = value;      // insert it
      nElems++;                      // increment size
      }
//--------------------------------------------------------------
   public void display()             // displays array contents
      {
      System.out.print("A=");
      for(int j=0; j<nElems; j++)    // for each element,
         System.out.print(data[j] + " ");  // display it
      System.out.println("");
      }
//--------------------------------------------------------------
   public void quickSort()
      {
      recQuickSort(0, nElems-1);
      // insertionSort(0, nElems-1); // the other option
      }
//--------------------------------------------------------------
   public void recQuickSort(int left, int right)
      {
      int size = right-left+1;
      if(size < 10)                   // insertion sort if small
         insertionSort(left, right);
      else                            // quicksort if large
         {
         double median = medianOf3(left, right);
         int partition = partitionIt(left, right, median);
         recQuickSort(left, partition-1);
         recQuickSort(partition+1, right);
         }
      }  // end recQuickSort()
//--------------------------------------------------------------
   public double medianOf3(int left, int right)
      {
      int center = (left+right)/2;
                                       // order left & center
      if( data[left].getVolume() > data[center].getVolume() )
         swap(left, center);
