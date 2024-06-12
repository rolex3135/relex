public class Account {
    private String name;
    int Accountnmbr=30;
   private double balance;
 static String  Accountname="SBI";


  void setbalance(double balance){

      this.balance=balance;
   }
   void setname(String name){
      this.name=name;
       this. Accountnmbr=Accountnmbr;
       Accountnmbr++;
   }
  void   getname(){
        System.out.println(this.name);


   }
    void setDeposit(double bal){
      if(bal>0){
          this.balance=this.balance+bal;
      }

   }
    void setWithDraw(double bal){
      if(this.balance>=bal){
          this.balance=this.balance-bal;
      }else{
          System.out.println("In sufficient amount ");
      }
   }
   String PrintDetails(){
      return " name:"+this.name+" balance:"+this.balance+" Accountname:"+Accountname+" Accountnmbr:"+Accountnmbr;
   }

}
