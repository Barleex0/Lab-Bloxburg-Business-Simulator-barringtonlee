public class Buisness {
 final private int TAX = 34 ; 
 private static int openBuiCount;
 private String buisnessName;
 private float costs ;
 private float money;
 private float startingfunds;
 private name owner;
 private Employee workers;
 //Todo implement selling products
 //private Products[] products;

 Buisness(String bN,name own, float sMon){
    buisnessName = bN;
    startingfunds = sMon;
    money = startingfunds;
    owner = own;
    openBuiCount += 1;
    workers = new Employee(new name("Martha","Stewards"), 12, "Helper");
 };



class Employee {
    public float Salary;
    public name Name;
    public String role;
    //this is going to be an enum later if i was going to make this real.

    Employee(name id,float pay,String job){
        Name = id;
        Salary = pay;
        role = job;
    };

    
}










 // Getters
name Get_Owner(){
    return owner;
 };
String Get_Buisness_Name(){
    return buisnessName ;
 };
float Get_costs(){
    return costs;
 };
int Get_OPEN(){
    return openBuiCount;
 };
String Get_Out(){
    return ("heres what you have " + buisnessName + "/" + money + "/" + owner.fName + " " + owner.lName +"\n money after costs" + (money-costs-TAX) +"  " + workers.Name.fName )  ;



}







}
// one class per file is very annoying.
 