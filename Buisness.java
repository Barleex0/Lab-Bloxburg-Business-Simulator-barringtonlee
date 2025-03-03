public class Buisness {
 private static int openBuiCount;
 private String buisnessName;
 private float costs;
 private float money;
 private float startingfunds;
 private name owner;
 private Employee[] workers;
 //Todo implement selling products
 //private Products[] products;

 Buisness(String bN,name own, float sMon){
    buisnessName = bN;
    startingfunds = sMon;
    money = startingfunds;
    owner = own;
    openBuiCount += 1;
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

 void doBuissnes(){
 costs = 0;
 

 };








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








}
// one class per file is very annoying.
 