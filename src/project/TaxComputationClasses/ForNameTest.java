package project.TaxComputationClasses;

import java.util.HashMap;

public class ForNameTest {
    private static HashMap taxCompClasses = new HashMap<String, Class>();
    
    public static void main(String[] args) {
        Class tax_class;
        
        try{
            tax_class = Class.forName("TaxComputationClasses.MD_TaxComputation");
       
        
        populateTaxCompHashTable();
        
        tax_class = (Class) taxCompClasses.get("MD");
        
        TaxComputation t = (TaxComputation) tax_class.newInstance();
        System.out.println(t.getSalesTax());
        
        }
        catch(ClassNotFoundException e){
            System.out.println("Class Not Found");
        }
        catch(InstantiationException e){
            System.out.println("Class Instantiation Error");
        }
        catch(IllegalAccessException e){
            System.out.println("Illegal Access Error");
        }
    }
    
    private static void populateTaxCompHashTable(){
        String pkg = "TaxComputationClasses.";
        
        try{
            taxCompClasses.put("MD", Class.forName(pkg + "MD_TaxComputation"));
            taxCompClasses.put("CA", Class.forName(pkg + "CA_TaxComputation"));
            // etc.
        }
        catch(ClassNotFoundException e){
                System.out.println("Tax Computation Class Error");
        }
    }
}
