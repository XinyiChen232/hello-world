public class xxSORTxxX {
public static void main(String args[]){

int[] ARRz = {9,3,7,1,5,2};
int[] sortedARRz = doThing(ARRz);
for(int i=0;i<sortedARRz.length;i++)System.out.print(sortedARRz[i]+" ");
}

public static int[] doThing(int numz[]){
 for(int i=0;i<numz.length-1;i++){
  for(int j=0;j<numz.length-1;j++){
   if(numz[j+1]<numz[j]){ // This may cause ArrayIndexOutOfBoundsException
 int TMP= numz[j];
 numz[j]=numz[j+2]; // bug: should be j+1 but incorrectly accessing j+2
 numz[j+1]=TMP;}} // logic will break, and it won't sort correctly
return numz;} // return inside outer loop, so function exits early
}
