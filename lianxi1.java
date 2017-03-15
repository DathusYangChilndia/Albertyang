class lianxi1
{public static void main(String args[])
{ 
   System.out.println("水仙花数有:");
for(int i=1;i<=9;i++)
for(int j=0;j<=9;j++)
for(int	k=0;k<=9;k++)
{ 
  int s=i*100+j*10+k;
   if(i*i*i+j*j*j+k*k*k==s) 
     System.out.println("i="+i+",j="+j+",k="+k+",s="+s);
     }
         }
           }