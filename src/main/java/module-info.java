module com.mycompany.pizzadjack {
    requires javafx.controls;
    requires javafx.fxml;

    
    requires java.persistence; 
    requires java.sql; 
    requires org.hibernate.orm.core; 
    requires java.base;
    
    opens com.mycompany.pizzadjack.db;
    opens com.mycompany.pizzadjack to javafx.fxml;
    exports com.mycompany.pizzadjack;
}
