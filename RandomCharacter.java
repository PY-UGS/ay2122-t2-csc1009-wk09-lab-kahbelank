import java.util.Random;

public class RandomCharacter {
    
    public final static Random rand = new Random();

    //generate one random lower case letter
    public  char  getRandomLowerCaseLetter() {
        //gernate random lower case letter from a to z
        char lower = (char)('a'+ rand.nextInt(26));
        return lower;

    }

    //Generate one random Upper case letter
    public  char getRandomUpperCaseLetter() {
        //gernate random upper case letter from A to Z
        char upper = (char)('A'+ rand.nextInt(26));
        return upper;

    }

    //generate one random digit character
    public  char getRandomDigitCharacter() {
        //gernate random digit from 0 to 9
        char number = (char)('0'+ rand.nextInt(10));
        return number;

    }

    //generate random character between from Lower case, upper case and Digits
    public  char getRandomCharacter() {
        //create a case to generate a random alphanumerical letters from the methods above
        char character = (char)('1'+ rand.nextInt(3));
        if (character=='1'){
            return getRandomLowerCaseLetter();
        }else if(character =='2'){
            return getRandomUpperCaseLetter();
        }else{
            return getRandomDigitCharacter();
        }
    }



    public static void main(String[] args) {
        //set a static variable with value 15 for the number of chars to generate
        final int NUMBER_OF_CHARS = 15;

        //create the RandomCharacter Object
        RandomCharacter randch = new RandomCharacter();

        //Generate 15 random lower case letters
        System.out.print("Random Lower Case Letters: ");
        //Generate 15 random lower case letters
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char lc = randch.getRandomLowerCaseLetter();
            System.out.print(lc + ",");
        }

        //Generate 15 random upper case letters
        System.out.print("\nRandom Upper Case Letters: ");
        //Generate 15 random upper case letters
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char uc = randch.getRandomUpperCaseLetter();
            System.out.print(uc+ ",");
        }

        //Generate 15 random Digits
        System.out.print("\nRandom Digits: ");
        //Generate 15 random digits
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char dc = randch.getRandomDigitCharacter();
            System.out.print(dc+ ",");
        }

        //Generate 15 random alphanumerical charaters
        System.out.print("\nRandom Characters: ");
        //Generate 15 random characters
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char rc = randch.getRandomCharacter();
            System.out.print(rc+ ",");
        }


    }

}
