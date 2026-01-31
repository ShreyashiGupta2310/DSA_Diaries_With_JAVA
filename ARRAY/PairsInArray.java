public class PairsInArray {
    public static void Pairing(int array[]){
int totalpairs=0;

//total pairs=(n(n-1))/2   formula
    for(int i=0; i<array.length;i++){

        for(int j=i+1; j<array.length; j++){
            System.out.print("("+array[i]+","+array[j]+")");
            totalpairs++;
        }
        System.out.println();
    }
     System.out.println("total number of pairs :"+ totalpairs);
    }

    public static void main(String args[]){
        int array[]={1,2,3,4,5,6};
        Pairing(array); 
    }
}
