import mpi.*;

public class DistributedSum {
    public static void main(String[] args) throws MPIException {
 //1) Mpi decaration 
        MPI.Init(args);
        
//2) rank size     
        int rank = MPI.COMM_WORLD.Rank();
        int size = MPI.COMM_WORLD.Size();
        
//3)variable Declaration       
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Input array
        int n = array.length;
        
        int localN = n / size; // Number of elements per processor
        int[] localArray = new int[localN]; // Local array for each processor
        
        int localSum = 0; // Local sum for each processor
        int totalSum = 0;
        
//4) Scatter the input array to all processors
        MPI.COMM_WORLD.Scatter(array, 0, localN, MPI.INT, localArray, 0, localN, MPI.INT, 0);
     
//5)Calculate the local sum for each processor
        for (int i = 0; i < localN; i++) {
            localSum += localArray[i];
        }

//6) Send the local sum to the master processor
        int[] globalSum = new int[1];
        MPI.COMM_WORLD.Reduce(new int[] {localSum}, 0, globalSum, 0, 1, MPI.INT, MPI.SUM, 0);
        
//7) Display the intermediate sums calculated by each processor
        System.out.println("Processor " + rank + " calculated sum = " + localSum);

//8)Display total Sum 
         if (rank == 0) {
            totalSum = globalSum[0];
            System.out.println("Total Sum = " + totalSum);
        }
        
        MPI.Finalize();
    }
}

// javac -cp .;%MPJ_HOME%/lib/mpj.jar DistributedSum.java
// mpjrun.bat -np 2 DistributedSum
