package seminars;

import input.Input;

public class Password {
    private static String check(String value) throws MyException{
        if (value.length() < 8){
            throw new MyException("Длина пароля менее 8 символов.");
        }
        if (!value.matches(".*[A-Z].*")){
            throw new MyException("В пароле должна быть хотябы одна буква верхнего регистра");
        }
        if (!value.matches(".*\\d.*")){
            throw new MyException("В пароле должна присутствовать хотябы одна цифра ");
        }
        if (!value.matches(".*[!@#$%^&*].*")){
            throw new MyException("В пароле должен быть отябы один спец символ");
        }
        return value;
    }

    public static String checkPass() throws MyException {
        String value = "";

        while (true) {
            try {
                value = Input.inputUs("Введите пароль: ", String.class);
                Password.check(value);
                break;
            } catch (MyException e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Попробуйте снова.");
            }
        }

        return value;
    }
}
