public class GasStation {
    public static void main(String[] args) {
        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};
        int startstation=0;
        int surplus=0;
        int deficient=0;

        for(int i=0;i<gas.length;i++)
        {
            surplus=deficient+=gas[i]-cost[i];
            if(surplus<0)
            {
                surplus=0;
                startstation++;
            }
        }

        if(deficient>=0)
        {
            System.out.println("Gas station from where you should start is :"+startstation);
        }
        else{
            System.out.println("Gas station not found!!!!");
        }


        /*          //OR//
        class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int currentPetrol=0;
       int prevPetrol=0;
        int result=0;
        
        for(int i=0;i<gas.length;i++){
           
           currentPetrol += (gas[i]-cost[i]); 
           
           if(currentPetrol <0){ // if it does
               result = i+1;  
               prevPetrol+=currentPetrol; 
               currentPetrol = 0;
           }   
       }        
    return (currentPetrol+prevPetrol) >= 0 ? result : -1; 
    }
} */
    }
    
}
