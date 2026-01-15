package tech.codingclub.database.FullStackDevelopment;

import tech.codingclub.entity.Coders;

public class TestCodersTable {

    public static void main(String[] args) {

        Coders coder  = new Coders("Surabi Mondal", 19L );

        //Insert this object into DB !
        new GenericDB<Coders>().addRow(tech.codingclub.tables.Coders.CODERS, coder);
//           < ENTITY CLASS>
        Coders spammer =new Coders ("SPAMMER",50L);
        new GenericDB<Coders>().addRow(tech.codingclub.tables.Coders.CODERS, spammer);
        //CRUD Operation !
        //create Read Update Delete
    }
}
