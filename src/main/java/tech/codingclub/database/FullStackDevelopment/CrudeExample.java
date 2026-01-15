


package tech.codingclub.database.FullStackDevelopment;

import tech.codingclub.entity.Coders;

import java.util.Date;
import java.util.List;

public class CrudeExample {
    public static void main(String[] args) {
        System.out.println("Reading rows at " + new Date().getTime());
        Coders coder = new GenericDB<Coders>().getRow(tech.codingclub.tables.Coders.CODERS, Coders.class, null);
        readTableCoders();
        new GenericDB<String>().updateColumn(tech.codingclub.tables.Coders.CODERS.NAME, "Coding Mafia", tech.codingclub.tables.Coders.CODERS,tech.codingclub.tables.Coders.CODERS.NAME.eq("Surabi"));
        readTableCoders();
    }


    private static void readTableCoders() {
        List<Coders> rows= (List<Coders>) GenericDB.getRows(tech.codingclub.tables.Coders.CODERS,Coders.class,null,null);


        for(Coders row : rows){
            System.out.println("Row :" + row.getName()+" "+row.getAge());
        }
    }
}


