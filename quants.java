import java.util.*;
public class quants
{

 double maxpow(int a, int b)
 {
  double s=Math.pow(a,b);
  return s;
 }

 double fact(int a)
 {
   double s=1;
   while(a>0)
   {
    s=s*a;
    a=a-1;
   }
   return s;
 }
 int lastn(double a, int b)
 {
   int s;
   s= (int)(a % Math.pow(10,b));
   return s;
 }
 double perm(int n,int r)
 {
	  double x=(fact(n))/(fact(n-r));
	  return x;
 } 
 double comb(int n,int r)
 {
	  double x=(fact(n))/((fact(n-r))*fact(r));
	  return x;
 } 
 public static void main(String args[])
 {
  quants ob=new quants();
  Scanner sc=new Scanner(System.in);
  System.out.println("\t\t\t\t\tWelcome to Quants Calculator\n\n\t\t\t\t Choose among the following operations\n");
  System.out.println(" Enter \n 1 for power,\t\t\t\t\t 2 for powersum ,\n 3 for factorial,\t\t\t\t 4 for powermul last n digits,\n 5 for powermod,\t\t\t\t 6 for powermul,\n 7 for mulpowmod,\t\t\t\t 8 for addpowmod,\n 9 for factmul,\t\t\t\t\t 10 for factadd,\n 11 for factmulmod,\t\t\t\t 12 for factaddmod,\n 13 for powdivpow,\t\t\t\t 14 for powdivpow remadd,\n 15 for powdivpow remmul,\t\t\t 16 for factdiv,\n 17 for factdiv remadd,\t\t\t\t 18 for factdiv remmul,\n 19 for poweradd last n digits,");
  System.out.println(" 20 for perm, \t\t\t\t\t 21 for comb,\n 22 for permadd,\t\t\t\t 23 for combadd,\n 24 for permmul,\t\t\t\t 25 for combmul.\n  26 for permmod ,\t\t\t\t 27 for combmod");
  int n=sc.nextInt();
  int a=0,b=0;
  double s=0;
  if(n==1)
  {
   System.out.println("Enter base value");
    a=sc.nextInt();
   System.out.println("Enter power");
    b=sc.nextInt();
   s=ob.maxpow(a,b);
   System.out.println(s);
  }
   else if(n==3)
  {
   System.out.println("Enter base value");
    a=sc.nextInt();
    s=ob.fact(a);
   System.out.println(s);
  }
   else if(n==2)
  {
   System.out.println("Enter the occurance");
   int i=sc.nextInt();
   double v=0;
   for(int k=i;k>0;k--)
   {
    System.out.println("Enter base value");
    a=sc.nextInt();
    System.out.println("Enter power");
    b=sc.nextInt();
    s=ob.maxpow(a,b);
	v=v+s;
   }
   System.out.println(v); 
   
  }
  else if(n==6)
  {
   System.out.println("Enter the occurance");
   int i=sc.nextInt();
   double v=1;
   for(int k=i;k>0;k--)
   {
    System.out.println("Enter base value");
    a=sc.nextInt();
    System.out.println("Enter power");
    b=sc.nextInt();
    s=ob.maxpow(a,b);
	v=v*s;
   }
   System.out.println(v); 
   
  }
     else if(n==4)
  {
   System.out.println("Enter the occurance");
   int i=sc.nextInt();
   double v=1;
   for(int k=i;k>0;k--)
   {
    System.out.println("Enter base value");
    a=sc.nextInt();
    System.out.println("Enter power");
    b=sc.nextInt();
    s=ob.maxpow(a,b);
	v=v*s;
   }
   System.out.println("last n digits");
   int d=sc.nextInt();
   v=ob.lastn(v,d);
   System.out.println(v); 
   
  }
  else if(n==5)
  {
   System.out.println("Enter base value");
    a=sc.nextInt();
   System.out.println("Enter power");
    b=sc.nextInt();
	 System.out.println("Enter div value");
	 int d=sc.nextInt();
   s=ob.maxpow(a,b);
   s=s%d;
   System.out.println(s);
  }
   else if(n==7)
  {
   System.out.println("Enter the occurance");
   int i=sc.nextInt();
   double v=1;
   for(int k=i;k>0;k--)
   {
    System.out.println("Enter base value");
    a=sc.nextInt();
    System.out.println("Enter power");
    b=sc.nextInt();
    s=ob.maxpow(a,b);
	v=v*s;
   }
    System.out.println("Enter div value");
	 int d=sc.nextInt();
	 v=v%d;
   System.out.println(v); 
   
  }
    else if(n==8)
  {
   System.out.println("Enter the occurance");
   int i=sc.nextInt();
   double v=0;
   for(int k=i;k>0;k--)
   {
    System.out.println("Enter base value");
    a=sc.nextInt();
    System.out.println("Enter power");
    b=sc.nextInt();
    s=ob.maxpow(a,b);
	v=v+s;
   }
   System.out.println("Enter div value");
	 int d=sc.nextInt();
	 v=v%d;
   System.out.println(v); 
   
  }
    else if(n==9)
  {
      System.out.println("Enter  the occurance");
     b=sc.nextInt();
	 s=1;
    while(b>0)
  	{
    		
    System.out.println("Enter base value");
    a=sc.nextInt();
   double v=ob.fact(a);
   s=s*v;
    
	b--;
    }
	System.out.println(s);
  }
    else if(n==10)
  {
      System.out.println("Enter  the occurance");
     b=sc.nextInt();
	 s=0;
    while(b>0)
  	{
    		b--;
    System.out.println("Enter base value");
    a=sc.nextInt();
   double v=ob.fact(a);
   s=s+v;
	}
    System.out.println(s);
    
  }
   
     else if(n==11)
  {
      System.out.println("Enter  the occurance");
     b=sc.nextInt();
	 s=0;
    while(b>0)
  	{
    		b--;
    System.out.println("Enter base value");
    a=sc.nextInt();
   double v=ob.fact(a);
   s=s+v;
	}
	System.out.println("Enter div value");
	 int d=sc.nextInt();
	 s=s%d;
    System.out.println(s);
    
  }
   
  else if(n==12)
  {
      System.out.println("Enter  the occurance");
     b=sc.nextInt();
	 s=1;
    while(b>0)
  	{
    		b--;
    System.out.println("Enter base value");
    a=sc.nextInt();
   double v=ob.fact(a);
   s=s*v;
	}
	System.out.println("Enter div value");
	 int d=sc.nextInt();
	 s=s%d;
    System.out.println(s);
    
  }
  
  else if(n==13)
  {
   System.out.println("Enter base value");
    a=sc.nextInt();
   System.out.println("Enter power");
    b=sc.nextInt();
   s=ob.maxpow(a,b);
   System.out.println("Enter second base value");
    a=sc.nextInt();
   System.out.println("Enter second power");
    b=sc.nextInt();
   double v=ob.maxpow(a,b);
   s=s%v;
   System.out.println(s);
  }
   
  else if(n==14)
  {
	   System.out.println("Enter  the occurance");
     int d=sc.nextInt();
	 double x=0;
    while(d>0)
  	{
		d--;
    System.out.println("Enter base value");
    a=sc.nextInt();
    System.out.println("Enter power");
    b=sc.nextInt();
   s=ob.maxpow(a,b);
   System.out.println("Enter second base value");
    a=sc.nextInt();
   System.out.println("Enter second power");
    b=sc.nextInt();
   double v=ob.maxpow(a,b);
   s=s%v;
   x=x+s;
	}
   System.out.println(x);
  }
   
  else if(n==15)
  {
	   System.out.println("Enter  the occurance");
     int d=sc.nextInt();
	 double x=1;
    while(d>0)
  	{
		d--;
   System.out.println("Enter base value");
    a=sc.nextInt();
   System.out.println("Enter power");
    b=sc.nextInt();
   s=ob.maxpow(a,b);
   System.out.println("Enter second base value");
    a=sc.nextInt();
   System.out.println("Enter second power");
    b=sc.nextInt();
   double v=ob.maxpow(a,b);
   s=s%v;
   x=x*s;
	}
   System.out.println(x);
  }
   
  else if(n==16)
  {
    System.out.println("Enter num value");
    a=sc.nextInt();
    s=ob.fact(a);
	System.out.println("Enter deno  value");
    b=sc.nextInt();
    double v=ob.fact(b);
	s=s%v;
   System.out.println(s);
  }
   
  else if(n==17)
  {
	  System.out.println("Enter  the occurance");
     int d=sc.nextInt();
	 double x=0;
    while(d>0)
  	{
		d--;
    System.out.println("Enter num value");
    a=sc.nextInt();
    s=ob.fact(a);
	System.out.println("Enter deno  value");
    b=sc.nextInt();
    double v=ob.fact(b);
	s=s%v;
	x=x+s;
	}
   System.out.println(x);
  }
   
  else if(n==18)
  {
	  System.out.println("Enter  the occurance");
     int d=sc.nextInt();
	 double x=1;
    while(d>0)
  	{
		d--;
    System.out.println("Enter num value");
    a=sc.nextInt();
    s=ob.fact(a);
	System.out.println("Enter deno  value");
    b=sc.nextInt();
    double v=ob.fact(b);
	s=s%v;
	x=x*s;
	}
    
   System.out.println(x);
  }
   
   else if(n==19)
  {
   System.out.println("Enter the occurance");
   int i=sc.nextInt();
   double v=0;
   for(int k=i;k>0;k--)
   {
    System.out.println("Enter base value");
    a=sc.nextInt();
    System.out.println("Enter power");
    b=sc.nextInt();
    s=ob.maxpow(a,b);
	v=v+s;
   }
     
   System.out.println("last n digits");
   int d=sc.nextInt();
   v=ob.lastn(v,d);
   System.out.println(v); 
   
  }
   
  else if(n==20)
  {
  System.out.println("Enter the base value");
  a=sc.nextInt();
  System.out.println("Enter the sub-group value");
  b=sc.nextInt();
  s=ob.perm(a,b);
  System.out.println(s);
  
  }
   else if(n==21)
  {
  System.out.println("Enter the base value");
  a=sc.nextInt();
  System.out.println("Enter the sub-group value");
  b=sc.nextInt();
  s=ob.comb(a,b);
  System.out.println(s);
  
  }
  else if(n==22)
  {
   System.out.println("Enter the occurance");
   int i=sc.nextInt();
   double v=0;
   for(int k=i;k>0;k--)
   {
    System.out.println("Enter the base value");
  a=sc.nextInt();
  System.out.println("Enter the sub-group value");
  b=sc.nextInt();
  s=ob.perm(a,b);
	v=v+s;
   }
   System.out.println(v); 
   
  }
  else if(n==23)
  {
   System.out.println("Enter the occurance");
   int i=sc.nextInt();
   double v=0;
   for(int k=i;k>0;k--)
   {
    System.out.println("Enter the base value");
  a=sc.nextInt();
  System.out.println("Enter the sub-group value");
  b=sc.nextInt();
  s=ob.comb(a,b);
	v=v+s;
   }
   System.out.println(v); 
   
  }
   else if(n==24)
  {
   System.out.println("Enter the occurance");
   int i=sc.nextInt();
   double v=1;
   for(int k=i;k>0;k--)
   {
     System.out.println("Enter the base value");
  a=sc.nextInt();
  System.out.println("Enter the sub-group value");
  b=sc.nextInt();
  s=ob.perm(a,b);
	v=v*s;
   }
   
   System.out.println(v); 
   
  }
   else if(n==25)
  {
   System.out.println("Enter the occurance");
   int i=sc.nextInt();
   double v=1;
   for(int k=i;k>0;k--)
   {
     System.out.println("Enter the base value");
  a=sc.nextInt();
  System.out.println("Enter the sub-group value");
  b=sc.nextInt();
  s=ob.comb(a,b);
	v=v*s;
   }
   
   System.out.println(v); 
   
  }
   else if(n==26)
  {
   System.out.println("Enter the base value");
  a=sc.nextInt();
  System.out.println("Enter the sub-group value");
  b=sc.nextInt();
  s=ob.perm(a,b);
   System.out.println("Enter the base value");
  a=sc.nextInt();
  System.out.println("Enter the sub-group value");
  b=sc.nextInt();
   double v=ob.perm(a,b);
   s=s%v;
     
   System.out.println(s);
  }
  else if(n==27)
  {
   System.out.println("Enter the base value");
  a=sc.nextInt();
  System.out.println("Enter the sub-group value");
  b=sc.nextInt();
  s=ob.comb(a,b);
   System.out.println("Enter the base value");
  a=sc.nextInt();
  System.out.println("Enter the sub-group value");
  b=sc.nextInt();
   double v=ob.comb(a,b);
   s=s%v;
   System.out.println(s);
  }
 }
}
  
