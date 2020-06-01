package fr.wildcodeschool.unittesting;

//import fr.wildcodeschool.unittesting.StringUtils;
import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testTypeNull () {
        final String candidate = null;
        Assertions.assertThrows(NullPointerException.class, () -> StringUtils.vowels(candidate));
    }

    @Test
    public void testOubliDeChar() {
        final String missingVowel = "akon";
        Assertions.assertEquals("ao", StringUtils.vowels(missingVowel));
    }

    @Test
    public void testChaineVide() {
        final String chaineVide = "";
        Assertions.assertEquals("", StringUtils.uniqueVowels(chaineVide));
    }
    @Test
    public void testSansVowel() {
        final String sansVowel = "nprtt";
        Assertions.assertEquals("", StringUtils.uniqueVowels(sansVowel));
    }
    
    @Test
    public void testDoublonVowel() {
        final String doublon = "hello world";
        Assertions.assertEquals("eo", StringUtils.uniqueVowels(doublon));
    }


   
}
