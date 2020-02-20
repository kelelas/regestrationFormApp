package controller;

import model.Group;
import model.Model;
import model.Record;
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
        model.setOneRecord(new Record(inputValueWithScanner(sc, TEXT_FOR_SURNAME, REGEX_FOR_SURNAME),
                                      inputValueWithScanner(sc, TEXT_FOR_LOGIN, REGEX_FOR_LOGIN),
                inputValueWithScanner(sc, TEXT_FOR_NAME, REGEX_FOR_NAME),
                inputValueWithScanner(sc,TEXT_FOR_SECOND_NAME, REGEX_FOR_SECOND_NAME),
                inputValueWithScanner(sc, TEXT_FOR_SKYPE, REGEX_FOR_SKYPE),
                inputValueWithScanner(sc, TEXT_FOR_EMAIL, REGEX_FOR_EMAIL),
                inputValueWithScanner(sc, TEXT_FOR_INDEX, REGEX_FOR_ADDRESS_INDEX_OR_HOUSE_OR_FLAT),
                inputValueWithScanner(sc, TEXT_FOR_CITY, REGEX_FOR_ADDRESS_TOWN_OR_STREET),
                inputValueWithScanner(sc, TEXT_FOR_STREET, REGEX_FOR_ADDRESS_TOWN_OR_STREET),
                inputValueWithScanner(sc, TEXT_FOR_HOME_NUMBER, REGEX_FOR_ADDRESS_INDEX_OR_HOUSE_OR_FLAT),
                inputValueWithScanner(sc, TEXT_FOR_FLAT_NUMBER, REGEX_FOR_ADDRESS_INDEX_OR_HOUSE_OR_FLAT),
                inputValueWithScanner(sc, TEXT_FOR_PHONE_NUMBER, REGEX_FOR_PHONE_NUMBER),
                inputValueWithScanner(sc, TEXT_FOR_SECOND_PHONE_NUMBER, REGEX_FOR_PHONE_NUMBER),
                inputValueWithScanner(sc, TEXT_FOR_COMMENT, REGEX_FOR_COMMENT),
                Group.valueOf(inputValueWithScanner(sc, TEXT_FOR_GROUP, REGEX_FOR_GROUP))
                ));
        model.setOneRecord(new Record(inputValueWithScanner(sc, TEXT_FOR_SURNAME, REGEX_FOR_SURNAME),
                inputValueWithScanner(sc, TEXT_FOR_LOGIN, REGEX_FOR_LOGIN),
                inputValueWithScanner(sc, TEXT_FOR_NAME, REGEX_FOR_NAME),
                inputValueWithScanner(sc,TEXT_FOR_SECOND_NAME, REGEX_FOR_SECOND_NAME),
                inputValueWithScanner(sc, TEXT_FOR_SKYPE, REGEX_FOR_SKYPE),
                inputValueWithScanner(sc, TEXT_FOR_EMAIL, REGEX_FOR_EMAIL),
                inputValueWithScanner(sc, TEXT_FOR_INDEX, REGEX_FOR_ADDRESS_INDEX_OR_HOUSE_OR_FLAT),
                inputValueWithScanner(sc, TEXT_FOR_CITY, REGEX_FOR_ADDRESS_TOWN_OR_STREET),
                inputValueWithScanner(sc, TEXT_FOR_STREET, REGEX_FOR_ADDRESS_TOWN_OR_STREET),
                inputValueWithScanner(sc, TEXT_FOR_HOME_NUMBER, REGEX_FOR_ADDRESS_INDEX_OR_HOUSE_OR_FLAT),
                inputValueWithScanner(sc, TEXT_FOR_FLAT_NUMBER, REGEX_FOR_ADDRESS_INDEX_OR_HOUSE_OR_FLAT),
                inputValueWithScanner(sc, TEXT_FOR_PHONE_NUMBER, REGEX_FOR_PHONE_NUMBER),
                inputValueWithScanner(sc, TEXT_FOR_COMMENT, REGEX_FOR_COMMENT),
                Group.valueOf(inputValueWithScanner(sc, TEXT_FOR_GROUP, REGEX_FOR_GROUP))
        ));


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
