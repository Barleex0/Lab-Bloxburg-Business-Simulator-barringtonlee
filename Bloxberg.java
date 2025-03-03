import java.util.Scanner;

public class Bloxberg {
    static public Buisness mBiz;

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println(
            "Welcome to the game you \n for now all you can do is lose money \n"+
        " but really thats all buisness really is anyway"+
        " \n \n Press 1 for a tutorial \n");
       
         gamestate.start(inp.nextInt());
         inp.close();

         System.out.println("heres your buissness" + mBiz.Get_Out() );














    }
    
    class gamestate{
        //this just stores game related data so i can keep the main simple
        static Scanner gsinp = new Scanner(System.in);
        

        static void  start(int i){
            gsinp.nextLine();
            if (i == 1){
                System.out.println("okay the game works like this\n"+
                " The game will start with you choosing a name for yourself\n"+
                " your buissness with a \n"+
                " Name next you choose your difficulty easy to hard , 1, 2, and 3, respectfully,\n"+
                " this changes your costs and money production\n \n"+
                " the game itself has two phases buy and Cry \n"+
                " during the buy phase you can get more employees and buy and sell products each employee has a cost and each product a price which is randomized\n"+
                " -uh i mean \" Changes with market pressure \" every day\n\n then there is the cry phase where you lose money (or gain money) (but mostly lose money)\n"+
                " and see the fruits of your buissness strategy \n\n after that the game ends and a new day begins");
                start(gsinp.nextInt());  2
            }
            else {
                begin();
            }
        }

        static Buisness begin(){
            // Fntemp stores both buissness and first name to save on memory
            String fNtemp;
            name ownerTemp;
            int dif;
           
            
            
            System.out.println("okay gimme a first name >>");
            fNtemp = gsinp.nextLine();
            System.out.println("okay gimme a last name >>");
            ownerTemp = new name(fNtemp, gsinp.nextLine());

            System.out.println("Snazzy Buissness name Go >>");
            fNtemp = gsinp.nextLine();

            System.out.println("now difficulty 1..3 easy to hard");
            dif = gsinp.nextInt();

            switch(dif){
                case 1:
                   return Bloxberg.mBiz = new Buisness(fNtemp,ownerTemp,10000);
                    
    
                case 2:
                   return Bloxberg.mBiz = new Buisness(fNtemp,ownerTemp,6000);
                    
    
                case 3:
                  return  Bloxberg.mBiz = new Buisness(fNtemp,ownerTemp,3000);
                   
                default: return  Bloxberg.mBiz = new Buisness(fNtemp,ownerTemp,6000);
            }
            



            
        }
    }





}

