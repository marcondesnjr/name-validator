package io.github.marcondesnjr.namevalidator;

/**
 *
 * @author José Marcondes do Nascimento Junior
 */
public class NameValidator {
    public static boolean isValid(String str){
        String pt = "^((\\p{L}+\\s\\p{L}+)+)$";
        return str.matches(pt);
    }
}
