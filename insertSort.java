# Taller_1
/*Rodriguez-Alexander_Bañares-Matias

 */
import java.util.ArrayList;
import java.util.List;

// insertSort.java
// demonstrates insertion sort
// to run this program: C>java InsertSortApp
//--------------------------------------------------------------
class ArrayIns
   {  
   private Info[] data;          // ref to array a
   private int nElems;               // number of data items
//--------------------------------------------------------------
   public ArrayIns(int max)          // constructor
      {  
      data = new Info[max];              // create the array
      nElems = 0;                        // no items yet
      }
//--------------------------------------------------------------
   public void insert(Info value)    // put element into array
      {
      data[nElems] = value;             // insert it
      nElems++;                      // increment size
      }
//--------------------------------------------------------------
   public void display()             // displays array contents
      {
      for(int j=0; j<nElems; j++) {     // for each element,
         System.out.println(data[j]);  // display it

      }
   }
//--------------------------------------------------------------
   public void insertionSort()
      {
      int in, out;

      for(out=1; out<nElems; out++)     // out is dividing line
         {
         Info temp = data[out];         // remove marked item
         in = out;                      // start shifts at out
         while(in>0 && data[in-1].getVolume() >= temp.getVolume()) // until one is smaller,
            {
            data[in] = data[in-1];            // shift item to right
            --in;                       // go left one position
            }
         data[in] = temp;                 // insert marked item
         }  // end for
      }  // end insertionSort()
//--------------------------------------------------------------
   }  // end class ArrayIns
////////////////////////////////////////////////////////////////
// class InsertSortApp
//    {
//    public static void main(String[] args)
//       {
//       int maxSize = 100;            // array size
//       ArrayIns arr;                 // reference to array
//       arr = new ArrayIns(maxSize);  // create the array

//       arr.insert(77);               // insert 10 items
//       arr.insert(99);
//       arr.insert(44);
//       arr.insert(55);
//       arr.insert(22);
//       arr.insert(88);
//       arr.insert(11);
//       arr.insert(00);
//       arr.insert(66);
//       arr.insert(33);

//       arr.display();                // display items

//       arr.insertionSort();          // insertion-sort them

//       arr.display();                // display them again
//       }  // end main()
//    }  // end class InsertSortApp
