package Processor;


import java.io.IOException;
import java.util.Scanner;

public class Input {
     public static void getData() throws EmptyStringException, ArrayCountElementException, IncorrectValueException, IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("При вводе данных используйте латинский алфавит соблюдайте следующий формат ввода;\n" +
                "Фамилия Имя Отчество Дата рождения(dd.mm.yyyy) Телефон(1234567)  Пол(m / f)\n" + "Введите данные: "
                );
        String inputData;
        inputData = scanner.nextLine();
        if (inputData.isEmpty()){
            throw new EmptyStringException("Ни каких данных не введено");
        }

        inputData = inputData.replaceAll("\\s+", " ");
        inputData = inputData.trim();
        String[] bufferArray = inputData.split(" ");
        if (bufferArray.length == 6){
            InputValidation.checkDateFormat(bufferArray[3]);
            InputValidation.checkPhoneNumberFormat(bufferArray[4]);
            InputValidation.checkGenderFormat(bufferArray[5]);
            Write.createFile(bufferArray);


        } else {
            throw new ArrayCountElementException("Введены не все данные или\n" +
                    "пропущен пробел");
        }




    }
}
