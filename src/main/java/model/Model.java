package model;

import java.util.ArrayList;
import java.util.List;

public class Model {

   private  List<Record> records = new ArrayList<Record>();

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }
    public void setOneRecord(Record record) {
        records.add(record);
    }
}
