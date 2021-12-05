package com.mycompany.pizzadjack;

import com.mycompany.pizzadjack.db.User;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Controller {
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_PizzaDjack_jar_1.0-SNAPSHOTPU");
    public static EntityManager em = emf.createEntityManager();

    @FXML
    private Button reg;

    @FXML
    private Button logIn;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    void login(MouseEvent event) throws IOException {
        Query q = em.createNamedQuery("User.findByLogin");
        q.setParameter("login", login_field.getText());
        
        try {
            User u = (User) q.getSingleResult();
            if (u.getPassword().equals(password_field.getText())) {
                App.setRoot("logIn");
            } else {
                System.out.println("Неверный логин или пароль");
            }
        } catch (NoResultException e) {
            System.out.println("Неверный логин или пароль");
        }

    }

    @FXML
    void signup(MouseEvent event) throws IOException {
        App.setRoot("signUp");

    }

}


