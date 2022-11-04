
package mysqlconnection;


public class Record {
    private int personID;
    private String Name;
    private int Age;
    private String Town;

    public Record() {
    }

    public Record(int personID, String Name, int Age, String Town) {
        this.personID = personID;
        this.Name = Name;
        this.Age = Age;
        this.Town = Town;
    }

    public Record(String Name, int Age, String Town) {
        this.Name = Name;
        this.Age = Age;
        this.Town = Town;
    }

    public int getPersonID() {
        return personID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String Town) {
        this.Town = Town;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Record{");
        sb.append("personID=").append(personID);
        sb.append(", Name=").append(Name);
        sb.append(", Age=").append(Age);
        sb.append(", Town=").append(Town);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
