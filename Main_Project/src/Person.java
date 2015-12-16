
/*
 * 
 * @author Mayank Attri 2014063
 * @author Mohammad Nayeem 2014147
 * 
 */
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
	SimpleStringProperty name;
    SimpleStringProperty eid;

    public Person(String id, String n) {
        this.name = new SimpleStringProperty(n);
        this.eid = new SimpleStringProperty(id);
    }
    public String getName() {
        return name.get();
    }
    public void setName(String n) {
        this.name.set(n);
    }
    public String getEID() {
        return eid.get();
    }
    public void setEID(String id) {
        this.eid.set(id);
    }
    public StringProperty c1Property() {
		return eid;
	}
	public StringProperty c2Property() {
		return name;
	}
}
