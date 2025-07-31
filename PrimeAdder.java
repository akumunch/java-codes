import java.util.Scanner;

public class PrimeAdder 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt(), M= sc.nextInt();
        int sum=0,ctr_prime=0;
        boolean factor_found=false;
        
        while(sum<M)
        {
            for(int j=2;j*j<N;j++)
            {    
                if (N%j==0)
                    factor_found=true;
            }
            
            //if factor_found==true, that means it's not prime. 
            if (factor_found==false) //==> prime
            {
                sum+=N;
                ctr_prime+=1;
            }
            N++;
            factor_found=false;
        }
    System.out.println(ctr_prime);
    }
}