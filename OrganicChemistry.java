package tenth;
import java.util.Scanner;
public class OrganicChemistry {
    String nomenclature="";
    String wordroot;
    int carbon_no;
    String fungr;
    int pos;
    int pos1;
    Scanner in = new Scanner(System.in);
    String CarbonChain(){
        System.out.println("Enter number of carbons in main chain");
        carbon_no = in.nextInt();
        if(carbon_no == 1)
            nomenclature = "meth";
        if(carbon_no == 2)
            nomenclature = "eth";
        if(carbon_no == 3)
            nomenclature = "prop";
        if(carbon_no == 4)
            nomenclature = "but";
        if(carbon_no == 5)
            nomenclature = "pent";
        if(carbon_no == 6)
            nomenclature = "hex";
        if(carbon_no == 7)
            nomenclature = "hept";
        if(carbon_no == 8)
            nomenclature = "oct";
        if(carbon_no == 9)
            nomenclature = "non";
        if(carbon_no == 10)
            nomenclature = "dec";
        return nomenclature;
    }
    String Bonds(){
        System.out.println("are all bonds single? Answer in 'yes' or 'no'");
        String choice = in.next();
       if(choice.equalsIgnoreCase("yes"))
           nomenclature =nomenclature+"an";
       else{
           System.out.println("is there a double bond? Answer in 'yes' or 'no'");
           choice = in.next();
           if(choice.equalsIgnoreCase("yes")){
               System.out.println("Enter position of the same");
               int p = in.nextInt();
               nomenclature = nomenclature+"-"+p+"-ene";   
           }
           if(choice.equalsIgnoreCase("no")){
               System.out.println("Enter position of triple bond");
               int ps = in.nextInt();
               nomenclature = nomenclature+"-"+ps+"-yne";
           }
       }
        return nomenclature;
    }
    String FunctionalGroup(){
        System.out.println("Enter functional group");
         fungr = in.nextLine();
         fungr = in.nextLine();
        if(fungr.equalsIgnoreCase("alcohol"))
            nomenclature =nomenclature+ "ol";
        if(fungr.equalsIgnoreCase("aldehyde"))
            nomenclature =nomenclature+ "al";
        if(fungr.equalsIgnoreCase("ketone")){
            System.out.println("Enter the position of the same");
            int n = in.nextInt();
            nomenclature =nomenclature+"-"+n+"-one";     
        }
        if(fungr.equalsIgnoreCase("carboxylic acid"))
            nomenclature =nomenclature+ "oic acid";
        if(fungr.equalsIgnoreCase("alkene")){
        }
       if(fungr.equalsIgnoreCase("alkane")){
           nomenclature =nomenclature+ "e";
       }
       if(fungr.equalsIgnoreCase("alkyne"))
       {}     
        return nomenclature;
    }
    String SideChain(){
        System.out.println("Are there any side chains? Answer in 'yes' or 'no'");
        String choice = in.next();
        if(choice.equalsIgnoreCase("yes")){
            System.out.println("Enter the name for the same: ");
            String sidechain = in.next();
            if(sidechain.equalsIgnoreCase("methyl")){
                System.out.println("Enter the position of the same: ");
                 pos = in.nextInt();
                nomenclature =pos+"-methyl"+nomenclature;
            }
            if(sidechain.equalsIgnoreCase("dimethyl")){
                System.out.println("Enter the position of first methyl");
                pos = in.nextInt();
                System.out.println("Enter the position of second methyl");
                pos1 = in.nextInt();
                nomenclature =pos+","+pos1+"-dimethyl"+nomenclature;    
            }
            if(sidechain.equalsIgnoreCase("trimethyl")){
                System.out.println("Enter the position of first methyl");
                pos = in.nextInt();
                System.out.println("Enter the position of second methyl");
                pos1 = in.nextInt();
                System.out.println("Enter the position of third methyl");
                int pos2 = in.nextInt();
                nomenclature =pos+","+pos1+","+ pos2+"-trimethyl"+nomenclature;    
            }
            if(sidechain.equalsIgnoreCase("ethyl")){
                System.out.println("Enter the position of the same");
                pos = in.nextInt();
                nomenclature =pos+"-ethyl"+nomenclature;    
        }
           if(sidechain.equalsIgnoreCase("chloro")){
                System.out.println("Enter the position of the same");
                pos = in.nextInt();
                nomenclature =pos+"-chloro"+nomenclature;    
        }
           if(sidechain.equalsIgnoreCase("dichloro")){
                System.out.println("Enter the position of the first chloro");
                pos = in.nextInt();
                System.out.println("Enter the position of the second chloro");
                pos1= in.nextInt();
                nomenclature =pos+"-"+pos1+"-dichloro"+nomenclature;    
        }
            if(sidechain.equalsIgnoreCase("dibromo")){
                System.out.println("Enter the position of the first bromo");
                pos = in.nextInt();
                System.out.println("Enter the position of the second bromo");
                pos1= in.nextInt();
                nomenclature =pos+"-"+pos1+"-dibromo"+nomenclature;    
        }
             if(sidechain.equalsIgnoreCase("iodo")){
                System.out.println("Enter the position of the first chloro");
                pos = in.nextInt();
                
                nomenclature =pos+"-iodo"+nomenclature;    
        }
        }
        else{
            
        }
        return nomenclature;
    }
    void display(){
        System.out.println("The nomenclature of this organic compound is "+nomenclature);
    }
    public static void main(String[] args) {
        OrganicChemistry ob = new OrganicChemistry();
        ob.CarbonChain();
        ob.Bonds();
        ob.FunctionalGroup();
        ob.SideChain();
        ob.display();
         
        
       
        
    }
}