package controller;

import model.Model;
import view.View;
import static model.RegexConstants.*;
import static view.TextConstants.*;

import java.util.Scanner;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        model.setSurname(inputValueWithScanner(sc, TEXT_FOR_SURNAME, REGEX_FOR_SURNAME));
        model.setLogin(inputValueWithScanner(sc, TEXT_FOR_LOGIN,  REGEX_FOR_LOGIN));


    }
    private String inputValueWithScanner(Scanner sc, String text, String regex){
        view.writeInputMessage(text, regex);
        String result = "";

        while (sc.hasNext() && !((result = sc.next()).matches(regex))) {
             errorInput();
            view.writeInputMessage(text, regex);
        }
        return result;
    }
    private void errorInput(){
        view.writeMessage(INVALID_TEXT_FORMAT);
    }
}
