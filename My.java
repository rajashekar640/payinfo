import java.util.concurrent.atomic.LongAdder;

class my {

    public static void main (String arg[])

    {


        long Package =77000;
         long Month= Package/12;
         System.out.println("According to lca yearly package:" + Package);

         System.out.println("According to lca per month:" +Month);

         double lcatax= 28;
         double totals= Month-(Month*(lcatax/100));
         System.out.println("according to lca After tax :" +totals);

         double deducted= Month-totals;
         System.out.println("according to lca tax deducted:" +deducted);



        int Salary = 30;
        int hours= 160;
         int montly= Salary* hours;

         System.out.println("according 30/hr montly:"+montly);

         double employer= 20;
         double employerpercentage = montly-(montly*(employer/ 100));

         double employercommision= montly-employerpercentage;


         System.out.println("employer comission:"+ employercommision);

         System.out.println("after employer comission:"+employerpercentage);

          double tax= 28;
          double total= employerpercentage-(employerpercentage*(tax/100));

         System.out.println("after tax:"+total);


         double inhands=total-deducted;

         System.out.println("after all deduction according to lca:"+ inhands);


    System.out.println("if i move on to vendor payroll");

    double a= 77000;
    double d= a/12;
    double b= 28;
    double c= d-(d*(b/100));
    double e= d-c;
    System.out.println("yearly package:"+ a);
    System.out.println("pay per month:"+ d);
    System.out.println("tax :"+ e);
    System.out.println("total in hands:"+ c);
}
    
} 