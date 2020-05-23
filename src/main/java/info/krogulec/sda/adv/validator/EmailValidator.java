package info.krogulec.sda.adv.validator;

import java.util.regex.Pattern;

/**
 * @author krogulecp
 */
class EmailValidator {

    private static final EmailValidator instance = new EmailValidator();
    private static final String EMAIL_REGEX = "^[a-z0-9!#$%&'**+/=?^_'{|}~-]+(?:\\.[a-z0-9!#$%&'**+/=?^_'{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);

    private EmailValidator(){
        System.out.println("init...");
    }

    public static EmailValidator getInstance() {
        return instance;
    }

    public boolean isValid(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }
}
