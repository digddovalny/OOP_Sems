package Sem5.personal.utils;

public class Validate {

    public void checkNumber(String telephone) throws Exception {
        if(!telephone.substring(0,1).equals("+")) {
            throw new PhoneException("Ошибка, номер телефона начинается со знака '+' ");
        }
        else if(telephone.length() != 12) {
            throw new PhoneException("Длина номера телефона должна быть 11 цифр ");
        }
    }
}