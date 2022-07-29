//INEURON
public class pattern1 {
   public static void main(String[]args) {
    int n =10;
    //To print I
    for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
         {
           if(i==0 || j==(n-1)/2 || i==n-1 )
           
             System.out.print("*");
             else
             System.out.print(" ");  
           }
          System.out.println();
     }
     System.out.println();


    //To print N
    for(int i=0;i<n;i++)
         {
           for(int j=0;j<n;j++)
            {
              if(j==0 || j==n-1 || i==j )
              
                System.out.print("*");
                else
                System.out.print(" ");  
              }
             System.out.println();
         }
     System.out.println();    
     
    //To print E 
     for(int i=0;i<n;i++)
            {
              for(int j=0;j<n;j++)
               {
                 if(i==0 || i==n-1 || j==0 || i==(n-1)/2 && j!=n-1 && j!=n-2 )
                 
                   System.out.print("*");
                   else
                   System.out.print(" ");  
                 }
                System.out.println();
            }
     System.out.println();  
     
     
     //To print U
     for(int i=0;i<n;i++)
             {
                 for(int j=0;j<n;j++)
                 {
                  if((j==0 || j==n-1) && i<n-1 || i==n-1 && j%2==1) 
                           
                    System.out.print("*");
                    else
                    System.out.print(" ");  
                 }
                 System.out.println();
             }
        
     System.out.println();
     

     //To print R
     int fp=2;
     boolean flg=false;     
     for(int i=0;i<n;i++)
             {
                 for(int j=0;j<n;j++)
                 {
                  if(j==0 || (i==0 || i==(n-1)/2 ) && j%2==0 || j==n-1 && i<(n-1)/2 && i!=0 ) 
                           
                    System.out.print("*");
                    else if(i>(n-1)/2 && j==fp)
                    {
                    System.out.print("*"); 
                    flg=true; 
                    }
                    else
                    System.out.print(" ");
                 }
                 System.out.println();
                 if(flg==true)
                 {
                    fp++;
                 }
             }
             System.out.println();

     //To print O
           for(int i=0;i<n;i++)
                  {
                    for(int j=0;j<n;j++)
                     {
                        if(i==0 && j!=n-1 || j==0 || j==n-1 &&i!=0 && i!=n-1|| i==n-1 && j!=n-1)
                         System.out.print("*");
                         else
                         System.out.print(" ");  
                     }
                      System.out.println();
                  }
             System.out.println();

       //To print N
            for(int i=0;i<n;i++)
                  {
                    for(int j=0;j<n;j++)
                     {
                       if(j==0 || j==n-1 || i==j )
                       
                         System.out.print("*");
                         else
                         System.out.print(" ");  
                       }
                      System.out.println();
                  }
  }
}

