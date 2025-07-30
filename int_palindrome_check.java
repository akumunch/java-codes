import java.util.ArrayList;
import java.util.Scanner;

public class int_palindrome_check 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter range: ");
        int start=sc.nextInt(), end= sc.nextInt();
        ArrayList<Integer> p_nums= new ArrayList<>(); 
        String str="";
        int max=start;
        boolean pal_check=false;
        for (int num=start;num<=end;num++)
        {
            if ((num%10==num)&&(num!=10))
            {
                p_nums.add(num);
            }
            else if (num!=10)
            {
                int num_copy=num;
                while(num_copy>0)
                {
                    int digit=num_copy%10;
                    str+=digit;
                    num_copy/=10;
                }
                //now, str contains the digits of num, performing reverse op:
                String str_reversed= new StringBuilder(str).reverse().toString();
                if (str.equals(str_reversed))
                {
                    pal_check=true;
                    p_nums.add(num);
                }
            }
            str="";
        }
        //now, p_nums consists of all integers which are pallindrome in range start to end
        if (pal_check)
        {
            for (int i=0;i<p_nums.size();i++)
            {
                int pal_num=p_nums.get(i);
                if (pal_num>max)
                    max=pal_num;
            }
            
            System.out.println(max);
        }
        else 
            System.out.println(-1);
    }
}