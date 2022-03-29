import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class RandomCharacterTest {
    static RandomCharacter randomChar;

    @BeforeAll
    //only apply to the tests within the methods below
    public static void setUp() throws Exception{
        randomChar = new RandomCharacter();
    }

    //Testing for lower case letter from a to z
    @RepeatedTest(value = 15)
    void getRandomLowerCaseLetter() {
        char check = randomChar.getRandomLowerCaseLetter();
        //Return true if the charcater generated is lowercase
        assertTrue(Character.isLowerCase(check));
    }

    //Testing for upper case letter from A to Z
    @RepeatedTest(value = 15)
    void getRandomUpperCaseLetter() {
        char check = randomChar.getRandomUpperCaseLetter();
        //Return true if the charcater generated is uppercase
        assertTrue(Character.isUpperCase(check));
    }

    //Testing for Digits from 0 to 9
    @RepeatedTest(value = 15)
    void getRandomDigitCharacter() {
        char check = randomChar.getRandomDigitCharacter();
        //Return true if the charcater generated is a digit
        assertTrue(Character.isDigit(check));
    }


    @RepeatedTest(value = 15)
    public void getRandomCharacter() {
       char check = randomChar.getRandomCharacter();
       //Return true if the charcater generated is lowercase or upper case or a digit
       assertTrue(Character.isLowerCase(check)||Character.isUpperCase(check)||Character.isDigit(check));
       
    }

    @RepeatedTest(value = 15)
    public void testForPrime() {
        //Return true if the digit charcater generated is prime using the cases below
       int check = Character.getNumericValue(randomChar.getRandomDigitCharacter());
       boolean isPrime = true;
       // Check if number is less than or equal to 1
        if (check <= 1){
            isPrime = false;
        //check if the number is 2
        }else if(check==2){
            assertTrue(isPrime);
        //check if the number is a multiple of 2
        }else if(check % 2 == 0){
            isPrime = false;
        }
    
        // Else just check the odd ones left
        for (int i = 3; i <= Math.sqrt(check); i += 2)
        {
            if (check % i == 0)
            isPrime = false;
        }
        System.out.println(check);
        assertTrue(isPrime);
        
        }



    @AfterAll
    //tear down class after everything
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("Tear Down");  
    }  
}