package Processor;

public class InputValidation {

    public static void checkDateFormat(String date) throws IncorrectValueException {

        char[] checkData = date.toCharArray();
        if (checkData.length == 10 && (checkData[2] == '.' && checkData[5] == '.')){

        } else {
            throw new IncorrectValueException("Дата введена не правильно. Формат ввода dd.mm.yyyy");
        }
    }


    public static void checkPhoneNumberFormat(String phoneNumber) throws IncorrectValueException {
        try {
            long check = Long.parseLong(phoneNumber); // ошибка приведения вида
        } catch (IncorrectValueException e){
            throw new IncorrectValueException("Тулуфон введен не правильно. " +
                    "Ввод телефона одним целым числом 12345678 без пробелов и тире");
        }
    }


    public static void checkGenderFormat(String gender) throws IncorrectValueException {
        if (gender.length() == 1){
            gender = gender.toLowerCase();
            if (gender.equals("m") || gender.equals("f")) {
                char[] charArray = gender.toCharArray();
                char convertedGender = charArray[0];
            } else {
                throw new IncorrectValueException("Неправильно указан пол !\n" +
                        "мужчина - m, женщина - f");
            }
        } else {
            throw new IncorrectValueException("Неправильно указан пол !\n" +
                    "мужчина - m, женщина - f");
        }
    }
}
