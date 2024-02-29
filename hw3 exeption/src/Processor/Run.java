package Processor;
import java.io.IOException;

public class Run {
    public static void run () {

        try {
            Input.getData();

        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        } catch (ArrayCountElementException e) {
            System.out.println(e.getMessage());
        } catch (IncorrectValueException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        };
    }
}
