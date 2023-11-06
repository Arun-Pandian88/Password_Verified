import java.util.Scanner;

public class Strong_Password {

    public static void main(String[] args) {
        final int MinLength = 6;
        final int Num_UpperLetter = 1;
        final int Num_LowerLetter = 1;
        final int Num_Digit = 1;
        final int Num_SpecialCharacter = 1;

        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;
        int specialCharacterCount = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the password: ");
        String password = scanner.nextLine();

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                specialCharacterCount++;
            }
        }
        if((Num_UpperLetter<=upperCaseCount)&&(Num_LowerLetter<=lowerCaseCount)&&(Num_Digit<=digitCount)&&(Num_SpecialCharacter<=specialCharacterCount)){
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid password");
        }


        }
    }

